package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.ReusableMethods;

import java.io.IOException;

public class ReusableStepdefs {
    @Then("capture the screenshot")
    public void captureTheScreenshot() throws IOException {
        ReusableMethods.getScreenshot("capturing_screenshot");
    }
}
