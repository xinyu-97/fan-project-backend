package com.example.fanproject.model;

import java.io.Serializable;
import java.util.Date;

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;
    private final String userName;
    private Date expiredDate;
    private String image;

    public JwtResponse(String jwttoken, String userName) {
        this.jwttoken = jwttoken;
        this.userName = userName;
    }

    public JwtResponse(String jwttoken, String userName, Date expiredDate, String image) {
        this.jwttoken = jwttoken;
        this.userName = userName;
        this.expiredDate = expiredDate;
        this.image = image;
    }

    public String getToken() {
        return this.jwttoken;
    }

    public String getUserName(){
        return this.userName;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public String getImage() {
        return image;
    }
}
