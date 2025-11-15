package com.quan.springboot.bean;

public class Address {
    private String city;
    private String postCode;

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
