
package com.zalocoders.fashionapp.Models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class FashionCategory {

    @SerializedName("created_at")
    private Object mCreatedAt;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("fashion_group_id")
    private String mFashionGroupId;
    @SerializedName("featured_photo")
    private String mFeaturedPhoto;
    @SerializedName("id")
    private Long mId;
    @SerializedName("price")
    private String mPrice;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("updated_at")
    private Object mUpdatedAt;

    public Object getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(Object createdAt) {
        mCreatedAt = createdAt;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getFashionGroupId() {
        return mFashionGroupId;
    }

    public void setFashionGroupId(String fashionGroupId) {
        mFashionGroupId = fashionGroupId;
    }

    public String getFeaturedPhoto() {
        return mFeaturedPhoto;
    }

    public void setFeaturedPhoto(String featuredPhoto) {
        mFeaturedPhoto = featuredPhoto;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Object getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        mUpdatedAt = updatedAt;
    }

}
