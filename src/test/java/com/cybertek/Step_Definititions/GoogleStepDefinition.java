package com.cybertek.Step_Definititions;

import com.cybertek.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinition {

    @When("User is on the search page")
    public void user_is_on_the_search_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.google.com");
    }


    @Then("User should be able to see the title is \"Google")
    public void user_should_be_able_to_see_the_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertTrue("actual condition does not match expected",actualTitle.equals(expectedTitle));
    }



}
