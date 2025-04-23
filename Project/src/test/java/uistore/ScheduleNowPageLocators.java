package uistore;

import org.openqa.selenium.By;

public class ScheduleNowPageLocators {
    public static By scheduleNow = By.xpath("//a[text()='Schedule now']");
    public static By requestAppointment = By.xpath("(//a[@href='/webappointment'])[1]");
    public static By getStarted = By.cssSelector("button.btn--primary");
    public static By heading1 = By.xpath("//h1[text()='Who is this request for?']");
    public static By meButton = By.xpath("//button[text()='Not sure']");
    public static By heading2 = By.xpath("//h1[text()='Have you received care at Cleveland Clinic within the last three years?']");
    public static By notSureButton = By.cssSelector(".btn--not-sure ");
    public static By heading3 = By.xpath("//h1[text()='Please help us get to know you better.']");
    public static By firstName = By.cssSelector("#firstName");
    public static By lastName = By.cssSelector("#lastName");
    public static By gender = By.cssSelector("#gender");
    public static By maritalStatus = By.cssSelector("#maritalStatus");
    public static By dateOfBirth = By.cssSelector("#dob");
    public static By nextButton = By.cssSelector(".btn--primary");
    public static By heading4 = By.xpath("//h1[text()='How can we contact you about your appointment?']");
    public static By address = By.cssSelector("#address1");
    public static By city = By.cssSelector("#city");
    public static By state = By.cssSelector("#state");
    public static By zipCode = By.cssSelector("#zip");
    public static By email = By.cssSelector("#email");
    public static By phoneNumber = By.xpath("//input[@id='Phone number']");
    public static By heading5 = By.xpath("//h1[text()='Tell us about your appointment needs.']");
    public static By reason = By.cssSelector("#reason");
    public static By heading6 = By.xpath("//h1[text() = 'Tell us about your appointment needs (cont.).']");
}
