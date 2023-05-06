package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;

@Test
public class Steps {

    @Given("^the user is on login page$")
    public void the_user_is_on_login_page() throws Throwable {
     System.out.println("The user is on login page");
    }

    @When("^the user enters valid credentials$")
    public void the_user_enters_valid_credentials() throws Throwable {

        System.out.println("Entered username and password");

    }

    @When("^hits submit$")
    public void hits_submit() throws Throwable {

        System.out.println("Clicked on submit");

    }

    @Then("^the user should be logged in successfully$")
    public void the_user_should_be_logged_in_successfully() throws Throwable {

        System.out.println("Yeah I am logged");

    }


}
