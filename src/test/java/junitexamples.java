import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class junitexamples {

  @BeforeAll
  static void browserConfig(){
    Configuration.browserSize = "2560x1440";
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

}
