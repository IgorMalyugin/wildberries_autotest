package ru.wildberries.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CheckSearchTest extends BaseTest {

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Поиск товара по артиклу")
    @Test
    public void checkSearchArtTest() {
        mainPage
                .waitForPageIsLoaded()
                .getHeaderComponent()
                .setSearchInput("144668129");
        productPage
                .checkArticle("Scarlett Погружной блендер");
    }


    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Поиск товара по наименованию")
    @Test
    public void checkSearchNameTest() {
        mainPage
                .waitForPageIsLoaded()
                .getHeaderComponent()
                .setSearchInput("Polaris Робот пылесос PVCR 0826");
        searchPage
                .checkProduct("найдено");
    }


}
