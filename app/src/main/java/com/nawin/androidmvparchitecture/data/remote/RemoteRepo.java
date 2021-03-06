package com.nawin.androidmvparchitecture.data.remote;

import com.nawin.androidmvparchitecture.data.model.News;
import com.nawin.androidmvparchitecture.data.model.TaggedQuestions;
import com.nawin.androidmvparchitecture.data.model.Tags;
import com.nawin.androidmvparchitecture.data.model.UserInfo;
import com.nawin.androidmvparchitecture.data.model.api.BaseResponse;
import com.nawin.androidmvparchitecture.data.model.api.LoginRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by brainovation on 6/13/17.
 */

public interface RemoteRepo {

    @POST("/login")
    Call<BaseResponse<UserInfo>> requestLogin(@Body LoginRequest loginRequest);

    @POST("/news")
    Call<BaseResponse<List<News>>> requestNews(@Body Map<String, Object> params);

    @GET("/search?pagesize=25&order=desc&sort=activity&tagged=android-annotations&site=stackoverflow")
    Call<BaseResponse<List<Tags>>> getTags();

}
