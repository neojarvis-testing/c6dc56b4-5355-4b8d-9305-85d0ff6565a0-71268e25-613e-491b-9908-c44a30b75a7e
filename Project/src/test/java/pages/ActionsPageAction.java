package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.ActionsPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
 
public class ActionsPageAction {
    public WebDriverHelper helper;
    ExtentTest test;
    Assertion assertion= new Assertion(Base.driver);
    public  ActionsPageAction(ExtentTest test){
        helper= new WebDriverHelper(Base.driver);
        this.test= test;
    }
    public void verifyActionsSec(){
        try{
            helper.scrollToAnElement(ActionsPageLocators.action);
            assertion.verifyFullText("Actions",ActionsPageLocators.action);
            LoggerHandler.info("Actions section is displayed");
            test.log(Status.PASS,"Actions section is displayed");
        }catch(AssertionError e){
           LoggerHandler.error("Actions section is not displayed");
           test.log(Status.PASS,"Actions section is not displayed");
        }
   }
   public void clickOnAppointments(){
    try{
        helper.clickByLocater(ActionsPageLocators.appointments);
        assertion.verifyFullUrl("https://my.clevelandclinic.org/patients/information/access");
        Base.driver.navigate().back();
        LoggerHandler.info("Appointmenmts Url Verified Successfully");
        test.log(Status.PASS,"Appointmenmts Url Verified Successfully");
    }catch(Exception e){
        LoggerHandler.error("Appointmenmts not clicked");
        test.log(Status.FAIL,"Appointmenmts not clicked");
     }catch(AssertionError e){
        LoggerHandler.error("Appointments Url is not verified");
         test.log(Status.FAIL,"Appointments Url is not verified");
      }
   }
   public void clickOnInsurance(){
    try{
        helper.clickByLocater(ActionsPageLocators.acceptedInsu);
        assertion.verifyFullUrl("https://my.clevelandclinic.org/patients/accepted-insurance");
        Base.driver.navigate().back();
        LoggerHandler.info("Insurance Url Verified Successfully");
        test.log(Status.PASS,"Insurance Url Verified Successfully");
    }catch(Exception e){
        LoggerHandler.error("Insurance not clicked");
        test.log(Status.FAIL,"Insurance not clicked");
    }catch(AssertionError e){
        LoggerHandler.error("Insurance Url is not verified");
        test.log(Status.FAIL,"Insurance Url is not verified");
     }
 
   }
   public void clickOnEvent(){
    try{
        helper.clickByLocater(ActionsPageLocators.eventsCal);
        helper.switchToNewTab();
        assertion.verifyFullUrl("https://events.clevelandclinic.org");
        helper.goBackToWindow(0);
        LoggerHandler.info("Event clicked and  Url Verified Successfully");
        test.log(Status.PASS,"Event clicked and Url Verified Successfully");
    }catch(Exception e){
        LoggerHandler.error("Event not clicked");
        test.log(Status.FAIL,"Event not clicked");
    }catch(AssertionError e){
        LoggerHandler.error("Event Url is not verified");
        test.log(Status.FAIL,"Event Url is not verified");
     }
   }
   public void clickOnFinance(){
    try{
        helper.clickByLocater(ActionsPageLocators.finaceAssi);
        assertion.verifyFullUrl("https://my.clevelandclinic.org/patients/billing-finance/financial-assistance");
        Base.driver.navigate().back();
        LoggerHandler.info("Finance clicked and  Url Verified Successfully");
        test.log(Status.PASS,"Finance clicked and Url Verified Successfully");
    }catch(Exception e){
        LoggerHandler.error("Finance not clicked");
        test.log(Status.FAIL,"Finance not clicked");
    }catch(AssertionError e){
        LoggerHandler.error("Finance Url is not verified");
        test.log(Status.FAIL,"Finance Url is not verified");
     }
   }
   public void clickOnCleveLand(){
    try{
    helper.clickByLocater(ActionsPageLocators.giveTo);
    assertion.verifyFullUrl("https://my.clevelandclinic.org/giving");
    Base.driver.navigate().back();
    LoggerHandler.info("giveto clicked and  Url Verified Successfully");
    test.log(Status.PASS,"giveto clicked and Url Verified Successfully");
}catch(Exception e){
    LoggerHandler.error("Giveto not clicked");
    test.log(Status.FAIL,"giveto not clicked");
}catch(AssertionError e){
    LoggerHandler.error("giveto Url is not verified");
    test.log(Status.FAIL,"giveto Url is not verified");
 }
}
public void clickOnPayBill(){
    try{
    helper.clickByLocater(ActionsPageLocators.payYour);
    assertion.verifyFullUrl("https://my.clevelandclinic.org/patients/billing-finance/payment-options");
    Base.driver.navigate().back();
    LoggerHandler.info("Pay your bill is clicked and Url is Verified");
    test.log(Status.PASS,"Pay your bill is clicked and Url is Verified");
    }catch(Exception e){
        LoggerHandler.error("Pay your Bill not clicked");
        test.log(Status.FAIL,"Pay your Billclicked");
    }catch(AssertionError e){
        LoggerHandler.error("Pay your Bill is not verified");
        test.log(Status.FAIL,"Pay your Bill is not verified");
     }
}
public void clickOnPrice(){
    try{
        helper.clickByLocater(ActionsPageLocators.priceTrans);
        assertion.verifyFullUrl("https://my.clevelandclinic.org/patients/billing-finance/comprehensive-hospital-charges");
        Base.driver.navigate().back();
        LoggerHandler.info("Price Transparency is clicked and Url verified");
        test.log(Status.PASS, "Price Transparency is clicked and Url verified");
    }catch(Exception e){
        LoggerHandler.error("Price Transparency not clicked");
        test.log(Status.FAIL,"Price Transparency notclicked");
    }catch(AssertionError e){
        LoggerHandler.error("Price Transparency Url is not verified");
        test.log(Status.FAIL,"Price Transparency Url is not verified");
     }
}
public void clickOnRefer(){
    try{
        helper.clickByLocater(ActionsPageLocators.referPatient);
        assertion.verifyFullUrl("https://my.clevelandclinic.org/professionals/referring");
        Base.driver.navigate().back();
        LoggerHandler.info("Refer a Patient is clicked and Url verified");
        test.log(Status.PASS, "Refer a Patient is clicked and Url verified");
    }catch(Exception e){
        LoggerHandler.error("Refer a Patient not clicked");
        test.log(Status.FAIL,"Refer a Patient notclicked");
    }catch(AssertionError e){
        LoggerHandler.error("Refer a Patient Url is not verified");
        test.log(Status.FAIL,"Refer a Patient Url is not verified");
     }
}
public void clickOnPhone(){
    try{
        helper.clickByLocater(ActionsPageLocators.phoneDir);
        assertion.verifyFullUrl("https://my.clevelandclinic.org/about/contact/phone-directory");
        Base.driver.navigate().back();
        LoggerHandler.info("Phone Directory is clicked and Url verified");
        test.log(Status.PASS, "Phone Directory is clicked and Url verified");
    }catch(Exception e){
        LoggerHandler.error("Phone Directory not clicked");
        test.log(Status.FAIL,"Phone Directory notclicked");
    }catch(AssertionError e){
        LoggerHandler.error("Phone Directory Url is not verified");
        test.log(Status.FAIL,"Phone Directory Url is not verified");
     }
}
public void clickOnSecondOpi(){
    try{
        helper.clickByLocater(ActionsPageLocators.virtualSecond);
        assertion.verifyFullUrl("https://my.clevelandclinic.org/online-services/virtual-second-opinions");
        Base.driver.navigate().back();
        LoggerHandler.info("Virtual Second Opinions is clicked and Url verified");
        test.log(Status.PASS, "Virtual Second Opinions is clicked and Url verified");
    }catch(Exception e){
        LoggerHandler.error("Virtual Second Opinions not clicked");
        test.log(Status.FAIL,"Virtual Second Opinions notclicked");
    }catch(AssertionError e){
        LoggerHandler.error("Virtual Second Opinions Url is not verified");
        test.log(Status.FAIL,"Virtual Second Opinions Url is not verified");
     }  
}
public void clickOnVirtual(){
    try{
        helper.clickByLocater(ActionsPageLocators.virtualVisit);
        assertion.verifyFullUrl("https://my.clevelandclinic.org/online-services/virtual-visits");
        Base.driver.navigate().back();
        LoggerHandler.info("Virtual Visits is clicked and Url verified");
        test.log(Status.PASS, "Virtual Visits is clicked and Url verified");
    }catch(Exception e){
        LoggerHandler.error("Virtual Visits not clicked");
        test.log(Status.FAIL,"Virtual Visits notclicked");
    }catch(AssertionError e){
        LoggerHandler.error("Virtual Visits Url is not verified");
        test.log(Status.FAIL,"Virtual Visits Url is not verified");
     }
}
public void clickonCleveImg(){
    try{
        helper.clickByLocater(ActionsPageLocators.virtualVisit);
        assertion.verifyFullUrl("https://my.clevelandclinic.org/");
        Base.driver.navigate().back();
        LoggerHandler.info("CleveLand Img is clicked and Url verified");
        test.log(Status.PASS, "CleveLand Img is clicked and Url verified");
    }catch(Exception e){
        LoggerHandler.error("CleveLand Img not clicked");
        test.log(Status.FAIL,"CleveLand Img notclicked");
    }catch(AssertionError e){
        LoggerHandler.error("CleveLand Img Url is not verified");
        test.log(Status.FAIL,"CleveLand Img Url is not verified");
     }
}
 
   public void allActions(){
      verifyActionsSec();
      clickOnAppointments();
      clickOnEvent();
      clickOnInsurance();
      clickOnFinance();
      clickOnCleveLand();
      clickOnPayBill();
      clickOnPrice();
      clickOnRefer();
      clickOnPhone();
      clickOnSecondOpi();
      clickOnVirtual();
      clickonCleveImg();
   }
}
 
