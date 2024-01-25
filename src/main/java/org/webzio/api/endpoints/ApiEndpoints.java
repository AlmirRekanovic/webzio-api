package org.webzio.api.endpoints;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApiEndpoints {
    FILTER_WEB_CONTENT("/filterWebContent");

    private final String endpoint;
}