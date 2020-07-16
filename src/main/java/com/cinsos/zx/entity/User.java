package com.cinsos.zx.entity;

import java.util.Date;

public class User {
    public String getUser_oid() {
        return user_oid;
    }

    public void setUser_oid(String user_oid) {
        this.user_oid = user_oid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Float getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(Float user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_passWord() {
        return user_passWord;
    }

    public void setUser_passWord(String user_passWord) {
        this.user_passWord = user_passWord;
    }

    public Date getUser_createDate() {
        return user_createDate;
    }

    public void setUser_createDate(Date user_createDate) {
        this.user_createDate = user_createDate;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    private String user_oid;
    private String user_name;
    private Float user_phone;
    private String user_email;
    private String user_passWord;
    private Date user_createDate;
    private String user_gender;

}
