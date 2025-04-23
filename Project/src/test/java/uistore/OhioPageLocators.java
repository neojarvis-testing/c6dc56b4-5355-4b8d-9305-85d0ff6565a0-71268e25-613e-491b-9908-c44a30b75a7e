package uistore;

import org.openqa.selenium.By;

public class OhioPageLocators {
    public static By searchbox=By.cssSelector("input#search-input");

    public static By locationtype=By.xpath("//input[@value='Filter by Location Types...']");
    public static By healthcenters=By.xpath("//li[text()='Health Centers']");
    public static By imagingradiology=By.xpath("//li[text()='Imaging & Radiology']");
}
