package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.HealthLibraryPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
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
 
    public void Health(){
        try{
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
            LoggerHandler.info("Scrolled till Health Library");
            test.log(Status.PASS,"Scrolled till Health Library");
        }catch(Exception e){
            LoggerHandler.error("Scrolled failed till Health Library");
            test.log(Status.FAIL,"Scrolled failed till Health Library");
        }
    }
 
    public void Diseases(){
        try{
 
            helper.clickByLocater(HealthLibraryPageLocators.Diseases);
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
            LoggerHandler.info("Clicked on Diseases");
            test.log(Status.PASS,"Clicked on Diseases");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Diseases failed");
            test.log(Status.FAIL,"Clicked on Diseases failed");
        }
    }
 
    public void Diagnostics(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.Diagnostics);
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
            LoggerHandler.info("Clicked on Diagnostics");
            test.log(Status.PASS,"Clicked on Diagnostics");
 
        }catch(Exception e){
            LoggerHandler.error("Clicked on Diagnostics failed");
            test.log(Status.FAIL,"Clicked on Diseases failed");
        }
    }
    public void Treatments(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.Treatments);
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
            LoggerHandler.info("Clicked on Treatments");
            test.log(Status.PASS,"Clicked on Treatments");
           
        }catch(Exception e){
            LoggerHandler.error("Clicked on Treatments failed");
            test.log(Status.FAIL,"Clicked on Treatments failed");
        }
    }
 
    public void Organs(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.BodySystems);
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
            LoggerHandler.info("Clicked on BodySystems");
            test.log(Status.PASS,"Clicked on BodySystems");
        }catch(Exception e){
            LoggerHandler.error("Clicked on BodySystems failed");
            test.log(Status.FAIL,"Clicked on BodySystems failed");
        }
    }
 
    public void Drugs(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.DrugsDevices);
            LoggerHandler.info("Clicked on Drugs");
            test.log(Status.PASS,"Clicked on Drugs");
 
        }catch(Exception e){
            LoggerHandler.error("Clicked on Drugs failed");
            test.log(Status.FAIL,"Clicked on Drugsfailed");
        }
    }
 
   
 
 
    public void test1(){
        Health();
        Diseases();
        Diagnostics();
        Treatments();
        Organs();
        Drugs();
    }
 
 
}
 