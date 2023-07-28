package ru.wildberries.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends BasePage {

    SelenideElement headerNameProduct = $(".product-page__header"),
            addProductInBasket = $(".product-page__aside-sticky .order");

    @Step("проверяем результат поиска по артиклу")
    public ProductPage checkArticle(String value) {
        headerNameProduct.shouldHave(Condition.text(value));
        return this;
    }

    @Step("добавляем товар в корзину")
    public ProductPage addProductInBasket() {
        addProductInBasket.click();
        return this;
    }


}
