package org.example;

import com.opensymphony.xwork2.ActionSupport;

public class Profile extends ActionSupport {
    private String fn;
    private String fd;

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getFd() {
        return fd;
    }

    public void setFd(String fd) {
        this.fd = fd;
    }

    public String execute() throws  Exception{
        return SUCCESS;
    }
}
