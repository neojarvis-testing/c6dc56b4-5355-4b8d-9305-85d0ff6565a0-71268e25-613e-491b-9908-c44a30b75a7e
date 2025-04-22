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
        }
    }

    public void Diseases(){
        try{

            helper.clickByLocater(HealthLibraryPageLocators.Diseases);
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Diagnostics(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.Diagnostics);
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void Treatments(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.Treatments);
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Organs(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.BodySystems);
            helper.clickByLocater(HealthLibraryPageLocators.backHealth);
            helper.scrollToAnElement(HealthLibraryPageLocators.HealthHeading);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Drugs(){
        try{
            helper.clickByLocater(HealthLibraryPageLocators.DrugsDevices);

        }catch(Exception e){

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
