


import org.junit.Test;

import static org.junit.Assert.*;

public class SignInTestMadalina extends project1.BaseTestMadalina {
   @Test
    public void signInSuccess() throws InterruptedException {
       project1.SignInPage sign=new project1.SignInPage(getWebDriver());
       sign.insertEmailAndPassword("madalinaungureanu502@yahoo.com","12345");
       assertEquals("http://automationpractice.com/index.php?controller=my-account", getWebDriver().getCurrentUrl());

    }

    @Test
    public void signInFailWrongEmail() throws InterruptedException {
        project1.SignInPage sign=new project1.SignInPage(getWebDriver());
        sign.insertEmailAndPassword("madalinaungurea@yahoo.com","12345");
        assertTrue(sign.getAlert().isDisplayed());
        assertTrue(sign.assertMethod(sign, "Authentication failed."));


    }
    @Test
    public void signInFailWrongPassword() throws InterruptedException {
        project1.SignInPage sign=new project1.SignInPage(getWebDriver());
        sign.insertEmailAndPassword("madalinaungurea@yahoo.com","123");
        assertTrue(sign.getAlert().isDisplayed());
        assertTrue(sign.assertMethod(sign, "Invalid password."));

    }

}
