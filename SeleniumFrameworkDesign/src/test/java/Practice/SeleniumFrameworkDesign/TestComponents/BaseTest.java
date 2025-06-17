package Practice.SeleniumFrameworkDesign.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Practice.SeleniumFrameworkDesign.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException 
	{
		Properties prop = new Properties(); // intialize the Properties
		// below we will shorten the Path to start from the project path and not from the system path using user.dir
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Practice\\SeleniumFrameworkDesign\\resources\\GlobalData.properties"); // providing the Path
		prop.load(fis); // load the properties file to get the key value. but this requires a FileInput Stream
		String browserName = prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome")) {
			
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			// firefox
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			// edge
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	public LandingPage launchApplication() throws IOException 
	{
		driver = initializeDriver();
		
		LandingPage landingpage = new LandingPage(driver);

		landingpage.goTo();
		
		return landingpage;
	}
}
