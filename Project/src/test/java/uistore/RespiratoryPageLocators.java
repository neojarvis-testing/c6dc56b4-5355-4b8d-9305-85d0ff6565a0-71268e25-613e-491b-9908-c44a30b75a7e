package uistore;

import org.openqa.selenium.By;
/* 
    * a. Class name : RespiratoryPageLocators
    * b. Author : Dharen
    * c. Description : This class contains the locators for the elements on the Respiratory Page, making it easier to identify and interact with them during Selenium tests.
*/
public class RespiratoryPageLocators {
    public static By respiratory=By.cssSelector("#site-hits > div:nth-child(1) > a");

    public static By introduction=By.cssSelector("body > div.page-content > div > div > ul > li:nth-child(1) > a");
    public static By coughdeepbreathe=By.cssSelector("body > div.page-content > div > div > ul > li:nth-child(2)");
    public static By pep=By.xpath("//a[text()='PEP']");
    public static By acapella=By.xpath("//a[text()='Acapella']");
    public static By nebulizer=By.xpath("//a[text()='Nebulizer']");

    public static By doctors=By.cssSelector("a:contains('Doctors')");
    public static By specialist=By.cssSelector("input#Specialist");
    public static By female=By.cssSelector("input#Female");
    public static By male=By.cssSelector("input#Male");
    public static By mamounabdoh=By.xpath("//a[text()='Mamoun Abdoh, MD']");



}
