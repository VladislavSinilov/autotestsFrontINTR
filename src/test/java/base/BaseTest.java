package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelectorMode;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

/**
 * Base class Selenide
 */

abstract public class BaseTest {

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pollingInterval = 300;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = true;
        Configuration.savePageSource = true;
        Configuration.reportsFolder = "build/selenideReports/tests";
        Configuration.selectorMode = SelectorMode.valueOf("CSS");
        Configuration.fastSetValue = true;
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        SelenideLogger.addListener("AllureSelenude", new AllureSelenide());
    }


    @AfterAll
    public static void tearDown(){
        Selenide.closeWebDriver();
    }

}