package com.blucore.searchtvshows.web;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.blucore.searchtvshows.activity.MainActivity;
import com.blucore.searchtvshows.activity.ui.movies.MoviesFragment;
import com.blucore.searchtvshows.activity.ui.tvshows.TvShowsFragment;
import com.blucore.searchtvshows.model.DataModel;
import com.blucore.searchtvshows.utils.Constants;
import com.blucore.searchtvshows.web.api.ResturantsApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebServices {

    private ResturantsApi api;
    private static WebServices mInstance;
    private Gson gson;

    public WebServices() {
        mInstance = this;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .callTimeout(5, TimeUnit.MINUTES)
                .writeTimeout(5, TimeUnit.MINUTES)
                .readTimeout(5, TimeUnit.MINUTES)
                .build();
        gson = new GsonBuilder().setLenient().create();
        api = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(ResturantsApi.class);
    }

    public static WebServices getInstance() {
        return mInstance;
    }


    public void searchShows(String keyword, final MoviesFragment moviesFragment) {
        Call<DataModel> call= api.searchShows(keyword,Constants.APIKEY);
        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                if (response.isSuccessful()){
                    moviesFragment.onApiResponse(response.body());
                }
            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {

            }
        });
    }
    public void searchShows(String keyword, final TvShowsFragment fragment) {
        Call<DataModel> call= api.searchShows(keyword,Constants.APIKEY);
        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                if (response.isSuccessful()){
                    fragment.onApiResponse(response.body());
                }
            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {

            }
        });
    }
}
