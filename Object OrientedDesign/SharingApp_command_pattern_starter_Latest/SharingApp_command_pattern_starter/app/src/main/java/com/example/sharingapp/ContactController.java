package com.example.sharingapp;

public class ContactController {

    private Contact user;

    public ContactController(Contact user) {
        this.user = user;
    }

    public String getUsername() {
        return user.getUsername();
    }

    public String getEmail() {
        return user.getEmail();
    }

    public String getId() {
        return user.getId();
    }

    public void setId() {
        user.setId();
    }

    public void updateId(String id) {
        user.updateId(id);
    }

    public void setEmail(String email) {
        user.setEmail(email);
    }

    public void setUsername(String username) {
        user.setUsername(username);
    }

    public void addObserver(Observer observer) {
        user.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        user.removeObserver(observer);
    }
}
