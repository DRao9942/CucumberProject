package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage_POM {
    WebDriver driver;
    By txt_username = By.id("name");
    By txt_password = By.id("password");
    By btn_login = By.id("login");
    By btn_logout = By.id("logout");

    public Loginpage_POM(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(btn_login).click();
    }

    public void checkLogout() {
        driver.findElement(btn_logout).isDisplayed();
    }
}
