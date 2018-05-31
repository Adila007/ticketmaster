package ticketmaster.app.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingUI {

	public static void main(String[] args) {
		String filePath = "/Users/Mac/Documents/selenium dependencies/drivers/chromedriver";
		System.setProperty("webdriver.chrome.driver", filePath);
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
	}
}
