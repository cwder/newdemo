package com.huifu.newdemo;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.huifu.newdemo.retrofit.Contant;
import com.huifu.newdemo.retrofit.RetrofitHttpService;
import com.huifu.newdemo.retrofit.StringConverterFactory;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retrofitTest();
            }
        });
    }


    private void retrofitTest(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Contant.baseUrl) //设置网络请求的Url地址
                .addConverterFactory(StringConverterFactory.create())
                .client(new OkHttpClient())
                .build();
        RetrofitHttpService retrofitHttpService =
                retrofit.create(RetrofitHttpService.class);

        Call<String> call = retrofitHttpService.get(Contant.head,Contant.body);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

                Log.e("aaa",response.toString());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("aaa",t.toString());
            }
        });
    }
}