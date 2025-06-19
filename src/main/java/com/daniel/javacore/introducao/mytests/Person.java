package com.daniel.javacore.introducao.mytests;

public class Person {
    public String username;
    public int age;
    public char gender;
    public String email;

    public Person(String username, int age, char gender, String email) {
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public int gtAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
