package org.example;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;


public class VerifyAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception {
        String us = "admin";
        String pw = "1234";
        if(this.username.trim().equals(us) && this.password.trim().equals(pw)){
            return "success";
        }
        return "error";
    }
}
