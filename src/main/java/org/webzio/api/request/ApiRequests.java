package org.webzio.api.request;

import io.restassured.response.Response;
import webzio.api.endpoints.ApiEndpoints;
import webzio.config.AppConfig;
import webzio.model.ThreadResponse;
import webzio.utils.RestUtils;

public class ApiRequests {

    public static ThreadResponse getFilterWebContentResponse(String query) {
        String url = AppConfig.BASE_URL + ApiEndpoints.FILTER_WEB_CONTENT.getEndpoint();

        Response response = RestUtils.getRequestWithToken(url, query);

        return response.as(ThreadResponse.class);
    }
}