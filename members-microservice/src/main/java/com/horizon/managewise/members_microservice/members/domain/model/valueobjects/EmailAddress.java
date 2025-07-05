package com.horizon.managewise.members_microservice.members.domain.model.valueobjects;

import jakarta.persistence.Embeddable;
@Embeddable
public record EmailAddress(String email) {
    public EmailAddress() {
        this(null);
    }
    public EmailAddress {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }
    }
}