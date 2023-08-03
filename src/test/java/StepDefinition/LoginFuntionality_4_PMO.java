
  package StepDefinition;
  
  //import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  //org.openqa.selenium.chrome.ChromeDriver;
 import pages.Loginpage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import
  io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
  io.cucumber.java.en.Then; import io.cucumber.java.en.When;
  
  public class LoginFuntionality_4_PMO {
  
  WebDriver driver = null; Loginpage_POM login;
  
  @Given("Login Page") public void LoginPage() throws InterruptedException {
  System.out.println(" ==== ===== Inside Step - Login page");
  System.out.println("Inside Step - Login page"); String Projectpath =
  System.getProperty("user.dir"); System.out.println("Project path is = " +
  Projectpath); System.setProperty("webdriver.chrome.driver", Projectpath +
  "/src/test/resources/drivers/chromedriver.exe"); driver = new ChromeDriver();
  }
  
  @And("user is on login page") public void user_is_on_login_page() throws
  InterruptedException {
  System.out.println("Inside Step - user is on login page");
  Thread.sleep(3000);
  driver.navigate().to("https://example.testproject.io/web/"); }
  
  @When("^user enters (.*) and (.*)$") public void
  user_enters_username_and_password(String username, String password) throws
  InterruptedException { Thread.sleep(3000); login = new Loginpage_POM(driver);
  login.enterUsername(username); login.enterPassword(password); }
  
  @And("enters password") public void enters_password() throws
  InterruptedException { Thread.sleep(3000); login.clickLogin(); }
  
  @Then("user is navigated to Example page") public void
  user_is_navigated_to_Example_page() throws InterruptedException {
  Thread.sleep(3000); login.checkLogout(); driver.close(); driver.quit(); } }
 