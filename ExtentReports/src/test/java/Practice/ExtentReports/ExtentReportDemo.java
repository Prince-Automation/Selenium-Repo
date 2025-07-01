package Practice.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {
	
	ExtentReports extent;

	@BeforeTest
	public void config() {
		
		// Extent Reports, Extent spark reporter these are the clases for Extenet reports
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); // this expects the html file where it has to create the report
		reporter.config().setReportName("web automation results");	
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
	    extent.attachReporter(reporter);
	    extent.setSystemInfo("Tester", "Prince Castelino");
	}
	
	@Test
	public void intialDemo() {
		ExtentTest test = extent.createTest("Initial Demo");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
//			test.info("Navigating to rahulshettyacademy.com");
			driver.get("https://rahulshettyacademy.com/");
//			test.pass("Successfully navigated to the website");
			System.out.println(driver.getTitle());
//			test.info("Page title is: " + title);
		} catch (Exception e) {
			test.fail("Test failed: " + e.getMessage());
		} finally {
			driver.quit();
			extent.flush(); // THIS is what creates and finalizes the report
		}
	}
}
