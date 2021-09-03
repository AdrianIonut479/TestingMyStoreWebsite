import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectBlouses extends BaseTest{
    By usser = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    @Test
    public void selectBlousesTest() throws InterruptedException {
        webDriver.get("http://automationpractice.com/index.php");

        DashboardPageMyStore dashboardPageObjects = new DashboardPageMyStore(webDriver);
        // The lines of code, below, allow the user to sign in

        SignInPageMyStore signInObjects = new SignInPageMyStore(webDriver);
        HomePageMyStore homePageObjects = new HomePageMyStore(webDriver);
        BuyBlouses buyBlouses = new BuyBlouses(webDriver);
        WebDriverWait wait = new WebDriverWait(webDriver, 6);
        String user = new String("Meera Raheja");
        String emailUser = new String("admin@yahoo.com");
        String passwordUser = new String("admin");
        homePageObjects.clickSingInButton();
        signInObjects.signIn(emailUser, passwordUser);
        wait.until(ExpectedConditions.elementToBeClickable(usser));
        Assert.assertEquals("Meera Raheja", webDriver.findElement(usser).getText());
        buyBlouses.selectBlouses(buyBlouses.blouses);
        Thread.sleep(2000);

    }
}
