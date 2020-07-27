package com.tts.WeatherApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="zipcode_id")
    private Long id;
    
    private String zipCode;

    public ZipCode(Long id, String zipCode) {
        super();
        this.id = id;
        this.zipCode = zipCode;
    }

    public ZipCode() {
        
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "ZipCode [id=" + id + ", zipCode=" + zipCode +"]";
    }
}