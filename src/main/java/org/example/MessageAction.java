package org.example;

import com.opensymphony.xwork2.ActionSupport;

public class MessageAction extends ActionSupport {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String execute() throws Exception {
        return SUCCESS;
    }
}
