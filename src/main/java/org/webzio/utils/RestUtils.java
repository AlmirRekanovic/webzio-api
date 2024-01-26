package org.webzio.utils;

import io.restassured.response.Response;
import lombok.experimental.UtilityClass;
import org.webzio.config.AppConfig;

import static io.restassured.RestAssured.given;

@UtilityClass
public class RestUtils {
    String baseUrl = AppConfig.BASE_URL;
    String token = AppConfig.API_TOKEN;

    public static Response getRequestWithToken(String url, String query) {
        String url1 = String.format("%s?%s&token=%s", url, query, token);

        return given()
                .when()
                .get(url1)
                .then()
                .extract()
                .response();
    }
}