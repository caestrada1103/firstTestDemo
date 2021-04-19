package co.com.choucair.certification.utestautomation.stepdefinitions;

import co.com.choucair.certification.utestautomation.model.uTestData;
import co.com.choucair.certification.utestautomation.questions.AnswerConfirm;
import co.com.choucair.certification.utestautomation.tasks.OpenUp;
import co.com.choucair.certification.utestautomation.tasks.StartRegister;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestRegisterStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^as Carlos want to create an account at uTest page$")
    public void asCarlosWantToCreateAnAccountAtUTestPage() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.theuTestPage());
    }

    @When("^complete register form$")
    public void completeRegisterForm(List<uTestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(StartRegister.onuTestPage(utestData));
    }

    @Then("^verify the new account$")
    public void verifyTheNewAccount(List<uTestData> utestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerConfirm.toThe(utestData)));
    }
}
