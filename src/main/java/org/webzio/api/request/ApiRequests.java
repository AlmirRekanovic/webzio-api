package org.webzio.api.request;

import io.restassured.response.Response;
import org.webzio.api.endpoints.ApiEndpoints;
import org.webzio.config.AppConfig;
import org.webzio.model.ThreadResponse;
import org.webzio.utils.RestUtils;

public class ApiRequests {

    public static ThreadResponse getFilterWebContentResponse(String query) {
        String url = AppConfig.BASE_URL + ApiEndpoints.FILTER_WEB_CONTENT.getEndpoint();

        Response response = RestUtils.getRequestWithToken(url, query);
        System.out.println(response.body().toString());
        return response.as(ThreadResponse.class);
    }
    public static Response postNewsThread(ThreadResponse threadResponse) {
        return RestUtils.postRequest(ApiEndpoints.FILTER_WEB_CONTENT.getEndpoint(), threadResponse);
    }
}