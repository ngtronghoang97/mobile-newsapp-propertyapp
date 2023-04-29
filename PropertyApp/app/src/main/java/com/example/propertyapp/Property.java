package com.example.propertyapp;

public class Property {
    private String title;
    private String address;
    private String imageUrl;

    public Property(String title, String address, String imageUrl) {
        this.title = title;
        this.address = address;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
