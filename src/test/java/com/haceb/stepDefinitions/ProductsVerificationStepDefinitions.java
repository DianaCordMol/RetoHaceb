package com.haceb.stepDefinitions;

import com.haceb.interactions.Refresh;
import com.haceb.task.SelectProductIndex;
import com.haceb.task.ValidateLogo;
import com.haceb.task.ValidateMatchName;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class ProductsVerificationStepDefinitions {

    @When("^I am in the home of the Haceb page and refresh it$")
    public void iAmInTheHomeOfTheHacebPageAndRefreshIt() {
        OnStage.theActorInTheSpotlight().attemptsTo(Refresh.on());
    }

    @When("^I validate the logo$")
    public void iValidateTheLogo() {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidateLogo.on());
    }

    @When("^I choose to enter the element at position (\\d+) and save his name$")
    public void iChooseToEnterTheElementAtPositionAndSaveHisName(int arg1) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProductIndex.on());
    }

    @Then("^I verify that it has the same name$")
    public void iVerifyThatItHasTheSameName() {
        OnStage.theActorInTheSpotlight().attemptsTo(ValidateMatchName.on());
    }
}
