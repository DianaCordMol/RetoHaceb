package com.haceb.stepDefinitions;

import com.haceb.driver.SeleniumWebDriver;
import com.haceb.task.SelectProductRandom;
import com.haceb.task.ValidateCart;
import com.haceb.task.ValidateHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ElementsValidationStepDefinitions {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I am on the page of (.*)$")
    public void iAmOnThePageOfHttpsWwwHacebCom(String url) {

        OnStage.theActorCalled("Diana")
                .can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));
    }

    @When("^I am in the home of the Haceb page and I choose to enter a random element$")
    public void iAmInTheHomeOfTheHacebPageAndIChooseToEnterARandomElement() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProductRandom.on());
    }

    @Then("^I validate the cart interface and home page$")
    public void iValidateTheCartInterfaceAndHomePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidateCart.on(),
                ValidateHome.on()
        );
    }
}
