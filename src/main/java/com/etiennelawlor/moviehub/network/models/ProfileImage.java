package com.etiennelawlor.moviehub.network.models;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.graphics.Palette;

import com.etiennelawlor.moviehub.utilities.ConfigurationUtility;
import com.google.gson.annotations.SerializedName;

/**
 * Created by etiennelawlor on 12/16/16.
 */

public class ProfileImage implements Parcelable {

    // region Fields
    @SerializedName("aspect_ratio")
    public float aspectRatio;
    @SerializedName("file_path")
    public String filePath;
    @SerializedName("height")
    public int height;
    @SerializedName("vote_average")
    public float voteAverage;
    @SerializedName("vote_count")
    public int voteCount;
    @SerializedName("width")
    public int width;

    private Palette posterPalette;
    // endregion

    // region Constructors
    public ProfileImage() {
    }

    protected ProfileImage(Parcel in) {
        this.aspectRatio = in.readFloat();
        this.filePath = in.readString();
        this.height = in.readInt();
        this.voteAverage = in.readFloat();
        this.voteCount = in.readInt();
        this.width = in.readInt();
    }
    // endregion

    // region Getters

    public float getAspectRatio() {
        return aspectRatio;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFilePath(Context context) {
        String secureBaseUrl = ConfigurationUtility.getSecureBaseUrl(context);
        String posterSize = ConfigurationUtility.getPosterSize(context);
        String profileUrl = String.format("%s%s%s", secureBaseUrl, posterSize, filePath);

        return profileUrl;
    }

    public int getHeight() {
        return height;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public int getWidth() {
        return width;
    }

    public Palette getPosterPalette() {
        return posterPalette;
    }

    // endregion

    // region Setters

    public void setAspectRatio(float aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPosterPalette(Palette posterPalette) {
        this.posterPalette = posterPalette;
    }

    // endregion

    // region Parcelable Methods
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(this.aspectRatio);
        dest.writeString(this.filePath);
        dest.writeInt(this.height);
        dest.writeFloat(this.voteAverage);
        dest.writeInt(this.voteCount);
        dest.writeInt(this.width);
    }
    // endregion

    public static final Parcelable.Creator<ProfileImage> CREATOR = new Parcelable.Creator<ProfileImage>() {
        @Override
        public ProfileImage createFromParcel(Parcel source) {
            return new ProfileImage(source);
        }

        @Override
        public ProfileImage[] newArray(int size) {
            return new ProfileImage[size];
        }
    };
}
