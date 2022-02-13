package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "ssn")
    public WebElement ssnTextbox;

    @FindBy(id = "firstname")
    public WebElement firstnameTextbox;

    @FindBy(id = "lastname")
    public WebElement lastnameTextbox;

    @FindBy(id = "address")
    public WebElement addressTextbox;

    @FindBy(id = "mobilephone")
    public WebElement mobilephoneTextbox;

    @FindBy(id = "username")
    public WebElement usernameTextbox;

    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextbox;

    @FindBy(id = "secondPassword")
    public WebElement newPasswordTextbox;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//*[text()='Registration saved!']")
    public WebElement successMessageToastContainer;

}