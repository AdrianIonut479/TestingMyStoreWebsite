package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage extends BasePageMadalina {
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement dressesButton;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    private WebElement eveningDresses;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")
    private WebElement casualDresses;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
    private WebElement printedDress;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")
    private WebElement addToCartButton;
    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
    private WebElement proceedToCheckoutButton;
    @FindBy(id = "total_product")
    public WebElement totalProduct;
    @FindBy(id = "cart_quantity_up_4_16_0_0")
    private WebElement cartQuantityUp;
    @FindBy(id = "quantity_wanted")
    private WebElement cartQuantity;
    @FindBy(css = "#product_price_4_44_0 > span")
    private WebElement unitPrice;
    @FindBy(id = "color_7")
    private WebElement beigeColor;
    @FindBy(id = "color_24")
    private WebElement pinkColor;
    @FindBy(id = "group_1")
    private WebElement sizeDropDown;
    @FindBy(id="add_to_cart")
    private WebElement addToCartButton1;
    @FindBy(css = "#product_4_44_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey")
    public WebElement cant1;

    public AddToCartPage addToCardMethod() throws InterruptedException {
        goToLandingPage();
        AddToCartPage addToCartPage= new AddToCartPage(getWebDriver());
        Actions action = new Actions(getWebDriver());
        action.moveToElement(addToCartPage.getDressesButton()).build().perform();
        Thread.sleep(1000);
        addToCartPage.getEveningDresses().click();
        addToCartPage.getPrintedDress().click();
        Thread.sleep(2000);
        addToCartPage.getPinkColor().click();
        Select select=new Select(addToCartPage.getSizeDropDown());
        select.selectByValue("2");
        addToCartPage.getCartQuantity().clear();
        addToCartPage.getCartQuantity().sendKeys("3");
        addToCartPage.getAddToCartButton1().click();
        Thread.sleep(2000);
        new WebDriverWait(getWebDriver(),3).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")));
        addToCartPage.getProceedToCheckoutButton().click();
        Thread.sleep(3000);
        return new AddToCartPage(getWebDriver());


    }

    public AddToCartPage(WebDriver webDriver) {
        super(webDriver);

        PageFactory.initElements(getWebDriver(),this);
    }

    public WebElement getDressesButton() {return dressesButton;}
    public WebElement getEveningDresses() {return eveningDresses;}
    public WebElement getCasualDresses() {return casualDresses;}
    public WebElement getPrintedDress() {return printedDress;}
    public WebElement getAddToCartButton() {return addToCartButton;}
    public WebElement getProceedToCheckoutButton() {return proceedToCheckoutButton;}
    public WebElement getTotalProduct() {return totalProduct;}
    public WebElement getCartQuantityUp() {return cartQuantityUp;}
    public WebElement getCartQuantity() {return cartQuantity;}
    public WebElement getUnitPrice() {return unitPrice;}
    public WebElement getBeigeColor() {return beigeColor;}
    public WebElement getPinkColor() {return pinkColor;}
    public WebElement getSizeDropDown() {return sizeDropDown;}
    public WebElement getAddToCartButton1() {return addToCartButton1;}

    public WebElement getCant1() {
        return cant1;
    }
}
