package com.javaguides.app.common;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class HttpResponse {
    private HttpStatus status;
    private Object data;

    public HttpResponse(HttpStatus status, Object data) {
        this.status = status;
        this.data = data;
    }
}
