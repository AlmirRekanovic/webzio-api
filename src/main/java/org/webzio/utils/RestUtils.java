package org.webzio.utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import lombok.experimental.UtilityClass;
import org.webzio.config.AppConfig;

import static io.restassured.RestAssured.given;

@UtilityClass
public class RestUtils {
    String baseUrl = AppConfig.BASE_URL;
    String token = AppConfig.API_TOKEN;

    public static Response getRequestWithToken(String url, String query) {
        String uri = String.format("%s?%s&token=%s", url, query, token);

        return given()
                .when()
                .get(uri)
                .then()
                .extract()
                .response();
    }

    public static Response postRequest(String endpoint, Object requestBody) {
        String uri = baseUrl + endpoint;
        return given()
                .baseUri(baseUrl)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(uri);
    }
}