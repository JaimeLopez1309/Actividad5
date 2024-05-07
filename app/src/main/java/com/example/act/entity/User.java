package com.example.act.entity;

public class User {
    private int Document;
    private String Names;
    private String LastNames;
    private String User;
    private String Password;

    public User(int document, String names, String lastNames, String user, String password) {
        Document = document;
        Names = names;
        LastNames = lastNames;
        User = user;
        Password = password;
    }

    public User() {
    }

    public int getDocument() {
        return Document;
    }

    public void setDocument(int document) {
        Document = document;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public String getLastNames() {
        return LastNames;
    }

    public void setLastNames(String lastNames) {
        LastNames = lastNames;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("Document=").append(Document);
        sb.append(", Names='").append(Names).append('\'');
        sb.append(", LastNames='").append(LastNames).append('\'');
        sb.append(", User='").append(User).append('\'');
        sb.append(", Password='").append(Password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
