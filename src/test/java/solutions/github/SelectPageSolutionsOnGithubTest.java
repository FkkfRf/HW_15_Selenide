package solutions.github;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelectPageSolutionsOnGithubTest extends BaseTest {
    @Test
    void LoadPageSolutions() {
        open(baseUrl);
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("h1").shouldHave(text("Build like the best"));
        $("h2").shouldHave(text("Stay secure end to end"));
    }
}