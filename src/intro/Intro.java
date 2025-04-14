package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://rahulshettyacademy.com/");
//		System.out.println(driver.getTitle());
		
		getData();

	}
	
	public static String getData() {
		System.out.println("Welcome!");
		return "Rahul Shetty";
	}

}
