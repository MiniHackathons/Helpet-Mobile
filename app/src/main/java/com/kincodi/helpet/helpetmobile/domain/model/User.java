package com.kincodi.helpet.helpetmobile.domain.model;

/**
 * Created by Julio on 20/02/2018.
 */

public class User {
    private String Id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;

    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
