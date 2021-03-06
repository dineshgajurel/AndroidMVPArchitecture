package com.nawin.androidmvparchitecture.auth.login;

import android.content.Context;

import com.nawin.androidmvparchitecture.R;
import com.nawin.androidmvparchitecture.data.Data;
import com.nawin.androidmvparchitecture.data.model.UserInfo;
import com.nawin.androidmvparchitecture.data.model.api.BaseResponse;
import com.nawin.androidmvparchitecture.data.model.api.LoginRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.nawin.androidmvparchitecture.utils.Commons.cancel;

/**
 * Created by brainovation on 6/13/17.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View view;
    private Call<BaseResponse<UserInfo>> call;
    private final Context context;

    public LoginPresenter(Context context, LoginContract.View view) {
        this.view = view;
        this.context = context;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {
        cancel(call);
    }

    @Override
    public void onLogin(String username, String password) {
        view.showLoginProgress();
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUserName(username);
        loginRequest.setPassword(password);
        call = Data.getInstance(context).requestLogin(loginRequest, new Callback<BaseResponse<UserInfo>>() {
            @Override
            public void onResponse(Call<BaseResponse<UserInfo>> call, Response<BaseResponse<UserInfo>> response) {
                if (response.isSuccessful()) {
                    UserInfo userInfo = response.body().getResponse();
                    if (userInfo != null) {
//                        view.showLoginSuccess(response.body().getStatusMessage());
                    } else {
//                        view.showLoginError(response.body().getStatusMessage());
                    }
                } else {
                    view.showLoginError(context.getString(R.string.server_error));
                }
            }

            @Override
            public void onFailure(Call<BaseResponse<UserInfo>> call, Throwable t) {
                view.showLoginError(t.getMessage());
            }
        });
    }
}
