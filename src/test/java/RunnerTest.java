import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:reports/cucumber.json"
        ,"html:reports/cucumber-report"
        ,"junit:reports/cucumber.xml"},
        features = {"src/test/featureFiles"},
        glue = {"instastepdef"},
        tags = "@instafeature and not @ignore and not @PCRF")

public class RunnerTest {
}
