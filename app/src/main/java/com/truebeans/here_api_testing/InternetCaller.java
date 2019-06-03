package com.truebeans.here_api_testing;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public abstract class InternetCaller extends AsyncTask<Void, Void, Void>{

    String serverResponse;
    private String restUrl = "https://places.cit.api.here.com/places/v1/discover/explore?";

    @Override
    protected Void doInBackground(Void... voids) {
        asyncBeforeInternetCall();
        internetCall();
        return null;
    }

    private void internetCall() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(restUrl + getAppId() + "&"  + getAppCode() + "&"+  getRequestUrl())
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull final Response response) throws IOException {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                }

                assert response.body() != null;
                serverResponse = response.body().string();

                Handler handler = new Handler(Looper.getMainLooper());

                handler.post(() -> responseReceived());
            }
        });

    }

    public abstract String getRequestUrl();

    public abstract void responseReceived();

    public abstract void asyncBeforeInternetCall();

    private String getAppId(){
        return "app_id=your-app-id";
    }

    private String getAppCode(){
        return "app_code=your-app-code";
    }

}
