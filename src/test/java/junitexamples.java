import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class junitexamples {

  @BeforeAll
  static void browserConfig() {
    Configuration.browserSize = "1920x1080";
  }
  @Test
  void closeCookieWindowOTP(){
    open("https://www.otpbank.ru/?utm_source=yandex.ru&utm_medium=organic&utm_campaign=yandex.ru&utm_referrer=yandex.ru");
    
    $(byTagAndText("strong","Закрыть")).click();
  }

      @Test
        void test() {
          open("https://demoqa.com/text-box");
          $("#userName").setValue("Charles Leclerc");
          $("#userEmail").setValue("leclerc@f1.com");
          $("#currentAddress").setValue("UK, Silverstone");
          $("#permanentAddress").setValue("Monaco, Nabergnaya u morya, 9");
          $("#submit").click();
          $("#output").shouldHave(text("Name:Charles Leclerc"), text("Email:leclerc@f1.com"), text("Current Address :UK, Silverstone"),
                  text("Permananet Address :Monaco, Nabergnaya u morya, 9"));
        }
  @Test
  void findSelenideMostCommitsUser() {
    open("https://github.com/");
    $("[placeholder='Search or jump to...']").click();
    $("#query-builder-test").setValue("Selenide").pressEnter();
    $("[class='Box-sc-g0xbh4-0 kzfhBO search-match prc-Text-Text-0ima0']").click();
    $("#repository-container-header").shouldHave(text("selenide"));
    //$("div.BorderGrid-cell").$(By.cssSelector("")).click();

    $("div.Layout-sidebar").$(byText("Contributors"))
              .closest("h2").sibling(0).$$(byCssSelector("li")).first().hover();
    $$(".Popover").findBy(visible).shouldHave(text("asolntsev"));
    sleep(5000);
    }

}