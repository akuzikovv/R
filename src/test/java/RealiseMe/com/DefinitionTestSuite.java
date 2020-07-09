package RealiseMe.com;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"" +
        "src/test/resources/features/Booking flow/Booking_flow_for_CLEARED_teacher.feature",
        "src/test/resources/features/Booking flow/Booking_flow_for_PENDING_teacher.feature",
        "src/test/resources/features/Booking flow/Booking_flow_for_UNCLEARED_teacher.feature",
        "src/test/resources/features/Teacher/Teacher Other/Teacher_Other_Flow.feature",
        "src/test/resources/features/Booking flow/Booking_flow_for_agency.feature",
        "src/test/resources/features/Timesheet flow/Timesheet_flow_for_active_booking.feature",
        "src/test/resources/features/Timesheet flow/Timesheet_flow_for_completed_booking.feature",
        "src/test/resources/features/Job flow/A_Job_Creation.feature",
        "src/test/resources/features/Job flow/B_Job_Search.feature",
        "src/test/resources/features/Job flow/C_Job_Save.feature",
        "src/test/resources/features/Job flow/D_Job_Apply.feature",
        "src/test/resources/features/Job flow/F_Job_Applicants.feature",
        "src/test/resources/features/Job flow/G_Job_Withdraw.feature",
        "src/test/resources/features/Job flow/H_Job_Edit.feature",
        "src/test/resources/features/Teacher/Teacher Profile/Teacher_Profile_creation.feature",
        "src/test/resources/features/School/School Profile/School_Profile_creation.feature",
        "src/test/resources/features/Agency/Agency Profile/Agency_Profile_creation.feature",


//        "src/test/resources/features/Unauthorised user flow/LandingPage.feature",
//        "src/test/resources/features/LoginPage.feature",
//        "src/test/resources/features/AuthorizationPage.feature",
//        "src/test/resources/features/Teacher (general) flow/TeacherSupplyHome.feature",
//        "src/test/resources/features/Teacher (general) flow/TeacherOtherFlow.feature",
//        "src/test/resources/features/School flow/School.feature",

})
public class DefinitionTestSuite {}