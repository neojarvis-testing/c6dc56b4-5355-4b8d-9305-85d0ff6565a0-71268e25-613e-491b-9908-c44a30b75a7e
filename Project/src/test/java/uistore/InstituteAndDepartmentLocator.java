package uistore;
 
import org.openqa.selenium.By;
 
public class InstituteAndDepartmentLocator {
 
    //Institute and Department
    public static By instituteAndDepartment = By.xpath("(//a[@href='/departments'])[2]");
    public static By verifyInstituteAndDepartment = By.xpath("//h1[@class='hero-content__title lede']");
 
    //Blood Management
    public static By bloodManagement = By.xpath("//a[@href='/departments/blood-management']");
    public static By verifyBloodManagement = By.xpath("//h1[@class='hero-content__title lede']");
    public static By frequentlyAskedQuestions = By.xpath("//a[text()='Frequently Asked Questions']");
    public static By preparingForSurgery = By.xpath("//a[text()='Preparing for Surgery']");
    public static By anemia = By.xpath("(//a[text()='Anemia'])[1]");
    public static By refusingABloodTransfusion = By.xpath("//a[text()='Refusing a Blood Transfusion']");
    public static By locations = By.xpath("(//a[text()='Locations'])[1]");
    public static By contactsBloodManagement = By.xpath("(//a[text()='Contact Us'])[1]");
 
    //Pharmacy
    public static By pharmacy = By.cssSelector("a[href='/departments/pharmacy']");
    //below one will switch the tab
    public static By takeTheSurvey = By.cssSelector("a[href='https://forms.office.com/r/msaiG5gbpi']");
 
    //Contact Us
    public static By contactUs = By.xpath("(//a[@href='/about/contact/phone-directory'])[2]");
    public static By verifyPhoneDirectory = By.xpath("//h1[@class='hero-content__title lede']");
    public static By contactClevelandClinic = By.xpath("(//a[@href='/about/contact'])[2]");
 
    // Need Help in Home Page
    public static By needHelp = By.xpath("(//a[@href='/help'])[1]");
    public static By parking = By.xpath("(//h3[@class='call-to-action__title lede '])[4]");
    public static By verifyParking = By.xpath("//h1[@class='hero-content__title lede']");
    public static By travelAssistance = By.xpath("(//a[text()='Travel Assistance'])[1]");
    public static By globalPatientServices = By.xpath("(//a[@href='/patients/international'])[1]");
    public static By speakWithOurTeam = By.xpath("(//a[@href='/patients/international#locations'])[2]");
    public static By virtualSecondOpinion = By.xpath("(//a[@href='/online-services/virtual-second-opinions'])[1]");
    public static By verifyVirtualSecondOpinion = By.xpath("//h1[text()='Virtual Second Opinions']");
    public static By getStarted = By.xpath("//a[@href='https://go.tc.clinicbyclevelandclinic.com/onboarding/central-login-page?mtm_campaign=CCF_Portal'])[1]");
 
}
