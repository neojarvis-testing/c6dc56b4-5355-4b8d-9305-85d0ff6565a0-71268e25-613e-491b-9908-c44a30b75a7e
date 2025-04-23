package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HomePageLocators;
import uistore.OhioPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
/*
    * a. Class name : OhioPageActions
    * b. Author : Dharen
    * c. Description : This class provides methods to interact with elements related to the Get Directions section.
*/
public class OhioPageActions {
    public static WebDriverHelper helper;
    public static ExtentTest test;
 
    /*
     * a. Constructor name : OhioPageActions
     * b. Author : Dharen
     * c. Description : Initializes the WebDriverHelper instance with the current
     * driver and associates the ExtentTest instance for reporting.
     * d. Parameter list :
     * - ExtentTest test: Instance of ExtentTest to log actions and results in the
     * test report.
     */
    public OhioPageActions(ExtentTest test) {
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
    }
 
    /*
     * a. Method name : clickOnGetDirection
     * b. Author : Dharen
     * c. Description : This method is used for clicking on "Get directions" button.
     * d. Return type : void
     * e. Parameter list : none
     */
    public void clickOnGetDirection() {
        try {
            Screenshot.captureScreenshot("Home Page");
            Reporter.addScreenshotToReport("HomePage", test, "HomePage", Base.driver);
            test.log(Status.INFO, "click on Get Directions");
            helper.waitForElementToBeVisible(HomePageLocators.getdirections, 4);
            helper.scrollToAnElement(HomePageLocators.getdirections);
            helper.clickByLocater(HomePageLocators.getdirections);
            LoggerHandler.info("Clicked on Get Directions.");
            test.log(Status.PASS, "Clicked on Get Directions.");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Get Directions.");
            test.log(Status.FAIL, "Failed to click on Get Directions.");
            Screenshot.captureScreenshot("Failed to click get directions");
            Reporter.addScreenshotToReport(null, test, null, Base.driver);
        }
    }
 
    /*
     * a. Method name : clickOnSearchBar
     * b. Author : Dharen
     * c. Description : This method is used for clicking on "Search bar" in find a
     * location page.
     * d. Return type : void
     * e. Parameter list : none
     */
    public void clickOnSearchBar() {
        try {
            test.log(Status.INFO, "click on Search Bar");
            helper.waitForElementToBeVisible(OhioPageLocators.searchbox, 4);
            helper.clickByLocater(OhioPageLocators.searchbox);
            LoggerHandler.info("Clicked on Search bar");
            test.log(Status.PASS, "clicked on Search bar");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on search bar");
            test.log(Status.FAIL, "Failed to click on search bar");
            Screenshot.captureScreenshot("Failed to click on search bar");
            Reporter.addScreenshotToReport(null, test, null, Base.driver);
        }
    }
 
    /*
     * a. Method name : enterOhio
     * b. Author : Dharen
     * c. Description : This method is used enter "Ohio" in search bar.
     * d. Return type : void
     * e. Parameter list : none
     */
    public void enterOhio() {
        try {
            test.log(Status.INFO, "enter Ohio");
            helper.waitForElementToBeVisible(OhioPageLocators.searchbox, 4);
            helper.sendData(OhioPageLocators.searchbox, "Ohio");
            LoggerHandler.info("Entered Ohio");
            test.log(Status.PASS, "Entered Ohio");
        } catch (Exception e) {
            LoggerHandler.error("Failed to enter Ohio");
            test.log(Status.FAIL, "Failed to enter Ohio");
            Screenshot.captureScreenshot("Failed to enter Ohio");
            Reporter.addScreenshotToReport(null, test, null, Base.driver);
        }
    }
 
    /*
     * a. Method name : locationtype
     * b. Author : Dharen
     * c. Description : This method is to click on "location type" in find a
     * location page.
     * d. Return type : void
     * e. Parameter list : none
     */
    public void locationtype() {
        try {
            test.log(Status.INFO, "click on Location Type");
            helper.waitForElementToBeVisible((OhioPageLocators.locationtype), 6);
            helper.clickByLocater(OhioPageLocators.locationtype);
            LoggerHandler.info("Clicked on Location type");
            test.log(Status.PASS, "Clicked on Location Type");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Location type");
            test.log(Status.FAIL, "Failed to click on Location type");
            Screenshot.captureScreenshot("Failed to click on Location type");
            Reporter.addScreenshotToReport(null, test, null, Base.driver);
        }
    }
 
    /*
     * a. Method name : selecthealthcenters
     * b. Author : Dharen
     * c. Description : This method is used to select "healthcenters".
     * d. Return type : void
     * e. Parameter list : none
     */
    public void selecthealthcenters() {
        try {
            test.log(Status.INFO, "select Health Centers.");
            helper.hoverByLocater(OhioPageLocators.healthcenters);
            helper.clickByLocater(OhioPageLocators.healthcenters);
            LoggerHandler.info("Selected Health Centers");
            test.log(Status.PASS, "Selected Health Centers");
        } catch (Exception e) {
            LoggerHandler.error("Failed to select health centers");
            test.log(Status.FAIL, "Failed to select health centers");
            Screenshot.captureScreenshot("Failed to select health centers");
            Reporter.addScreenshotToReport(null, test, null, Base.driver);
        }
    }
 
    /*
     * a. Method name : selectimagingradiology
     * b. Author : Dharen
     * c. Description : This method is used for selecting "imagingradiology".
     * d. Return type : void
     * e. Parameter list : none
     */
    public void selectimagingradiology() {
        try {
            test.log(Status.INFO, "select Imaging Radiology.");
            helper.clickByLocater(OhioPageLocators.locationtype);
            helper.waitForElementToBeVisible(OhioPageLocators.imagingradiology, 6);
            helper.hoverByLocater(OhioPageLocators.imagingradiology);
            helper.clickByLocater(OhioPageLocators.imagingradiology);
            LoggerHandler.info("Selected Imaging Radiology");
            test.log(Status.PASS, "Selected Imaging Radiology");
        } catch (Exception e) {
            LoggerHandler.error("Failed to select Imaging Radiology");
            test.log(Status.FAIL, "Failed to select to Imaging Radiology");
            Screenshot.captureScreenshot("Failed to select Imaging radiology");
            Reporter.addScreenshotToReport(null, test, null, Base.driver);
 
        }
    }
 
    /*
     * a. Method name : ohiotest
     * b. Author : Dharen
     * c. Description : It is concrete method.
     * d. Return type : void
     * e. Parameter list : none
     */
    public void ohiotest() {
        clickOnGetDirection();
        enterOhio();
        locationtype();
        selecthealthcenters();
        selectimagingradiology();
    }
}

