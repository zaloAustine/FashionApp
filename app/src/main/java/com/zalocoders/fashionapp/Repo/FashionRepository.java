package com.zalocoders.fashionapp.Repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.zalocoders.fashionapp.Api.FashionApi;
import com.zalocoders.fashionapp.Api.NetworkService;
import com.zalocoders.fashionapp.Models.FashionGroup;
import com.zalocoders.fashionapp.Response.CategoryResponse;
import com.zalocoders.fashionapp.Response.FashionCategoryItemsResponse;
import com.zalocoders.fashionapp.Response.GroupResponse;
import com.zalocoders.fashionapp.Response.SingleItemResponse;
import com.zalocoders.fashionapp.Views.CategoryListActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FashionRepository {

    NetworkService networkService;
    MutableLiveData<GroupResponse> group_response;
    MutableLiveData<CategoryResponse> category_List;
    MutableLiveData<FashionCategoryItemsResponse> items_List;
    MutableLiveData<SingleItemResponse> single_Item;

    public FashionRepository(){
        networkService = NetworkService.getInstance();
    }

    public MutableLiveData<GroupResponse> getFashionGroups() {

        group_response = new MutableLiveData<>();

        networkService.getAPI().getGroups().enqueue(new Callback<GroupResponse>() {
            @Override
            public void onResponse(Call<GroupResponse> call, Response<GroupResponse> response) {

                if (response.body() != null) {
                    Log.i("Fashion","Data available");
                    group_response.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<GroupResponse> call, Throwable t) {
                Log.e("Error Loading", "There was an error getting Response");
            }
        });


    return group_response;
    }

    public MutableLiveData<CategoryResponse> getFashionCategories(String id){
        category_List = new MutableLiveData<>();
        networkService.getAPI().getCategories(id).enqueue(new Callback<CategoryResponse>() {
            @Override
            public void onResponse(Call<CategoryResponse> call, Response<CategoryResponse> response) {
                if (response.body() != null) {
                    Log.e("Fashion","Category available");
                    category_List.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<CategoryResponse> call, Throwable t) {
                Log.e("Fashion",t.getMessage());

            }
        });

        return category_List;

    }

    public MutableLiveData<FashionCategoryItemsResponse> getCategoryListItems(String id){
        items_List = new MutableLiveData<>();

        networkService.getAPI().getCategoriesItems(id).enqueue(new Callback<FashionCategoryItemsResponse>() {
            @Override
            public void onResponse(Call<FashionCategoryItemsResponse> call, Response<FashionCategoryItemsResponse> response) {
                if (response.body() != null) {
                    Log.i("Fashion","Category available");
                    items_List.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<FashionCategoryItemsResponse> call, Throwable t) {
                Log.i("Fashion","Category items  Error");
            }
        });

        return items_List;

    }

    public  MutableLiveData<SingleItemResponse> getSingleItem(String id){

        single_Item = new MutableLiveData<>();

        networkService.getAPI().getSinglesItems(id).enqueue(new Callback<SingleItemResponse>() {
            @Override
            public void onResponse(Call<SingleItemResponse> call, Response<SingleItemResponse> response) {
                if (response.body() != null) {
                    Log.i("Fashion","Category available");
                    single_Item.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<SingleItemResponse> call, Throwable t) {

                Log.i("Fashion","Single Item Error");

            }
        });

        return single_Item;
    }

}
