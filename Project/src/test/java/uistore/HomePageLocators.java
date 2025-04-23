package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
    public static By clevelandcliniclogo = By.cssSelector("span.header__logo");
    public static By searchbar=By.cssSelector("#site-header > nav.nav--utility.js-nav--utility > ul > li:nth-child(8) > a");
    public static By searchbox=By.cssSelector("input#search-input");
    public static By getdirections = By.cssSelector("p + a[href='/locations']");
}
