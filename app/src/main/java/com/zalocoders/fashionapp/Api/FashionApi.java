package com.zalocoders.fashionapp.Api;

import com.zalocoders.fashionapp.Response.SingleItemResponse;
import com.zalocoders.fashionapp.Response.CategoryResponse;
import com.zalocoders.fashionapp.Response.GroupResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface FashionApi {
    @GET("fashion_groups")
    Call<GroupResponse> getGroups();

    @FormUrlEncoded
    @GET("fashion_categories/{id}")
    Call<CategoryResponse> getCategories(@Field("fashion_group_id") String id);


    @FormUrlEncoded
    @GET("fashion_category_items/{id}")
    Call<CategoryResponse> getCategoriesItems(@Field("fashion_category_id") String id);


    @FormUrlEncoded
    @GET("single_item/{id}")
    Call<SingleItemResponse> getSinglesItems(@Field("id") String id);


}
