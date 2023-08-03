package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoq {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.out.println("Inside Step - browser is open");
		String Projectpath1 = System.getProperty("user.dir");
		System.out.println("Project path is = " + Projectpath1);

		System.setProperty("webdriver.chrome.driver", Projectpath1 + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://www.google.co.in/");
	}

}
