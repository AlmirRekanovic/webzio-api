package webzio.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.webzio.api.request.ApiRequests;
import org.webzio.model.ThreadResponse;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ApiStepDefinitions {

    private ThreadResponse threadResponse;

    ThreadResponse.ThreadData postData1 = ThreadResponse.ThreadData.builder()
            .uuid("postUuid1")
            .url("https://example.com/post1")
            .site_full("example.com")
            .site("example")
            .site_section("https://example.com/section1")
            .site_categories(Arrays.asList("category1", "category2"))
            .section_title("Section 1")
            .title("Post Title 1")
            .title_full("Full Post Title 1")
            .published("2022-01-25T12:00:00.000Z")
            .replies_count(5)
            .participants_count(3)
            .site_type("forum")
            .country("US")
            .main_image("https://example.com/images/image1.jpg")
            .performance_score(80)
            .domain_rank(123)
            .domain_rank_updated("2022-01-25T12:00:00.000Z")
            .reach("local")
            .build();

    ThreadResponse.ThreadData postData2 = ThreadResponse.ThreadData.builder()
            .uuid("postUuid2")
            .url("https://example.com/post2")
            .site_full("example.com")
            .site("example")
            .site_section("https://example.com/section2")
            .site_categories(Arrays.asList("category3", "category4"))
            .section_title("Section 2")
            .title("Post Title 2")
            .title_full("Full Post Title 2")
            .published("2022-01-25T13:00:00.000Z")
            .replies_count(8)
            .participants_count(4)
            .site_type("blog")
            .country("UK")
            .main_image("https://example.com/images/image3.jpg")
            .performance_score(90)
            .domain_rank(456)
            .domain_rank_updated("2022-01-25T13:00:00.000Z")
            .reach("global")
            .build();

    // Create threadData with posts using ArrayList
    ThreadResponse threadData = ThreadResponse.builder()
            .totalResults(10)
            .moreResultsAvailable(true)
            .next("/filterWebContent?token=123&format=json")
            .requestsLeft(1000)
            .warnings(Arrays.asList("warning1", "warning2"))  // Using Arrays.asList instead of List.of
            .posts(new ArrayList<>(Arrays.asList(postData1, postData2)))  // Using ArrayList
            .build();

    @When("I make a GET request to filter web content with query {string}")
    public void iMakeAGetRequestToFilterWebContent(String query) {
        threadResponse = ApiRequests.getFilterWebContentResponse(query);
    }

    @Then("the total results should be {int}")
    public void theTotalResultsShouldBe(int expectedTotalResults) {
        assertEquals(expectedTotalResults, threadResponse.getTotalResults());
    }

    @Then("POST request")
    public void postRequest() {

        Response postResponse = ApiRequests.postNewsThread(threadData);

        assertEquals(200, postResponse.getStatusCode());
    }

}
