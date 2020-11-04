package com.blucore.searchtvshows.web.api;

import com.blucore.searchtvshows.model.DataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ResturantsApi {


    @GET("/?")
    Call<DataModel> searchShows(@Query("s") String s,
                                @Query("apikey") String s1);
}
