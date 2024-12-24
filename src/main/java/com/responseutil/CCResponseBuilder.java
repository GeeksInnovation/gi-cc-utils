package com.responseutil;

public class CCResponseBuilder {
    
    public <T> ClipclashResponse<T> buildSuccessResponse(T data) {
        return new ClipclashResponse<>(true, null, data);
    }

    public <T> ClipclashResponse<T> buildFailureResponse(String message) {
        return new ClipclashResponse<>(false, message, null);
    }
}
