package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPageElements;
import pages.MoneyTransferPage;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class MoneyTransferStepDefs {

    CommonPageElements commonPageElements=new CommonPageElements();
    MoneyTransferPage moneyTransferPage=new MoneyTransferPage();

    @Given("user clicks on my operations")
    public void user_clicks_on_my_operations() {

        //commonPageElements.myOperations.click();
        // clicking using custom wait
        Driver.waitAndClick(commonPageElements.myOperations);
    }

    @Given("user clicks on transfer money")
    public void user_clicks_on_transfer_money() {
commonPageElements.moneyTransferOption.click();
    }
    @When("user select the current account to transfer money from")

    public void user_select_the_current_account_to_transfer_money_from() {

Driver.selectByIndex(moneyTransferPage.transferFrom,1);

       // Select select=new Select(moneyTransferPage.transferFrom);
      //  select.selectByIndex(1);


    }
    @When("user select the other account to transfer money to")
    public void user_select_the_other_account_to_transfer_money_to() {
        Driver.selectByIndex(moneyTransferPage.transferTo,1);
       // Select select=new Select(moneyTransferPage.transferTo);
       // select.selectByIndex(1);



    }
    @When("user provides the balance {string}")
    public void user_provides_the_balance(String string) {
//moneyTransferPage.balance.sendKeys();

Driver.waitAndSendText(moneyTransferPage.balance,string);
    }

    @When("user provides the balancecent {string}")
    public void user_provides_the_balancecent(String string) {

        moneyTransferPage.balancecent.sendKeys("1");
    }
    @When("user types the description")
    public void user_types_the_description() {
moneyTransferPage.description.sendKeys("hello");
    }
    @Then("user makes the money transfer and verify success message")
    public void user_makes_the_money_transfer_and_verify_success_message() throws IOException {
Driver.waitAndClick(moneyTransferPage.makeTransferButton);
Driver.wait(2);

        Assert.assertTrue(moneyTransferPage.successMessageToastContainer.isDisplayed());
        System.out.println(moneyTransferPage.successMessageToastContainer.getText());
        Driver.wait(2);
        File successImage =moneyTransferPage.successMessageToastContainer.getScreenshotAs(OutputType.FILE);
        File path=new File("successMessage.png");
        FileUtils.copyFile(successImage,path);
    }
}
