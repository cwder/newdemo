package com.huifu.newdemo.retrofit;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Timeout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface RetrofitHttpService {

    @GET()
    default Call<String> get1(@HeaderMap Map<String, String> headers, @Url String url, @QueryMap Map<String, String> params){
           System.out.println("aaaa");
           return new Call<String>() {
               @Override
               public Response<String> execute() throws IOException {
                   return null;
               }

               @Override
               public void enqueue(Callback<String> callback) {

               }

               @Override
               public boolean isExecuted() {
                   return false;
               }

               @Override
               public void cancel() {

               }

               @Override
               public boolean isCanceled() {
                   return false;
               }

               @Override
               public Call<String> clone() {
                   return null;
               }

               @Override
               public Request request() {
                   return null;
               }

               @Override
               public Timeout timeout() {
                   return null;
               }
           };
    }

//    @GET()
//    Call<String> get2(@HeaderMap T headers, @Url String url, @QueryMap Map<String, String> params);

    @GET("grouo/u?id=2")
    Call<String> get(@HeaderMap Map<String, String> headers, @QueryMap Map<String, String> params);

    @FormUrlEncoded
    @POST()
    Call<String> post(@HeaderMap Map<String, String> headers, @Url String url, @FieldMap Map<String, String> params);

    @Streaming
    @GET()
    Call<ResponseBody> download(@HeaderMap Map<String, String> headers, @Url String url, @QueryMap Map<String, String> params);


}
