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
        page
                .waitPage()
                .setInput("144668129")
                .checkArticle("Scarlett Погружной блендер");
    }


    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Поиск товара по наименованию")
    @Test
    public void checkSearchNameTest() {
        page
                .waitPage()
                .setInput("Polaris Робот пылесос PVCR 0826")
                .checkProduct("найдено");
    }

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Проверка добавления товара в корзину")
    @Test
    public void checkAddProductTest() {
        page
                .waitPage()
                .setInput("6170053")
                .addProductInBasket("Добавить в корзину")
                .openBasket("Корзина")
                .checkBasket("1");

    }
    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Проверка валюты")
    @Test
    public void checkCurrencyTest(){
        page.checkCurrency("RUB");
    }

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Проверка локации")
    @Test
    public void checkCurrencyLocation(){
        page.checkLocation("Москва");
    }
}
