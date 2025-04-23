package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.FindDoctorLocators;
import utils.Assertion;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class FindDoctorActions {
    WebDriver driver;
    WebDriverHelper helper;
    Assertion asserr;
    ExtentTest test;

    public FindDoctorActions(WebDriver driver, ExtentTest test){
        this.driver = driver;
        this.test = test;
        helper = new WebDriverHelper(driver);
        asserr = new Assertion(driver);
    }

    public void clickFindDoctor(){
        helper.clickByLocater(FindDoctorLocators.findDoctor);
    }

    public void enterHeart(){
        helper.clickByLocater(FindDoctorLocators.searchBar);
        helper.sendData(FindDoctorLocators.searchBar, retriveData(1, 0));
        helper.enterAction(FindDoctorLocators.searchBar);
    }

    public void enterLocation(){
        helper.waitForElementToBeVisible(FindDoctorLocators.location, 10);
        helper.clickByLocater(FindDoctorLocators.location);
        helper.sendData(FindDoctorLocators.location, retriveData(4, 0));

        helper.waitForElementToBeVisible(FindDoctorLocators.loc, 10);
        helper.hoverByLocater(FindDoctorLocators.loc);
        helper.clickByLocater(FindDoctorLocators.loc);
    }

    public void enterDepartment(){
        helper.waitForElementToBeVisible(FindDoctorLocators.department, 10);
        helper.clickByLocater(FindDoctorLocators.department);
        helper.sendData(FindDoctorLocators.department, retriveData(5, 0));

        helper.waitForElementToBeVisible(FindDoctorLocators.dept, 10);
        helper.hoverByLocater(FindDoctorLocators.dept);
        helper.clickByLocater(FindDoctorLocators.dept);
    }

    public void enterLanguage(){
        helper.waitForElementToBeVisible(FindDoctorLocators.language, 10);
        helper.clickByLocater(FindDoctorLocators.language);
        helper.sendData(FindDoctorLocators.language, retriveData(6, 0));
        helper.enterAction(FindDoctorLocators.location);
    }

    public void requestAppointment(){
        helper.waitForElementToBeVisible(FindDoctorLocators.language, 10);
        helper.clickByLocater(FindDoctorLocators.appointment);
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
        //requestAppointment();
    }

}


