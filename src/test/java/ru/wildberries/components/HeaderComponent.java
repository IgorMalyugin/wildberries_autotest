package ru.wildberries.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HeaderComponent {
    SelenideElement
            inputSearch = $("#searchInput"),
            openBasket = $(".header__navbar-pc .j-item-basket .navbar-pc__icon");

    @Step("вводим наименование")
    public HeaderComponent setSearchInput(String value) {
        inputSearch.setValue(value)
                .pressEnter();
        return this;
    }

    @Step("открываем корзину")
    public HeaderComponent openBasket() {
        openBasket.click();
        return this;
    }


}
