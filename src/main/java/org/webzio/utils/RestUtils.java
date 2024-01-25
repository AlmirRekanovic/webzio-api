package org.webzio.utils;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;
import org.webzio.config.AppConfig;

import static io.restassured.RestAssured.given;

@UtilityClass
public class RestUtils {

    public static Response getRequestWithToken(String url, String query) {
        return given()
                .baseUri(url)
                .header("Authorization", "Bearer " + AppConfig.API_TOKEN)
                .param("q", query)
                .param("format", "json")
                .param("sort", "crawled")
                .param("ts", System.currentTimeMillis())
                .param("highlight", true)
                .when()
                .get()
                .then()
                .extract()
                .response();
    }
}