package pages;
 
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.FooterIconPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
 
public class FooterIconPageActions {
    ExtentReports reports;
 
    WebDriverHelper helper;
 
    ExtentTest test;
 
    public FooterIconPageActions(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
 
    }
 
    public void clickFacebook(){
        try{
            helper.scrollToAnElement(FooterIconPageLocators.facebook);
            helper.clickByLocater(FooterIconPageLocators.facebook);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Facebook Icon");
            test.log(Status.PASS,"Clicked on Facebook Icon");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Facebook Icon Failed");
            test.log(Status.FAIL,"Clicked on Facebook Icon Failed");
        }
    }
 
 
 
    public void clickTwitter(){
        try{
           
            helper.clickByLocater(FooterIconPageLocators.twitter);
            Thread.sleep(3000);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Twitter Icon");
            test.log(Status.PASS,"Clicked on Twitter Icon");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Twitter Icon Failed");
            test.log(Status.FAIL,"Clicked on Twitter Icon Failed");
        }
    }
 
 
 
    public void clickYoutube(){
        try{
            helper.clickByLocater(FooterIconPageLocators.youtube);
            Thread.sleep(3000);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Youtube Icon");
            test.log(Status.PASS,"Clicked on Youtube Icon");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Youtube Icon Failed");
            test.log(Status.FAIL,"Clicked on Youtube Icon Failed");
        }
    }
 
    public void clickInstagram(){
        try{
            helper.clickByLocater(FooterIconPageLocators.instagram);
            Thread.sleep(3000);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Instagram Icon");
            test.log(Status.PASS,"Clicked on Instagram Icon");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Instagram Icon Failed");
            test.log(Status.FAIL,"Clicked on Instagram Icon Failed");
        }
    }
 
    public void clickLinkdin(){
        try{
            helper.clickByLocater(FooterIconPageLocators.linkdin);
            Thread.sleep(3000);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Linkedin Icon");
            test.log(Status.PASS,"Clicked on Linkedin Icon");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Linkedin Icon Failed");
            test.log(Status.FAIL,"Clicked on Linkedin Icon Failed");
        }
    }
 
    public void clickpintrest(){
        try{
            helper.clickByLocater(FooterIconPageLocators.pinterest);
            Thread.sleep(3000);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Pinterest Icon");
            test.log(Status.PASS,"Clicked on Pinterest Icon");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Pinterest Icon Failed");
            test.log(Status.FAIL,"Clicked on Pinterest Icon Failed");
        }
    }
 
    public void clicksnapchat(){
        try{
            helper.clickByLocater(FooterIconPageLocators.snapchat);
            Thread.sleep(3000);
            helper.switchToNewTab();
            Base.driver.close();
            helper.goBackToWindow(0);
            LoggerHandler.info("Clicked on Snapchat Icon");
            test.log(Status.PASS,"Clicked on Snapchat Icon");
        }catch(Exception e){
            LoggerHandler.error("Clicked on Snapchat Icon Failed");
            test.log(Status.FAIL,"Clicked on Snapchat Icon Failed");
        }
    }
 
    public void footerTestCase(){
        clickFacebook();
        clickTwitter();
        clickYoutube();
        clickInstagram();
        clickLinkdin();
        clickpintrest();
        clicksnapchat();
 
    }
 
 
 
}
