package pages;

import uistore.HealthPageLocators;
import utils.Base;
import utils.WebDriverHelper;

public class HealthAction {
    public WebDriverHelper helper;

    public HealthAction(){
        helper= new WebDriverHelper(Base.driver);
    }
    public void clickOnHealthLibrary(){
        try{
        helper.clickByLocater(HealthPageLocators.healthLibrary);
        }catch(Exception e){
            e.getMessage();
        }
    }
    public void clickOnBody(){
        try{
        helper.scrollToAnElement(HealthPageLocators.bodyOrgans);
        helper.clickByLocater(HealthPageLocators.bodyOrgans);
        }catch(Exception e){
            e.getMessage();
        }
    }

    public void enterEyes(){
        try{
            helper.clickByLocater(HealthPageLocators.searchBar);
            helper.sendData(HealthPageLocators.searchBar, "Eyes");
            helper.enterAction(HealthPageLocators.searchBar);
        }catch(Exception e){
            e.getMessage();
        }
    }
    public void clickOnEye(){
        try{
            helper.clickByLocater(HealthPageLocators.eyes);
        }catch(Exception e){
            e.getMessage();
        }
    }
    public void clickOnRedEye(){
        try{
            helper.scrollToAnElement(HealthPageLocators.redEye);
            helper.clickByLocater(HealthPageLocators.redEye);
            helper.switchToNewTab();
        }catch(Exception e){
            e.getMessage();
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
