package instastepdef;

import InstagramClient.InstaClient;
import com.Instagramjavastubs.grpc.Instagram.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class instaSteps {
    static InstaClient instaClient;
    signupResponse signupResponse;
    String resultmsg ;

    @Given("I have an Instagram client")
    public void iHaveAnInstagramClient() {
        instaClient = new InstaClient();
    }

    @When("create account with firstname as {string} and secondname as {string} and middlename as {string} email as {string} and phoneno as {string} and dob as {string} and country as {string} and mothername as {string}")
    public void instasignuprequest(String firstname, String secondname, String middlename,String email, String phno, String dob, String country,String mothername) {
        int phoneNumber = Integer.parseInt(phno); // Convert phno to int
        signupResponse = instaClient.instarequest(firstname, secondname,middlename, email, phoneNumber, dob, country,mothername);
        resultmsg = signupResponse.getResult().getResultmsg();

    }

    @Then("validate the user created or not")
    public void validating()
    {
        assertEquals("validation failed with the given result msg came wrong----> " ,"Success: User created in India",resultmsg);

    }


}
