package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.OhioPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class OhioPageActions {
    public static WebDriverHelper helper; 
    public static ExtentTest test;

    public OhioPageActions(ExtentTest test) {
        this.test=test;

    }
    public void clickOnGetDirection(){
        try {
            helper.waitForElementToBeVisible(HomePageLocators.getdirections,4);
            helper.scrollToAnElement(HomePageLocators.getdirections);
            helper.clickByLocater(HomePageLocators.getdirections);
            LoggerHandler.info("Clicked on Get Directions.");
            test.log(Status.PASS,"Clicked on Get Directions.");
        } catch (Exception e) {
            LoggerHandler.info("Failed to click on Get Directions.");
            test.log(Status.FAIL,"Failed to click on Get Directions.");
        }
    }

    public void clickOnSearchBar() {
        try{
            helper.waitForElementToBeVisible(OhioPageLocators.searchbox, 4);
            helper.clickByLocater(OhioPageLocators.searchbox);
            LoggerHandler.info("Clicked on Search Bar");
            test.log(Status.PASS,"Clicked on Search Bar");
        }catch(Exception e){
            LoggerHandler.info("Failed to click on Search Bar");
            test.log(Status.FAIL,"Failed to click on Search Bar");
        }
    }
    public void enterOhio() {
        try{
            helper.waitForElementToBeVisible(OhioPageLocators.searchbox,4);
            helper.sendData(OhioPageLocators.searchbox,"Ohio");
            LoggerHandler.info("Entered Ohio");
            test.log(Status.PASS,"Entered Ohio");
        }catch(Exception e){
            LoggerHandler.info("Failed to Enter Ohio");
            test.log(Status.FAIL,"Failed to Enter Ohio");
        }
    }

    public void locationtype() {
        try{
            helper.waitForElementToBeVisible((OhioPageLocators.locationtype), 6);
            helper.clickByLocater(OhioPageLocators.locationtype);
            LoggerHandler.info("Clicked on Location Type");
            test.log(Status.PASS,"Clicked on Location Type");
        }catch(Exception e){
            LoggerHandler.info("Failed to click on Location Type");
            test.log(Status.FAIL,"Failed to click on Location Type");
        }
    }

    public void selecthealthcenters() {
        try{
            helper.hoverByLocater(OhioPageLocators.healthcenters);
            helper.clickByLocater(OhioPageLocators.healthcenters);
            LoggerHandler.info("Clicked on Health Centers");
            test.log(Status.PASS,"Clicked on Health Centers");
        }catch(Exception e){
            LoggerHandler.info("Failed to click on Health Centers");
            test.log(Status.FAIL,"Failed to click on Health Centers");
        }
    }
    public void selectimagingradiology() {
        try{
            helper.waitForElementToBeVisible(OhioPageLocators.imagingradiology, 6);
            helper.hoverByLocater(OhioPageLocators.imagingradiology);
            helper.hoverByLocater(OhioPageLocators.imagingradiology);
            helper.clickByLocater(OhioPageLocators.imagingradiology);
            LoggerHandler.info("Clicked on ImageRadiology");
            test.log(Status.PASS,"Clicked on ImageRadiology");
        }catch(Exception e){
            LoggerHandler.info("Failed to click on ImageRadiology");
            test.log(Status.FAIL,"Failed to click on ImageRadiology");
        }
    }

    public void ohiotest() {
        clickOnGetDirection();
        enterOhio();
        locationtype();
        selecthealthcenters();
        locationtype();
        selectimagingradiology();
    }
}
