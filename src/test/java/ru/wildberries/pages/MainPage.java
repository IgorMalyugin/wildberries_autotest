package ru.wildberries.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage{

    SelenideElement
            inputSearch = $("#searchInput"),
            checkCurrency = $(".simple-menu__currency"),
            checkLocation = $(".simple-menu__link--address"),
            waitBanner = $(".main-page__banner");

    @Step("вводим наименование")
    public MainPage setSearchInput(String value) {
        inputSearch.setValue(value)
                .pressEnter();
        return this;
    }


    @Step("проверяем установленную валюту")
    public MainPage checkCurrency(String value) {
        checkCurrency.shouldHave(Condition.text(value));
        return this;
    }

    @Step("проверяем локацию")
    public MainPage checkLocation(String value) {
        checkLocation.shouldHave(Condition.text(value));
        return this;
    }

    @Step("ожидание загрузки страницы")
    public MainPage waitForPageIsLoaded() {
        waitBanner.shouldBe(Condition.visible);
        return this;
    }


}
