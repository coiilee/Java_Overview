package com.kh.practiceEx.oopArrayPre;

public class User {

    //username, email, age
    private String username;
    private int age;
    private String email;

    public User() {
    }

    public User(String email, String username) {
        this.email = email;
        this.username = username;
//        this.age = age;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
