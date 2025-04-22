package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ScheduleNowLocators;
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
            helper.clickByLocater(ScheduleNowLocators.scheduleNow);
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
            helper.waitForElementToBeVisible(ScheduleNowLocators.requestAppointment,10);
            //helper.hoverByLocater(ScheduleNowLocators.requestAppointment);
            driver.navigate().refresh();
            helper.clickByLocater(ScheduleNowLocators.requestAppointment);
            asserr.verifyFullTitle(retriveData(1, 0));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void clickGetStarted(){
        try{
            helper.waitForElementToBeVisible(ScheduleNowLocators.getStarted, 10);
            helper.clickByLocater(ScheduleNowLocators.getStarted);
            asserr.verifyFullText(retriveData(2, 0),ScheduleNowLocators.heading1);
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void clickMe(){
        try{
            helper.clickByLocater(ScheduleNowLocators.meButton);
            asserr.verifyFullText(retriveData(3, 0), ScheduleNowLocators.heading2);
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void clickNotSure(){
        try{
            helper.clickByLocater(ScheduleNowLocators.notSureButton);
            asserr.verifyFullText(retriveData(4, 0), ScheduleNowLocators.heading3);
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void enterFirstName(){
        try{
            helper.clickByLocater(ScheduleNowLocators.firstName);
            helper.sendData(ScheduleNowLocators.firstName, retriveData(5, 0));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void enterLastName(){
        try{
            helper.clickByLocater(ScheduleNowLocators.lastName);
            helper.sendData(ScheduleNowLocators.lastName,retriveData(5, 1));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void selectGender(){
        try{
            helper.dropDown(ScheduleNowLocators.gender, retriveData(5, 2));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void selectMaritalStatus(){
        try{
            helper.dropDown(ScheduleNowLocators.maritalStatus, retriveData(5, 3));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void enterDateOfBirth(){
        try{
            helper.clickByLocater(ScheduleNowLocators.dateOfBirth);
            helper.sendData(ScheduleNowLocators.dateOfBirth,retriveData(5, 4));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void enterAddress(){
        try{
            asserr.verifyFullText(retriveData(6,0),ScheduleNowLocators.heading4);
            helper.clickByLocater(ScheduleNowLocators.address);
            helper.sendData(ScheduleNowLocators.address,retriveData(7, 0));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void enterCity(){
        try{
            helper.clickByLocater(ScheduleNowLocators.city);
            helper.sendData(ScheduleNowLocators.city,retriveData(7, 1));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void selectState(){
        try{
            helper.clickByLocater(ScheduleNowLocators.state);
            helper.sendData(ScheduleNowLocators.state,retriveData(7, 2));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void enterZipCode(){
        try{
            helper.clickByLocater(ScheduleNowLocators.zipCode);
            helper.sendData(ScheduleNowLocators.zipCode,retriveData(7, 3));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void enterEmail(){
        try{
            helper.clickByLocater(ScheduleNowLocators.email);
            helper.sendData(ScheduleNowLocators.email,retriveData(7, 4));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void enterPhoneNumber(){
        try{
            helper.clickByLocater(ScheduleNowLocators.phoneNumber);
            helper.sendData(ScheduleNowLocators.phoneNumber,retriveData(7, 5));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void enterReason(){
        try{
            asserr.verifyFullText(retriveData(8, 0), ScheduleNowLocators.heading5);
            helper.clickByLocater(ScheduleNowLocators.reason);
            helper.sendData(ScheduleNowLocators.reason, retriveData(9, 0));
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void captureScreen(){
        try{
            asserr.verifyFullText(retriveData(10, 0), ScheduleNowLocators.heading6);
            Screenshot.captureScreenshot("Tell us about your appointment needs (cont).");
        }
        catch(Exception e){
            LoggerHandler.error("");
            test.log(Status.FAIL, "");
        }
    }

    public void clickNext(){
        try{
            helper.clickByLocater(ScheduleNowLocators.nextButton);
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
