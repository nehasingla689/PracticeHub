package definition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepDefinition {

    @Given("^a user is on facebook login page$")
    public void a_user_is_on_facebook_login_page() throws Throwable {

       System.out.println("inside given method");
        Assert.assertEquals(true,true);
        System.out.println("inside  when method");

    }

    @When("^i enter valid details$")
    public void i_enter_valid_details() throws Throwable {
        System.out.println("inside  when method");
        Assert.assertEquals(true,true);
        System.out.println("inside  when method");
    }

    @Then("^i should see the home page$")
    public void i_should_see_the_home_page() throws Throwable {
        System.out.println("inside then method");
        Assert.assertEquals(true,true);
        Assert.assertEquals(false,true);
    }


    }


