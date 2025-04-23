package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.FooterIconPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class FooterIconPageActions {
    ExtentReports reports;

    WebDriverHelper helper;

    ExtentTest test;

    /*
     * Method Name: FooterIconPageActions
     * Author Name: T Gnana Asritha
     * Description: Constructor that initializes the WebDriverHelper and assigns the
     * provided ExtentTest and LoggerHandler instances.
     * Return Type: N/A (Constructor)
     * Parameter List:
     * - ExtentTest test: The ExtentTest instance for logging test results.
     */
    public FooterIconPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;


    }

    /*
     * Method Name: clickFacebook
     * Author Name: T Gnana Asritha
     * Description: Clicks the Facebook icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */

    public void clickFacebook() {
        try {
            helper.scrollToAnElement(FooterIconPageLocators.facebook);
            helper.clickByLocater(FooterIconPageLocators.facebook);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Facebook Icon");
            test.log(Status.INFO,"Clicked on Facebook Icon");
            test.log(Status.PASS, "Clicked on Facebook Icon");
            Reporter.addScreenshotToReport("Facebook", test,"Facebook Screenshot",Base.driver);
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Facebook Icon Failed");
            test.log(Status.FAIL, "Clicked on Facebook Icon Failed");
            Reporter.addScreenshotToReport("Facebook", test,"Facebook Screenshot",Base.driver);

        }
    }
    /*
     * Method Name: clickTwitter
     * Author Name: T Gnana Asritha
     * Description: Clicks the Twitter icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */

    public void clickTwitter() {
        try {

            helper.clickByLocater(FooterIconPageLocators.twitter);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Twitter Icon");
            test.log(Status.INFO,"Clicked on Twitter Icon");
            test.log(Status.PASS, "Clicked on Twitter Icon");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Twitter Icon Failed");
            test.log(Status.FAIL, "Clicked on Twitter Icon Failed");
            Reporter.addScreenshotToReport("Twitter", test,"Twitter Screenshot",Base.driver);
        }
    }

    /*
     * Method Name: clickYoutube
     * Author Name: T Gnana Asritha
     * Description: Clicks the Youtube icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clickYoutube() {
        try {
            helper.clickByLocater(FooterIconPageLocators.youtube);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Youtube Icon");
            test.log(Status.INFO,"Clicked on Youtube Icon");
            test.log(Status.PASS, "Clicked on Youtube Icon");
            Reporter.addScreenshotToReport("Youtube", test,"Youtube Screenshot",Base.driver);
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Youtube Icon Failed");
            test.log(Status.FAIL, "Clicked on Youtube Icon Failed");
            Reporter.addScreenshotToReport("Youtube", test,"Youtube Screenshot",Base.driver);
        }
    }

    /*
     * Method Name: clickInstagram
     * Author Name: T Gnana Asritha
     * Description: Clicks the Instagram icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clickInstagram() {
        try {
            helper.clickByLocater(FooterIconPageLocators.instagram);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Instagram Icon");
            test.log(Status.INFO,"Clicked on Instagram Icon");
            test.log(Status.PASS, "Clicked on Instagram Icon");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Instagram Icon Failed");
            test.log(Status.FAIL, "Clicked on Instagram Icon Failed");
            Reporter.addScreenshotToReport("Instagram", test,"Instagram Screenshot",Base.driver);
        }
    }

    /*
     * Method Name: clickLinkdin
     * Author Name: T Gnana Asritha
     * Description: Clicks the LinkedIn icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clickLinkdin() {
        try {
            helper.clickByLocater(FooterIconPageLocators.linkdin);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Linkedin Icon");
            test.log(Status.INFO,"Clicked on Linkedin Icon");
            test.log(Status.PASS, "Clicked on Linkedin Icon");
            Reporter.addScreenshotToReport("Linkedin", test,"Linkedin Screenshot",Base.driver);
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Linkedin Icon Failed");
            test.log(Status.FAIL, "Clicked on Linkedin Icon Failed");
            Reporter.addScreenshotToReport("Linkedin", test,"Linkedin Screenshot",Base.driver);
        }
    }

    /*
     * Method Name: clickpintrest
     * Author Name: T Gnana Asritha
     * Description: Clicks the Pinterest icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clickpintrest() {
        try {
            helper.clickByLocater(FooterIconPageLocators.pinterest);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Pinterest Icon");
            test.log(Status.INFO,"Clicked on Pinterest Icon");
            test.log(Status.PASS, "Clicked on Pinterest Icon");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Pinterest Icon Failed");
            test.log(Status.FAIL, "Clicked on Pinterest Icon Failed");
            Reporter.addScreenshotToReport("Pinterest", test,"Pinterest Screenshot",Base.driver);

        }
    }

    /*
     * Method Name: clicksnapchat
     * Author Name: T Gnana Asritha
     * Description: Clicks the Snapchat icon, switches to the new tab, closes the
     * tab, and switches back to the main window. LoggerHandler the result.
     * Return Type: void
     * Parameter List: None
     */
    public void clicksnapchat() {
        try {
            helper.clickByLocater(FooterIconPageLocators.snapchat);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Snapchat Icon");
            test.log(Status.INFO,"Clicked on Snapchat Icon");
            test.log(Status.PASS, "Clicked on Snapchat Icon");
            Reporter.addScreenshotToReport("Snapchat", test,"Snapchat Screenshot",Base.driver);
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Snapchat Icon Failed");
            test.log(Status.FAIL, "Clicked on Snapchat Icon Failed");
            Reporter.addScreenshotToReport("Snapchat", test,"Snapchat Screenshot",Base.driver);
        }
    }
    /*
     * Method Name: footerTestCase
     * Author Name: T Gnana Asritha
     * Description: Executes all icon click methods in the Footer section
     * sequentially to validate their functionality.
     * Return Type: void
     * Parameter List: None
     */

    public void footerTestCase() {
        clickFacebook();
        clickTwitter();
        clickYoutube();
        clickInstagram();
        clickLinkdin();
        clickpintrest();
        clicksnapchat();

    }

}
