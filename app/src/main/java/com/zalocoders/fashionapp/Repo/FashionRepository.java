package com.zalocoders.fashionapp.Repo;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.zalocoders.fashionapp.Api.FashionApi;
import com.zalocoders.fashionapp.Api.NetworkService;
import com.zalocoders.fashionapp.Models.FashionGroup;
import com.zalocoders.fashionapp.Response.GroupResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FashionRepository {

    NetworkService networkService;
    MutableLiveData<GroupResponse> group_response;

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

}
