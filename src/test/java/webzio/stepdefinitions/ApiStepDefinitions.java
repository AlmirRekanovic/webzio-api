package webzio.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webzio.api.request.ApiRequests;
import webzio.model.ThreadResponse;

import static org.junit.Assert.assertEquals;

public class ApiStepDefinitions {

    private ThreadResponse threadResponse;

    @When("^I make a GET request to filter web content with query \"([^\"]*)\"$")
    public void iMakeAGetRequestToFilterWebContent(String query) {
        threadResponse = ApiRequests.getFilterWebContentResponse("01a2ca30-a4d7-47cc-beaa-b9f321cae01e");
    }

    @Then("^the total results should be (\\d+)$")
    public void theTotalResultsShouldBe(int expectedTotalResults) {
        assertEquals(expectedTotalResults, threadResponse.getTotalResults());
    }

    // Add more step definitions as needed
}
