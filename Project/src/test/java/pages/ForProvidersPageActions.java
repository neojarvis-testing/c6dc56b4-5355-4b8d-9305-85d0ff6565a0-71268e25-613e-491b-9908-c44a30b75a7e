package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ForProvidersPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
 
public class ForProvidersPageActions {
public WebDriverHelper helper;
public ExtentTest test;
 
public ForProvidersPageActions(ExtentTest test) {
    helper= new WebDriverHelper(Base.driver);
    this.test=test;
}
 
public void ForProviders(){
    helper.scrollToAnElement(ForProvidersPageLocators.forproviders);
}
 
public void join(){
    try{
    helper.clickByLocater(ForProvidersPageLocators.JoinOurNursing);
    helper.clickByLocater(ForProvidersPageLocators.clevelandcliniclink);
    helper.switchToNewTab();
    Base.driver.close();
    helper.goBackToWindow(0);
    LoggerHandler.info("Clicked on Join Our Nursing");
    test.log(Status.PASS,"Clicked on Join Our Nursing");
    }
    catch(Exception e){
        LoggerHandler.error("Clicked on Join Our Nursing Failed");
        test.log(Status.FAIL,"Clicked on Join Our Nursing Failed");
    }
}  
 
public void carrer(){
    try {
        helper.scrollToAnElement(ForProvidersPageLocators.forproviders);
        helper.waitForElementToBeVisible(ForProvidersPageLocators.careers, 10);
        helper.clickByLocater(ForProvidersPageLocators.careers);
        helper.waitForElementToBeVisible(ForProvidersPageLocators.careers, 10);
        helper.hoverByLocater(ForProvidersPageLocators.findcareer);
        helper.clickByLocater(ForProvidersPageLocators.findcareer);
        helper.switchToNewTab();
        Base.driver.close();
        helper.goBackToWindow(0);
        LoggerHandler.info("Clicked on carrer");
        test.log(Status.PASS,"Clicked on carrer");
    } catch (Exception e) {
        LoggerHandler.error("Clicked on carrer Failed");
        test.log(Status.FAIL,"Clicked on carrer Failed");
    }
 
}
 
public void patient(){
    try {
        helper.scrollToAnElement(ForProvidersPageLocators.forproviders);
        helper.waitForElementToBeVisible(ForProvidersPageLocators.Referpatient, 10);
        helper.clickByLocater(ForProvidersPageLocators.Referpatient);
        helper.clickByLocater(ForProvidersPageLocators.physicianteam);
        helper.switchToNewTab();
        Base.driver.close();
        helper.goBackToWindow(0);
        LoggerHandler.info("Clicked on Patient");
        test.log(Status.PASS,"Clicked on Patient");
    } catch (Exception e) {
        LoggerHandler.error("Clicked on Patient Failed");
        test.log(Status.FAIL,"Clicked on Patient Failed");
    }
}
 
 
 
public void test2(){
    ForProviders();
    join();
    carrer();
    patient();
   
}
}