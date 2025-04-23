package pages;
 
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ScheduleNowPageLocators;
import utils.Assertion;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
/*
* Class Name : ScheduleNowPageActions
* Author Name : Nikhith Sree Sai
* Description : The Class contains the action methods for ScheduleNowPage
* Return Type : NA
* Params List : NA
*/ 
public class ScheduleNowPageActions {
    WebDriver driver;
    WebDriverHelper helper;
    Assertion asserr;
    ExtentTest test;
 
    /*
    * Constructor Name : ScheduleNowPageActions
    * Author Name : Nikhith Sree Sai
    * Description : The constructor contains the initialization
    * Return Type : NA
    * Params List : WebDriver driver, ExtentTest test
    */ 
    public ScheduleNowPageActions(WebDriver driver, ExtentTest test){
        this.driver = driver;
        this.test = test;
        helper = new WebDriverHelper(driver);
        asserr = new Assertion(driver);
    }
 
    /*
    * Method Name : clickScheduleNow
    * Author Name : Nikhith Sree Sai
    * Description : It performs click operation on Schedule Now and verifies title
    * Return Type : NA
    * Params List : NA
    */ 
    public void clickScheduleNow(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.scheduleNow);
            LoggerHandler.info("Clicked Schedule Now");
            test.log(Status.INFO,"Clicked Schedule Now");
            test.log(Status.PASS, "Clicked Schedule Now");
 
            asserr.verifyFullPageTitle(retriveData(0, 0));
           // asserr.verifyFullTitle(retriveData(0, 0));
            LoggerHandler.info("Verified Title");
            test.log(Status.INFO,"Verified Title");
            test.log(Status.PASS, "Verified Title");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked Schedule Now failed");
            test.log(Status.FAIL, "Clicked Schedule Now failed");
            Reporter.addScreenshotToReport("Clicked Schedule Now failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : clickRequestAnAppointment
    * Author Name : Nikhith Sree Sai
    * Description : It performs click operation on requestAppointment and verifies title
    * Return Type : NA
    * Params List : NA
    */ 
    public void clickRequestAnAppointment(){
        try{
            helper.waitForElementToBeVisible(ScheduleNowPageLocators.requestAppointment,6);
            helper.clickByLocater(ScheduleNowPageLocators.requestAppointment);
            LoggerHandler.info("Clicked on Request an Appointment");
            test.log(Status.INFO,"Clicked on Request an Appointment");
            test.log(Status.PASS, "Clicked on Request an Appointment");

            asserr.verifyFullPageTitle(retriveData(1, 0));
            LoggerHandler.info("Verified Title");
            test.log(Status.INFO,"Verified Title");
            test.log(Status.PASS, "Verified Title");
            //asserr.verifyFullTitle(retriveData(1, 0));
            LoggerHandler.info("Clicked on Request an Appointment");
            test.log(Status.PASS, "Clicked on Request an Appointment");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on Request an Appointment failed");
            test.log(Status.FAIL, "Clicked on Request an Appointment failed");
            Reporter.addScreenshotToReport("Clicked on Request Appointment failed", test, null, driver);

            LoggerHandler.error("Verified Title");
            test.log(Status.FAIL, "Verified Title");
            Reporter.addScreenshotToReport("Verified Title", test, null, driver);
        }
    }
 
    /*
    * Method Name : clickGetStarted
    * Author Name : Nikhith Sree Sai
    * Description : It performs click operation on getStarted and verifies text
    * Return Type : NA
    * Params List : NA
    */ 
    public void clickGetStarted(){
        try{
            helper.waitForElementToBeVisible(ScheduleNowPageLocators.heading1, 6);
            helper.clickByLocater(ScheduleNowPageLocators.getStarted);
            LoggerHandler.info("Clicked on Get Started");
            test.log(Status.INFO,"Clicked on Get Started");
            test.log(Status.PASS, "Clicked on Get Started");
            Reporter.addScreenshotToReport("Clicked on Get Started", test, null, driver);

            asserr.verifyFullText(retriveData(2, 0),ScheduleNowPageLocators.heading1);
            LoggerHandler.info("Verified Text");
            test.log(Status.INFO,"Verified Text");
            test.log(Status.PASS, "Verified Text");
            //asserr.verifyFullText(retriveData(2, 0),ScheduleNowPageLocators.heading1);
            LoggerHandler.info("Clicked on Get Started");
            test.log(Status.PASS, "Clicked on Get Started");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on Get Started failed");
            test.log(Status.FAIL, "Clicked on Get Started failed");
            Reporter.addScreenshotToReport("Clicked on Get Started failed", test, null, driver);

            LoggerHandler.error("Verified Text");
            test.log(Status.FAIL, "Verified Text");
            Reporter.addScreenshotToReport("Verified Text", test, null, driver);
        }
    }
 
    /*
    * Method Name : clickMe
    * Author Name : Nikhith Sree Sai
    * Description : It performs click operation on me button and verifies text
    * Return Type : NA
    * Params List : NA
    */ 
    public void clickMe(){
        try{
            helper.waitForElementToBeVisible(ScheduleNowPageLocators.meButton, 4);
            helper.clickByLocater(ScheduleNowPageLocators.meButton);
            LoggerHandler.info("Clicked on Me");
            test.log(Status.INFO,"Clicked on Me");
            test.log(Status.PASS, "Clicked on Me");

            asserr.verifyFullText(retriveData(3, 0), ScheduleNowPageLocators.heading2);
            LoggerHandler.info("Verified Text");
            test.log(Status.INFO,"Verified Text");
            test.log(Status.PASS, "Verified Text");
            //asserr.verifyFullText(retriveData(3, 0), ScheduleNowPageLocators.heading2);
            LoggerHandler.info("Clicked on Me");
            test.log(Status.PASS, "Clicked on Me");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on Me failed");
            test.log(Status.FAIL, "Clicked on Me failed");
            Reporter.addScreenshotToReport("Clicked on Me failed", test, null, driver);

            LoggerHandler.error("Verified Text");
            test.log(Status.FAIL, "Verified Text");
            Reporter.addScreenshotToReport("Verified Text", test, null, driver);
        }
    }
 
    /*
    * Method Name : clickNotSure
    * Author Name : Nikhith Sree Sai
    * Description : It performs click operation on notSure Button and verifies text
    * Return Type : NA
    * Params List : NA
    */ 
    public void clickNotSure(){
        try{
            helper.waitForElementToBeVisible(ScheduleNowPageLocators.notSureButton,6);
            helper.clickByLocater(ScheduleNowPageLocators.notSureButton);
            LoggerHandler.info("Clicked on NotSure");
            test.log(Status.INFO,"Clicked on Not Sure");
            test.log(Status.PASS, "Clicked on NotSure");
            Reporter.addScreenshotToReport("Clicked on NotSure", test, null, driver);
            
            asserr.verifyFullText(retriveData(4, 0), ScheduleNowPageLocators.heading3);
            LoggerHandler.info("Verified Text");
            test.log(Status.INFO,"Verified Text");
            test.log(Status.PASS, "Verified Text");
            //asserr.verifyFullText(retriveData(4, 0), ScheduleNowPageLocators.heading3);
            LoggerHandler.info("Clicked on NotSure");
            test.log(Status.PASS, "Clicked on NotSure");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on NotSure failed");
            test.log(Status.FAIL, "Clicked on NotSure failed");
            Reporter.addScreenshotToReport("Clicked on NotSure failed", test, null, driver);

            LoggerHandler.error("Verified Text");
            test.log(Status.FAIL, "Verified Text");
            Reporter.addScreenshotToReport("Verified Text", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterFirstName
    * Author Name : Nikhith Sree Sai
    * Description : It passes first name in the field 
    * Return Type : NA
    * Params List : NA
    */ 
    public void enterFirstName(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.firstName);
            helper.sendData(ScheduleNowPageLocators.firstName, retriveData(5, 0));
            LoggerHandler.info("Entered First Name");
            test.log(Status.INFO,"Entered First Name");
            test.log(Status.PASS, "Entered First Name");
        }
        catch(Exception e){
            LoggerHandler.error("Entered First Name failed");
            test.log(Status.FAIL, "Entered First Name failed");
            Reporter.addScreenshotToReport("Entered First Name failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterLastName
    * Author Name : Nikhith Sree Sai
    * Description : It passes last name in the field
    * Return Type : NA
    * Params List : NA
    */ 
    public void enterLastName(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.lastName);
            helper.sendData(ScheduleNowPageLocators.lastName,retriveData(5, 1));
            LoggerHandler.info("Entered Last Name");
            test.log(Status.INFO,"Entered Last Name");
            test.log(Status.PASS, "Entered Last Name");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Last Name failed");
            test.log(Status.FAIL, "Entered Last Name failed");
            Reporter.addScreenshotToReport("Entered Last Name failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : selectGender
    * Author Name : Nikhith Sree Sai
    * Description : It selects gender in dropdown 
    * Return Type : NA
    * Params List : NA
    */ 
    public void selectGender(){
        try{
            helper.dropDown(ScheduleNowPageLocators.gender, retriveData(5, 2));
            LoggerHandler.info("Select Gender");
            test.log(Status.INFO,"Select Gender");
            test.log(Status.PASS, "Select Gender");
        }
        catch(Exception e){
            LoggerHandler.error("Select Gender failed");
            test.log(Status.FAIL, "Select Gender failed");
            Reporter.addScreenshotToReport("Select Gender failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : selectMaritalStatus
    * Author Name : Nikhith Sree Sai
    * Description : It selects Marital Status In the dropdown
    * Return Type : NA
    * Params List : NA
    */ 
    public void selectMaritalStatus(){
        try{
            helper.dropDown(ScheduleNowPageLocators.maritalStatus, retriveData(5, 3));
            LoggerHandler.info("Select Marital Status");
            test.log(Status.INFO,"Select Marital Status");
            test.log(Status.PASS, "Select Marital Status");
        }
        catch(Exception e){
            LoggerHandler.error("Select Marital Status failed");
            test.log(Status.FAIL, "Select Marital Status failed");
            Reporter.addScreenshotToReport("Select Marital Status failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterDateOfBirth
    * Author Name : Nikhith Sree Sai
    * Description : It passes date to the field
    * Return Type : NA
    * Params List : NA
    */ 
    public void enterDateOfBirth(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.dateOfBirth);
            helper.sendData(ScheduleNowPageLocators.dateOfBirth,retriveData(5, 4));
            LoggerHandler.info("Entered Date Of Birth");
            test.log(Status.INFO,"Entered Date Of Birth");
            test.log(Status.PASS, "Entered Date Of Birth");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Date Of Birth failed");
            test.log(Status.FAIL, "Entered Date Of Birth failed");
            Reporter.addScreenshotToReport("Entered Date Of failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterAddress
    * Author Name : Nikhith Sree Sai
    * Description : It verifies text and passes address in the field
    * Return Type : NA
    * Params List : NA
    */ 
    public void enterAddress(){
        try{
            asserr.verifyFullText(retriveData(6,0),ScheduleNowPageLocators.heading4);
            helper.clickByLocater(ScheduleNowPageLocators.address);
            helper.sendData(ScheduleNowPageLocators.address,retriveData(7, 0));
            LoggerHandler.info("Verified Text");
            test.log(Status.INFO,"Verified Text");
            test.log(Status.PASS, "Verified Text");

            LoggerHandler.info("Entered Address");
            test.log(Status.INFO,"Entered Address");
            test.log(Status.PASS, "Entered Address");
        }
        catch(Exception e){
            LoggerHandler.error("Verified Text");
            test.log(Status.FAIL, "Verified Text");
            Reporter.addScreenshotToReport("Verified Text", test, null, driver);

            LoggerHandler.error("Entered Address failed");
            test.log(Status.FAIL, "Entered Address failed");
            Reporter.addScreenshotToReport("Entered Address failed", test, null, driver);
            LoggerHandler.info("Entered Address");
            test.log(Status.PASS, "Entered Address");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Address failed");
            test.log(Status.FAIL, "Entered Address failed");
        }
    }
 
    /*
    * Method Name : enterCity
    * Author Name : Nikhith Sree Sai
    * Description : It passes city in the field
    * Return Type : NA
    * Params List : NA
    */ 
    public void enterCity(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.city);
            helper.sendData(ScheduleNowPageLocators.city,retriveData(7, 1));
            LoggerHandler.info("Entered City");
            test.log(Status.INFO,"Entered City");
            test.log(Status.PASS, "Entered City");
        }
        catch(Exception e){
            LoggerHandler.error("Entered City failed");
            test.log(Status.FAIL, "Entered City failed");
            Reporter.addScreenshotToReport("Entered City failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : selectState
    * Author Name : Nikhith Sree Sai
    * Description : It selects the state in dropdown
    * Return Type : NA
    * Params List : NA
    */ 
    public void selectState(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.state);
            helper.sendData(ScheduleNowPageLocators.state,retriveData(7, 2));
            LoggerHandler.info("Selected state");
            test.log(Status.INFO,"Selected state");
            test.log(Status.PASS, "Selected state");
        }
        catch(Exception e){
            LoggerHandler.error("Selecting state failed");
            test.log(Status.FAIL, "Selecting state failed");
            Reporter.addScreenshotToReport("Selecting state failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterZipCode
    * Author Name : Nikhith Sree Sai
    * Description : It passes ZipCode in the field
    * Return Type : NA
    * Params List : NA
    */ 
    public void enterZipCode(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.zipCode);
            helper.sendData(ScheduleNowPageLocators.zipCode,retriveData(7, 3));
            LoggerHandler.info("Entered Zipcode");
            test.log(Status.INFO,"Entered Zipcode");
            test.log(Status.PASS, "Entered Zipcode");
        }
        catch(Exception e){
            LoggerHandler.error("Entering Zipcode failed");
            test.log(Status.FAIL, "Entering Zipcode failed");
            Reporter.addScreenshotToReport("Entered Zipcode failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterEmail
    * Author Name : Nikhith Sree Sai
    * Description : It passes email in the field
    * Return Type : NA
    * Params List : NA
    */ 
    public void enterEmail(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.email);
            helper.sendData(ScheduleNowPageLocators.email,retriveData(7, 4));
            LoggerHandler.info("Entered Email");
            test.log(Status.INFO,"Entered Email");
            test.log(Status.PASS, "Entered Email");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Email failed");
            test.log(Status.FAIL, "Entered Email failed");
            Reporter.addScreenshotToReport("Entered Email failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterPhoneNumber
    * Author Name : Nikhith Sree Sai
    * Description : It passes phone number in the field
    * Return Type : NA
    * Params List : NA
    */ 
    public void enterPhoneNumber(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.phoneNumber);
            helper.sendData(ScheduleNowPageLocators.phoneNumber,retriveData(7, 5));
            LoggerHandler.info("Entered Phone Number");
            test.log(Status.INFO,"Entered Phone Number");
            test.log(Status.PASS, "Entered Phone Number");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Phone Number failed");
            test.log(Status.FAIL, "Entered Phone Number failed");
            Reporter.addScreenshotToReport("Entered Phone Number failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterReason
    * Author Name : Nikhith Sree Sai
    * Description : It verifies text and passes reason in the field 
    * Return Type : NA
    * Params List : NA
    */ 
    public void enterReason(){
        try{
            asserr.verifyFullText(retriveData(8, 0), ScheduleNowPageLocators.heading5);
            LoggerHandler.info("Verified Text");
            test.log(Status.INFO,"Verified Text");
            test.log(Status.PASS, "Verified Text");
            
            helper.clickByLocater(ScheduleNowPageLocators.reason);
            helper.sendData(ScheduleNowPageLocators.reason, retriveData(9, 0));
            LoggerHandler.info("Entered Reason");
            test.log(Status.INFO,"Entered Reason");
            test.log(Status.PASS, "Entered Reason");
            Reporter.addScreenshotToReport("Entered Reason", test, null, driver);
        }
        catch(Exception e){
            LoggerHandler.error("Verified Text");
            test.log(Status.FAIL, "Verified Text");
            Reporter.addScreenshotToReport("Verified Text", test, null, driver);

            LoggerHandler.error("Entered Reason failed");
            test.log(Status.FAIL, "Entered Reason failed");
            Reporter.addScreenshotToReport("Entered Reason failed", test, null, driver);
            test.log(Status.PASS, "Entered Reason");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Reason failed");
            test.log(Status.FAIL, "Entered Reason failed");
        }
    }
 
    /*
    * Method Name : captureScreen
    * Author Name : Nikhith Sree Sai
    * Description : It captures a screenshot of page
    * Return Type : NA
    * Params List : NA
    */ 
    public void captureScreen(){
        try{
            asserr.verifyFullText(retriveData(10, 0), ScheduleNowPageLocators.heading6);
            LoggerHandler.info("Verified Heading");
            test.log(Status.INFO,"Verified Heading");
            test.log(Status.PASS, "Verified Heading");

            Screenshot.captureScreenshot("Tell us about your appointment needs (cont).");
            LoggerHandler.info("Captured Screenshot");
            test.log(Status.INFO,"Captured Screenshot");
            test.log(Status.PASS, "Captured Screenshot");
            LoggerHandler.info("Verified Heading");
            test.log(Status.PASS, "Verified Heading");
        }
        catch(Exception e){
            LoggerHandler.error("Verified Heading failed");
            test.log(Status.FAIL, "Verified Heading failed");
            Reporter.addScreenshotToReport("Verified Heading failed", test, null, driver);

            LoggerHandler.error("Captured Screenshot failed");
            test.log(Status.FAIL, "Captured Screenshot failed");
            Reporter.addScreenshotToReport("Captured Screenshot failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : clickNext
    * Author Name : Nikhith Sree Sai
    * Description : It performs the click operation on next button
    * Return Type : NA
    * Params List : NA
    */ 
    public void clickNext(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.nextButton);
            LoggerHandler.info("Clicked on Next");
            test.log(Status.INFO,"Clicked on Find Doctor");
            test.log(Status.PASS, "Clicked on Next");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on Next failed");
            test.log(Status.FAIL, "Clicked on Next failed");
            Reporter.addScreenshotToReport("Clicked on Next failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : retrieveData
    * Author Name : Nikhith Sree Sai
    * Description : It retrieves data from excel sheet by row and column
    * Return Type : String
    * Params List : int row, int column
    */ 
    public String retriveData(int row, int column){
        try {
            return ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/NikhithData.xlsx","Sheet1",row,column);
        } 
        catch (Exception e) {
            LoggerHandler.error("Failed to retrive data");
            test.log(Status.FAIL, "Failed to retrieve data");
            Reporter.addScreenshotToReport("Failed to retreive data", test, null, driver);
            return "";
        }
    }
 
    /*
    * Method Name : testScheduleNow
    * Author Name : Nikhith Sree Sai
    * Description : It calls the methods that required for find doctor page actions 
    * Return Type : NA
    * Params List : NA
    */ 
    public void testScheduleNow(){
        clickScheduleNow();
        clickRequestAnAppointment();
        clickGetStarted();
        clickMe();
        clickNotSure();
        enterFirstName();
        enterLastName();
        selectGender();
        selectMaritalStatus();
        enterDateOfBirth();
        clickNext();
        enterAddress();
        enterCity();
        selectState();
        enterZipCode();
        enterEmail();
        enterPhoneNumber();
        clickNext();
        enterReason();
        clickNext();
        captureScreen();
    }
}