package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class MoneyTransferPage {
    public MoneyTransferPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@name='fromAccountId']")
    public WebElement transferFrom;
    @FindBy(id = "toAccountId")
    public WebElement transferTo;
    @FindBy(id = "balance")
    public WebElement balance;
    @FindBy(id = "balancecent")
    public WebElement balancecent;
    @FindBy(id="description")
    public WebElement description;
    @FindBy(id = "make-transfer")
    public WebElement makeTransferButton;
    @FindBy(xpath = "//*[text()='Transfer is succesfull']")
    public WebElement successMessageToastContainer;

}