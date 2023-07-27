package ru.wildberries.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import ru.wildberries.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.wildberries.pages.BasketPage;
import ru.wildberries.pages.MainPage;
import ru.wildberries.pages.ProductPage;
import ru.wildberries.pages.SearchPage;

import java.util.HashMap;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class BaseTest {

    MainPage mainPage = new MainPage();
    ProductPage productPage = new ProductPage();
    BasketPage basketPage = new BasketPage();
    SearchPage searchPage = new SearchPage();

    @BeforeEach
    public void beforeTest() {

        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browserVersion = System.getProperty("browserVersion", "100.0");
        Configuration.pageLoadStrategy = "eager";
        Configuration.remote = System.getProperty("remoteDriverUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", new HashMap<String, Object>() {{
            put("enableVCN", true);
            put("enableVideo", true);
        }});
        Configuration.browserCapabilities = capabilities;

        step("открываем главную страницу", () -> {
            open("https://www.wildberries.ru/");
        });
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        closeWebDriver();
    }
}
