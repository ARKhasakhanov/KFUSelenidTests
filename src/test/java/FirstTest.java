import org.junit.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {
    @Test
    public void Lk() {
        open("https://kpfu.ru");
        $(byText("Личный кабинет")).click();
        $(byXpath("//*[@id=\"eu_enter\"]/input[1]")).setValue("ARKhasakhanov");
        $(byXpath("//*[@id=\"eu_enter\"]/input[2]")).setValue("buk8lck1").pressEnter();
    }
}
