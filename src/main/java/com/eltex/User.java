package com.eltex;

public class User {
    private long id;
    private String login;
    private String name;
    private String avatar;

    public User(long id, String login, String name, String avatar) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.avatar = avatar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", login='" + login + "', name='" + name + "'}";
    }
}

