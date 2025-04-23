package uistore;

import org.openqa.selenium.By;
/* 
* a. Class name : OhioPageLocators 
* b. Author : Dharen 
* c. Description : This class defines locators for various elements on the Ohio-specific page, allowing easy interaction with key UI components such as the search box, location filters, and specific categories like Health Centers and Imaging & Radiology. These locators facilitate automation testing of the page using Selenium.
*/
public class OhioPageLocators {
    public static By searchbox=By.cssSelector("input#search-input");
    public static By locationtype=By.xpath("//input[@value='Filter by Location Types...']");
    public static By healthcenters=By.xpath("//li[text()='Health Centers']");
    public static By imagingradiology=By.xpath("//li[text()='Imaging & Radiology']");
}
