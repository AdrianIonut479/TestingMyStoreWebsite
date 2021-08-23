


import org.junit.Test;

import static org.junit.Assert.*;

public class SignInTestMadalina extends BaseTestMadalina {
    @Test
    public void signInSuccess() throws InterruptedException {
        SignInPage sign = new SignInPage(getWebDriver());
        sign.insertEmailAndPassword("madalinaungureanu502@yahoo.com", "12345");
        assertEquals("http://automationpractice.com/index.php?controller=my-account", getWebDriver().getCurrentUrl());

    }

    @Test
    public void signInFailWrongEmail() throws InterruptedException {
        SignInPage sign = new SignInPage(getWebDriver());
        sign.insertEmailAndPassword("madalinaungurea@yahoo.com", "12345");
        assertTrue(sign.getAlert().isDisplayed());
        assertTrue(sign.assertMethod(sign, "Authentication failed."));


    }

    @Test
    public void signInFailWrongPassword() throws InterruptedException {
        SignInPage sign = new SignInPage(getWebDriver());
        sign.insertEmailAndPassword("madalinaungurea@yahoo.com", "123");
        assertTrue(sign.getAlert().isDisplayed());
        assertTrue(sign.assertMethod(sign, "Invalid password."));

    }

}
