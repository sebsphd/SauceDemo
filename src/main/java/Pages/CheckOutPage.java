package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By zipCode = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By cancelBtn = By.id("cancel");

    public CheckOutPage(WebDriver driver){
        this.driver = driver;
    }

    public PaymentPage fillCheckOutForm(){
        driver.findElement(firstName).sendKeys("John");
        driver.findElement(lastName).sendKeys("Doe");
        driver.findElement(zipCode).sendKeys("90123");
        driver.findElement(continueBtn).click();
        return new PaymentPage(driver);
    }
}
