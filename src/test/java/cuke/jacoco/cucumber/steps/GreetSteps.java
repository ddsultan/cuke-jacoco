package cuke.jacoco.cucumber.steps;

import cuke.jacoco.Greeting;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetSteps {
    private String greeting;
    
    @When("start the application")
    public void startTheApplication() {
        this.greeting = new Greeting().getGreeting();
    }

    @Then("it should greet with {string}")
    public void itShouldGreetWith(String greeting) {
        assertEquals(this.greeting, greeting);
    }
}