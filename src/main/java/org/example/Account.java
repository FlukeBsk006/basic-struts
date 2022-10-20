package org.example;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.validators.EmailValidator;

import java.util.Date;

public class Account extends ActionSupport {
    private String kkname;
    private String kksurname;
    private String address;
    private Integer phone;
    private String email;

    public String getKkname() {
        return kkname;
    }

    public void setKkname(String kkname) {
        this.kkname = kkname;
    }

    public String getKksurname() {
        return kksurname;
    }

    public void setKksurname(String kksurname) {
        this.kksurname = kksurname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String execute() throws  Exception{
        return SUCCESS;
    }
}

