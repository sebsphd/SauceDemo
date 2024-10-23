package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartPage {
    private WebDriver driver;
    private By checkOutBtn = By.id("checkout");
//    private int items = 0;

    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
    }

    public int countItems(){
        List<WebElement> itemInShoppingCart = driver.findElements(By.className("cart_item"));
        System.out.println("item in cart= "+ itemInShoppingCart.size());
        return itemInShoppingCart.size();
    }

    public CheckOutPage checkOut(){

        int items = countItems();
        if(items == 0){
            System.out.println("No item in the shopping cart.");
            return null;
        }else{
            driver.findElement(checkOutBtn).click();
            return new CheckOutPage(driver);
        }

    }
}
