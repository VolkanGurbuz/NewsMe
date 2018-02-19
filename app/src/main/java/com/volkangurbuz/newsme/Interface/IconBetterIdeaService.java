package com.volkangurbuz.newsme.Interface;


import com.volkangurbuz.newsme.Model.IconBetterIdea;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by VolkanGurbuz on 2/19/2018.
 */

public interface IconBetterIdeaService {
    @GET
    Call<IconBetterIdea> getIconUrl(@Url String url);
}
