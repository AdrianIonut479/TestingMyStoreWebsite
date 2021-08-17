import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePageMyStore {

    WebDriver driver;

    By signIn_Button = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By emailAddress_TextBox = By.id("email_create");
    By createAccount_Button = By.id("SubmitCreate");

    public HomePageMyStore(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSingInButton(){
        driver.findElement(signIn_Button).sendKeys(Keys.RETURN);
    }
    public void enterEmailAddresTextBox(String text){
        driver.findElement(emailAddress_TextBox).sendKeys(text);
    }

    public void clickCreateAccountButton(){
        driver.findElement(createAccount_Button).sendKeys(Keys.RETURN);
    }

}
