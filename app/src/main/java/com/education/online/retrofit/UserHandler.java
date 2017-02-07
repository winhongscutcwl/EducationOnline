package com.education.online.retrofit;


import com.education.online.bean.LoginInfo;
import com.education.online.http.Method;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Administrator on 2016/8/12.
 */
public interface UserHandler {

    @POST(Method.Login)
    Observable<HttpResult<LoginInfo>> login(@Body RequestBody signStr);

}
