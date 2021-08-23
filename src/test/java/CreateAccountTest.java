

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreateAccountTest extends BaseTestMadalina {
    @Test
    public void createAccountFail() throws InterruptedException {
        CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver());
        createAccountPage.insertEmailAddress("madalinaungureanu532@yahoo.com");
        Thread.sleep(2000);
        createAccountPage.insertPersonalData(createAccountPage, "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        createAccountPage.getEmail().clear();
        createAccountPage.clickMethod(createAccountPage);
        createAccountPage.selectMethod(createAccountPage, "", "", "", "", "");
        createAccountPage.clickRegisterButton();
        Thread.sleep(2000);


        assertTrue(createAccountPage.getErrors().isDisplayed());
        // assertTrue(createAccountPage.getErrors().getText().contains("There are 11 errors"));
        assertTrue(createAccountPage.getErrors().getText().contains("You must register at least one phone number."));
        assertTrue(createAccountPage.getErrors().getText().contains("lastname is required."));
        assertTrue(createAccountPage.getErrors().getText().contains("firstname is required."));
        assertTrue(createAccountPage.getErrors().getText().contains("email is required."));
        assertTrue(createAccountPage.getErrors().getText().contains("passwd is required."));
        assertTrue(createAccountPage.getErrors().getText().contains("id_country is required."));
        // assertTrue(createAccountPage.getErrors().getText().contains("alias is required."));
        assertTrue(createAccountPage.getErrors().getText().contains("address1 is required."));
        assertTrue(createAccountPage.getErrors().getText().contains("city is required."));
        assertTrue(createAccountPage.getErrors().getText().contains("Country cannot be loaded with address->id_country"));
        assertTrue(createAccountPage.getErrors().getText().contains("Country is invalid"));

    }


    @Test
    public void createAccountSuccess() throws InterruptedException {
        CreateAccountPage createAccountPage = new CreateAccountPage(getWebDriver());
        createAccountPage.insertEmailAddress("madalinaungureanu002@yahoo.com");
        Thread.sleep(2000);
        createAccountPage.insertPersonalData(createAccountPage, "Madalina", "Ungureanu", "", "12345", "Madalina", "Ungureanu", "Endava", "Calea Bucuresti nr 19", "Bloc 29", "Pitesti", "11007", "You can always find me at the specified address", "02365738", "073458678");
        createAccountPage.clickMethod(createAccountPage);
        createAccountPage.selectMethod(createAccountPage, "24", "5", "1999", "21", "21");
        createAccountPage.clickRegisterButton();
        Thread.sleep(2000);
        assertEquals("http://automationpractice.com/index.php?controller=my-account", getWebDriver().getCurrentUrl());

    }


}
