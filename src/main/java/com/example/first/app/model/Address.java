package com.example.first.app.model;

public class Address {
    // for tight  copulig we make all of them public ad for loose copulig we will make all of them private
    private int doorNo;
    private String streetName;
    private String city;

    public Address(int doorNo, String streetName, String city) {
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.city = city;
    }

    public Address() {
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo=" + doorNo +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
