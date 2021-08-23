package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePageMadalina {
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement signInButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);

        PageFactory.initElements(getWebDriver(), this);
    }

    public CreateAccountPage clickSignInButton() {
        new WebDriverWait(getWebDriver(), 3).until(ExpectedConditions.elementToBeClickable(getSignInButton()));
        getSignInButton().click();
        return new CreateAccountPage(getWebDriver());
    }

    public SignInPage clickSignInButton2() {
        new WebDriverWait(getWebDriver(), 3).until(ExpectedConditions.elementToBeClickable(getSignInButton()));
        getSignInButton().click();
        return new SignInPage(getWebDriver());
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

}
