<<<<<<< HEAD
import com.sun.source.doctree.ThrowsTree;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

import static org.junit.Assert.*;

public class BuyTshirt extends BasePage {
    WebDriver driver;
    By user = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
    By tshirt = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    By selectTshirt = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]");
    By listSort = By.xpath("//*[@id=\"list\"]/a/i");
    By viewTshirt = By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1");
    By entierTshirt = By.xpath("//*[@id=\"center_column\"]/ul/li/div");
    By changeQuantity = By.xpath("//*[@id=\"quantity_wanted\"]");
    By addToCart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By blueColor = By.xpath("//*[@id=\"color_2\"]");
    By availableStock = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/span");
    By proccedToAddress = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    By totalQuantity = By.xpath("//*[@id=\"summary_products_quantity\"]");
    By totalPrice = By.xpath("//*[@id=\"total_price\"]");
    By closeCart = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span");
    By viewCart = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[3]");
    By addressCity = By.xpath("//*[@id=\"address_delivery\"]/li[5]");
    By commentOrder = By.xpath("//*[@id=\"ordermsg\"]/textarea");
    By proceedToShipping = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
    By termsOfServices = By.id("cgv");
    By proceedToPayment = By.xpath("//*[@id=\"form\"]/p/button/span");
    By payByCheck = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
    By currencyUsed = By.xpath("//*[@id=\"center_column\"]/form/div/p[3]/b");
    By lastStepToConfirm = By.xpath("//*[@id=\"cart_navigation\"]/button/span");
    By confirmingOrder = By.xpath("//*[@id=\"center_column\"]/p[1]");


    public BuyTshirt(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void selectTshirt(By tshirt) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions actions = new Actions(driver);

        WebElement firstTshirt = driver.findElement(tshirt);
        actions.moveToElement(firstTshirt).moveToElement(driver.findElement(tshirt)).click().build().perform();

        assertEquals("T-SHIRTS", driver.findElement(tshirt).getText());
        driver.findElement(listSort).click();
        //
        //BuyTshirt view = driver.switchTo().window();
        actions.moveToElement(driver.findElement(blueColor));
        wait.until(ExpectedConditions.visibilityOfElementLocated(blueColor));
        Thread.sleep(2000);
        //actions.moveToElement(driver.findElement(blueColor)).click().perform();
        Thread.sleep(1000);
        driver.findElement(blueColor).click();
        Thread.sleep(1000);
        assertEquals("Faded Short Sleeve T-shirts", driver.findElement(viewTshirt).getText());
        //actions.moveToElement(driver.findElement(changeQuantity));
        wait.until(ExpectedConditions.elementToBeClickable(changeQuantity));
        waitForElementToAppear(changeQuantity);
        driver.findElement(changeQuantity).click();
        Thread.sleep(500);
        driver.findElement(changeQuantity).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(100);
        driver.findElement(changeQuantity).sendKeys("3");
        driver.findElement(addToCart).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(closeCart));
        driver.findElement(closeCart).click();
        driver.findElement(viewCart).click();
        Thread.sleep(1000);
        actions.moveToElement(driver.findElement(totalPrice));
        Thread.sleep(1000);
        assertEquals("$51.53", driver.findElement(totalPrice).getText());
        Thread.sleep(500);
        assertEquals("3 Products", driver.findElement(totalQuantity).getText());
        driver.findElement(proccedToAddress).click();
        assertEquals("Indore, Alaska 00000", driver.findElement(addressCity).getText());
        driver.findElement(commentOrder).click();
        driver.findElement(commentOrder).sendKeys("I want to send me this order A.S.A.P. Thanks you in advance!");
        driver.findElement(proceedToShipping).click();
        Thread.sleep(1000);
        driver.findElement(termsOfServices).click();
        driver.findElement(proceedToPayment).click();
        driver.findElement(payByCheck).click();
        Thread.sleep(500);
        assertEquals("Dollar", driver.findElement(currencyUsed).getText());
        driver.findElement(lastStepToConfirm).click();
        Thread.sleep(2000);
        assertEquals("Your order on My Store is complete.", driver.findElement(confirmingOrder).getText());
    }
=======
import com.sun.source.doctree.ThrowsTree;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

import static org.junit.Assert.*;

public class BuyTshirt extends BasePage{
    WebDriver driver;
    By user = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
    By tshirt = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    By selectTshirt= By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]");
    By listSort = By.xpath("//*[@id=\"list\"]/a/i");
    By viewTshirt = By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1");
    By entierTshirt = By.xpath("//*[@id=\"center_column\"]/ul/li/div");
    By changeQuantity = By.xpath("//*[@id=\"quantity_wanted\"]");
    By addToCart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By blueColor = By.xpath("//*[@id=\"color_2\"]");
    By availableStock = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/span");
    By proccedToAddress = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    By totalQuantity = By.xpath("//*[@id=\"summary_products_quantity\"]");
    By totalPrice = By.xpath("//*[@id=\"total_price\"]");
    By closeCart = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span");
    By viewCart = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[3]");
    By addressCity = By.xpath("//*[@id=\"address_delivery\"]/li[5]");
    By commentOrder = By.xpath("//*[@id=\"ordermsg\"]/textarea");
    By proceedToShipping = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
    By termsOfServices = By.id("cgv");
    By proceedToPayment = By.xpath("//*[@id=\"form\"]/p/button/span");
    By payByCheck = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
    By currencyUsed = By.xpath("//*[@id=\"center_column\"]/form/div/p[3]/b");
    By lastStepToConfirm = By.xpath("//*[@id=\"cart_navigation\"]/button/span");
    By confirmingOrder = By.xpath("//*[@id=\"center_column\"]/p[1]");


    public BuyTshirt(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public void selectTshirt(By tshirt) throws InterruptedException{
        WebDriverWait wait=new WebDriverWait(driver, 10);
        Actions actions = new Actions(driver);

        WebElement firstTshirt = driver.findElement(tshirt);
        actions.moveToElement(firstTshirt).moveToElement(driver.findElement(tshirt)).click().build().perform();

        assertEquals("T-SHIRTS", driver.findElement(tshirt).getText());
        driver.findElement(listSort).click();
        //
        //BuyTshirt view = driver.switchTo().window();
        actions.moveToElement(driver.findElement(blueColor));
        wait.until(ExpectedConditions.visibilityOfElementLocated(blueColor));
        Thread.sleep(2000);
        //actions.moveToElement(driver.findElement(blueColor)).click().perform();
        Thread.sleep(1000);
        driver.findElement(blueColor).click();
        Thread.sleep(1000);
        assertEquals("Faded Short Sleeve T-shirts",driver.findElement(viewTshirt).getText());
        //actions.moveToElement(driver.findElement(changeQuantity));
        wait.until(ExpectedConditions.elementToBeClickable(changeQuantity));
        waitForElementToAppear(changeQuantity);
        driver.findElement(changeQuantity).click();
        Thread.sleep(500);
        driver.findElement(changeQuantity).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(100);
        driver.findElement(changeQuantity).sendKeys("3");
        driver.findElement(addToCart).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(closeCart));
        driver.findElement(closeCart).click();
        driver.findElement(viewCart).click();
        Thread.sleep(1000);
        actions.moveToElement(driver.findElement(totalPrice));
        Thread.sleep(1000);
        assertEquals("$51.53",driver.findElement(totalPrice).getText());
        Thread.sleep(500);
        assertEquals("3 Products", driver.findElement(totalQuantity).getText());
        driver.findElement(proccedToAddress).click();
        assertEquals("Indore, Alaska 00000", driver.findElement(addressCity).getText());
        driver.findElement(commentOrder).click();
        driver.findElement(commentOrder).sendKeys("I want to send me this order A.S.A.P. Thanks you in advance!");
        driver.findElement(proceedToShipping).click();
        Thread.sleep(1000);
        driver.findElement(termsOfServices).click();
        driver.findElement(proceedToPayment).click();
        driver.findElement(payByCheck).click();
        Thread.sleep(500);
        assertEquals("Dollar", driver.findElement(currencyUsed).getText());
        driver.findElement(lastStepToConfirm).click();
        Thread.sleep(2000);
        assertEquals("Your order on My Store is complete.", driver.findElement(confirmingOrder).getText());
    }
>>>>>>> 029f0afc15df17f12e08d63ae2cd2bbc5a149d9f
}