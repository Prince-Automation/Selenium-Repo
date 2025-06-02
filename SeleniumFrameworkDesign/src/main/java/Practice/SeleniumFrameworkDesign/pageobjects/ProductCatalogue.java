package Practice.SeleniumFrameworkDesign.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalogue {
	
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver) { // created constructor
		// initialization
		this.driver = driver; 
		PageFactory.initElements(driver, this); // inorder to create the driver.findElement for FindBy Page factory
	}


	
	//	List <WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

	//PageFactory
	@FindBy(css=".mb-3")
	List<WebElement> products; //for list of Web Elements

}
