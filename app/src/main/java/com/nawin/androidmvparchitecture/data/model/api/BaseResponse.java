package com.nawin.androidmvparchitecture.data.model.api;

/**
 * Created by brainovation on 6/14/17.
 */

public class BaseResponse<T> {

//    private int status;
//    private String statusMessage;
    private T items;

//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public String getStatusMessage() {
//        return statusMessage;
//    }
//
//    public void setStatusMessage(String statusMessage) {
//        this.statusMessage = statusMessage;
//    }

    public T getResponse() {
        return items;
    }

    public void setResponse(T response) {
        this.items = response;
    }
}
