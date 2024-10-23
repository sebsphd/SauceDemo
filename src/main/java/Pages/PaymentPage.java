package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaymentPage {
    private WebDriver driver;
    private By finishBtn = By.id("finish");

    public PaymentPage(WebDriver driver){
        this.driver = driver;
    }
    public int checkTotalPrice(){
        List<WebElement> price = driver.findElements(By.className("inventory_item_price"));
        int totalPrice = 0;
        for(WebElement priceElement : price){
            String priceText = priceElement.getText();
            String cleanPriceText = priceText.replaceAll("[^0-9]","");
            int priceInt = Integer.parseInt(cleanPriceText);
            totalPrice += priceInt;
        }
        System.out.println(totalPrice);
        return totalPrice;

    }
}
