package com.airlinesproject.demo.steps;

import com.airlinesproject.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AirlineSteps {

    @Given("^I am on the ticket booking website$")
    public void iAmOnTheTicketBookingWebsite() {

    }

    @When("^I search for flights from Abu Dhabi$")
    public void iSearchForFlightsFromAbuDhabi() {
        new HomePage().sendTextToFromField();
    }

    @And("^I search for flights to Accra$")
    public void iSearchForFlightsToAccra() {
        new HomePage().sendTextToToField();
    }

    @Then("^I click on show flights$")
    public void iClickOnShowFlights() {
        new HomePage().showFlights();
    }

    @And("^I select the Business class$")
    public void iSelectTheBusinessClass() {
        new HomePage().selectClass();

    }
    @And("^I select the passenger Adult (\\d+)$")
    public void iSelectThePassengerAdult(int arg0) {
        new HomePage().addPassenger();
    }

    @Then("^I verify the availability of flights$")
    public void iVerifyTheAvailabilityOfFlights() {
    // The website flight webpage containing Captcha
    // Due to limitation of selenium we can not automate Captcha
    }


    @When("^I mouse hoover on support$")
    public void iMouseHooverOnSupport() {
        new HomePage().mouseHooverOnSupport();
    }

    @And("^I mouse hoover and click on customer support$")
    public void iMouseHooverAndClickOnCustomerSupport() {
        new HomePage().mouseHooverAndClickCustomerSupport();
    }

    @Then("^I navigate that page and verify the contacts us text$")
    public void iNavigateThatPageAndVerifyTheContactsUsText() {
        Assert.assertEquals(new HomePage().verifyContactUsText(),"CONTACT US");
    }
}
