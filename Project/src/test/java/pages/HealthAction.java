package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HealthPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
 
public class HealthAction {
    public WebDriverHelper helper;
    ExtentTest test;
    public HealthAction(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void clickOnHealthLibrary(){
        try{
        helper.clickByLocater(HealthPageLocators.healthLibrary);
        LoggerHandler.info("Clicked on Health Library");
        test.log(Status.PASS,"Clicked on Health Library");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Health Library failed");
            test.log(Status.FAIL,"Clicked on Health Library failed");
        }
    }
    public void clickOnBody(){
        try{
        helper.scrollToAnElement(HealthPageLocators.bodyOrgans);
        helper.clickByLocater(HealthPageLocators.bodyOrgans);
        LoggerHandler.info("Clicked on BodyOrgans");
        test.log(Status.PASS,"Clicked on BodyOrgans");
        }catch(Exception e){
            LoggerHandler.error("Clicked on BodyOrgans failed");
            test.log(Status.FAIL,"Clicked on BodyOrgans failed");
        }
    }
 
    public void enterEyes(){
        try{
            helper.clickByLocater(HealthPageLocators.searchBar);
            helper.sendData(HealthPageLocators.searchBar, "Eyes");
            helper.enterAction(HealthPageLocators.searchBar);
            LoggerHandler.info("Eyes action performed");
            test.log(Status.PASS,"Eyes action performed");
        }catch(Exception e){
            LoggerHandler.error("Eyes action failed");
            test.log(Status.FAIL,"Eyes action failed");
        }
    }
    public void clickOnEye(){
        try{
            helper.clickByLocater(HealthPageLocators.eyes);
            LoggerHandler.info("Clicked on Eye");
            test.log(Status.PASS,"Clicked on Eye");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Eye failed");
            test.log(Status.FAIL,"Clicked on Eye failed");
        }
    }
    public void clickOnRedEye(){
        try{
            helper.scrollToAnElement(HealthPageLocators.redEye);
            helper.clickByLocater(HealthPageLocators.redEye);
            helper.switchToNewTab();
            LoggerHandler.info("Clicked on RedEye");
            test.log(Status.PASS,"Clicked on RedEye");
        }catch(Exception e){
            LoggerHandler.error("Clicked on RedEye failed");
            test.log(Status.FAIL,"Clicked on RedEye failed");
        }
    }
 
    public void allHealth(){
        clickOnHealthLibrary();
        clickOnBody();
        enterEyes();
        clickOnEye();
        clickOnRedEye();
    }
 
}