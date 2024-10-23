package Pages;

import org.openqa.selenium.WebDriver;

public class ItemDetailPage {
    private WebDriver driver;
    private int itemId;



    public ItemDetailPage(WebDriver driver, int itemId) {
        this.driver = driver;
        this.itemId = itemId;
    }

    public void checkItemDetail(){
//        if(driver.getCurrentUrl().contains("id="+itemId)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
        driver.getCurrentUrl().contains("id="+itemId);
    }
}
