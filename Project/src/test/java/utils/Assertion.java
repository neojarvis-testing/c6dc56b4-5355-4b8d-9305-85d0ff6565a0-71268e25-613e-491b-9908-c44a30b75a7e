package utils;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
/*
    * a. Class name : Assertion
    * b. Author : Dharen
    * c. Description : This class provides utility methods for assertions to verify titles, URLs, and texts during automation testing using Selenium and TestNG frameworks.
*/
public class Assertion {
    // WebDriver instance to interact with the browser
    private WebDriver driver;
    // Constructor to initialize the WebDriver instance
    public Assertion(WebDriver driver) {
        this.driver = driver;
    }
    /*
        * a. Method name : verifyFullPageTitle
        * b. Author : Dharen
        * c. Description : Verifies whether the actual page title matches the expected title.
        * d. Return type : void
        * e. Parameter list :
        *    - String expectedTitle: The title expected for the current page.
    */
    public void verifyFullPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    /*
        * a. Method name : verifyPartialPageTitle
        * b. Author : Dharen
        * c. Description : Verifies whether the actual page title contains the expected partial title.
        * d. Return type : void
        * e. Parameter list :
        *    - String expectedTitle: A substring expected to appear in the current page title.
    */
    public void verifyPartialPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    /*
        * a. Method name : verifyFullUrl
        * b. Author : Dharen
        * c. Description : Verifies whether the actual URL matches the expected URL exactly.
        * d. Return type : void
        * e. Parameter list :
        *    - String expectedUrl: The full URL expected for the current page.
    */
    public void verifyFullUrl(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    /*
        * a. Method name : verifyPageUrl
        * b. Author : Dharen
        * c. Description : Verifies whether the actual URL contains the expected partial URL.
        * d. Return type : void
        * e. Parameter list :
        *    - String expectedUrl: A substring expected to appear in the current page URL.
    */
    public void verifyPageUrl(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
    /*
        * a. Method name : verifyFullText
        * b. Author : Dharen
        * c. Description : Verifies whether the actual text of a web element matches the expected text exactly.
        * d. Return type : void
        * e. Parameter list :
        *    - String expectedText: The full text expected in the web element.
        *    - By locator: Locator of the web element to extract the text from.
    */
    public void verifyFullText(String expectedText, By locator) {
        String actualText = driver.findElement(locator).getText();
        Assert.assertEquals(actualText, expectedText);
    }
    /*
        * a. Method name : verifyPartialText
        * b. Author : Dharen
        * c. Description : Verifies whether the actual text of a web element contains the expected partial text.
        * d. Return type : void
        * e. Parameter list :
        *    - String expectedText: A substring expected to appear in the web element's text.
        *    - By locator: Locator of the web element to extract the text from.
    */
    public void verifyPartialText(String expectedText, By locator) {
        String actualText = driver.findElement(locator).getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }
}
 