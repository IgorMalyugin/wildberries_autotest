package come;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class CheckSearchTest extends BaseTest {

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Поиск товара по артиклу")
    @Test
    public void checkSearchArt() {
        step("вводим артикул", () -> {
            $("#searchInput").setValue("144668129").pressEnter();
        });
        step("проверяем результат поиска", () -> {
            $(".product-page__header")
                    .shouldHave(Condition.text("Погружной портативный блендер для смузи к3в 1"), Duration.ofSeconds(30));
        });
    }


    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Поиск товара по наименованию")
    @Test
    public void checkSearchName() {
        step("вводим наименование", () -> {
            $("#searchInput").setValue("Polaris Робот пылесос PVCR 0826").pressEnter();
        });
        step("проверяем результат поиска", () -> {
            $(".searching-results__title").shouldHave(Condition.text("найдено"), Duration.ofSeconds(30));
        });
    }

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Проверка добавления товара в корзину")
    @Test
    public void checkAddProduct() {
        step("вводим артикул", () -> {
            $("#searchInput").setValue("6170053").pressEnter();
        });
        step("добавляем товар в корзину", () -> {
            $(".product-page__aside-sticky").$(byText("Добавить в корзину")).click();
        });
        step("открываем корзину", () -> {
            $(".header__navbar-pc").$(byText("Корзина")).click();
        });
        step("проверяем наличие товара в корзине", () -> {
            $(".b-top__count").shouldHave(Condition.text("1"), Duration.ofSeconds(30));
        });
    }
}
