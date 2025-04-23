package uistore;

import org.openqa.selenium.By;

public class RespiratoryPageLocators {
    public static By respiratory=By.xpath("(//strong[text()='Respiratory'])[1]");

    public static By introduction=By.xpath("//a[text()='Introduction']");
    public static By coughdeepbreathe=By.xpath("//a[text()='Cough & Deep Breathe']");
    public static By pep=By.xpath("//a[text()='PEP']");
    public static By acapella=By.xpath("//a[text()='Acapella']");
    public static By nebulizer=By.xpath("//a[text()='Nebulizer']");

    public static By doctors=By.cssSelector("a:contains('Doctors')");
    public static By specialist=By.cssSelector("input#Specialist");
    public static By female=By.cssSelector("input#Female");
    public static By male=By.cssSelector("input#Male");
    public static By mamounabdoh=By.xpath("//a[text()='Mamoun Abdoh, MD']");



}
