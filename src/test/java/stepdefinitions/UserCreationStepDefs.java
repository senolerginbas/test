package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.CommonPageElements;
import pages.UserManagementPage;
import utilities.Driver;

public class UserCreationStepDefs {
    CommonPageElements commonpage = new CommonPageElements();
    UserManagementPage userManagementPage = new UserManagementPage();

    @Given("admin clicks user management")
    public void admin_clicks_user_management() {
        Driver.waitAndClick(commonpage.administrationDropdown);
        Driver.waitAndClick(commonpage.userManagementButton);

    }
    @Given("admin clicks the button to create a user")
    public void admin_clicks_the_button_to_create_a_user() {
Driver.waitAndClick(userManagementPage.createNewUserButton);
    }
    @Given("admin enters {string} for login")
    public void admin_enters_for_login(String string) {
        Driver.waitAndSendText(userManagementPage.loginId,string);
    }
    @Given("admin enters {string} for firstname and {string} for lastname")
    public void admin_enters_for_firstname_and_for_lastname(String string, String string2) {
Driver.waitAndSendText(userManagementPage.firstName,string);
        Driver.waitAndSendText(userManagementPage.lastName,string);

    }
    @Given("admin enters {string} as email address")
    public void admin_enters_as_email_address(String string) {
Driver.waitAndSendText(userManagementPage.email,string);

    }

    @Given("admin selects the language")
    public void admin_selects_the_language() {
Driver.selectByIndex(userManagementPage.language,1);
    }
    @Given("admin selects the profile")
    public void admin_selects_the_profile() {
        Driver.selectByIndex(userManagementPage.profiles,2);
    }

    @Given("user clicks Save button")
    public void user_clicks_save_button() {
        Driver.waitAndClick(userManagementPage.saveButton);
    }
       // @Given("verify creating user")
       // public void verify_creating_user() {
         //   Driver.wait(1);
        //    Assert.assertTrue(userManagementPage.createdSuccessText.isDisplayed());

   // }














}
