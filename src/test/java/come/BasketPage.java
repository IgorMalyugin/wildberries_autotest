package come;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    SelenideElement checkBasket = $(".b-top__count");

    @Step("проверяем наличие товара в корзине")
    public BasketPage checkBasketCount(String value) {
        checkBasket.shouldHave(Condition.text(value));
        return this;
    }
}
