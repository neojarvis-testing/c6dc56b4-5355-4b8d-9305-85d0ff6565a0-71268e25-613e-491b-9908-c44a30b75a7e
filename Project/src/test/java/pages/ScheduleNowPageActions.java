package pages;
 
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ScheduleNowPageLocators;
import utils.Assertion;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class ScheduleNowPageActions {
    WebDriver driver;
    WebDriverHelper helper;
    Assertion asserr;
    ExtentTest test;
 
    public ScheduleNowPageActions(WebDriver driver, ExtentTest test){
        this.driver = driver;
        this.test = test;
        helper = new WebDriverHelper(driver);
        asserr = new Assertion(driver);
    }
 
    public void clickScheduleNow(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.scheduleNow);
            LoggerHandler.info("Clicked Schedule Now");
            test.log(Status.PASS, "Clicked Schedule Now");
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void clickRequestAnAppointment(){
        try{
            helper.waitForElementToBeVisible(ScheduleNowPageLocators.requestAppointment,6);
            helper.clickByLocater(ScheduleNowPageLocators.requestAppointment);
            LoggerHandler.info("Clicked on Request an Appointment");
            test.log(Status.PASS, "Clicked on Request an Appointment");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on Request an Appointment failed");
            test.log(Status.FAIL, "Clicked on Request an Appointment failed");
        }
    }
 
    public void clickGetStarted(){
        try{
            helper.waitForElementToBeVisible(ScheduleNowPageLocators.heading1, 6);
            helper.clickByLocater(ScheduleNowPageLocators.getStarted);
            LoggerHandler.info("Clicked on Get Started");
            test.log(Status.PASS, "Clicked on Get Started");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on Get Started failed");
            test.log(Status.FAIL, "Clicked on Get Started failed");
        }
    }
 
    public void clickMe(){
        try{
            helper.waitForElementToBeVisible(ScheduleNowPageLocators.meButton, 4);
            helper.clickByLocater(ScheduleNowPageLocators.meButton);
            LoggerHandler.info("Clicked on Me");
            test.log(Status.PASS, "Clicked on Me");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on Me failed");
            test.log(Status.FAIL, "Clicked on Me failed");
        }
    }
 
    public void clickNotSure(){
        try{
            helper.waitForElementToBeVisible(ScheduleNowPageLocators.notSureButton,6);
            helper.clickByLocater(ScheduleNowPageLocators.notSureButton);
            LoggerHandler.info("Clicked on NotSure");
            test.log(Status.PASS, "Clicked on NotSure");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on NotSure failed");
            test.log(Status.FAIL, "Clicked on NotSure failed");
        }
    }
 
    public void enterFirstName(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.firstName);
            helper.sendData(ScheduleNowPageLocators.firstName, retriveData(5, 0));
            LoggerHandler.info("Entered First Name");
            test.log(Status.PASS, "Entered First Name");
        }
        catch(Exception e){
            LoggerHandler.error("Entered First Name failed");
            test.log(Status.FAIL, "Entered First Name failed");
        }
    }
 
    public void enterLastName(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.lastName);
            helper.sendData(ScheduleNowPageLocators.lastName,retriveData(5, 1));
            LoggerHandler.info("Entered Last Name");
            test.log(Status.PASS, "Entered Last Name");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Last Name failed");
            test.log(Status.FAIL, "Entered Last Name failed");
        }
    }
 
    public void selectGender(){
        try{
            helper.dropDown(ScheduleNowPageLocators.gender, retriveData(5, 2));
            LoggerHandler.info("Select Gender");
            test.log(Status.PASS, "Select Gender");
        }
        catch(Exception e){
            LoggerHandler.error("Select Gender failed");
            test.log(Status.FAIL, "Select Gender failed");
        }
    }
 
    public void selectMaritalStatus(){
        try{
            helper.dropDown(ScheduleNowPageLocators.maritalStatus, retriveData(5, 3));
            LoggerHandler.info("Select Marital Status");
            test.log(Status.PASS, "Select Marital Status");
        }
        catch(Exception e){
            LoggerHandler.error("Select Marital Status failed");
            test.log(Status.FAIL, "Select Marital Status failed");
        }
    }
 
    public void enterDateOfBirth(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.dateOfBirth);
            helper.sendData(ScheduleNowPageLocators.dateOfBirth,retriveData(5, 4));
            LoggerHandler.info("Entered Date Of Birth");
            test.log(Status.PASS, "Entered Date Of Birth");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Date Of Birth failed");
            test.log(Status.FAIL, "Entered Date Of Birth failed");
        }
    }
 
    public void enterAddress(){
        try{
            asserr.verifyFullText(retriveData(6,0),ScheduleNowPageLocators.heading4);
            helper.clickByLocater(ScheduleNowPageLocators.address);
            helper.sendData(ScheduleNowPageLocators.address,retriveData(7, 0));
            LoggerHandler.info("Entered Address");
            test.log(Status.PASS, "Entered Address");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Address failed");
            test.log(Status.FAIL, "Entered Address failed");
        }
    }
 
    public void enterCity(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.city);
            helper.sendData(ScheduleNowPageLocators.city,retriveData(7, 1));
            LoggerHandler.info("Entered City");
            test.log(Status.PASS, "Entered City");
        }
        catch(Exception e){
            LoggerHandler.error("Entered City failed");
            test.log(Status.FAIL, "Entered City failed");
        }
    }
 
    public void selectState(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.state);
            helper.sendData(ScheduleNowPageLocators.state,retriveData(7, 2));
            LoggerHandler.info("Selected state");
            test.log(Status.PASS, "Selected state");
        }
        catch(Exception e){
            LoggerHandler.error("Selecting state failed");
            test.log(Status.FAIL, "Selecting state failed");
        }
    }
 
    public void enterZipCode(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.zipCode);
            helper.sendData(ScheduleNowPageLocators.zipCode,retriveData(7, 3));
            LoggerHandler.info("Entered Zipcode");
            test.log(Status.PASS, "Entered Zipcode");
        }
        catch(Exception e){
            LoggerHandler.error("Entering Zipcode failed");
            test.log(Status.FAIL, "Entering Zipcode failed");
        }
    }
 
    public void enterEmail(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.email);
            helper.sendData(ScheduleNowPageLocators.email,retriveData(7, 4));
            LoggerHandler.info("Entered Email");
            test.log(Status.PASS, "Entered Email");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Email failed");
            test.log(Status.FAIL, "Entered Email failed");
        }
    }
 
    public void enterPhoneNumber(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.phoneNumber);
            helper.sendData(ScheduleNowPageLocators.phoneNumber,retriveData(7, 5));
            LoggerHandler.info("Entered Phone Number");
            test.log(Status.PASS, "Entered Phone Number");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Phone Number failed");
            test.log(Status.FAIL, "Entered Phone Number failed");
        }
    }
 
    public void enterReason(){
        try{
            asserr.verifyFullText(retriveData(8, 0), ScheduleNowPageLocators.heading5);
            helper.clickByLocater(ScheduleNowPageLocators.reason);
            helper.sendData(ScheduleNowPageLocators.reason, retriveData(9, 0));
            LoggerHandler.info("Entered Reason");
            test.log(Status.PASS, "Entered Reason");
        }
        catch(Exception e){
            LoggerHandler.error("Entered Reason failed");
            test.log(Status.FAIL, "Entered Reason failed");
        }
    }
 
    public void captureScreen(){
        try{
            asserr.verifyFullText(retriveData(10, 0), ScheduleNowPageLocators.heading6);
            Screenshot.captureScreenshot("Tell us about your appointment needs (cont).");
            LoggerHandler.info("Verified Heading");
            test.log(Status.PASS, "Verified Heading");
        }
        catch(Exception e){
            LoggerHandler.error("Verified Heading failed");
            test.log(Status.FAIL, "Verified Heading failed");
        }
    }
 
    public void clickNext(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.nextButton);
            LoggerHandler.info("Clicked on Next");
            test.log(Status.PASS, "Clicked on Next");
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on Next failed");
            test.log(Status.FAIL, "Clicked on Next failed");
        }
    }
 
    public String retriveData(int row, int column){
        return ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/NikhithData.xlsx","Sheet1",row,column);
    }
 
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