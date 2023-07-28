package ru.wildberries.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CheckMainPage extends BaseTest {

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Проверка валюты на главной странице")
    @Test
    public void checkCurrencyTest() {
        mainPage.checkCurrency("RUB");
    }

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Проверка локации на главной странице")
    @Test
    public void checkCurrencyLocation() {
        mainPage.checkLocation("Москва");
    }
}
