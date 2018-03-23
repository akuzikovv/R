package RealiseMe.com;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/LoginPage.feature" +
        "src/test/resources/features/AuthorizationPage.feature"+
        "TeacherOtherHome.feature"+
        "TeacherSupplyHome.feature"
)
public class DefinitionTestSuite {}
