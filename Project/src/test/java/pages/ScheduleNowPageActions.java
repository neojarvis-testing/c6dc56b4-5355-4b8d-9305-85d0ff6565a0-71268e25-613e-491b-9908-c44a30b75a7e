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
 
            asserr.verifyFullTitle(retriveData(0, 0));
            LoggerHandler.info("Verified Title");
            test.log(Status.PASS, "Verified Title");
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void clickRequestAnAppointment(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.requestAppointment);
            asserr.verifyFullTitle(retriveData(1, 0));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void clickGetStarted(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.getStarted);
            asserr.verifyFullText(retriveData(2, 0),ScheduleNowPageLocators.heading1);
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void clickMe(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.meButton);
            asserr.verifyFullText(retriveData(3, 0), ScheduleNowPageLocators.heading2);
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void clickNotSure(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.notSureButton);
            asserr.verifyFullText(retriveData(4, 0), ScheduleNowPageLocators.heading3);
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void enterFirstName(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.firstName);
            helper.sendData(ScheduleNowPageLocators.firstName, retriveData(5, 0));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void enterLastName(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.lastName);
            helper.sendData(ScheduleNowPageLocators.lastName,retriveData(5, 1));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void selectGender(){
        try{
            helper.dropDown(ScheduleNowPageLocators.gender, retriveData(5, 2));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void selectMaritalStatus(){
        try{
            helper.dropDown(ScheduleNowPageLocators.maritalStatus, retriveData(5, 3));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void enterDateOfBirth(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.dateOfBirth);
            helper.sendData(ScheduleNowPageLocators.dateOfBirth,retriveData(5, 4));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void enterAddress(){
        try{
            asserr.verifyFullText(retriveData(6,0),ScheduleNowPageLocators.heading4);
            helper.clickByLocater(ScheduleNowPageLocators.address);
            helper.sendData(ScheduleNowPageLocators.address,retriveData(7, 0));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void enterCity(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.city);
            helper.sendData(ScheduleNowPageLocators.city,retriveData(7, 1));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void selectState(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.state);
            helper.sendData(ScheduleNowPageLocators.state,retriveData(7, 2));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void enterZipCode(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.zipCode);
            helper.sendData(ScheduleNowPageLocators.zipCode,retriveData(7, 3));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void enterEmail(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.email);
            helper.sendData(ScheduleNowPageLocators.email,retriveData(7, 4));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void enterPhoneNumber(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.phoneNumber);
            helper.sendData(ScheduleNowPageLocators.phoneNumber,retriveData(7, 5));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void enterReason(){
        try{
            asserr.verifyFullText(retriveData(8, 0), ScheduleNowPageLocators.heading5);
            helper.clickByLocater(ScheduleNowPageLocators.reason);
            helper.sendData(ScheduleNowPageLocators.reason, retriveData(9, 0));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void captureScreen(){
        try{
            asserr.verifyFullText(retriveData(10, 0), ScheduleNowPageLocators.heading6);
            Screenshot.captureScreenshot("Tell us about your appointment needs (cont).");
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }
 
    public void clickNext(){
        try{
            helper.clickByLocater(ScheduleNowPageLocators.nextButton);
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
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