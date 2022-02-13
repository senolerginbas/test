package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
public class UserManagementPage {
    public UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Create a new user']")
    public WebElement createNewUserButton;
    @FindBy(id = "login")
    public WebElement loginId;
    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "langKey")
    public WebElement language;
    @FindBy(id = "authorities")
    public WebElement profiles;
    @FindBy(xpath = "//*[text()='Back']")
    public WebElement backButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

   // @FindBy(xpath = "//*[text()='']")
   // public WebElement createdSuccessText;
   //         =
}