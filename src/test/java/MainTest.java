import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainTest {

    @Test
    public void Lk() {
        open("https://kpfu.ru");
        $(byText("Личный кабинет")).click();
        $(byXpath("//*[@id=\"eu_enter\"]/input[1]")).setValue("ARKhasakhanov");
        $(byXpath("//*[@id=\"eu_enter\"]/input[2]")).setValue("buk8lck1").pressEnter();
        $(byXpath("/html/body/div[2]/div[4]/div/a[2]")).click();
        ElementsCollection result = $$("#info > div > div.top.clearfix > div.left > div:nth-child(9) > span.value");
        check(result);
        result.get(0).should(exist);
        result.shouldHave(size(1));
    }
    @Step
    public void check(ElementsCollection result){
        result.first().shouldBe(visible);
    }
}