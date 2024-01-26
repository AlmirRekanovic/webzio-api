package webzio.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import org.webzio.api.request.ApiRequests;
import org.webzio.model.ThreadResponse;

import static org.junit.Assert.assertEquals;

public class ApiStepDefinitions {

    private ThreadResponse threadResponse;

    @When("I make a GET request to filter web content with query {string}")
    public void iMakeAGetRequestToFilterWebContent(String query) {
        threadResponse = ApiRequests.getFilterWebContentResponse(query);
        String nest = threadResponse.getPosts().toString();
        System.out.println(nest);
//        assertEquals(expectedStatusCode, response.getStatusCode());
//        Assert.assertEquals("200",String.valueOf(response.getStatusCode()),"Call failed!");
    }

    @Then("the total results should be {int}")
    public void theTotalResultsShouldBe(int expectedTotalResults) {
//        assertEquals(expectedTotalResults, threadResponse.getPosts().getFirst();
    }
}
