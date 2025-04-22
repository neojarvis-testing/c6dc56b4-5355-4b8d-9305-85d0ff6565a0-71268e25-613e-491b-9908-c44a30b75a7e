package runner;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.ForProvidersPageActions;
import pages.HealthLibraryPageActions;
import utils.Base;
import utils.Reporter;

public class TestRunner extends Base {

	ExtentReports reports;
    ExtentTest test;

	@BeforeClass
    public void reportlaunch(){
        reports = Reporter.createReport("cleveland_Report");
    }


    @BeforeMethod 
	public void launch() {
		openBrowser();

	}  

    @Test
    public void testCase1() {
		test = reports.createTest("TestCase05");
		HealthLibraryPageActions hpa = new HealthLibraryPageActions(test);
        hpa.test1();
    }

	@Test
	public void testcase2() {
		test = reports.createTest("TestCase06");
		ForProvidersPageActions fpa=new ForProvidersPageActions(test);
		fpa.test2();
	}


    @AfterMethod 
	public void tearDown() {
		driver.quit();
	}
    
}
