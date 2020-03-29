
package com.zalocoders.fashionapp.Models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class SingleItem {

    @SerializedName("created_at")
    private Object mCreatedAt;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("email_verified_at")
    private Object mEmailVerifiedAt;
    @SerializedName("fashion_category_id")
    private String mFashionCategoryId;
    @SerializedName("id")
    private String  mId;
    @SerializedName("is_bargainable")
    private String mIsBargainable;
    @SerializedName("location")
    private String mLocation;
    @SerializedName("name")
    private String mName;
    @SerializedName("password")
    private String mPassword;
    @SerializedName("phone")
    private String mPhone;
    @SerializedName("photo_1")
    private String mPhoto1;
    @SerializedName("photo_2")
    private String mPhoto2;
    @SerializedName("photo_3")
    private String mPhoto3;
    @SerializedName("remember_token")
    private Object mRememberToken;
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

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public Object getEmailVerifiedAt() {
        return mEmailVerifiedAt;
    }

    public void setEmailVerifiedAt(Object emailVerifiedAt) {
        mEmailVerifiedAt = emailVerifiedAt;
    }

    public String getFashionCategoryId() {
        return mFashionCategoryId;
    }

    public void setFashionCategoryId(String fashionCategoryId) {
        mFashionCategoryId = fashionCategoryId;
    }

    public String  getId() {
        return mId;
    }

    public void setId(String  id) {
        mId = id;
    }

    public String getIsBargainable() {
        return mIsBargainable;
    }

    public void setIsBargainable(String isBargainable) {
        mIsBargainable = isBargainable;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
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

    public Object getRememberToken() {
        return mRememberToken;
    }

    public void setRememberToken(Object rememberToken) {
        mRememberToken = rememberToken;
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
