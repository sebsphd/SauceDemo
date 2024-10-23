package Login;

import Base.BaseTest;
import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin(){
        MainPage mainPage = loginPage.fillLoginForm();
    }
}
