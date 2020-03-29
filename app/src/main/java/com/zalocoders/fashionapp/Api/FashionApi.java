package com.zalocoders.fashionapp.Api;

import com.zalocoders.fashionapp.Response.FashionCategoryItemsResponse;
import com.zalocoders.fashionapp.Response.SingleItemResponse;
import com.zalocoders.fashionapp.Response.CategoryResponse;
import com.zalocoders.fashionapp.Response.GroupResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FashionApi {
    @GET("fashion_groups")
    Call<GroupResponse> getGroups();

    @GET("fashion_categories/{id}")
    Call<CategoryResponse> getCategories(@Path("id") String id);


    @GET("fashion_category_items/{id}")
    Call<FashionCategoryItemsResponse> getCategoriesItems(@Path("id") String id);


    @GET("single_item/{id}")
    Call<SingleItemResponse> getSinglesItems(@Path("id") String id);


}
