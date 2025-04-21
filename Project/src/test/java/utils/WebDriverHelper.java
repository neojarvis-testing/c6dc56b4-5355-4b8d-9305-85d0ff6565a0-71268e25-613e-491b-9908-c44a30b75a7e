package utils;
 
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class WebDriverHelper {
    WebDriver driver = Base.driver;
    List<String> handles = new ArrayList<>();
 
    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
        handles.add(driver.getWindowHandle());
    }
 
    public void clickByLocater(By locator) {
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void sendData(By locators, String data) {
        try {
            driver.findElement(locators).sendKeys(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void scrollToAnElement(By locator) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement element = driver.findElement(locator);
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void jsClick(By locator) {
        try {
            JavascriptExecutor obj = (JavascriptExecutor) driver;
            WebElement element = driver.findElement(locator);
            obj.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void scrollByPixel(int x, int y) {
        try {
            JavascriptExecutor obj = (JavascriptExecutor) driver;
            obj.executeScript("window.scrollBy(x,y);");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void waitForElementToBeVisible(By locator, int sec) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(sec))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void waitForElementToBeClickable(By locator, int sec) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(sec))
                    .until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void hoverByLocater(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void enterAction(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void dropDown(By locater, String value) {
        try {
            WebElement webElement = driver.findElement(locater);
            Select option = new Select(webElement);
            option.selectByVisibleText(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void switchToNewTab() {
        try {
            String currentWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String checkWindow : allWindows) {
                if (!checkWindow.equalsIgnoreCase(currentWindow) && !handles.contains(checkWindow)) {
                    handles.add(checkWindow);
                    driver.switchTo().window(checkWindow);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void goBackToWindow(int i) {
        try {
            driver.switchTo().window(handles.get(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public List<WebElement> getElementsByXPath(String path) {
        return driver.findElements(By.xpath(path));
    }
 
    public void iterateResults(String path, String value) {
        try {
            List<WebElement> resultList = getElementsByXPath(path);
            for (WebElement ele : resultList) {
                if (ele.getText().contains(value)) {
                    ele.click();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}