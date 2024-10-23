package Base;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.reporters.jq.Main;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;
    protected MainPage mainPage;
    protected PaymentPage paymentPage;
    protected CheckOutPage checkOutPage;
    protected ShoppingCartPage shoppingCartPage;

    @BeforeClass
    public void initialize(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ianti/OneDrive/Documents/dev/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        loginPage.fillLoginForm();
        mainPage = new MainPage(driver); //not really needed, but setting up everything in this BaseTest would be a lot of work
//        loginPage.fillLoginForm();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
