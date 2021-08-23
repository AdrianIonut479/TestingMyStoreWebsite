import org.junit.Test;

public class verifyPricesTest extends BaseTest{
    @Test
    public void verifyPrices() throws InterruptedException {
        webDriver.get("http://automationpractice.com/index.php?controller=my-account");
        DashboardPageMyStore dashboardPageObjects = new DashboardPageMyStore(webDriver);
        /////////////////////////////// The lines of code, below, alow the user to sign in
        SignInPageMyStore signInObjects = new SignInPageMyStore(webDriver);
        HomePageMyStore homePageObjects = new HomePageMyStore(webDriver);
        String emailUser = new String("adrianionut@gmail.com");
        String passwordUser = new String("password1234");
        signInObjects.signIn(emailUser,passwordUser);
        /////////////////////////////////
        dashboardPageObjects.verifyDressesPrice();


    }
}
