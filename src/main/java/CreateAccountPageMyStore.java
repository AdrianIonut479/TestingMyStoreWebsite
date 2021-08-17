import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPageMyStore extends BasePage {

    WebDriver driver;
    By genderMrRadioButton = By.id("id_gender1");
    By firstName = By.id("customer_firstname");
    By lastName = By.id("customer_lastname");
    By password = By.id("passwd");
    By dateOfBirthDays = By.id("days");
    By dateOfBirthMonth = By.id("months");
    By dateOfBirthYear = By.id("years");
    By newsletterCheckBox = By.id("newsletter");
    By specialOffersCheckBox = By.id("optin");
    By addressFirstNameTextBox = By.id("firstname");
    By addressLastNameTextBox = By.id("lastname");
    By theCompanysName = By.id("company");
    By addressCompany = By.id("address1");
    By addressCompanyLine2 = By.id("address2");
    By addressCompanyCity = By.id("city");
    By addressCompanyState = By.id("id_state");
    By zipCode = By.id("postcode");
    By addressCompanyCountry = By.id("id_country");
    By additionalInformation = By.id("other");
    By homePhone = By.id("phone");
    By mobilePhone = By.id("phone_mobile");
    By alisAddress = By.id("alias");
    By registerButton = By.id("submitAccount");





    public CreateAccountPageMyStore(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickRadioButtonMr(){
        driver.findElement(genderMrRadioButton).click();
    }

    public void userCredentials(String firstNameUser, String lastNameUser, String passwordUser){
        driver.findElement(firstName).sendKeys(firstNameUser);
        driver.findElement(lastName).sendKeys(lastNameUser);
        driver.findElement(password).sendKeys(passwordUser);
    }

    public void enterDateOfBirth(String day, String month, String year){
        ///////////////////////////// Dropdowns for date of birth
        Select Days = new Select(driver.findElement(dateOfBirthDays));
        Select Months = new Select(driver.findElement(dateOfBirthMonth));
        Select Years = new Select(driver.findElement(dateOfBirthYear));
        /////////////////////////////
        driver.findElement(dateOfBirthDays).click();
        driver.findElement(dateOfBirthMonth).click();
        driver.findElement(dateOfBirthYear).click();
        Days.selectByValue(day);
        Months.selectByValue(month);
        Years.selectByValue(year);
        driver.findElement(newsletterCheckBox).click();
        driver.findElement(specialOffersCheckBox).click();
    }

    public void enterAddressCredentials(String firstNameAdd, String lastNameAdd,
                                        String companyName,String companyLocation, String companyLocation2,
                                        String companyCity,String companyState,String zipCodeOf,String companyCountry, String aditionalInfo, String nrHomePhone,
                                        String nrMobilePhone,String aliasOfAddress){
        driver.findElement(addressFirstNameTextBox).sendKeys(firstNameAdd);
        driver.findElement(addressLastNameTextBox).sendKeys(lastNameAdd);
        driver.findElement(theCompanysName).sendKeys(companyName);
        driver.findElement(addressCompany).sendKeys(companyLocation);
        driver.findElement(addressCompanyLine2).sendKeys(companyLocation2);
        driver.findElement(addressCompanyCity).sendKeys(companyCity);

        ////////////////// Dropdown menu for selecting a state and a country
        Select CompanyState = new Select(driver.findElement(addressCompanyState));
        CompanyState.selectByVisibleText(companyState);
        driver.findElement(zipCode).sendKeys(zipCodeOf);
        Select CompanyCountry = new Select(driver.findElement(addressCompanyCountry));
        CompanyCountry.selectByVisibleText(companyCountry);
        //////////////////

        driver.findElement(additionalInformation).sendKeys(aditionalInfo);
        driver.findElement(homePhone).sendKeys(nrHomePhone);
        driver.findElement(mobilePhone).sendKeys(nrMobilePhone);
        driver.findElement(alisAddress).sendKeys(aliasOfAddress);
        driver.findElement(registerButton).click();




    }





}
