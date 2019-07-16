package RealiseMe.com;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"" +
        "src/test/resources/features/School flow/Bookings_School.feature",
//        "src/test/resources/features/Unauthorised user flow/LandingPage.feature",
//        "src/test/resources/features/LoginPage.feature",
//        "src/test/resources/features/AuthorizationPage.feature",
//        "src/test/resources/features/Teacher (general) flow/TeacherSupplyHome.feature",
//        "src/test/resources/features/Teacher (general) flow/TeacherOtherFlow.feature",
//        "src/test/resources/features/School flow/School.feature",

})
public class DefinitionTestSuite {}