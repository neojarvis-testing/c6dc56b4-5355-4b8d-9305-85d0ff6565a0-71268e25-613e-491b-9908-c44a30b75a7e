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
        helper=new WebDriverHelper(Base.driver);
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
        helper.waitForElementToBeVisible(OhioPageLocators.searchbox, 4);
        helper.clickByLocater(OhioPageLocators.searchbox);
    }
    public void enterOhio() {
        helper.waitForElementToBeVisible(OhioPageLocators.searchbox,4);
        helper.sendData(OhioPageLocators.searchbox,"Ohio");
    }

    public void locationtype() {
        helper.waitForElementToBeVisible((OhioPageLocators.locationtype), 6);
        helper.clickByLocater(OhioPageLocators.locationtype);
    }

    public void selecthealthcenters() {
        helper.hoverByLocater(OhioPageLocators.healthcenters);
        helper.clickByLocater(OhioPageLocators.healthcenters);
    }
    public void selectimagingradiology() {
        helper.waitForElementToBeVisible(OhioPageLocators.imagingradiology, 10);
        helper.hoverByLocater(OhioPageLocators.imagingradiology);
        helper.hoverByLocater(OhioPageLocators.imagingradiology);
        helper.clickByLocater(OhioPageLocators.imagingradiology);
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
