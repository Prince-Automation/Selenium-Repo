package Practice.SeleniumFrameworkDesign.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) { // created constructor
		// initialization
		this.driver = driver; 
		PageFactory.initElements(driver, this); // inorder to create the driver.findElement for FindBy Page factory
	}


	
	//	WebElement userEmail = driver.findElement(By.id("userEmail"));

	//PageFactory
	@FindBy(id="userEmail")
	WebElement userEmail;

	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	// creating action methods
	public void loginApplication(String email, String password ) {
		userEmail.sendKeys(email);
		userPassword.sendKeys(password);
		loginButton.click();
	}
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
}
