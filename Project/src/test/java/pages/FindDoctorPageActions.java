package pages;
 
import java.time.Duration;
 
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentTest;
 
import uistore.FindDoctorPageLocators;
import utils.Assertion;
import utils.ExcelReader;
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
        helper.clickByLocater(FindDoctorPageLocators.findDoctor);
    }
 
    public void enterHeart(){
        helper.clickByLocater(FindDoctorPageLocators.searchBar);
        helper.sendData(FindDoctorPageLocators.searchBar, retriveData(1, 0));
        helper.enterAction(FindDoctorPageLocators.searchBar);
    }
 
    public void enterLocation(){
        helper.waitForElementToBeVisible(FindDoctorPageLocators.location, 10);
        helper.clickByLocater(FindDoctorPageLocators.location);
        helper.sendData(FindDoctorPageLocators.location, retriveData(4, 0));
 
        helper.waitForElementToBeVisible(FindDoctorPageLocators.loc, 10);
        helper.hoverByLocater(FindDoctorPageLocators.loc);
        helper.clickByLocater(FindDoctorPageLocators.loc);
    }
 
    public void enterDepartment(){
        helper.waitForElementToBeVisible(FindDoctorPageLocators.department, 10);
        helper.clickByLocater(FindDoctorPageLocators.department);
        helper.sendData(FindDoctorPageLocators.department, retriveData(5, 0));
 
        helper.waitForElementToBeVisible(FindDoctorPageLocators.dept, 10);
        helper.hoverByLocater(FindDoctorPageLocators.dept);
        helper.clickByLocater(FindDoctorPageLocators.dept);
    }
 
    public void enterLanguage(){
        helper.waitForElementToBeVisible(FindDoctorPageLocators.language, 10);
        helper.clickByLocater(FindDoctorPageLocators.language);
        helper.sendData(FindDoctorPageLocators.language, retriveData(6, 0));
        helper.enterAction(FindDoctorPageLocators.location);
    }
 
    public void requestAppointment(){
        helper.waitForElementToBeVisible(FindDoctorPageLocators.language, 10);
        helper.clickByLocater(FindDoctorPageLocators.appointment);
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