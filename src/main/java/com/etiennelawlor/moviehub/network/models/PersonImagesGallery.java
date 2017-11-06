package com.etiennelawlor.moviehub.network.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eventlink on 25/10/17.
 */

public class PersonImagesGallery {

    @SerializedName("id")
    public long id;
    @SerializedName("profiles")
    public ArrayList<ProfileImage> profileImageList = null;

    public PersonImagesGallery() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<ProfileImage> getProfileImageList() {
        return profileImageList;
    }

    public void setProfileImageList(ArrayList<ProfileImage> profileImageList) {
        this.profileImageList = profileImageList;
    }
}
