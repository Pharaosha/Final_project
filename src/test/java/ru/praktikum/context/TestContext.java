package ru.praktikum.context;

import ru.praktikum.apimodels.User;

public class TestContext {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}