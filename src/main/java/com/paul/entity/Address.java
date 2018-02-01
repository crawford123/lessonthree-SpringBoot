package com.paul.entity;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/25/2018
 * Time: 3:42 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class Address {
    private Integer addrId;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
