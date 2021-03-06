package com.nawin.androidmvparchitecture.data.model.api;

/**
 * Created by brainovation on 6/13/17.
 */

public class LoginRequest {

    private String userName;
    private String password;
    private String deviceToken;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
