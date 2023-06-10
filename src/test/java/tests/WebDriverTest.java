package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class WebDriverTest extends TestBaseTest{
    @Test
    void ownerTest() {
        open("/");
        $(".styles_navList__2gE6Y").shouldHave(text("Модельный ряд"));
        $(".styles_location__1qKKy").click();
        $(".styles_list__OQWdz").$(byText("Москва")).click();
        $(".styles_text__QYg3R").shouldHave(text("Москва"));
    }
}
