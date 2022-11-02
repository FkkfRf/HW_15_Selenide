package actions.selenide;

import base.BaseTestHerokuApp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MoveRectangleTest extends BaseTestHerokuApp {

    @Test
    @DisplayName(value = ".dragAndDrop -  перемещения прямоугольников ")
    void dragAndDropRectangles() {
        open("/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));
    }

    @Test
    @DisplayName(value = "actions() - перемещения")
    // не работает
    void dragAndDropTestUsingSelenideActions() {
        open("/drag_and_drop");
        actions().clickAndHold($("#column-a")).moveByOffset(10,10).release().perform();
        $("#column-a").shouldHave(text("B"));

    }
}
