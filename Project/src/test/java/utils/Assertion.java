package utils;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
 
public class Assertion {
    private static WebDriver driver;
     
        public Assertion(WebDriver driver) {
            this.driver = driver;
        }
     
        public static void verifyFullTitle(String expectedTitle) {
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
        }
     
        public void verifyPartialTitle(String expectedTitle) {
            String actualTitle = driver.getTitle();
            Assert.assertTrue(actualTitle.contains(expectedTitle));
        }
     
        public static void verifyFullUrl(String expectedUrl) {
            String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
 
    public void verifyPartialUrl(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
 
    public static void verifyFullText(String expectedText, By locator) {
        String actualText = driver.findElement(locator).getText();
        Assert.assertEquals(actualText, expectedText);
    }
 
    public void verifyPartialText(String expectedText, By locator) {
        String actualText = driver.findElement(locator).getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }
}
