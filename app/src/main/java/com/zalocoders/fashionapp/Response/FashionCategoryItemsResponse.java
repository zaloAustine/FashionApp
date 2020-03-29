
package com.zalocoders.fashionapp.Response;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import com.zalocoders.fashionapp.Models.FashionItemCategory;

@SuppressWarnings("unused")
public class FashionCategoryItemsResponse {

    @SerializedName("fashion_item_category")
    private List<FashionItemCategory> mFashionItemCategory;

    public List<FashionItemCategory> getFashionItemCategory() {
        return mFashionItemCategory;
    }

    public void setFashionItemCategory(List<FashionItemCategory> fashionItemCategory) {
        mFashionItemCategory = fashionItemCategory;
    }

}
