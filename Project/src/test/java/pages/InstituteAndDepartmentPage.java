package pages;
 
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.InstituteAndDepartmentLocator;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
/*
 * Class Name: InstituteAndDepartmentPage
 * Author Name: Prithviraj Seth
 * Description: Institute And Department Page on navigation Bar
 * Return Type: NA
 * Params List: NA
 */
public class InstituteAndDepartmentPage {
    WebDriver driver;
    public static WebDriverHelper helper;
    ExtentTest test;
 
    Assertion assertion = new Assertion(Base.driver);
 
    public InstituteAndDepartmentPage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
    }
 
    // Institute and Department
 
    /*
     * Method Name: clickOnInstituteAndDepartment
     * Author Name: Prithviraj Seth
     * Description: click on Institute And Department
     * Return Type: void
     * Params List: NA
     */
    public void clickOnInstituteAndDepartment() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.instituteAndDepartment);
            assertion.verifyFullText("Institutes & Departments",
                    InstituteAndDepartmentLocator.verifyInstituteAndDepartment);
            LoggerHandler.info("Clicked on Institute and Department");
            test.log(Status.INFO, "Clicked on Institute and Department");
            test.log(Status.PASS, "Clicked on Institute and Department");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Institute and Department failed");
            test.log(Status.FAIL, "Clicked on Institute and Department failed");
            Reporter.addScreenshotToReport("Clicked on Institute and Department failed", test, "Clicked on Institute and Department failed", driver);
        }
    }
 
    // Blood Management
 
    /*
     * Method Name: clickOnBloodManagement
     * Author Name: Prithviraj Seth
     * Description: Click On Blood Management
     * Return Type: void
     * Params List: NA
     */
    public void clickOnBloodManagement() {
        try {
            helper.scrollByPixel(0, 3000);
            helper.waitForElementToBeVisible(InstituteAndDepartmentLocator.bloodManagement, 10);
            helper.clickByLocater(InstituteAndDepartmentLocator.bloodManagement);
            // assertion.verifyFullText("Blood Management", InstituteAndDepartmentLocator.verifyBloodManagement);
            Screenshot.captureScreenshot("popup");
            Reporter.addScreenshotToReport("popup", test, "popup", driver);
            LoggerHandler.info("Clicked on Blood Management");
            test.log(Status.INFO, "Clicked on Blood Management");
            test.log(Status.PASS, "Clicked on Blood Management");
 
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Blood Management failed");
            test.log(Status.FAIL, "Clicked on Blood Management failed");
            Reporter.addScreenshotToReport("Clicked on Blood Management failed", test, "Clicked on Blood Management failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnFrequentlyAskedQuestion
     * Author Name: Prithviraj Seth
     * Description: Click On Frequently Asked Question
     * Return Type: void
     * Params List: NA
     */
    public void clickOnFrequentlyAskedQuestion() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.frequentlyAskedQuestions);
            LoggerHandler.info("Clicked on Frequently Asked Question");
            test.log(Status.INFO, "Clicked on Frequently Asked Question");
            test.log(Status.PASS, "Clicked on Frequently Asked Question");
           
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Frequently Asked Question failed");
            test.log(Status.FAIL, "Clicked on Frequently Asked Question failed");
            Reporter.addScreenshotToReport("Clicked on Frequently Asked Question failed", test, "Clicked on Frequently Asked Question failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnPreparingForSurgery
     * Author Name: Prithviraj Seth
     * Description: Click On Preparing For Surgery
     * Return Type: void
     * Params List: NA
     */
    public void clickOnPreparingForSurgery() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.preparingForSurgery);
            LoggerHandler.info("Clicked on Preparing For Surgery");
            test.log(Status.INFO, "Clicked on Preparing For Surgery");
            test.log(Status.PASS, "Clicked on Preparing For Surgery");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Preparing For Surgery failed");
            test.log(Status.FAIL, "Clicked on Preparing For Surgery failed");
            Reporter.addScreenshotToReport("Clicked on Preparing For Surgery failed", test, "Clicked on Preparing For Surgery failed", driver);
        }
    }
 
    /*
     * Method Name: clickOnAnemia
     * Author Name: Prithviraj Seth
     * Description: Click On Anemia
     * Return Type: void
     * Params List: NA
     */
    public void clickOnAnemia() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.anemia);
            LoggerHandler.info("Clicked on Anemia");
            test.log(Status.INFO, "Clicked on Anemia");
            test.log(Status.PASS, "Clicked on Anemia");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Anemia failed");
            test.log(Status.FAIL, "Clicked on Anemia failed");
            Reporter.addScreenshotToReport("Clicked on Anemia failed", test, "Clicked on Anemia failed", driver);
        }
    }
 
    /*
     * Method Name: clickOnRefusingABloodTransfusion
     * Author Name: Prithviraj Seth
     * Description: Click On Refusing A Blood Transfusion
     * Return Type: void
     * Params List: NA
     */
    public void clickOnRefusingABloodTransfusion() {
 
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.refusingABloodTransfusion);
            LoggerHandler.info("Clicked on Refusing A Blood Transfusion");
            test.log(Status.INFO, "Clicked on Refusing A Blood Transfusion");
            test.log(Status.PASS, "Clicked on Refusing A Blood Transfusion");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Refusing A Blood Transfusion failed");
            test.log(Status.FAIL, "Clicked on Refusing A Blood Transfusion failed");
            Reporter.addScreenshotToReport("Clicked on Refusing A Blood Transfusion failed", test, "Clicked on Refusing A Blood Transfusion failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnLocations
     * Author Name: Prithviraj Seth
     * Description: Click On Locations
     * Return Type: void
     * Params List: NA
     */
    public void clickOnLocations() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.locations);
            LoggerHandler.info("Clicked on Locations");
            test.log(Status.INFO, "Clicked on Locations");
            test.log(Status.PASS, "Clicked on Locations");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Locations failed");
            test.log(Status.FAIL, "Clicked on Locations failed");
            Reporter.addScreenshotToReport("Clicked on Locations failed", test, "Clicked on Locations failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnContactsBloodManagement
     * Author Name: Prithviraj Seth
     * Description: Click on Contact Us button
     * Return Type: void
     * Params List: NA
     */
    public void clickOnContactsBloodManagement() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.contactsBloodManagement);
            LoggerHandler.info("Clicked on contacts");
            test.log(Status.INFO, "Clicked on contacts");
            test.log(Status.PASS, "Clicked on contacts");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on contacts failed");
            test.log(Status.FAIL, "Clicked on contacts failed");
            Reporter.addScreenshotToReport("Clicked on contacts failed", test, "Clicked on contacts failed", driver);
        }
 
    }
    // Pharmacy
 
    /*
     * Method Name: clickOnPharmacy
     * Author Name: Prithviraj Seth
     * Description: Click On Pharmacy
     * Return Type: void
     * Params List: NA
     */
    public void clickOnPharmacy() {
 
        try {
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            // Base.driver.navigate().to("https://my.clevelandclinic.org/departments");
            helper.clickByLocater(InstituteAndDepartmentLocator.pharmacy);
            LoggerHandler.info("Clicked on Pharmacy");
            test.log(Status.INFO, "Clicked on Pharmacy");
            test.log(Status.PASS, "Clicked on Pharmacy");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Pharmacy failed");
            test.log(Status.FAIL, "Clicked on Pharmacy failed");
            Reporter.addScreenshotToReport("Clicked on Pharmacy failed", test, "Clicked on Pharmacy failed", driver);
 
        }
 
    }
 
    /*
     * Method Name: switchTabToTakeTheSurvey
     * Author Name: Prithviraj Seth
     * Description: Switch Tab To Take The Survey
     * Return Type: void
     * Params List: NA
     */
    public void switchTabToTakeTheSurvey() {
 
        try {
            helper.scrollByPixel(0, 5000);
            helper.clickByLocater(InstituteAndDepartmentLocator.takeTheSurvey);
            helper.switchToNewTab();
            helper.goBackToWindow(0);
            LoggerHandler.info("verify forms");
            test.log(Status.PASS,"verify forms");
            LoggerHandler.info("Switched tab to take the survey");
            test.log(Status.INFO, "Switched tab to take the survey");
            test.log(Status.PASS, "Switched tab to take the survey");
            LoggerHandler.info("verify forms");
            test.log(Status.INFO, "verify forms");
            test.log(Status.PASS, "verify forms");
            Reporter.addScreenshotToReport(null, test, null, driver);
        } catch (Exception e) {
            LoggerHandler.error("Switched tab to take the survey failed");
            test.log(Status.FAIL, "Switched tab to take the survey failed");
            Reporter.addScreenshotToReport("Switched tab to take the survey failed", test, "Switched tab to take the survey failed", driver);
        }
 
    }
 
    // Contact Us
 
    /*
     * Method Name: clickOnContactUs
     * Author Name: Prithviraj Seth
     * Description: Click On Contact Us
     * Return Type: void
     * Params List: NA
     */
    public void clickOnContactUs() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(InstituteAndDepartmentLocator.contactUs);
            // assertion.verifyFullText("Phone Directory", InstituteAndDepartmentLocator.verifyPhoneDirectory);
            LoggerHandler.info("Clicked on Contact us");
            test.log(Status.INFO, "Clicked on Contact us");
            test.log(Status.PASS, "Clicked on Contact us");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Contact us failed");
            test.log(Status.FAIL, "Clicked on Contact us failed");
            Reporter.addScreenshotToReport("Clicked on Contact us failed", test, "Clicked on Contact us failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnContactClevelandClinic
     * Author Name: Prithviraj Seth
     * Description: Click On Contact Cleveland Clinic
     * Return Type: void
     * Params List: NA
     */
    public void clickOnContactClevelandClinic() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.contactClevelandClinic);
            LoggerHandler.info("Clicked on Contact Cleveland Clinic");
            test.log(Status.INFO, "Clicked on Contact Cleveland Clinic");
            test.log(Status.PASS, "Clicked on Contact Cleveland Clinic");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Contact Cleveland Clinic failed");
            test.log(Status.FAIL, "Clicked on Contact Cleveland Clinic failed");
            Reporter.addScreenshotToReport("Clicked on Contact Cleveland Clinic failed", test, "Clicked on Contact Cleveland Clinic failed", driver);
        }
 
    }
 
    // Need Help
 
    /*
     * Method Name: clickOnNeedHelp
     * Author Name: Prithviraj Seth
     * Description: Click On Need Help
     * Return Type: void
     * Params List: NA
     */
    public void clickOnNeedHelp() {
        try {
            helper.waitForElementToBeVisible(InstituteAndDepartmentLocator.needHelp, 10);
            helper.waitForElementToBeClickable(InstituteAndDepartmentLocator.needHelp, 10);
            helper.clickByLocater(InstituteAndDepartmentLocator.needHelp);
            LoggerHandler.info("Clicked on Need Help");
            test.log(Status.INFO, "Clicked on Need Help");
            test.log(Status.PASS, "Clicked on Need Help");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Need Help failed");
            test.log(Status.FAIL, "Clicked on Need Help failed");
            Reporter.addScreenshotToReport("Clicked on Need Help failed", test, "Clicked on Need Help failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnParking
     * Author Name: Prithviraj Seth
     * Description: Click On Parking
     * Return Type: void
     * Params List: NA
     */
    public void clickOnParking() {
        try {
            // assertion.verifyFullText("Parking", InstituteAndDepartmentLocator.verifyParking);
            helper.clickByLocater(InstituteAndDepartmentLocator.parking);
            LoggerHandler.info("click on parking");
            test.log(Status.INFO, "click on parking");
            test.log(Status.PASS, "click on parking");
        } catch (Exception e) {
            LoggerHandler.error("Failed Clicked on Parking failed");
            test.log(Status.FAIL, "Failed Clicked on Parking failed");
            Reporter.addScreenshotToReport("Failed Clicked on Parking failed", test, "Failed Clicked on Parking failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnTravelAssistance
     * Author Name: Prithviraj Seth
     * Description: Click On Travel Assistance
     * Return Type: void
     * Params List: NA
     */
    public void clickOnTravelAssistance() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.travelAssistance);
            LoggerHandler.info("Clicked on Travel Assistance");
            test.log(Status.INFO, "Clicked on Travel Assistance");
            test.log(Status.PASS, "Clicked on Travel Assistance");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Travel Assistance failed");
            test.log(Status.FAIL, "Clicked on Travel Assistance failed");
            Reporter.addScreenshotToReport("Clicked on Travel Assistance failed", test, "Clicked on Travel Assistance failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnGlobalPatientServices
     * Author Name: Prithviraj Seth
     * Description: Click On Global Patient Services
     * Return Type: void
     * Params List: NA
     */
    public void clickOnGlobalPatientServices() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.globalPatientServices);
            LoggerHandler.info("Clicked on Global Patient Services");
            test.log(Status.INFO, "Clicked on Global Patient Services");
            test.log(Status.PASS, "Clicked on Global Patient Services");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Global Patient Services failed");
            test.log(Status.FAIL, "Clicked on Global Patient Services failed");
            Reporter.addScreenshotToReport("Clicked on Global Patient Services failed", test, "Clicked on Global Patient Services failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnSpeakWithOurTeam
     * Author Name: Prithviraj Seth
     * Description: Click On Speak With Our Team
     * Return Type: void
     * Params List: NA
     */
    public void clickOnSpeakWithOurTeam() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.speakWithOurTeam);
            LoggerHandler.info("Clicked on Speak With Our Team");
            test.log(Status.INFO, "Clicked on Speak With Our Team");
            test.log(Status.PASS, "Clicked on Speak With Our Team");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Speak With Our Team failed");
            test.log(Status.FAIL, "Clicked on Speak With Our Team failed");
            Reporter.addScreenshotToReport("Clicked on Speak With Our Team failed", test, "Clicked on Speak With Our Team failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnVirtualSecondOpinion
     * Author Name: Prithviraj Seth
     * Description: Click On Virtual Second Opinion
     * Return Type: void
     * Params List: NA
     */
    public void clickOnVirtualSecondOpinion() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.virtualSecondOpinion);
            assertion.verifyFullText("Virtual Second Opinions",
                    InstituteAndDepartmentLocator.verifyVirtualSecondOpinion);
            LoggerHandler.info("Clicked on Virtual Second Opinion");
            test.log(Status.INFO, "Clicked on Virtual Second Opinion");
            test.log(Status.PASS, "Clicked on Virtual Second Opinion");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Virtual Second Opinion failed");
            test.log(Status.FAIL, "Clicked on Virtual Second Opinion failed");
            Reporter.addScreenshotToReport("Clicked on Virtual Second Opinion failed", test, "Clicked on Virtual Second Opinion failed", driver);
        }
 
    }
 
    /*
     * Method Name: clickOnGetStarted
     * Author Name: Prithviraj Seth
     * Description: Click On Get Started
     * Return Type: void
     * Params List: NA
     */
    public void clickOnGetStarted() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.getStarted);
            LoggerHandler.info("Clicked on Get Started");
            test.log(Status.INFO, "Clicked on Get Started");
            test.log(Status.PASS, "Clicked on Get Started");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Get Started failed");
            test.log(Status.FAIL, "Clicked on Get Started failed");
            Reporter.addScreenshotToReport("Clicked on Get Started failed", test, "Clicked on Get Started failed", driver);
        }
 
    }
 
    // Merged Lines
 
    /*
     * Method Name: mergeInstituteAndDepartment
     * Author Name: Prithviraj Seth
     * Description: Merged Institute And Department
     * Return Type: void
     * Params List: NA
     */
    public void mergeInstituteAndDepartment() {
        clickOnInstituteAndDepartment();
        clickOnBloodManagement();
        clickOnFrequentlyAskedQuestion();
        clickOnPreparingForSurgery();
        clickOnAnemia();
        clickOnRefusingABloodTransfusion();
        clickOnLocations();
        // clickOnContactsBloodManagement();
        clickOnPharmacy();
        switchTabToTakeTheSurvey();
        clickOnContactUs();
        clickOnContactClevelandClinic();
        clickOnNeedHelp();
        clickOnParking();
        clickOnTravelAssistance();
        clickOnGlobalPatientServices();
        clickOnSpeakWithOurTeam();
        clickOnVirtualSecondOpinion();
        clickOnGetStarted();
    }
 
}