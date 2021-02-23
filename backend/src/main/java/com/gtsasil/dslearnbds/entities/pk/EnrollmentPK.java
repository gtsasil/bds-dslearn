package com.gtsasil.dslearnbds.entities.pk;

import com.gtsasil.dslearnbds.entities.Offer;
import com.gtsasil.dslearnbds.entities.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EnrollmentPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    public EnrollmentPK(User user, Offer offer) {
        this.user = user;
        this.offer = offer;
    }

    public EnrollmentPK() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnrollmentPK)) return false;
        EnrollmentPK that = (EnrollmentPK) o;
        return getUser().equals(that.getUser()) && getOffer().equals(that.getOffer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getOffer());
    }
}
