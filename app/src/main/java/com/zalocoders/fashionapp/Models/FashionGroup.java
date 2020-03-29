
package com.zalocoders.fashionapp.Models;


import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class FashionGroup {

    @SerializedName("created_at")
    private Object mCreatedAt;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("featured_photo")
    private String mFeaturedPhoto;
    @SerializedName("id")
    private Integer mId;
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

    public String getFeaturedPhoto() {
        return mFeaturedPhoto;
    }

    public void setFeaturedPhoto(String featuredPhoto) {
        mFeaturedPhoto = featuredPhoto;
    }

    public Integer getId() {
        return mId;
    }

    public void setId(Integer id) {
        mId = id;
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
