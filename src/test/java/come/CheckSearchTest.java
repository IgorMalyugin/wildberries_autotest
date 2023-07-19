package come;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class CheckSearchTest extends BaseTest {

    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Поиск товара по артиклу 144668129")
    @Test
    public void checkSearch144668129() {

        step("открываем главную страницу", () -> {
            open("https://www.wildberries.ru/");
        });
        step("вводим артикул", () -> {
            $("#searchInput").setValue("144668129").pressEnter();
        });
//        step("проверяем результат поиска", () -> {
//            $(".product-page__header")
//                    .shouldHave(Condition.text("Погружной портативный блендер для смузи к3в 1"), Duration.ofSeconds(30));
//        });
    }

    @Disabled
    @Tag("UI")
    @Owner("Малюгин И А")
    @DisplayName("Поиск товара по артиклу 144132397")
    @Test
    public void checkSearch144132397() {

        step("вводим артикул", () -> {
            $("#searchInput").setValue("144132397").pressEnter();
        });
        step("проверяем результат поиска", () -> {
            $(".product-page__header")
                    .shouldHave(Condition.text("Подушка 50х70"), Duration.ofSeconds(30));
        });
    }
}
