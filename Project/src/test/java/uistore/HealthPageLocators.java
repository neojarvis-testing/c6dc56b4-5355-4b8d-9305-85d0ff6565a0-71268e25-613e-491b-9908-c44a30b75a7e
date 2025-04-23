package uistore;
 
import org.openqa.selenium.By;
 
public class HealthPageLocators {
    public static By healthLibrary=By.cssSelector("a.nav--secondary__link[href='/health']");
    public static By bodyOrgans= By.cssSelector("a[href='/health/body'] h3");
    public static By searchBar= By.id("search-input");
    public static By eyes= By.xpath("(//span[text()='Eyes'] )[1]");
    public static By redEye= By.xpath("//a[text()='Red eye']");
    public static By allergies= By.xpath("//a[text()='Allergies']");
    public static By blephartis= By.xpath("//a[text()='Blepharitis']");
    public static By Pinkeye= By.xpath("//a[text()='Pink eye (conjunctivitis)']");
    public static By dryEye= By.xpath("//a[text()='Dry eye']");
    public static By eyeInjury= By.xpath("Dry eye");
    public static By glaucoma= By.xpath("Glaucoma");
}
