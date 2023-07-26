package come;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    SelenideElement listProducts = $(".searching-results__title");

    @Step("проверяем результат поиска по наименованию")
    public SearchPage checkProduct(String value) {
        listProducts.shouldHave(Condition.text(value));
        return this;
    }
}
