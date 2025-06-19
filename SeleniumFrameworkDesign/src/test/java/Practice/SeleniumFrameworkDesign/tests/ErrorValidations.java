package Practice.SeleniumFrameworkDesign.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Practice.SeleniumFrameworkDesign.TestComponents.BaseTest;
import Practice.SeleniumFrameworkDesign.pageobjects.CartPage;
import Practice.SeleniumFrameworkDesign.pageobjects.CheckoutPage;
import Practice.SeleniumFrameworkDesign.pageobjects.ConfirmationPage;
import Practice.SeleniumFrameworkDesign.pageobjects.LandingPage;
import Practice.SeleniumFrameworkDesign.pageobjects.ProductCatalogue;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorValidations extends BaseTest {

	@Test
	public void submitOrder() throws IOException{
		// TODO Auto-generated method stub

		String productName = "ZARA COAT 3";

		ProductCatalogue productCatalogue = landingpage.loginApplication("princec@gmail.com", "Prince@12312");
		
		

	}

}
