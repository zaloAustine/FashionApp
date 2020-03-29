
package com.zalocoders.fashionapp.Response;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import com.zalocoders.fashionapp.Models.FashionGroup;

@SuppressWarnings("unused")
public class GroupResponse {

    @SerializedName("fashion_groups")
    private List<FashionGroup> mFashionGroups;

    public List<FashionGroup> getFashionGroups() {
        return mFashionGroups;
    }

    public void setFashionGroups(List<FashionGroup> fashionGroups) {
        mFashionGroups = fashionGroups;
    }

}
