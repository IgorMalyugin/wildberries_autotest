package come;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Page {
    SelenideElement input = $("#searchInput"),
            checkA = $(".product-page__header"),
            checkP = $(".searching-results__title"),
            addProduct = $(".product-page__aside-sticky"),
            openB = $(".header__navbar-pc"),
            checkB = $(".b-top__count"),
            checkC = $(".simple-menu__currency"),
            checkL = $(".simple-menu__link--address"),
            waitP = $(".footer__add-info");

    @Step("вводим наименование")
    public Page setInput(String value) {
        input.setValue(value)
                .pressEnter();
        return this;
    }

    @Step("проверяем результат поиска")
    public Page checkArticle(String value) {
        checkA.shouldHave(Condition.text(value));
        return this;
    }
    @Step("проверяем результат поиска")
    public Page checkProduct(String value) {
        checkP.shouldHave(Condition.text(value));
        return this;
    }

    @Step("добавляем товар в корзину")
    public Page addProductInBasket(String value) {
        addProduct
                .$(byText(value)).click();
        return this;
    }
    @Step("открываем корзину")
    public Page openBasket(String value) {
        openB.$(byText(value)).click();
        return this;
    }
    @Step("проверяем наличие товара в корзине")
    public Page checkBasket(String value){
        checkB.shouldHave(Condition.text(value));
        return this;
    }

    @Step("проверяем установленную валюту")
    public Page checkCurrency(String value){
        checkC.shouldHave(Condition.text(value));
        return this;
    }

    @Step("проверяем локацию")
    public Page checkLocation(String value){
        checkL.shouldHave(Condition.text(value));
        return this;
    }
    @Step("ожидание загрузки страницы")
    public Page waitPage(){
        waitP.shouldBe(Condition.visible);
        return this;
    }


}
