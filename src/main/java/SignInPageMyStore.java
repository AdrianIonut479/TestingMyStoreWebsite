import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPageMyStore extends BasePage {


    By emailSignIn = By.id("email");
    By passwordSignIn = By.id("passwd");
    By signInButton = By.id("SubmitLogin");

    public SignInPageMyStore(WebDriver driver) {
        super(driver);
    }

    public void signIn(String email, String password){
        driver.findElement(emailSignIn).sendKeys(email);
        waitForElementToAppear(emailSignIn);
        driver.findElement(passwordSignIn).sendKeys(password);
        driver.findElement(signInButton).click();
    }

}
