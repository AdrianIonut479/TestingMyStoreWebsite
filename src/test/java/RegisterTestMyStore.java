import jdk.jfr.Timespan;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

public class RegisterTestMyStore extends BaseTest {

    @Test
    public void test() throws InterruptedException{
        webDriver.get("http://automationpractice.com/index.php");
        WebDriverWait wait = new WebDriverWait(webDriver,8);
        HomePageMyStore homePageObjects = new HomePageMyStore(webDriver);
        CreateAccountPageMyStore createAccountObjects = new CreateAccountPageMyStore(webDriver);
        homePageObjects.clickSingInButton();

        homePageObjects.enterEmailAddresTextBox("cineva14@gmail.com");
        homePageObjects.clickCreateAccountButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-id_gender1")));
        createAccountObjects.clickRadioButtonMr();
        createAccountObjects.userCredentials("Adrian","Ion","password1234");
        createAccountObjects.enterDateOfBirth("1","7","2012");
        // The action to scroll over to a specific element, known by id
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.id("postcode")));
        actions.perform();
        String firstName = "Adrian";
        String lastName = "Ion";
        createAccountObjects.enterAddressCredentials(firstName,lastName,"Endava",
                "Str XDGDG","Str IDGDJK","Pitesti","Arizona","00000",
                "United States","Not so much info","345353234","0732489523432","Pit");


        WebElement userNameSpan = webDriver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
        assertEquals(firstName+" "+lastName, userNameSpan.getText());
        if((firstName+" "+lastName).equals(userNameSpan.getText())) {
            System.out.println("User's name has been introduced corectly");
        }





    }

}
