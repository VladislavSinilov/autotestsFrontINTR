package MainPages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница - таблица Настройки правил выполнения сценария
 */

public class CreateRuleMainPage {

    private final SelenideElement createRule = $x("//button");
    private final SelenideElement deleteRule = $x("/html/body/div/div/div/div/div/table/tbody/tr[7]/td[1]/div/svg[2]/path");

    public CreateRuleMainPage(String url){
        Selenide.open(url);
    }

    /**
     * Клик по кнопке "СОЗДАТЬ"
     */
    public void doCreateRule(){
        createRule.click();
    }
}
