package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPageElements;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
CommonPageElements commonPageElements=new CommonPageElements();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
    }

    @Given("user clicks on login dropdown")
    public void user_clicks_on_login_dropdown() {
//        Create pages, locate the elements
        loginPage.loginDropdown.click();
    }

    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.signInButton.click();
    }

    @Given("user sends username {string}")
    public void user_sends_username(String string) {
        loginPage.username.sendKeys(string);
    }

    @Given("user sends password {string}")
    public void user_sends_password(String string) {
        loginPage.password.sendKeys(string);
    }

    @Given("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.loginButton.click();
    }

    @Given("user enters admin_id and admin_password")
    public void user_enters_admin_id_and_admin_password(DataTable credentials) {
//        1. We can get data as List<String>
     //  List<String> adminCredentials = credentials.row(1);//returns row 1 data as List
    //    System.out.println(adminCredentials);//[CWoburn,Cw192837?]
    //    System.out.println(adminCredentials.get(0));//CWoburn
      //  System.out.println(adminCredentials.get(1));//Cw192837?
       // 2. We can get data as List<Map<String,String>>
        List<Map<String,String>> adminCredentials = credentials.asMaps(String.class,String.class);
        System.out.println(adminCredentials);

        for (Map<String,String> eachCredentials : adminCredentials){
            System.out.println(eachCredentials.get("admin_username"));
            System.out.println(eachCredentials.get("admin_password"));
            loginPage.username.sendKeys(eachCredentials.get("admin_username"));
            loginPage.password.sendKeys(eachCredentials.get("admin_password"));


        }

        }
        @Then("verify the login is successful")
        public void verify_the_login_is_successful() {
            Driver.wait(1);
            Assert.assertTrue(commonPageElements.myOperations.isDisplayed());
    }
    }
