import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class BuyBlouses extends BasePage {
    WebDriver driver;

    public BuyBlouses(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By blouses = By.linkText("WOMEN");
    By selectTops= By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/span");
    By selectBlouses = By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/ul/li[2]/a");
    By blackBlouses =By.xpath("//*[@id=\"color_7\"]");
    By detailsAboutBlouses = By.xpath("//*[@id=\"short_description_content\"]/p");
    By whiteBlouses = By.id("color_8");
    By quantityWanted = By.id("quantity_wanted");
    By addToCart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By proceedToCart = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
    By totalPrice = By.id("total_price_container");
    By continueToCheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
    By continueToCheckout2 = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
    By acceptTerms = By.id("cgv");
    By continueToCheckout3 = By.xpath("//*[@id=\"form\"]/p/button/span");
    By payMethod = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
    By confirmOrder = By.xpath("//*[@id=\"cart_navigation\"]/button/span");
    By completeInformationAboutOrder = By.xpath("//*[@id=\"center_column\"]/div/p");

    public void selectBlouses(By blouses) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions actions = new Actions(driver);

        WebElement firstBlouses = driver.findElement(blouses);
        actions.moveToElement(firstBlouses).moveToElement(driver.findElement(blouses)).click().build().perform();
        assertEquals("WOMEN", driver.findElement(blouses).getText());
        //driver.findElement(blouses).click();
        driver.findElement(selectTops).click();
        Thread.sleep(2000);
        driver.findElement(selectBlouses).click();
        Thread.sleep(1000);
        driver.findElement(blouses).sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);
        driver.findElement(blackBlouses).click();
        Thread.sleep(4000);
        driver.findElement(whiteBlouses).click();
        assertEquals("Short sleeved blouse with feminine draped sleeve detail.", driver.findElement(detailsAboutBlouses).getText());
        driver.findElement(quantityWanted).clear();
        driver.findElement(quantityWanted).sendKeys("2");

        driver.findElement(addToCart).click();
        Thread.sleep(6000);
        driver.findElement(proceedToCart).click();
        Thread.sleep(2000);
        assertEquals("$56.00", driver.findElement(totalPrice).getText());
        driver.findElement(continueToCheckout).click();
        driver.findElement(continueToCheckout2).click();
        driver.findElement(acceptTerms).click();
        driver.findElement(continueToCheckout3).click();
        driver.findElement(payMethod).click();
        driver.findElement(confirmOrder).click();
        Thread.sleep(2000);
        assertEquals("Your order on My Store is complete.", driver.findElement(completeInformationAboutOrder).getText());

    }
}
