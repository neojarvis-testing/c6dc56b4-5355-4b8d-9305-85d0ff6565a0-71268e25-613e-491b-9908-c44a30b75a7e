package pages;
 
import org.openqa.selenium.WebDriver;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.FindDoctorPageLocators;
import utils.Assertion;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;
 
 
/*
* Class Name : FindDoctorPageActions
* Author Name : Nikhith Sree Sai
* Description : The Class contains the action methods for FindDoctorPage
* Return Type : NA
* Params List : NA
*/
public class FindDoctorPageActions {
    WebDriver driver;
    WebDriverHelper helper;
    Assertion asserr;
    ExtentTest test;
 
    /*
    * Constructor Name : FindDoctorPageActions
    * Author Name : Nikhith Sree Sai
    * Description : The constructor contains the initialization
    * Return Type : NA
    * Params List : WebDriver driver, ExtentTest test
    */
    public FindDoctorPageActions(WebDriver driver, ExtentTest test){
        this.driver = driver;
        this.test = test;
        helper = new WebDriverHelper(driver);
    }
 
    /*
    * Method Name : clickFindDocto
    * Author Name : Nikhith Sree Sai
    * Description : It performs click operation on the findDoctor locator
    * Return Type : NA
    * Params List : NA
    */
    public void clickFindDoctor(){
        try{
            helper.clickByLocater(FindDoctorPageLocators.findDoctor);
            LoggerHandler.info("Clicked on Find Doctor");
            test.log(Status.INFO,"Clicked on Find Doctor");
            test.log(Status.PASS,"Clicked on Find Doctor");
            Reporter.addScreenshotToReport("Clicked on Find Doctor", test, null, driver);
        }
        catch(Exception e){
            LoggerHandler.error("Clicked on Find Doctor failed");
            test.log(Status.FAIL,"Clicked on Find Doctor failed");
            Reporter.addScreenshotToReport("Clicked on Find Doctor failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterHeart
    * Author Name : Nikhith Sree Sai
    * Description : It passes heart value to search bar and performs enter action
    * Return Type : NA
    * Params List : NA
    */
    public void enterHeart(){
        try{
            helper.clickByLocater(FindDoctorPageLocators.searchBar);
            helper.sendData(FindDoctorPageLocators.searchBar, retriveData(1, 0));
            helper.enterAction(FindDoctorPageLocators.searchBar);
            LoggerHandler.info("Entered input Heart");
            test.log(Status.INFO,"Entered input Heart");
            test.log(Status.PASS,"Entered input Heart");
        }
        catch(Exception e){
            LoggerHandler.error("Entered input Heart failed");
            test.log(Status.FAIL,"Entered input Heart failed");
            Reporter.addScreenshotToReport("Entered input Heart failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterLocation
    * Author Name : Nikhith Sree Sai
    * Description : It passes location value to filter and performs click operation
    * Return Type : NA
    * Params List : NA
    */
    public void enterLocation(){
        try{
            helper.waitForElementToBeVisible(FindDoctorPageLocators.location, 10);
            helper.clickByLocater(FindDoctorPageLocators.location);
            helper.sendData(FindDoctorPageLocators.location, retriveData(4, 0));
            LoggerHandler.info("Entered Location");
            test.log(Status.INFO,"Entered Location");
            test.log(Status.PASS,"Entered Location");
           
            helper.waitForElementToBeVisible(FindDoctorPageLocators.loc, 10);
            helper.hoverByLocater(FindDoctorPageLocators.loc);
            helper.clickByLocater(FindDoctorPageLocators.loc);
            LoggerHandler.info("Clicked Location");
            test.log(Status.INFO,"Clicked Location");
            test.log(Status.PASS,"Clicked Location");
            Reporter.addScreenshotToReport("Clicked Location", test, null, driver);
           
        }
        catch(Exception e){
            LoggerHandler.error("Entered Location failed");
            test.log(Status.FAIL,"Entered Location failed");
            Reporter.addScreenshotToReport("Entered Location failed", test, null, driver);
 
            LoggerHandler.error("Clicked Location failed");
            test.log(Status.FAIL,"Clicked Location failed");
            Reporter.addScreenshotToReport("Clicked Location failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterDepartment
    * Author Name : Nikhith Sree Sai
    * Description : It passes department value to filter and performs click operation
    * Return Type : NA
    * Params List : NA
    */
    public void enterDepartment(){
        try{
            helper.waitForElementToBeVisible(FindDoctorPageLocators.department, 10);
            helper.clickByLocater(FindDoctorPageLocators.department);
            helper.sendData(FindDoctorPageLocators.department, retriveData(5, 0));
            LoggerHandler.info("Entered Department");
            test.log(Status.INFO,"Entered Department");
            test.log(Status.PASS,"Entered Department");
   
            helper.waitForElementToBeVisible(FindDoctorPageLocators.dept, 10);
            helper.hoverByLocater(FindDoctorPageLocators.dept);
            helper.clickByLocater(FindDoctorPageLocators.dept);
            LoggerHandler.info("Clicked Department");
            test.log(Status.INFO,"Clicked Department");
            test.log(Status.PASS,"Clicked Department");
            Reporter.addScreenshotToReport("Clicked Department", test, null, driver);
        }
        catch(Exception e ){
            LoggerHandler.error("Entered Department failed");
            test.log(Status.FAIL,"Entered Department failed");
            Reporter.addScreenshotToReport("Entered Department failed", test, null, driver); 
            LoggerHandler.error("Clicked Department failed");
            test.log(Status.FAIL,"Clicked Department failed");
            Reporter.addScreenshotToReport("Clicked Department failed", test, null, driver);
        }
    }
 
    /*
    * Method Name : enterLanguage
    * Author Name : Nikhith Sree Sai
    * Description : It passes language value to filter and performs enter action
    * Return Type : NA
    * Params List : NA
    */
    public void enterLanguage(){
        try{
            helper.waitForElementToBeVisible(FindDoctorPageLocators.language, 10);
            helper.clickByLocater(FindDoctorPageLocators.language);
            helper.sendData(FindDoctorPageLocators.language, retriveData(6, 0));
            helper.enterAction(FindDoctorPageLocators.language);
            LoggerHandler.info("Entered Language");
            test.log(Status.INFO,"Entered Language");
            test.log(Status.PASS,"Entered Language");
            Reporter.addScreenshotToReport("Entered Language", test, null, driver);
        }
        catch(Exception e){
            LoggerHandler.error("Entered Language failed");
            test.log(Status.FAIL,"Entered Language failed");
            Reporter.addScreenshotToReport("Entered Language failed", test, null, driver);
        }
    }
 
 
    /*
    * Method Name : retriveData
    * Author Name : Nikhith Sree Sai
    * Description : It retrieves data from excel sheet by row and column
    * Return Type : String
    * Params List : int row, int column
    */
    public String retriveData(int row, int column){
        try {
            return ExcelReader.readdata(System.getProperty("user.dir")+"/testdata/NikhithData.xlsx","Sheet2",row,column);
        }
        catch (Exception e) {
            LoggerHandler.error("Failed to retrive data");
            test.log(Status.FAIL, "Failed to retieve data");
            Reporter.addScreenshotToReport("Failed to retreive data", test, null, driver);
            return "";
        }
    }
 
    /*
    * Method Name : testFindDoctor
    * Author Name : Nikhith Sree Sai
    * Description : It calls the methods that required for find doctor page actions
    * Return Type : NA
    * Params List : NA
    */
    public void testFindDoctor(){
        clickFindDoctor();
        enterHeart();
        enterLocation();
        enterDepartment();
        enterLanguage();
    }
 
}