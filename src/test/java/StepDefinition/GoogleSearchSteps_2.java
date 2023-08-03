package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps_2 {

    WebDriver driver = null;

    @Given("browser is open")
    public void Browser_is_open() throws InterruptedException {
        System.out.println("Inside Step - browser is open");
        String Projectpath = System.getProperty("user.dir");
        System.out.println("Project path is = " + Projectpath);

        System.setProperty("webdriver.chrome.driver", Projectpath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("user is on Google page")
    public void user_is_on_Google_page() throws InterruptedException {
        System.out.println("Inside Step - user is on Google page");
        Thread.sleep(5000);
        driver.navigate().to("https://www.google.co.in/");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("Inside Step - user enters a text in search box");
        driver.findElement(By.name("q")).sendKeys("automation step by step");
    }

    @And("hits enter")
    public void hits_enter() {
        System.out.println("Inside Step - hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Inside Step - user is navigated to search results");
        driver.getPageSource().contains("Online Courses");
        
        driver.close();
        driver.quit();
    }
    
    
}
