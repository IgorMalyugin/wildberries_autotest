package ru.wildberries.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CheckAddProductTest extends BaseTest {

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Проверка добавления товара в корзину")
    @Test
    public void checkAddProductTest() {
        mainPage
                .waitForPageIsLoaded()
                .getHeaderComponent()
                .setSearchInput("6170053");
        productPage
                .addProductInBasket()
                .getHeaderComponent()
                .openBasket();
        basketPage
                .checkBasketCount("1");

    }
}
