package MainMenu;

import Base.BaseTest;
import Pages.CheckOutPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {


    private static final Logger log = LoggerFactory.getLogger(ShoppingCartTest.class);



    @Test
    public void testAddCart(){
//        var mainPage = loginPage.fillLoginForm();
        mainPage.addCart();
    }

    @Test
    public void testRemoveCart(){
//        var mainPage = loginPage.fillLoginForm();
        mainPage.addCart();
        mainPage.removeCart();

    }

    @Test
    public void testItemId(){
//        var mainPage = loginPage.fillLoginForm();
        var itemDetailPage = mainPage.clickItem();
        itemDetailPage.checkItemDetail();

    }

    @Test
    public void checkOut(){
//        var mainPage = loginPage.fillLoginForm();
        mainPage.addCart();
        var shoppingCartPage = mainPage.clickShoppingCart();
        shoppingCartPage.checkOut();
    }

    @Test
    public void checkOutFail(){
//        var mainPage = loginPage.fillLoginForm();
        var shoppingCartPage = mainPage.clickShoppingCart();
        shoppingCartPage.checkOut();
    }

    public CheckOutPage checkOutTest(){
        mainPage.addCart();
        var shoppingCartPage = mainPage.clickShoppingCart();
        return checkOutPage = shoppingCartPage.checkOut();
    }

    @Test void payment(){
        checkOutTest();
        var paymentPage = checkOutPage.fillCheckOutForm();
        paymentPage.checkTotalPrice();
    }
}
