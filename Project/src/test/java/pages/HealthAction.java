package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.HealthPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;

import uistore.HealthPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;

import uistore.HealthPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;
 
public class HealthAction {
    public WebDriverHelper helper;
    ExtentTest test;
    /*
 * Method Name: HealthAction
 * Author Name: Hrushikesh
 * Description: Initializes the HealthAction class by setting up the
 * WebDriverHelper instance and linking the ExtentTest instance for
 * reporting purposes.
 * Return Type: Constructor
 * Parameter List:
 *   - ExtentTest test: Instance of ExtentTest for logging and reporting.
 */

    public HealthAction(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test=test;
    }
    /*
 * Method Name: clickOnHealthLibrary
 * Author Name: Hrushikesh
 * Description: Performs a click operation on the Health Library element
 * to navigate to the health-related content section.
 * Return Type: void
 * Parameter List: None
 */
    public void clickOnHealthLibrary(){
        try{
        helper.clickByLocater(HealthPageLocators.healthLibrary);
        LoggerHandler.info("Clicked on Health Library");
        test.log(Status.INFO, "Clicked on Health Library");
        test.log(Status.PASS,"Clicked on Health Library");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Health Library failed");
            test.log(Status.FAIL,"Clicked on Health Library failed");
            Reporter.addScreenshotToReport("HealthLibrary", test, "HealthLibrary", Base.driver);
        }
    }
    /*
 * Method Name: clickOnBody
 * Author Name: Hrushikesh
 * Description: Scrolls to the Body Organs element and clicks to navigate
 * to the Body Organs section.
 * Return Type: void
 * Parameter List: None
 */
    public void clickOnBody(){
        try{
        helper.scrollToAnElement(HealthPageLocators.bodyOrgans);
        helper.clickByLocater(HealthPageLocators.bodyOrgans);
        LoggerHandler.info("Clicked on BodyOrgans");
        test.log(Status.INFO, "Clicked on BodyOrgans");
        test.log(Status.PASS,"Clicked on BodyOrgans");
        }catch(Exception e){
            LoggerHandler.error("Clicked on BodyOrgans failed");
            test.log(Status.FAIL,"Clicked on BodyOrgans failed");
            Reporter.addScreenshotToReport("BodyOrgans", test, "BodyOrgans", Base.driver);
        }
    }
 /*
 * Method Name: enterEyes
 * Author Name: Hrushikesh
 * Description: Performs actions in the search bar by entering the term
 * "Eyes" and executing an enter key action.
 * Return Type: void
 * Parameter List: None
 */
    public void enterEyes(){
        try{
            helper.clickByLocater(HealthPageLocators.searchBar);
            helper.sendData(HealthPageLocators.searchBar, "Eyes");
            helper.enterAction(HealthPageLocators.searchBar);
            LoggerHandler.info("Eyes action performed");
            test.log(Status.INFO, "Eyes action performed");
            test.log(Status.PASS,"Eyes action performed");
        }catch(Exception e){
            LoggerHandler.error("Eyes action failed");
            test.log(Status.FAIL,"Eyes action failed");
            Reporter.addScreenshotToReport("Eyes", test, "Eyes", Base.driver);
        }
    }
    /*
 * Method Name: clickOnEye
 * Author Name: Hrushikesh
 * Description: Clicks on the Eye element to navigate to detailed
 * information about the Eye section.
 * Return Type: void
 * Parameter List: None
 */
    public void clickOnEye(){
        try{
            helper.clickByLocater(HealthPageLocators.eyes);
            LoggerHandler.info("Clicked on Eye");
            test.log(Status.INFO, "Clicked on Eye");
            test.log(Status.PASS,"Clicked on Eye");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Eye failed");
            test.log(Status.FAIL,"Clicked on Eye failed");
            Reporter.addScreenshotToReport("Eye", test, "Eye", Base.driver);
        }
    }
    /*
 * Method Name: clickOnRedEye
 * Author Name: Hrushikesh
 * Description: Scrolls to the Red Eye element, clicks to navigate, and
 * switches to a new browser tab for additional content.
 * Return Type: void
 * Parameter List: None
 */
    public void clickOnRedEye(){
        try{
            helper.scrollToAnElement(HealthPageLocators.redEye);
            helper.clickByLocater(HealthPageLocators.redEye);
            helper.switchToNewTab();
            LoggerHandler.info("Clicked on RedEye");
            test.log(Status.INFO, "Clicked on RedEye");
            test.log(Status.PASS,"Clicked on RedEye");
        }catch(Exception e){
            LoggerHandler.error("Clicked on RedEye failed");
            test.log(Status.FAIL,"Clicked on RedEye failed");
            Reporter.addScreenshotToReport("RedEye", test, "RedEye", Base.driver);
        }
    }
    /*
 * Method Name: allHealth
 * Author Name: Hrushikesh
 * Description: Executes all health-related methods in a sequence, including
 * clicking on Health Library, navigating to Body Organs, performing an Eyes
 * search, and clicking on Eye and Red Eye sections.
 * Return Type: void
 * Parameter List: None
 */
    public void allHealth(){
        clickOnHealthLibrary();
        clickOnBody();
        enterEyes();
        clickOnEye();
        clickOnRedEye();
    }
}
