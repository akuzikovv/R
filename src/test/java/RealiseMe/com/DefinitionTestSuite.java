package RealiseMe.com;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/LoginPage.feature",
        "src/test/resources/features/AuthorizationPage.feature",
        "src/test/resources/features/TeacherOtherHome.feature",
        "src/test/resources/features/TeacherSupplyHome.feature"
})
public class DefinitionTestSuite {}
