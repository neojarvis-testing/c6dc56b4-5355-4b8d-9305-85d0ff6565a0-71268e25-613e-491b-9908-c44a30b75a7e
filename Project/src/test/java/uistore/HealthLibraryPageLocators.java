package uistore;
 
import org.openqa.selenium.By;
 
public class HealthLibraryPageLocators {
    public static By backHealth=By.xpath("//a[text()='Home']");
    public static By HealthHeading=By.xpath("//div[text()='Health Library']");
    public static By Diseases = By.cssSelector("a[href='/health/diseases']");
    public static By Diagnostics = By.cssSelector("a[title='Diagnostics & Testing']");
    public static By Treatments=By.cssSelector("a[title='Treatments']");
    public static By BodySystems=By.cssSelector("a[title='Body Systems & Organs']");
    public static By DrugsDevices=By.cssSelector("a[title='Drugs, Devices & Supplements']");
}