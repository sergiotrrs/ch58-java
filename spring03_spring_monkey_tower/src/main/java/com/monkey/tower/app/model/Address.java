package com.monkey.tower.app.model;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="addresses")
public class Address {
    @Id
    private Long id;
    @Column(name="address", length=250, nullable=false)
    private String address;
    @Column(name="city", length=100, nullable=false)
    private String city;
    @Column(name="state", length=100, nullable=false)
    private String state;
    @Column(name="postal_code", length=20, nullable=false)
    private String postalCode;
    @Column(name="country", length=50, nullable=false)
    private String country;
    
    //===============================
    public Address() {}

    public Address(Long id, String address, String city, String state, String postalCode, String country) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }


    //==============================================
    //get y set
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
    //============================================
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Address [id=");
        builder.append(id);
        builder.append(", address=");
        builder.append(address);
        builder.append(", city=");
        builder.append(city);
        builder.append(", state=");
        builder.append(state);
        builder.append(", postalCode=");
        builder.append(postalCode);
        builder.append(", country=");
        builder.append(country);
        builder.append("]");
        return builder.toString();
    }

    
    //========================================
    @Override
    public int hashCode() {
        return Objects.hash(address, city, country, id, postalCode, state);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        return Objects.equals(address, other.address) && Objects.equals(city, other.city)
                && Objects.equals(country, other.country) && Objects.equals(id, other.id)
                && Objects.equals(postalCode, other.postalCode) && Objects.equals(state, other.state);
    }

    
}