package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePageMadalina {
    @FindBy(id = "email")
    private WebElement emailSignIn;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(id = "SubmitLogin")
    private WebElement signInButton1;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]")
    private WebElement alert;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement myAccount;

    public SignInPage authentication() {
        goToLandingPage();
        HomePage homePage = new HomePage(getWebDriver());
        return homePage.clickSignInButton2();
    }

    public SignInPage insertEmailAndPassword(String getEmailSignIn, String getPassword) {
        SignInPage signInPage = authentication();
        signInPage.getEmailSignIn().sendKeys(getEmailSignIn);
        signInPage.getPassword().sendKeys(getPassword);
        signInPage.clickSignInButton1();
        return new SignInPage(getWebDriver());
    }

    public boolean assertMethod(SignInPage sign, String param1) {
        if (sign.getAlert().getText().contains(param1)) {
            return true;
        }
        return false;

    }

    public SignInPage clickSignInButton1() {
        getSignInButton1().click();
        return new SignInPage(getWebDriver());
    }


    public SignInPage(WebDriver webDriver) {
        super(webDriver);

        PageFactory.initElements(getWebDriver(), this);
    }


    public WebElement getEmailSignIn() {
        return emailSignIn;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignInButton1() {
        return signInButton1;
    }

    public WebElement getAlert() {
        return alert;
    }

    public WebElement getMyAccount() {
        return myAccount;
    }
}
