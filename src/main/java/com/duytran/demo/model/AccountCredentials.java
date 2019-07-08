package com.duytran.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class AccountCredentials{
    @Id
    private String username;
    private String password;
    private String active;

    public AccountCredentials() {
    }

    public AccountCredentials(String username, String password, String active) {
        this.username = username;
        this.password = password;
        this.active = active;
    }

    public AccountCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}