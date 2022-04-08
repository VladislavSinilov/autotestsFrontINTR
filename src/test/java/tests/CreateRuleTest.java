package tests;

import base.BaseTest;
import mainpages.CreateRuleMainPage;
import pages.CreateRulePage;
import org.junit.jupiter.api.Test;
import utils.Constants;

/**
 * Creating a Script Execution rule
 */

public class CreateRuleTest extends BaseTest {


    @Test
    public void createRule() throws InterruptedException {

        String URL = Constants.Host;
        CreateRuleMainPage createRuleMainPage = new CreateRuleMainPage(URL);
        createRuleMainPage.doCreateRule();
        CreateRulePage createRule = new CreateRulePage();
        createRule.addValues();

    }

}
