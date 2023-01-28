package com.driver;

import org.springframework.web.bind.annotation.GetMapping;

//@GetMapping("/get-user");
public class User {
    private String name;
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
