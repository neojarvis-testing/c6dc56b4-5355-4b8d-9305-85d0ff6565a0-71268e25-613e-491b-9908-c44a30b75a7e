package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ActionsPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class ActionsPageAction {
    public WebDriverHelper helper;
    ExtentTest test;
    Assertion assertion = new Assertion(Base.driver);
 
    /*
     * Method Name: ActionsPageAction
     * Author Name: Hrushikesh
     * Description: Constructor that initializes the WebDriverHelper and assigns the provided ExtentTest and LoggerHandler instances.
     * Return Type: N/A (Constructor)
     * Parameter List:
     *     - ExtentTest test: The ExtentTest instance for logging test results.
    */
    public ActionsPageAction(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
    }
 
    /*
     * Method Name: verifyActionsSec
     * Author Name: Hrushikesh
     * Description: Ensures the "Actions" section is displayed by verifying the text
     * "Actions" and logging the result.
     * Return Type: void
     * Parameter List: None
     */
    public void verifyActionsSec() {
        try {
            helper.scrollToAnElement(ActionsPageLocators.action);
            assertion.verifyFullText("Actions", ActionsPageLocators.action);
            LoggerHandler.info("Actions section is displayed");
            test.log(Status.INFO, "Actions section is displayed");
            test.log(Status.PASS, "Actions section is displayed");
            Reporter.addScreenshotToReport("ActionsSection", test,"Finance Screenshot",Base.driver);
        } catch (AssertionError e) {
            LoggerHandler.error("Actions section is not displayed");
            test.log(Status.PASS, "Actions section is not displayed");
            Reporter.addScreenshotToReport("ActionsSection", test,"Finance Screenshot",Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnAppointments
     * Author Name: Hrushikesh
     * Description: Clicks the "Appointments" link, verifies the URL, and navigates
     * back. LoggerHandler and updates test results.
     * Return Type: void
     * Parameter List: None
     */
    public void clickOnAppointments() {
        try {
            helper.clickByLocater(ActionsPageLocators.appointments);
            LoggerHandler.info("Appointmenmts clicked Successfully");
            test.log(Status.INFO, "Appointmenmts clicked Successfully");
            test.log(Status.PASS, "Appointmenmts clicked Successfully");
        } catch (Exception e) {
            LoggerHandler.error("Appointmenmts not clicked");
            test.log(Status.FAIL, "Appointmenmts not clicked");
            Reporter.addScreenshotToReport("Appointments", test,"Finance Screenshot",Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnInsurance
     * Author Name: Hrushikesh
     * Description: Clicks the "Accepted Insurance" link, validates the URL, and
     * navigates back to the previous page. LoggerHandler actions.
     * Return Type: void
     * Parameter List: None
     */
    public void clickOnInsurance() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(ActionsPageLocators.acceptedInsu);
            LoggerHandler.info("Insurance clicked Successfully");
            test.log(Status.INFO, "Insurance clicked Successfully");
            test.log(Status.PASS, "Insurance clicked Successfully");
            Reporter.addScreenshotToReport("Insurance", test,"Insurance Screenshot",Base.driver);
        } catch (Exception e) {
            LoggerHandler.error("Insurance not clicked");
            test.log(Status.FAIL, "Insurance not clicked");
        }
        /*
         * Method Name: clickOnEvent
         * Author Name: Hrushikesh
         * Description: Clicks the "Events Calendar" link, switches to a new tab to
         * verify the URL, and switches back to the original tab. LoggerHandler progress.
         * Return Type: void
         * Parameter List: None
         */
 
    }
 
    public void clickOnEvent() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(ActionsPageLocators.eventsCal);
            helper.switchToNewTab();
            assertion.verifyPageUrl("https://events.clevelandclinic.org");
            LoggerHandler.info("Event clicked and  Url Verified Successfully");
            test.log(Status.INFO, "Event clicked and  Url Verified Successfully");
            test.log(Status.PASS, "Event clicked and Url Verified Successfully");
        } catch (Exception e) {
            LoggerHandler.error("Event not clicked");
            test.log(Status.FAIL, "Event not clicked");
            Reporter.addScreenshotToReport("Event", test,"Event Screenshot",Base.driver);
        } catch (AssertionError e) {
            LoggerHandler.error("Event Url is not verified");
            test.log(Status.FAIL, "Event Url is not verified");
        }
    }
 
    /*
     * Method Name: clickOnFinance
     * Author Name: Hrushikesh
     * Description: Validates the "Financial Assistance" link functionality by
     * clicking, verifying the URL, and navigating back. LoggerHandler actions.
     * Return Type: void
     * Parameter List: None
     */
    public void clickOnFinance() {
        try {
            helper.goBackToWindow(0);
            helper.clickByLocater(ActionsPageLocators.finaceAssi);
            assertion.verifyPageUrl("https://my.clevelandclinic.org/patients/billing-finance/financial-assistance");
            LoggerHandler.info("Finance clicked and  Url Verified Successfully");
            test.log(Status.INFO, "Finance clicked and  Url Verified Successfully");
            test.log(Status.PASS, "Finance clicked and Url Verified Successfully");
            Reporter.addScreenshotToReport("Finance", test,"Finance Screenshot",Base.driver);
        } catch (Exception e) {
            LoggerHandler.error("Finance not clicked");
            test.log(Status.FAIL, "Finance not clicked");
            Reporter.addScreenshotToReport("Finance", test,"Finance Screenshot",Base.driver);
        } catch (AssertionError e) {
            LoggerHandler.error("Finance Url is not verified");
            test.log(Status.FAIL, "Finance Url is not verified");
        }
    }
 
    /*
     * Method Name: clickOnCleveLand
     * Author Name: Hrushikesh
     * Description: Verifies the "Give To" link functionality by clicking,
     * validating the URL, and returning to the previous page.
     * Return Type: void
     * Parameter List: None
     */
    public void clickOnCleveLand() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(ActionsPageLocators.giveTo);
            LoggerHandler.info("giveto clicked ");
            test.log(Status.INFO, "giveto clicked");
            test.log(Status.PASS, "giveto clicked");
        } catch (Exception e) {
            LoggerHandler.error("Giveto not clicked");
            test.log(Status.FAIL, "giveto not clicked");
            Reporter.addScreenshotToReport("CleveLand", test,"CleveLand Screenshot",Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnPayBill
     * Author Name: Hrushikesh
     * Description: Clicks the "Pay Your Bill" link, checks the URL, and navigates
     * back. Updates log and test results.
     * Return Type: void
     * Parameter List: None
     */
    public void clickOnPayBill() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(ActionsPageLocators.payYour);
            LoggerHandler.info("Pay your bill is clicked");
            test.log(Status.INFO, "Pay your bill is clicked");
            test.log(Status.PASS, "Pay your bill is clicked");
        } catch (Exception e) {
            LoggerHandler.error("Pay your Bill not clicked");
            test.log(Status.FAIL, "Pay your Billclicked");
            Reporter.addScreenshotToReport("PayBill", test,"PayBill Screenshot",Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnPrice
     * Author Name: Hrushikesh
     * Description: Validates "Price Transparency" by clicking the link, verifying
     * the URL, and navigating back to the original page.
     * Return Type: void
     * Parameter List: None
     */
    public void clickOnPrice() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(ActionsPageLocators.priceTrans);
            LoggerHandler.info("Price Transparency is clicked ");
            test.log(Status.INFO, "Price Transparency is clicked");
            test.log(Status.PASS, "Price Transparency is clicked ");
        } catch (Exception e) {
            LoggerHandler.error("Price Transparency not clicked");
            test.log(Status.FAIL, "Price Transparency notclicked");
            Reporter.addScreenshotToReport("Price", test,"Price Screenshot",Base.driver);
        }
    }
 
    /*
     * Method Name: clickOnRefer
     * Author Name: Hrushikesh
     * Description: Tests the "Refer a Patient" link by clicking, verifying the URL,
     * and returning to the previous page.
     * Return Type: void
     * Parameter List: None
     */
    public void clickOnRefer() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(ActionsPageLocators.referPatient);
            assertion.verifyPageUrl("https://my.clevelandclinic.org/professionals/referring");
            LoggerHandler.info("Refer a Patient is clicked and Url verified");
            test.log(Status.INFO, "Refer a Patient is clicked and Url verified");
            test.log(Status.PASS, "Refer a Patient is clicked and Url verified");
        } catch (Exception e) {
            LoggerHandler.error("Refer a Patient not clicked");
            test.log(Status.FAIL, "Refer a Patient notclicked");
            Reporter.addScreenshotToReport("Refer", test,"Refer Screenshot",Base.driver);
        } catch (AssertionError e) {
            LoggerHandler.error("Refer a Patient Url is not verified");
            test.log(Status.FAIL, "Refer a Patient Url is not verified");
        }
    }
 
    /*
     * Method Name: clickOnPhone
     * Author Name: Hrushikesh
     * Description: Tests the "Phone Directory" link functionality by clicking,
     * checking the URL, and navigating back.
     * Return Type: void
     * Parameter List: None
     */
    public void clickOnPhone() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(ActionsPageLocators.phoneDir);
            assertion.verifyPageUrl("https://my.clevelandclinic.org/about/contact/phone-directory");
            LoggerHandler.info("Phone Directory is clicked and Url verified");
            test.log(Status.INFO, "Phone Directory is clicked and Url verified");
            test.log(Status.PASS, "Phone Directory is clicked and Url verified");
        } catch (Exception e) {
            LoggerHandler.error("Phone Directory not clicked");
            test.log(Status.FAIL, "Phone Directory notclicked");
            Reporter.addScreenshotToReport("Phone", test,"Phone Screenshot",Base.driver);
        } catch (AssertionError e) {
            LoggerHandler.error("Phone Directory Url is not verified");
            test.log(Status.FAIL, "Phone Directory Url is not verified");
        }
    }
 
    /*
     * Method Name: clickOnSecondOpi
     * Author Name: Hrushikesh
     * Description: Clicks the "Virtual Second Opinions" link, validates the URL,
     * and navigates back. LoggerHandler outcomes.
     * Return Type: void
     * Parameter List: None
     */
    public void clickOnSecondOpi() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(ActionsPageLocators.virtualSecond);
            assertion.verifyPageUrl("https://my.clevelandclinic.org/online-services/virtual-second-opinions");
            LoggerHandler.info("Virtual Second Opinions is clicked and Url verified");
            test.log(Status.INFO, "Virtual Second Opinions is clicked and Url verified");
            test.log(Status.PASS, "Virtual Second Opinions is clicked and Url verified");
        } catch (Exception e) {
            LoggerHandler.error("Virtual Second Opinions not clicked");
            test.log(Status.FAIL, "Virtual Second Opinions notclicked");
            Reporter.addScreenshotToReport("SecondOpi", test,"SecondOpi Screenshot",Base.driver);
        } catch (AssertionError e) {
            LoggerHandler.error("Virtual Second Opinions Url is not verified");
            test.log(Status.FAIL, "Virtual Second Opinions Url is not verified");
        }
    }
 
    /*
     * Method Name: clickOnVirtual
     * Author Name: Hrushikesh
     * Description: Clicks the "Virtual Visits" link, verifies the URL, and returns
     * to the original state. Updates the log.
     * Return Type: void
     * Parameter List: None
     */
    public void clickOnVirtual() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(ActionsPageLocators.virtualVisit);
            LoggerHandler.info("Virtual Visits is clicked");
            test.log(Status.INFO, "Virtual Visits is clicked");
            test.log(Status.PASS, "Virtual Visits is clicked");
        } catch (Exception e) {
            LoggerHandler.error("Virtual Visits not clicked");
            test.log(Status.FAIL, "Virtual Visits notclicked");
            Reporter.addScreenshotToReport("Virtual", test,"Virtual Screenshot",Base.driver);
        }
    }
 
    /*
     * Method Name: clickonCleveImg
     * Author Name: Hrushikesh
     * Description: Tests the "Cleveland Clinic" image link functionality by
     * clicking, checking the URL, and navigating back. LoggerHandler results.
     * Return Type: void
     * Parameter List: None
     */
    public void clickonCleveImg() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(ActionsPageLocators.virtualVisit);
            assertion.verifyPageUrl("https://my.clevelandclinic.org/");
            LoggerHandler.info("CleveLand Img is clicked and Url verified");
            test.log(Status.INFO, "CleveLand Img is clicked and Url verified");
            test.log(Status.PASS, "CleveLand Img is clicked and Url verified");
        } catch (Exception e) {
            LoggerHandler.error("CleveLand Img not clicked");
            test.log(Status.FAIL, "CleveLand Img notclicked");
            Reporter.addScreenshotToReport("CleveImg", test,"CleveImg Screenshot",Base.driver);
        } catch (AssertionError e) {
            LoggerHandler.error("CleveLand Img Url is not verified");
            test.log(Status.FAIL, "CleveLand Img Url is not verified");
        }
    }
    /*
     * Method Name: allActions
     * Author Name: Hrushikesh
     * Description: Sequentially executes all defined methods to validate every
     * action element in the "Actions" section.
     * Return Type: void
     * Parameter List: None
     */
 
    public void allActions() {
        verifyActionsSec();
        clickOnAppointments();
        clickOnInsurance();
        clickOnEvent();
        clickOnFinance();
        clickOnCleveLand();
        clickOnPayBill();
        clickOnPrice();
        clickOnRefer();
        clickOnPhone();
        clickOnSecondOpi();
        clickOnVirtual();
        clickonCleveImg();
    }
}
