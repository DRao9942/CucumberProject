package StepForHooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class HooksDemoSteps {
	WebDriver driver = null;
	
	@Before
	public void browsersetep() {
		String Projectpath = System.getProperty("user.dir");
	System.out.println("Project path is = " +Projectpath);
	System.setProperty("webdriver.chrome.driver", Projectpath +"/src/test/resources/drivers/chromedriver.exe");
	driver = new ChromeDriver();
			 }
	@After
	 public void teardown(){
		driver.quit();
		driver.close();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Add code to navigate to the login page
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Add code to click the login button
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		// Add code to verify that the user is on the home page
	}

}



