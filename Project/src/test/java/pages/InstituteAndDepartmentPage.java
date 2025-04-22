package pages;
 
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.InstituteAndDepartmentLocator;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
 
public class InstituteAndDepartmentPage {
    WebDriver driver;
    public static WebDriverHelper helper;
    ExtentTest test;
 
    public InstituteAndDepartmentPage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
    }
 
    // Institute and Department
    public void clickOnInstituteAndDepartment() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.instituteAndDepartment);
            LoggerHandler.info("Clicked on Institute and Department");
            test.log(Status.PASS, "Clicked on Institute and Department");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Institute and Department");
            test.log(Status.FAIL, "Clicked on Institute and Department");
        }
    }
 
    // Blood Management
    public void clickOnBloodManagement() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.bloodManagement);
            LoggerHandler.info("Clicked on Blood Management");
            test.log(Status.PASS, "Clicked on Blood Management");
 
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Blood Management");
            test.log(Status.FAIL, "Clicked on Blood Management");
        }
 
    }
 
    public void clickOnFrequentlyAskedQuestion() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.frequentlyAskedQuestions);
            LoggerHandler.info("Clicked on Frequently Asked Question");
            test.log(Status.PASS, "Clicked on Frequently Asked Question");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Frequently Asked Question");
            test.log(Status.FAIL, "Clicked on Frequently Asked Question");
        }
 
    }
 
    public void clickOnPreparingForSurgery() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.preparingForSurgery);
            LoggerHandler.info("Clicked on Preparing For Surgery");
            test.log(Status.PASS, "Clicked on Preparing For Surgery");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Preparing For Surgery");
            test.log(Status.FAIL, "Clicked on Preparing For Surgery");
        }
    }
 
    public void clickOnAnemia() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.anemia);
            LoggerHandler.info("Clicked on Anemia");
            test.log(Status.PASS, "Clicked on Anemia");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Anemia");
            test.log(Status.FAIL, "Clicked on Anemia");
        }
    }
 
    public void clickOnRefusingABloodTransfusion() {
 
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.refusingABloodTransfusion);
            LoggerHandler.info("Clicked on Refusing A Blood Transfusion");
            test.log(Status.PASS, "Clicked on Refusing A Blood Transfusion");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Refusing A Blood Transfusion");
            test.log(Status.FAIL, "Clicked on Refusing A Blood Transfusion");
        }
 
    }
 
    public void clickOnLocations() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.locations);
            LoggerHandler.info("Clicked on Locations");
            test.log(Status.PASS, "Clicked on Locations");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Locations");
            test.log(Status.FAIL, "Clicked on Locations");
        }
 
    }
 
    public void clickOnContactsBloodManagement() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.contactsBloodManagement);
            LoggerHandler.info("Clicked on contacts");
            test.log(Status.PASS, "Clicked on contacts");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on contacts");
            test.log(Status.FAIL, "Clicked on contacts");
        }
 
    }
    // Pharmacy
 
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
            test.log(Status.PASS, "Clicked on Pharmacy");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Pharmacy");
            test.log(Status.FAIL, "Clicked on Pharmacy");
 
        }
 
    }
 
    public void switchTabToTakeTheSurvey() {
 
        try {
            helper.scrollByPixel(0, 5000);
            helper.clickByLocater(InstituteAndDepartmentLocator.takeTheSurvey);
            helper.switchToNewTab();
            helper.goBackToWindow(0);
            LoggerHandler.info("Switched tab to take the survey");
            test.log(Status.PASS, "Switched tab to take the survey");
        } catch (Exception e) {
            LoggerHandler.error("Switched tab to take the survey");
            test.log(Status.FAIL, "Switched tab to take the survey");
        }
 
    }
 
    // Contact Us
 
    public void clickOnContactUs() {
        try {
            Base.driver.navigate().back();
            helper.clickByLocater(InstituteAndDepartmentLocator.contactUs);
            LoggerHandler.info("Clicked on Contact us");
            test.log(Status.PASS, "Clicked on Contact us");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Contact us");
            test.log(Status.FAIL, "Clicked on Contact us");
        }
 
    }
 
    public void clickOnContactClevelandClinic() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.contactClevelandClinic);
            LoggerHandler.info("Clicked on Contact Cleveland Clinic");
            test.log(Status.PASS, "Clicked on Contact Cleveland Clinic");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Contact Cleveland Clinic");
            test.log(Status.FAIL, "Clicked on Contact Cleveland Clinic");
        }
 
    }
 
    // Need Help
 
    public void clickOnNeedHelp() {
        try {
            helper.waitForElementToBeVisible(InstituteAndDepartmentLocator.needHelp, 10);
            helper.waitForElementToBeClickable(InstituteAndDepartmentLocator.needHelp, 10);
            helper.clickByLocater(InstituteAndDepartmentLocator.needHelp);
            LoggerHandler.info("Clicked on Need Help");
            test.log(Status.PASS, "Clicked on Need Help");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Need Help");
            test.log(Status.FAIL, "Clicked on Need Help");
        }
 
    }
 
    public void clickOnParking() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.parking);
            LoggerHandler.info("Click on Parking");
            test.log(Status.PASS, "Click on Parking");
        } catch (Exception e) {
            LoggerHandler.error("Failed Clicked on Parking");
            test.log(Status.FAIL, "Failed Clicked on Parking");
        }
 
    }
 
    public void clickOnTravelAssistance() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.travelAssistance);
            LoggerHandler.info("Clicked on Travel Assistance");
            test.log(Status.PASS, "Clicked on Travel Assistance");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Travel Assistance");
            test.log(Status.FAIL, "Clicked on Travel Assistance");
        }
 
    }
 
    public void clickOnGlobalPatientServices() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.globalPatientServices);
            LoggerHandler.info("Clicked on Global Patient Services");
            test.log(Status.PASS, "Clicked on Global Patient Services");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Global Patient Services");
            test.log(Status.FAIL, "Clicked on Global Patient Services");
        }
 
    }
 
    public void clickOnSpeakWithOurTeam() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.speakWithOurTeam);
            LoggerHandler.info("Clicked on Speak With Our Team");
            test.log(Status.PASS, "");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Speak With Our Team");
            test.log(Status.FAIL, "Clicked on Speak With Our Team");
        }
 
    }
 
    public void clickOnVirtualSecondOpinion() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.virtualSecondOpinion);
            LoggerHandler.info("Clicked on Virtual Second Opinion");
            test.log(Status.PASS, "Clicked on Virtual Second Opinion");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Virtual Second Opinion");
            test.log(Status.FAIL, "Clicked on Virtual Second Opinion");
        }
 
    }
 
    public void clickOnGetStarted() {
        try {
            helper.clickByLocater(InstituteAndDepartmentLocator.getStarted);
            LoggerHandler.info("Clicked on Get Started");
            test.log(Status.PASS, "Clicked on Get Started");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Get Started");
            test.log(Status.FAIL, "Clicked on Get Started");
        }
 
    }
 
    // mergeLines
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