package uistore;

import org.openqa.selenium.By;

public class FindDoctorLocators {
    public static By findDoctor = By.xpath("//a[text()='Find a doctor']");

    public static By searchBar = By.cssSelector("#search-input");

    public static By location = By.xpath("//input[@value='Filter by Locations by City...']");

    public static By loc = By.xpath("//li[@data-value='East Cleveland, OH']");

    public static By department = By.xpath("//input[@value='Filter by Institutes & Departments...']");

    public static By dept = By.xpath("//li[@data-value='Cardiovascular Medicine']");

    public static By language = By.xpath("//input[@value='Filter by Languages...']");

    public static By appointment = By.xpath("(//a[text()='Request an Appointment'])[1]");
}