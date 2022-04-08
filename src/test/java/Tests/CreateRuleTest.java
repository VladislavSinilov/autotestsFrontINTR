package Tests;

import Base.BaseTest;
import MainPages.CreateRuleMainPage;
import Pages.CreateRulePage;
import org.junit.jupiter.api.Test;

/**
 * Тест создания правила выполнения сценария
 */

public class CreateRuleTest extends BaseTest {


    @Test
    public void createRule() throws InterruptedException {

        String URL = "http://localhost:3000/";
        CreateRuleMainPage createRuleMainPage = new CreateRuleMainPage(URL);
        createRuleMainPage.doCreateRule();
        CreateRulePage createRule = new CreateRulePage();
        createRule.addValues();

    }

}
