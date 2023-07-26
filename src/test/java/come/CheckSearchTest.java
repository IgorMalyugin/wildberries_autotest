package come;

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
                .setSearchInput("Polaris Робот пылесос PVCR 0826");
        searchPage
                .checkProduct("найдено");
    }

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Проверка добавления товара в корзину")
    @Test
    public void checkAddProductTest() {
        mainPage
                .waitForPageIsLoaded()
                .setSearchInput("6170053");
        productPage
                .addProductInBasket()
                .openBasket();
        basketPage.checkBasketCount("1");

    }

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Проверка валюты")
    @Test
    public void checkCurrencyTest() {
        mainPage.checkCurrency("RUB");
    }

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Проверка локации")
    @Test
    public void checkCurrencyLocation() {
        mainPage.checkLocation("Москва");
    }
}
