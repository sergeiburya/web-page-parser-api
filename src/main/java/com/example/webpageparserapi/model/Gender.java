package com.example.webpageparserapi.model;

public enum Gender {
    FEMALE("Female"),
    MALE("MAle"),
    GENDERLESS("Genderless"),
    UNKNOWN("unknown");

    private String value;

    Gender(String value) {
        this.value = value;
    }
}
