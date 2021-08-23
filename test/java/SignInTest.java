import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInTest extends BaseTest {



    @Test
    public void testSignIn() throws InterruptedException{
        webDriver.get("http://automationpractice.com/index.php");
        HomePageMyStore homePageObjects = new HomePageMyStore(webDriver);
        SignInPageMyStore signInObjects = new SignInPageMyStore(webDriver);

        String emailUser = new String("adrianionut@gmail.com");
        String passwordUser = new String("password1234");
        homePageObjects.clickSingInButton();
        signInObjects.signIn(emailUser,passwordUser);
        Thread.sleep(3000);

    }


}
