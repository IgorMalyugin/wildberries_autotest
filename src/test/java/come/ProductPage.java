package come;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    SelenideElement
            addProductInBasket = $(".product-page__aside-sticky .order"),
            openBasket = $(".header__navbar-pc .j-item-basket .navbar-pc__icon"),
            headerNameProduct = $(".product-page__header");

    @Step("добавляем товар в корзину")
    public ProductPage addProductInBasket() {
        addProductInBasket.click();
        return this;
    }

    @Step("проверяем результат поиска по артиклу")
    public ProductPage checkArticle(String value) {
        headerNameProduct.shouldHave(Condition.text(value));
        return this;
    }

    @Step("открываем корзину")
    public ProductPage openBasket() {
        openBasket.click();
        return this;
    }
}
