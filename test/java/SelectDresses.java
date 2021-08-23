import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SelectDresses extends BaseTest {


    @Test
    public void selectingDressesTest() throws InterruptedException {
        webDriver.get("http://automationpractice.com/index.php?controller=my-account");

        DashboardPageMyStore dashboardPageObjects = new DashboardPageMyStore(webDriver);
        /////////////////////////////// The lines of code, below, alow the user to sign in
        SignInPageMyStore signInObjects = new SignInPageMyStore(webDriver);
        HomePageMyStore homePageObjects = new HomePageMyStore(webDriver);
        String emailUser = new String("adrianionut@gmail.com");
        String passwordUser = new String("password1234");
        homePageObjects.clickSingInButton();
        signInObjects.signIn(emailUser,passwordUser);
        /////////////////////////////////
        // To change the selected dress, you need to change de digit at the end of summerDressPrinted#
        // To change the payment method, you need to chanege the dashboardPageObjects.paymentMethod_# with "BankWire" or "Check"
        dashboardPageObjects.selectSummerDresses(dashboardPageObjects.summerDressesPrinted3, dashboardPageObjects.paymentMethod_BankWire);
        Thread.sleep(2000);

     //   WebElement summerDressesPrinted1 = webDriver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));









    }

}
