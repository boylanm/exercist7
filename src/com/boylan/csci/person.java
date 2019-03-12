package com.boylan.csci;

/**
 * Created by 126131 on 3/12/2019.
 */
public class person {
    private String name;
    private String email;

    public person() {
    }

    public person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
