package ru.praktikum.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AdPage {
    private final SelenideElement adTitle = $("h1[data-testid='ad-title']");
    private final SelenideElement adDescription = $("div[data-testid='ad-description']");
    private final SelenideElement adPrice = $("div[data-testid='ad-price']");

    public void verifyAdDetails(String title, String description, String price) {
        adTitle.shouldHave(text(title));
        adDescription.shouldHave(text(description));
        adPrice.shouldHave(text(price));
    }
}