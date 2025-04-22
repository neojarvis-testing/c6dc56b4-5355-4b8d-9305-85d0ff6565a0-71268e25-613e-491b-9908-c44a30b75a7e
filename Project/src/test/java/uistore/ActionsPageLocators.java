package uistore;

import org.openqa.selenium.By;

public class ActionsPageLocators {
     public static By appointments= By.cssSelector("a[title='Appointments']");
     public static By acceptedInsu= By.cssSelector("a[title='Accepted Insurance']");
     public static By eventsCal= By.cssSelector("a[href='https://events.clevelandclinic.org']");
     public static By finaceAssi= By.xpath("//a[text()='Financial Assistance']");
     public static By giveTo= By.xpath("//a[text()='Give to Cleveland Clinic']");
     public static By payYour= By.xpath("//a[text()='Pay Your Bill Online']");
     public static By priceTrans= By.cssSelector("a[title='Price Transparency']");
     public static By referPatient=By.xpath("//a[text()='Refer a Patient']");
     public static By phoneDir= By.xpath("//a[text()='Phone Directory']");
     public static By virtualSecond= By.xpath("//a[text()='Virtual Second Opinions']");
     public static By virtualVisit= By.xpath("//a[text()='Virtual Visits']");
     public static By cleveLandImg= By.xpath("//a[@href='/']");
     public static By action= By.xpath("//h5[text()='Actions']");
}
