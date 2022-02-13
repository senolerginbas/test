package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",// this is used for more readable reports or outputs

                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failedRerun.txt"
        },
        features = "./src/test/resources/features",
        glue = {"stepdefinitions","Hooks"},//run stepdefinitions and hooks folder
        tags = "@scenario_outline_search",
        dryRun = false

)
public class Runner {
}
/*Runner is used to run the feature files(Test Cases)
 *@RunWith   : This makes the class runnable.
 *@CucumberOptions :
 * -add path of features folder and step definitions folder,
 * -tags
 * -dryRun
 * -Report plugins
 * -failedRunner plugin
 * ----------------
 * What is the role of ?
 * -features : path of features folder.
 * -glue     : path of step definitions folder
 * -tags     : to run individual or multiple features or scenarios
 * For example, if i pass same tag to multiple feature, then all features with that tag will run
 *-dryRun: to check if there is any missing step definition(Java code)
 *         : dryRun can be true or false
 *          dryRun =false  default behaviour .It runs the test on the browser while checking thje missing steps
 *          dryRun = true do not run tests on the browser and check if there is any missing definition.
 * */