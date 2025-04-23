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
        assertion.verifyPartialUrl("https://my.clevelandclinic.org/patients/information/access");
       
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
        Base.driver.navigate().back();
        helper.clickByLocater(ActionsPageLocators.acceptedInsu);
        assertion.verifyPartialUrl("https://my.clevelandclinic.org/patients/accepted-insurance");
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
        assertion.verifyPartialUrl("https://events.clevelandclinic.org");
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
        helper.goBackToWindow(0);
        helper.clickByLocater(ActionsPageLocators.finaceAssi);
        assertion.verifyPartialUrl("https://my.clevelandclinic.org/patients/billing-finance/financial-assistance");
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
    Base.driver.navigate().back();
    helper.clickByLocater(ActionsPageLocators.giveTo);
    assertion.verifyPartialUrl("https://my.clevelandclinic.org/giving");
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
    Base.driver.navigate().back();
    helper.clickByLocater(ActionsPageLocators.payYour);
    assertion.verifyPartialUrl("https://my.clevelandclinic.org/patients/billing-finance/payment-options");
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
        Base.driver.navigate().back();
        helper.clickByLocater(ActionsPageLocators.priceTrans);
        assertion.verifyPartialUrl("https://my.clevelandclinic.org/patients/billing-finance/comprehensive-hospital-charges");
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
        Base.driver.navigate().back();
        helper.clickByLocater(ActionsPageLocators.referPatient);
        assertion.verifyPartialUrl("https://my.clevelandclinic.org/professionals/referring");
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
        Base.driver.navigate().back();
        helper.clickByLocater(ActionsPageLocators.phoneDir);
        assertion.verifyPartialUrl("https://my.clevelandclinic.org/about/contact/phone-directory");
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
        Base.driver.navigate().back();
        helper.clickByLocater(ActionsPageLocators.virtualSecond);
        assertion.verifyPartialUrl("https://my.clevelandclinic.org/online-services/virtual-second-opinions");
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
        Base.driver.navigate().back();
        helper.clickByLocater(ActionsPageLocators.virtualVisit);
        assertion.verifyPartialUrl("https://my.clevelandclinic.org/online-services/virtual-visits");
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
        Base.driver.navigate().back();
        helper.clickByLocater(ActionsPageLocators.virtualVisit);
        assertion.verifyPartialUrl("https://my.clevelandclinic.org/");
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
      clickOnInsurance();
      clickOnEvent();
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
 
