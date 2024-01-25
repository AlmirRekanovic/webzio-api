package org.webzio.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponse {
    private int statusCode;
    private String responseBody;
}