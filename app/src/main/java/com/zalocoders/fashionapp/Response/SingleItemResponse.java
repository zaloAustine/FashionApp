
package com.zalocoders.fashionapp.Response;

import com.google.gson.annotations.SerializedName;
import com.zalocoders.fashionapp.Models.SingleItem;

@SuppressWarnings("unused")
public class SingleItemResponse {

    @SerializedName("single_item")
    private SingleItem mSingleItem;

    public SingleItem getSingleItem() {
        return mSingleItem;
    }

    public void setSingleItem(SingleItem singleItem) {
        mSingleItem = singleItem;
    }

}
