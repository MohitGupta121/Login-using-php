package com.login.api.php;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface apiset
{
  @FormUrlEncoded
  @POST("login_android.php")
  Call<responsemodel> verifyuser(
                 @Field("email") String email,
                 @Field("password") String password
                 );
}
