package pages;
 
import com.aventstack.extentreports.ExtentTest;
 
import uistore.ForProvidersPageLocators;
import utils.Base;
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
    }
    catch(Exception e){
        e.printStackTrace();
    }
}  
 
public void carrer(){
    helper.scrollToAnElement(ForProvidersPageLocators.forproviders);
    helper.waitForElementToBeVisible(ForProvidersPageLocators.careers, 10);
    helper.clickByLocater(ForProvidersPageLocators.careers);
    helper.waitForElementToBeVisible(ForProvidersPageLocators.careers, 10);
    helper.hoverByLocater(ForProvidersPageLocators.findcareer);
    helper.clickByLocater(ForProvidersPageLocators.findcareer);
    helper.switchToNewTab();
    Base.driver.close();
    helper.goBackToWindow(0);
 
}
 
public void patient(){
    helper.scrollToAnElement(ForProvidersPageLocators.forproviders);
    helper.waitForElementToBeVisible(ForProvidersPageLocators.Referpatient, 10);
    helper.clickByLocater(ForProvidersPageLocators.Referpatient);
    helper.clickByLocater(ForProvidersPageLocators.physicianteam);
    helper.switchToNewTab();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    Base.driver.close();
    helper.goBackToWindow(0);
}
 
 
 
public void test2(){
    ForProviders();
    join();
    carrer();
    patient();
   
}
}