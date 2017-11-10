package com.etiennelawlor.moviehub.models;

import com.etiennelawlor.moviehub.network.models.TelevisionImageGallery;
import com.etiennelawlor.moviehub.network.models.TelevisionShow;
import com.etiennelawlor.moviehub.network.models.TelevisionShowContentRatingsEnvelope;
import com.etiennelawlor.moviehub.network.models.TelevisionShowCreditsEnvelope;
import com.etiennelawlor.moviehub.network.models.TelevisionShowsEnvelope;

/**
 * Created by etiennelawlor on 12/19/16.
 */

public class FullTelevisionShow {

    // region Member Variables
    private TelevisionShow televisionShow;
    private TelevisionShowCreditsEnvelope televisionShowCreditsEnvelope;
    private TelevisionShowsEnvelope televisionShowsEnvelope;
    private TelevisionShowContentRatingsEnvelope televisionShowContentRatingsEnvelope;
    private TelevisionImageGallery televisionImageGallery;
    // endregion

    // region Constructors

    public FullTelevisionShow(TelevisionShow televisionShow, TelevisionShowCreditsEnvelope televisionShowCreditsEnvelope,
                              TelevisionShowsEnvelope televisionShowsEnvelope, TelevisionShowContentRatingsEnvelope televisionShowContentRatingsEnvelope,
                              TelevisionImageGallery televisionImageGallery) {
        this.televisionShow = televisionShow;
        this.televisionShowCreditsEnvelope = televisionShowCreditsEnvelope;
        this.televisionShowsEnvelope = televisionShowsEnvelope;
        this.televisionShowContentRatingsEnvelope = televisionShowContentRatingsEnvelope;
        this.televisionImageGallery = televisionImageGallery;
    }

    // endregion

    // region Getters

    public TelevisionShow getTelevisionShow() {
        return televisionShow;
    }

    public TelevisionShowCreditsEnvelope getTelevisionShowCreditsEnvelope() {
        return televisionShowCreditsEnvelope;
    }

    public TelevisionShowsEnvelope getTelevisionShowsEnvelope() {
        return televisionShowsEnvelope;
    }

    public TelevisionShowContentRatingsEnvelope getTelevisionShowContentRatingsEnvelope() {
        return televisionShowContentRatingsEnvelope;
    }

    public TelevisionImageGallery getTelevisionImageGallery() {
        return televisionImageGallery;
    }

    // endregion

    // region Setters

    public void setTelevisionShow(TelevisionShow televisionShow) {
        this.televisionShow = televisionShow;
    }

    public void setTelevisionShowCreditsEnvelope(TelevisionShowCreditsEnvelope televisionShowCreditsEnvelope) {
        this.televisionShowCreditsEnvelope = televisionShowCreditsEnvelope;
    }

    public void setTelevisionShowsEnvelope(TelevisionShowsEnvelope televisionShowsEnvelope) {
        this.televisionShowsEnvelope = televisionShowsEnvelope;
    }

    public void setTelevisionShowContentRatingsEnvelope(TelevisionShowContentRatingsEnvelope televisionShowContentRatingsEnvelope) {
        this.televisionShowContentRatingsEnvelope = televisionShowContentRatingsEnvelope;
    }

    public void setTelevisionImageGallery(TelevisionImageGallery televisionImageGallery) {
        this.televisionImageGallery = televisionImageGallery;
    }

    // endregion
}
