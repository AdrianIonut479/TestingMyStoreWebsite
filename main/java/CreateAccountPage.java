package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateAccountPage extends BasePageMadalina {
    @FindBy(id = "email_create")
    private WebElement emailAddress;
    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;
    @FindBy(id="create_account_error")
    private WebElement invalidEmail;
    @FindBy(id="uniform-id_gender1")
    private WebElement mrRadioButton;
    @FindBy(id="uniform-id_gender2")
    private WebElement mrsRadioButton;
    @FindBy(id="customer_firstname")
    private WebElement firstName;
    @FindBy(id="customer_lastname")
    private WebElement lastName;
    @FindBy(id="email")
    private WebElement email;
    @FindBy(id="passwd")
    private WebElement password;
    @FindBy(id="days")
    private WebElement dropdown1;
    @FindBy(id="months")
    private WebElement dropdown2;
    @FindBy(id="years")
    private WebElement dropdown3;
    @FindBy(id="uniform-newsletter")
    private WebElement checkbox1;
    @FindBy(id="uniform-optin")
    private WebElement checkbox2;
    @FindBy(id="firstname")
    private WebElement firstNameForAddress;
    @FindBy(id="lastname")
    private WebElement lastNameForAddress;
    @FindBy(id="company")
    private WebElement company;
    @FindBy(id="address1")
    private WebElement Address1;
    @FindBy(id="address2")
    private WebElement Address2;
    @FindBy(id="city")
    private WebElement city;
    @FindBy(id="id_state")
    private WebElement state;
    @FindBy(id="postcode")
    private WebElement postcode;
    @FindBy(id="id_country")
    private WebElement country;
    @FindBy(id="other")
    private WebElement additionalInformation;
    @FindBy(id="phone_mobile")
    private WebElement mobilePhone;
    @FindBy(id="phone")
    private WebElement homePhone;
    @FindBy(id="alias")
    private WebElement addressAlias;
    @FindBy(id="submitAccount")
    private WebElement registerButton;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div")
    private WebElement errors;




    public CreateAccountPage(WebDriver webDriver) {
        super(webDriver);

        PageFactory.initElements(getWebDriver(),this);
    }

    public CreateAccountPage authentication(){
        goToLandingPage();
        HomePage homePage= new HomePage(getWebDriver());
        return homePage.clickSignInButton();
    }

    public CreateAccountPage insertEmailAddress(String getEmailAddress) {

        CreateAccountPage createAccountPage = authentication();
        createAccountPage.insertEmail(getEmailAddress);
        createAccountPage.clickCreateAnAccountButton();
        return new CreateAccountPage(getWebDriver());
    }
    public CreateAccountPage clickRadioButton(){
        CreateAccountPage createAccountPage = authentication();
        createAccountPage.getMrsRadioButton().click();
        //  createAccountPage.getMrRadioButton().click();
        return new  CreateAccountPage(getWebDriver());
    }

    public CreateAccountPage insertPersonalData(CreateAccountPage createAccountPage, String getFirstName, String getLastName, String getEmail, String getPassword, String getFirstNameForAddress,String getLastNameForAddress,String getCompany,String getAddress1, String getAddress2,String getCity,String getPostcode, String getAdditionalInformation, String getHomePhone,String getMobilePhone){
        createAccountPage.getFirstName().sendKeys(getFirstName);
        createAccountPage.getLastName().sendKeys(getLastName);
        createAccountPage.getEmail().click();
        createAccountPage.getPassword().sendKeys(getPassword);
        createAccountPage.getFirstNameForAddress().clear();
        createAccountPage.getFirstNameForAddress().sendKeys(getFirstNameForAddress);
        createAccountPage.getLastNameForAddress().clear();
        createAccountPage.getLastNameForAddress().sendKeys(getLastNameForAddress);
        createAccountPage.getCompany().sendKeys(getCompany);
        createAccountPage.getAddress1().sendKeys(getCompany);
        createAccountPage.getAddress2().sendKeys(getAddress2);
        createAccountPage.getCity().sendKeys(getCity);
        createAccountPage.getPostcode().sendKeys(getPostcode);
        createAccountPage.getAdditionalInformation().sendKeys(getAdditionalInformation);
        createAccountPage.getHomePhone().sendKeys(getHomePhone);
        createAccountPage.getMobilePhone().sendKeys(getMobilePhone);
        return createAccountPage;
    }

    public CreateAccountPage selectMethod(CreateAccountPage createAccountPage, String getDropDown1, String getDropDown2, String getDropDown3,String getState,String getCountry){
        Select select1= new Select(createAccountPage.getDropdown1());
        select1.selectByValue(getDropDown1);
        Select select2= new Select(createAccountPage.getDropdown2());
        select2.selectByValue(getDropDown2);;
        Select select3= new Select(createAccountPage.getDropdown3());
        select3.selectByValue(getDropDown3);
        Select select4= new Select(createAccountPage.getState());
        select4.selectByValue(getState);
        Select select5= new Select(createAccountPage.getCountry());
        select5.selectByValue(getCountry);
        return  new  CreateAccountPage(getWebDriver());
    }


    public String insertEmail(String email){
       new WebDriverWait(getWebDriver(),3).until(ExpectedConditions.elementToBeClickable(getEmailAddress()));
        getEmailAddress().sendKeys(email);
        return getEmailAddress().getText();
   }


    public CreateAccountPage clickCreateAnAccountButton(){
        getCreateAnAccount().click();
        return new CreateAccountPage(getWebDriver());
    }
    public CreateAccountPage clickRegisterButton(){
        getRegisterButton().click();
        return new CreateAccountPage(getWebDriver());
    }
    public CreateAccountPage clickMethod(CreateAccountPage createAccountPage){
        createAccountPage.getCheckbox1().click();
        createAccountPage.getCheckbox2().click();
        createAccountPage.getAddressAlias().click();
        return new CreateAccountPage(getWebDriver());
    }

    public WebElement getEmailAddress() {return emailAddress;}
    public WebElement getCreateAnAccount() {return createAnAccountButton;}
    public WebElement getInvalidEmail() {return invalidEmail;}
    public WebElement getMrRadioButton() {return mrRadioButton;}
    public WebElement getMrsRadioButton() {return mrsRadioButton;}
    public WebElement getFirstName() {return firstName;}
    public WebElement getLastName() {return lastName;}
    public WebElement getEmail() {return email;}
    public WebElement getPassword() {return password;}
    public WebElement getDropdown1() {return dropdown1;}
    public WebElement getDropdown2() {return dropdown2;}
    public WebElement getDropdown3() {return dropdown3;}
    public WebElement getCheckbox1() {return checkbox1;}
    public WebElement getCheckbox2() {return checkbox2;}
    public WebElement getFirstNameForAddress() {return firstNameForAddress;}
    public WebElement getLastNameForAddress() {return lastNameForAddress;}
    public WebElement getCompany() {return company;}
    public WebElement getAddress1() {return Address1;}
    public WebElement getAddress2() {return Address2;}
    public WebElement getCity() {return city;}
    public WebElement getState() {return state;}
    public WebElement getPostcode() {return postcode;}
    public WebElement getCountry() {return country;}
    public WebElement getAdditionalInformation() {return additionalInformation;}
    public WebElement getMobilePhone() {return mobilePhone;}
    public WebElement getHomePhone() {return homePhone;}
    public WebElement getAddressAlias() {return addressAlias;}
    public WebElement getRegisterButton() {return registerButton;}
    public WebElement getErrors() {return errors;}


}
