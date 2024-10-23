package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private By buttonId = By.id("add-to-cart-sauce-labs-bike-light");
    private By shoppingCart = By.xpath("//span[@class='shopping_cart_badge' and @data-test='shopping-cart-badge']");
    private By removeButtonId = By.id("remove-sauce-labs-bike-light");
    private By itemId = By.id("item_4_title_link");
    private By shoppingCartBtn = By.id("shopping_cart_container");



    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void addCart(){
        driver.findElement(buttonId).click();
        Assert.assertEquals(driver.findElement(shoppingCart).getText(),"1");
        System.out.println("Cart number: "+ driver.findElement(shoppingCart).getText());
    }

    public void removeCart(){
        driver.findElement(removeButtonId).isDisplayed();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(removeButtonId));
        driver.findElement(removeButtonId).click();
    }

    public ItemDetailPage clickItem(){
        driver.findElement(itemId).click();
        String id_str = itemId.toString();
        int id_int = Integer.parseInt(id_str.split("_")[1]);
        return new ItemDetailPage(driver, id_int);
    }

    public ShoppingCartPage clickShoppingCart(){
        driver.findElement(shoppingCartBtn).click();
        return new ShoppingCartPage(driver);
    }
}
