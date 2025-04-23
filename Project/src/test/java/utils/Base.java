package utils;
 
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
 
public class Base {
    public static WebDriver driver;
    public static LoadProperties loadProperties;
    LoggerHandler loggerHandler = new LoggerHandler();
     /*
     * Method Name: openBrowser
     * Author Name: Nikhith
     * Description: This method initializes the WebDriver, sets browser options, and opens the specified URL.
     * Return Type: void
     * Parameter List: NA
     */
    public void openBrowser() {
        try {
            loadProperties = new LoadProperties();
            ChromeOptions options = new ChromeOptions();
            driver = new RemoteWebDriver(new URL(loadProperties.getProperty("gridurl")), options);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
            driver.get(loadProperties.getProperty("url"));
 
        } catch (Exception e) {
           LoggerHandler.info(e.getMessage());
        }
        WebDriverListener listener = new EventHandler();
        driver = new EventFiringDecorator<>(listener).decorate(driver);
    }
}
 