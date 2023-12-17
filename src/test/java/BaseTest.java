import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    SelenideElement googleSearch = $(byAttribute("type","search"));

    @Test
    public void yandex(){
        Configuration.browser = "chrome";
        Configuration.screenshots = false;
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://www.google.ru";
        Configuration.browserSize = "1920x1080";

        open("/");
        googleSearch.shouldBe(visible).setValue("конвертер").pressEnter();
//        Selenide.webdriver().object().manage().window().maximize();
//        sleep(2000);
    }
}
