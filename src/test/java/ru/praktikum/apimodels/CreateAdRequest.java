package ru.praktikum.apimodels;

public class CreateAdRequest {
    private String title;

    public CreateAdRequest(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}