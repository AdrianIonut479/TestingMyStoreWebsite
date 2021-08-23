


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AddToCartTest extends project1.BaseTestMadalina {

    @Test
    public void addToCartTest() throws InterruptedException {
        project1.AddToCartPage addToCartPage = new project1.AddToCartPage(getWebDriver());
        addToCartPage.addToCardMethod();
        Double qty = Double.valueOf(addToCartPage.getCant1().getAttribute("value"));
        Double unitPrice = Double.valueOf(addToCartPage.getUnitPrice().getText().substring(1));
        Double totalPrice = Double.valueOf(addToCartPage.getTotalProduct().getText().substring(1));
        Double expectedPrice = qty * unitPrice;
        assertEquals(expectedPrice, totalPrice);


    }
}