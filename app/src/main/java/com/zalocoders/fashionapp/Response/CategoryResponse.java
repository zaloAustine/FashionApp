
package com.zalocoders.fashionapp.Response;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.zalocoders.fashionapp.Models.FashionCategory;

@SuppressWarnings("unused")
public class CategoryResponse {

    @SerializedName("fashion_category")
    private List<FashionCategory> mFashionCategory;

    public List<FashionCategory> getFashionCategory() {
        return mFashionCategory;
    }

    public void setFashionCategory(List<FashionCategory> fashionCategory) {
        mFashionCategory = fashionCategory;
    }

}
