package com.etiennelawlor.moviehub.network.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by eventlink on 06/11/17.
 */

public class MoviesImagesGallery {

    @SerializedName("id")
    public long id;
    @SerializedName("backdrops")
    public ArrayList<ProfileImage> backdropList = null;
    @SerializedName("poster")
    public ArrayList<ProfileImage> posterList = null;

    public MoviesImagesGallery() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<ProfileImage> getBackdropList() {
        return backdropList;
    }

    public void setBackdropList(ArrayList<ProfileImage> backdropList) {
        this.backdropList = backdropList;
    }

    public ArrayList<ProfileImage> getPosterList() {
        return posterList;
    }

    public void setPosterList(ArrayList<ProfileImage> posterList) {
        this.posterList = posterList;
    }
}
