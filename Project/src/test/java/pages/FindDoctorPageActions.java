package pages;
 
import java.time.Duration;
 
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.FindDoctorPageLocators;
import utils.Assertion;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;
 
public class FindDoctorPageActions {
    WebDriver driver;
    WebDriverHelper helper;
    Assertion asserr;
    ExtentTest test;
 
    public FindDoctorPageActions(WebDriver driver, ExtentTest test){
        this.driver = driver;
        this.test = test;
        helper = new WebDriverHelper(driver);
        asserr = new Assertion(driver);
    }
 
    public void clickFindDoctor(){
        try{
            helper.clickByLocater(FindDoctorPageLocators.findDoctor);
            LoggerHandler.info("Clicked on Find Doctor");
            test.log(Status.PASS,"Clicked on Find Doctor");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Find Doctor failed");
            test.log(Status.FAIL,"Clicked on Find Doctor failed");
        }
    }
 
    public void enterHeart(){
        try{
            helper.clickByLocater(FindDoctorPageLocators.searchBar);
            helper.sendData(FindDoctorPageLocators.searchBar, retriveData(1, 0));
            helper.enterAction(FindDoctorPageLocators.searchBar);
            LoggerHandler.info("Entered input Heart");
            test.log(Status.PASS,"Entered input Heart");
        }catch(Exception e){
            LoggerHandler.error("Entered input Heart failed");
            test.log(Status.FAIL,"Entered input Heart failed");
        }
    }
 
    public void enterLocation(){
        try{
            helper.waitForElementToBeVisible(FindDoctorPageLocators.location, 10);
            helper.clickByLocater(FindDoctorPageLocators.location);
            helper.sendData(FindDoctorPageLocators.location, retriveData(4, 0));
            helper.waitForElementToBeVisible(FindDoctorPageLocators.loc, 10);
            helper.hoverByLocater(FindDoctorPageLocators.loc);
            helper.clickByLocater(FindDoctorPageLocators.loc);
            LoggerHandler.info("Entered Location");
            test.log(Status.PASS,"Entered Location");
        }catch(Exception e){
            LoggerHandler.error("Entered Location failed");
            test.log(Status.FAIL,"Entered Location failed");
        }
    }
 
    public void enterDepartment(){
        try{
            helper.waitForElementToBeVisible(FindDoctorPageLocators.department, 10);
            helper.clickByLocater(FindDoctorPageLocators.department);
            helper.sendData(FindDoctorPageLocators.department, retriveData(5, 0));
    
            helper.waitForElementToBeVisible(FindDoctorPageLocators.dept, 10);
            helper.hoverByLocater(FindDoctorPageLocators.dept);
            helper.clickByLocater(FindDoctorPageLocators.dept);
            LoggerHandler.info("Entered Department");
            test.log(Status.PASS,"Entered Department");
        }catch(Exception e ){
            LoggerHandler.error("Entered Department failed");
            test.log(Status.FAIL,"Entered Department failed");
        }
    }
 
    public void enterLanguage(){
        try{
            helper.waitForElementToBeVisible(FindDoctorPageLocators.language, 10);
            helper.clickByLocater(FindDoctorPageLocators.language);
            helper.sendData(FindDoctorPageLocators.language, retriveData(6, 0));
            helper.enterAction(FindDoctorPageLocators.location);
            LoggerHandler.info("Entered Language");
            test.log(Status.PASS,"Entered Language");
        }catch(Exception e){
            LoggerHandler.error("Entered Language failed");
            test.log(Status.FAIL,"Entered Language failed");
        }
    }
 
 
    public String retriveData(int row, int column){
        return ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/NikhithData.xlsx","Sheet2",row,column);
    }
 
    public void testFindDoctor(){
        clickFindDoctor();
        enterHeart();
        enterLocation();
        enterDepartment();
        enterLanguage();
    }
 
}