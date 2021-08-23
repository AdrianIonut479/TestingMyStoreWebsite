import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class DashboardPageMyStore extends BasePage {

    WebDriver driver;
    By userName = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
    By dressesButton = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
    By summerDressesButton = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a");
    By summerDressesPrinted1 = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > h5 > a");
    By summerDressesPrinted2 = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a");
    By summerDressesPrinted3 = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.last-line.first-item-of-tablet-line.last-item-of-mobile-line.last-mobile-line > div > div.right-block > h5 > a");
    By compareButton = By.xpath("//*[@id=\"center_column\"]/div[3]/div/form");
    By dressColor1 = By.cssSelector("#color_15");
    By dressColor2 = By.cssSelector("#color_16");
    By addToCartButton = By.cssSelector("#add_to_cart > button > span");
    By continouShoppingButton = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span");
    By largeImage = By.cssSelector("#bigpic");
    By closeButton = By.cssSelector("#product > div.fancybox-wrap.fancybox-desktop.fancybox-type-image.fancybox-opened > div > a");
    By proceedToCheckoutButton = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a");
    By deleteDressButton = By.cssSelector("#\\37 _34_0_554042");
    By getProceedToCheckoutSummaryButton = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
    By getProceedToCheckoutAddressButton = By.cssSelector("#center_column > form > p > button");
    By termsAndServiciesRadioButton = By.cssSelector("#cgv");
    By getProceedToCheckoutShippingButton = By.cssSelector("#form > p > button");
    By paymentMethod_BankWire = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    By paymentMethod_Check = By.cssSelector("#HOOK_PAYMENT > div:nth-child(2) > div > p > a");
    By iConfirmMyOrderButton = By.cssSelector("#cart_navigation > button");
    By filterSummerDresses = By.cssSelector("#layered_category_11");
    By filterDressesSizeM = By.cssSelector("#layered_id_attribute_group_2");
    By filterDressesColorOrange = By.cssSelector("#ul_layered_id_attribute_group_3 > li:nth-child(4) > label > a");
    By filterDressesCompositionViscose = By.cssSelector("#layered_id_feature_3");
    By filterDressesStylesCasual = By.cssSelector("#layered_id_feature_11");
    By filterDressesPriceSlider = By.cssSelector("#layered_price_slider > div");
    By quantityDressValue = By.cssSelector("#quantity_wanted");
    By dressSizeValue = By.cssSelector("#group_1");
    By addToCartButtonPrintedDress1 = By.cssSelector("#add_to_cart > button > span");
    By productInStockSpan = By.cssSelector("#product_5_23_0_554042 > td.cart_avail > span");
    By productUnitPrice = By.cssSelector("#product_price_5_23_554042 > span.old-price");
    By productSpecialPrice = By.cssSelector("#product_price_5_23_554042 > span.price.special-price");
    By totalPriceProduct = By.cssSelector("#total_product_price_5_23_554042");
    By productPercentReduction = By.cssSelector("#product_price_5_23_554042 > span.price-percent-reduction.small");
    By productQuantity = By.cssSelector("#product_5_23_0_554042 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey");




    public DashboardPageMyStore(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void selectSummerDresses(By summerDress, By paymentMethod) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,8);
       Actions action = new Actions(driver);
       WebElement dressesB = driver.findElement(dressesButton);
       action.moveToElement(dressesB).moveToElement(driver.findElement(summerDressesButton)).click().build().perform();
       action.moveToElement(driver.findElement(compareButton));
       waitForElementToBeClickable(summerDressesPrinted3);
     //  assertEquals("Printed Chiffon Dress",driver.findElement(summerDressesPrinted3).getText());
     //  assertEquals("Printed Summer Dress",driver.findElement(summerDressesPrinted1).getText());
    //   assertEquals("Printed Summer Dress",driver.findElement(summerDressesPrinted2).getText());
       ///////////// All summer dresses have the right name
       driver.findElement(summerDress).click();
       // The line of code below alows to view the large version of the picture
         driver.findElement(largeImage).click();
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        driver.findElement(closeButton).click();
        // Choses the dress with the first color
        driver.findElement(dressColor1).click();
        driver.findElement(addToCartButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(continouShoppingButton));
        driver.findElement(continouShoppingButton).click();
        // Choses the dress with the second color
        driver.findElement(dressColor2).click();
        driver.findElement(addToCartButton).click();
        driver.findElement(proceedToCheckoutButton).click();
        waitForElementToAppear(deleteDressButton);
        driver.findElement(deleteDressButton).click();
        driver.findElement(getProceedToCheckoutSummaryButton).click();
        driver.findElement(getProceedToCheckoutAddressButton).click();
        driver.findElement(termsAndServiciesRadioButton).click();
        driver.findElement(getProceedToCheckoutShippingButton).click();
        driver.findElement(paymentMethod).click();
        driver.findElement(iConfirmMyOrderButton).click();


    }

    public void filterDresses() throws InterruptedException {
        Actions action = new Actions(driver);
        driver.findElement(dressesButton).click();
        action.moveToElement( driver.findElement(filterSummerDresses));
        driver.findElement(filterSummerDresses).click();
        action.moveToElement( driver.findElement(filterDressesSizeM));
        driver.findElement(filterDressesSizeM).click();
        action.moveToElement( driver.findElement(filterDressesColorOrange));
        driver.findElement(filterDressesColorOrange).click();
        action.moveToElement( driver.findElement(filterDressesCompositionViscose));
        driver.findElement(filterDressesCompositionViscose).click();
        action.moveToElement( driver.findElement(filterDressesStylesCasual));
        driver.findElement(filterDressesStylesCasual).click();
        action.moveToElement( driver.findElement(filterDressesPriceSlider));
        ////////////////////////////////// Move sliders
        WebElement sliderA = driver.findElement(By.cssSelector("#layered_price_slider > a:nth-child(2)"));
        Actions move = new Actions(driver);
        move.dragAndDropBy(sliderA,40, 0).click();
        move.build().perform();


        WebElement sliderB = driver.findElement(By.cssSelector("#layered_price_slider > a:nth-child(3)"));

        move.dragAndDropBy(sliderB, -90, 0).click();
        move.build().perform();

        Thread.sleep(10000);
    }

    public String removeFirstChar(String s){
        return s.substring(1);
    }
    public String removeLastChar(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        return s.substring(0, s.length()-2);
    }

    public void verifyDressesPrice() throws  InterruptedException{
        Actions action = new Actions(driver);
        WebElement dressesB = driver.findElement(dressesButton);
        dressesB.click();
        action.moveToElement(driver.findElement(summerDressesPrinted1));
        driver.findElement(summerDressesPrinted1).click();
        driver.findElement(quantityDressValue).clear();
        driver.findElement(quantityDressValue).sendKeys("3");
        Select CompanyState = new Select(driver.findElement(dressSizeValue));
        CompanyState.selectByVisibleText("M");
        waitForElementToBeClickable(addToCartButtonPrintedDress1);
        driver.findElement(addToCartButtonPrintedDress1).click();
        waitForElementToAppear(proceedToCheckoutButton);
        driver.findElement(proceedToCheckoutButton).click();
        assertEquals("In stock",driver.findElement(productInStockSpan).getText());
        System.out.println("Product is in stock");
        assertEquals("30.51",removeFirstChar(driver.findElement(productUnitPrice).getText()));
        System.out.println("Unit price: "+driver.findElement(productUnitPrice).getText());
        assertEquals("86.94",removeFirstChar(driver.findElement(totalPriceProduct).getText()));
        System.out.println("Total price: "+driver.findElement(totalPriceProduct).getText());
        // Float values of unit price, special price unit and total price
        Float unitPrice = Float.parseFloat(removeFirstChar(driver.findElement(productUnitPrice).getText()));
        Float unitSpecialPrice = Float.parseFloat(removeFirstChar(driver.findElement(productSpecialPrice).getText()));
        Float totalPrice = Float.parseFloat(removeFirstChar(driver.findElement(totalPriceProduct).getText()));
        //// Get the float value of product's reduction
        String specialReduction = driver.findElement(productPercentReduction).getText();
        specialReduction = removeLastChar(specialReduction);
        specialReduction = removeFirstChar(specialReduction);
        Float specialReductionF = Float.parseFloat(specialReduction);
        Float specialPriceF = unitPrice+(specialReductionF/100)*unitPrice;
        System.out.println("Unit price after reduction: "+String.format("%.02f",specialPriceF));
        Float specialPriceFloat = Float.parseFloat(String.format("%.02f",specialPriceF));
        assertEquals(java.util.Optional.of(totalPrice), java.util.Optional.of(3 * specialPriceFloat));
        System.out.println("Total price: "+3*specialPriceFloat);

        Thread.sleep(2000);
    }







}
