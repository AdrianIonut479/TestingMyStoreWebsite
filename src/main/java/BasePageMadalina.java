import org.openqa.selenium.WebDriver;

public class BasePageMadalina {
    private WebDriver webDriver;

    public void goToLandingPage() {
        webDriver.get("http://automationpractice.com/index.php");
    }

    public BasePageMadalina(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
