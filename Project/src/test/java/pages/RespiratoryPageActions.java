package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.RespiratoryPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class RespiratoryPageActions {
    public static WebDriverHelper helper; 
    public static ExtentTest test;
    public RespiratoryPageActions(ExtentTest test) {
        helper=new WebDriverHelper(Base.driver);
        this.test=test;
    }
    public void clickOnSearchBar(){
        try {
            helper.waitForElementToBeVisible(HomePageLocators.searchbar,4);
            helper.clickByLocater(HomePageLocators.searchbar);
            LoggerHandler.info("Clicked on Search bar.");
            test.log(Status.PASS,"Clicked on Search bar.");
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on Search bar.");
            test.log(Status.FAIL,"Failed to click on Search bar.");
            Screenshot.captureScreenshot("Failed to click on Search bar.");
        }
    }
    public void sendRespiratory() {
        try {
            helper.waitForElementToBeVisible(HomePageLocators.searchbox, 4);
            helper.sendData(HomePageLocators.searchbox,"Respiratory");
            helper.enterAction(HomePageLocators.searchbox);
            LoggerHandler.info("Sent Respiratory");
            test.log(Status.PASS,"Sent Respiratory");
        } catch (Exception e) {
            LoggerHandler.error("Failed to send Respiratory.");
            test.log(Status.FAIL,"Failed to send Respiratory.");
        }
    }

    public void clickRespiratory() {
        try {
            helper.waitForElementToBeVisible(RespiratoryPageLocators.respiratory, 4);
            helper.scrollToAnElement(RespiratoryPageLocators.respiratory);
            helper.clickByLocater(RespiratoryPageLocators.respiratory);
            LoggerHandler.info("Clicked on Respiratory.");
            test.log(Status.PASS,"Clicked on Respiratory.");
        } catch(Exception e) {
            LoggerHandler.error("Failed to click on Respiratory");
            test.log(Status.FAIL,"Failed to click on Respiratory");
        }
    }


    public void respiratorytest() {
        clickOnSearchBar();
        sendRespiratory();
        clickRespiratory();
    }
}
