package ticketmaster.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ticketmaster.utilities.Driver;

public class Login {
	 
	private WebDriver driver;
	
	public Login() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	@Given("^I go to ticketmaster$")
	public void i_go_to_ticketmaster() {
	  System.out.println("This is Given");
	  driver.get("https://www.ticketmaster.com");
	  System.out.println("succesfully open the driver");
	}

	@Test
	@Given("^I log in with valid credentials$")
	public void i_log_in_with_valid_credentials() {
		System.out.println("This is Given in Login class");
	   //Assert.fail();
	}

	@Then("^I should able to see log in$")
	public void i_should_able_to_see_log_in() throws InterruptedException {
	   System.out.println("This is Then");
	   Thread.sleep(4000);
	}
}
