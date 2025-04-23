package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.HealthLibraryPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class HealthLibraryPageActions {
    public WebDriverHelper helper;
    public Assertion pa;
    ExtentTest test;
   
    public HealthLibraryPageActions(ExtentTest test) {
            helper= new WebDriverHelper(Base.driver);
            pa=new Assertion(Base.driver);
            this.test=test;
         
    }
     /*
     * a. MethodName: health
     * b. AuthorName: Arun Kumar
     * c. Description: This is used to scrolldown to HealthLibrary.
     * d. Parameters: None
     * e. Return Type: void
     */
 
    public void health(){
        try{
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
            LoggerHandler.info("Scrolled till Health Library");
            test.log(Status.PASS,"Scrolled till Health Library");
        }catch(Exception e){
            LoggerHandler.error("Scrolled failed till Health Library");
            test.log(Status.FAIL,"Scrolled failed till Health Library");
        }
    }
     /*
     * a. MethodName: diseases
     * b. AuthorName: Arun Kumar
     * c. Description: This is used to click on diseases.
     * d. Parameters: None
     * e. Return Type: void
     */
 
    public void diseases(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.Diseases);
            LoggerHandler.info("Clicked on Diseases");
            Screenshot.captureScreenshot("clicked on diseases");
            test.log(Status.INFO,"clicked on diseases");
            test.log(Status.PASS,"Clicked on Diseases");
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            LoggerHandler.info("Clicked on BackHealth");
            test.log(Status.INFO,"Clicked on BackHealth");
            test.log(Status.PASS,"Clicked on BackHealth");
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
            LoggerHandler.info("Clicked on Diseases");
            test.log(Status.PASS,"Clicked on Diseases");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Diseases Failed");
            test.log(Status.FAIL,"Clicked on Diseases Failed");
            LoggerHandler.error("Clicked on BackHealth Failed");
            test.log(Status.FAIL,"Clicked on BackHealth Failed");
            Reporter.addScreenshotToReport("Diseases failed", test, "Diseases failed", null);
            LoggerHandler.error("Clicked on Diseases failed");
            test.log(Status.FAIL,"Clicked on Diseases failed");
        }
    }
 
     /*
     * a. MethodName: diagnostics
     * b. AuthorName: Arun Kumar
     * c. Description: This is used to click on diagnostics.
     * d. Parameters: None
     * e. Return Type: void
     */
 
    public void diagnostics(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.Diagnostics);
            LoggerHandler.info("Clicked on Diagnostics");
            test.log(Status.INFO,"Clicked on Diagnostics");
            test.log(Status.PASS,"Clicked on Diagnostics");
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            LoggerHandler.info("Clicked on BackHealth");
            test.log(Status.INFO,"Clicked on BackHealth");
            test.log(Status.PASS,"Clicked on BackHealth");
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
        }catch(Exception e){
            LoggerHandler.error("Clicked on Diagnostics Failed");
            test.log(Status.FAIL,"Clicked on Diagnostics Failed");
            LoggerHandler.error("Clicked on BackHealth Failed ");
            test.log(Status.FAIL,"Clicked on BackHealth Failed");
            Reporter.addScreenshotToReport("Diagnostics failed", test, "Diagnostics failed", null);
        }
    }
 
     /*
     * a. MethodName: treatments
     * b. AuthorName: Arun Kumar
     * c. Description: This is used to click on treatments.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void treatments(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.Treatments);
            LoggerHandler.info("Clicked on Treatments");
            test.log(Status.INFO,"Clicked on Treatments");
            test.log(Status.PASS,"Clicked on Treatments");
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            LoggerHandler.info("Clicked on BackHealth");
            test.log(Status.INFO,"Clicked on BackHealth");
            test.log(Status.PASS,"Clicked on BackHealth");
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
        }catch(Exception e){
            LoggerHandler.error("Clicked on Treatments Failed");
            test.log(Status.FAIL,"Clicked on Treatments Failed");
            LoggerHandler.error("Clicked on BackHealth Failed ");
            test.log(Status.FAIL,"Clicked on BackHealth Failed");
            Reporter.addScreenshotToReport("Treatments failed", test, "Treatments failed", null);
        }
    }
 
     /*
     * a. MethodName: organs
     * b. AuthorName: Arun Kumar
     * c. Description: This is used to click on organs.
     * d. Parameters: None
     * e. Return Type: void
     */
    public void organs(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.BodySystems);
            LoggerHandler.info("Clicked on BodySystems");
            test.log(Status.INFO,"Clicked on BodySystems");
            test.log(Status.PASS,"Clicked on BodySystems");
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            LoggerHandler.info("Clicked on BackHealth");
            test.log(Status.INFO,"Clicked on BackHealth");
            test.log(Status.PASS,"Clicked on BackHealth");
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
            LoggerHandler.info("Clicked on BodySystems");
            test.log(Status.PASS,"Clicked on BodySystems");
        }catch(Exception e){
            LoggerHandler.error("Clicked on BodySystems Failed");
            test.log(Status.FAIL,"Clicked on BodySystems Failed");
            LoggerHandler.error("Clicked on BackHealth Failed ");
            test.log(Status.FAIL,"Clicked on BackHealth Failed");
            Reporter.addScreenshotToReport("BodySystems failed", test, "BodySystems failed", null);
            LoggerHandler.error("Clicked on BodySystems failed");
            test.log(Status.FAIL,"Clicked on BodySystems failed");
        }
    }
 
     /*
     * a. MethodName: drugs
     * b. AuthorName: Arun Kumar
     * c. Description: This is used to click on drugs.
     * d. Parameters: None
     * e. Return Type: void
     */
 
    public void drugs(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.DrugsDevices);
            LoggerHandler.info("Clicked on DrugsDevices");
            test.log(Status.INFO,"Clicked on DrugsDevices");
            test.log(Status.PASS,"Clicked on DrugsDevices");
        }catch(Exception e){
            LoggerHandler.error("Clicked on DrugsDevices Failed ");
            test.log(Status.FAIL,"Clicked on DrugsDevices Failed");
            Reporter.addScreenshotToReport("DrugsDevices failed", test, "DrugsDevices failed", null);
        }
    }
     /*
     * a. MethodName: HealthLibraryTestcase
     * b. AuthorName: Arun kumar
     * c. Description: This is used to cluster method of HealthLibraryPageActions.
     * d. Parameters: None
     * e. Return Type: void
     */
 
    public void HealthLibraryTestcase(){
            health();
            diseases();
            diagnostics();
            treatments();
            organs();
            drugs();
    }
 
 
}