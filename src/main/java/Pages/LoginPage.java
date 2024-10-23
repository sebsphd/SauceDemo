package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("user-name");
    private By passwordfield = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage fillLoginForm(){
        driver.findElement(usernameField).sendKeys("standard_user");
        driver.findElement(passwordfield).sendKeys("secret_sauce");
        driver.findElement(loginButton).click();
        return new MainPage(driver);
    }
}
