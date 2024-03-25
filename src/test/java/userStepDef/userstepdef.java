package userStepDef;

import loginClient.Grpcclient;
//impoting client service
import com.loginsjavastubs.grpc.*;
//import server service

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class userstepdef {

    Grpcclient grpcclient ;
    User.APIResponse apiResponse ;
    String responsemsg;
    int responsecode ;


    @Given("i have a login client")
    public void i_have_a_login_client() {
        // Write code here that turns the phrase above into concrete actions
        grpcclient  = new Grpcclient();
    }
    @When("give crendetials for the user as username as {string} and password as {string}")
    public void give_crendetials_for_the_user_as_username_as_and_password_as(String username , String password) {
        // Write code here that turns the phrase above into concrete actions
        apiResponse = grpcclient.userdetails(username,password);
        responsemsg = apiResponse.getResponsemessage();
        responsecode = apiResponse.getResponsecode();



    }
    @Then("validate user created or not")
    public void validate_user_created_or_not() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("user creation failed with user name and password not same ---> " ,"SUCESS",responsemsg);


    }
}
