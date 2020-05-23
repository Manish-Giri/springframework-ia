package com.jrp.springdemo.domain;

public class User {

    public String fullName;
    public String age;
    public boolean employed;
    public String gender;

    public User() {
        System.out.println("User default constructor");
    }

    public User(String fullName, String age, boolean isEmployed, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.employed = isEmployed;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
