package com.volkangurbuz.newsme.Interface;


import com.volkangurbuz.newsme.Model.News;
import com.volkangurbuz.newsme.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by VolkanGurbuz on 2/19/2018.
 */

public interface NewsService {
    @GET("v1/sources?language=en")
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
