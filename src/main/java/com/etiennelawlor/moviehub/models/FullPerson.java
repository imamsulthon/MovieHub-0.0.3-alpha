package com.etiennelawlor.moviehub.models;

import com.etiennelawlor.moviehub.network.models.Person;
import com.etiennelawlor.moviehub.network.models.PersonCreditsEnvelope;
import com.etiennelawlor.moviehub.network.models.PersonImagesGallery;

/**
 * Created by etiennelawlor on 12/19/16.
 */

public class FullPerson {

    // region Member Variables
    private Person person;
    private PersonCreditsEnvelope personCreditsEnvelope;
    private PersonImagesGallery personImagesGallery;
    // endregion

    // region Constructors

    public FullPerson(Person person, PersonCreditsEnvelope personCreditsEnvelope, PersonImagesGallery personImagesGallery) {
        this.person = person;
        this.personCreditsEnvelope = personCreditsEnvelope;
        this.personImagesGallery = personImagesGallery;
    }

    // endregion

    // region Getters

    public Person getPerson() {
        return person;
    }

    public PersonCreditsEnvelope getPersonCreditsEnvelope() {
        return personCreditsEnvelope;
    }

    public PersonImagesGallery getPersonImagesGallery() {
        return personImagesGallery;
    }
    // endregion

    // region Setters

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPersonCreditsEnvelope(PersonCreditsEnvelope personCreditsEnvelope) {
        this.personCreditsEnvelope = personCreditsEnvelope;
    }

    public void setPersonImagesGallery(PersonImagesGallery personImagesGallery) {
        this.personImagesGallery = personImagesGallery;
    }

    // endregion
}
