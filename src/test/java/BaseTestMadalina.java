package project1;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTestMadalina {
    private WebDriver webDriver;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

    }

    //@After
    public void quit() {
        webDriver.quit();
    }

    public void goToLandingPage() {
        webDriver.get("http://automationpractice.com/index.php");
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }


}
