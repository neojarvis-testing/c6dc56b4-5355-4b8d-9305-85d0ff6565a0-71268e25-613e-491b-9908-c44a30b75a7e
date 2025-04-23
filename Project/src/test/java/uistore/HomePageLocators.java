package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
    public static By clevelandcliniclogo = By.cssSelector("span.header__logo");
    public static By searchbar=By.xpath("(//a[text()='Search'])[1]");
    public static By searchbox=By.cssSelector("input#search-input");

    public static By getdirections = By.cssSelector("p + a[href='/locations']");
}
