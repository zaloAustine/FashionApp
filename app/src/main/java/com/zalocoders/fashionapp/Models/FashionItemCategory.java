
package com.zalocoders.fashionapp.Models;


import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class FashionItemCategory {

    @SerializedName("created_at")
    private Object mCreatedAt;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("fashion_category_id")
    private String mFashionCategoryId;
    @SerializedName("fashion_group_id")
    private String mFashionGroupId;
    @SerializedName("featured_photo")
    private String mFeaturedPhoto;
    @SerializedName("id")
    private Long mId;
    @SerializedName("is_bargainable")
    private String mIsBargainable;
    @SerializedName("photo_1")
    private String mPhoto1;
    @SerializedName("photo_2")
    private String mPhoto2;
    @SerializedName("photo_3")
    private String mPhoto3;
    @SerializedName("price")
    private String mPrice;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("updated_at")
    private Object mUpdatedAt;
    @SerializedName("user_id")
    private Long mUserId;

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

    public String getFashionCategoryId() {
        return mFashionCategoryId;
    }

    public void setFashionCategoryId(String fashionCategoryId) {
        mFashionCategoryId = fashionCategoryId;
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

    public String getIsBargainable() {
        return mIsBargainable;
    }

    public void setIsBargainable(String isBargainable) {
        mIsBargainable = isBargainable;
    }

    public String getPhoto1() {
        return mPhoto1;
    }

    public void setPhoto1(String photo1) {
        mPhoto1 = photo1;
    }

    public String getPhoto2() {
        return mPhoto2;
    }

    public void setPhoto2(String photo2) {
        mPhoto2 = photo2;
    }

    public String getPhoto3() {
        return mPhoto3;
    }

    public void setPhoto3(String photo3) {
        mPhoto3 = photo3;
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

    public Long getUserId() {
        return mUserId;
    }

    public void setUserId(Long userId) {
        mUserId = userId;
    }

}
