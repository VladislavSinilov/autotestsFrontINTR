package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import mainpages.RuleMainPage;
import pages.CreateRulePage;
import org.junit.jupiter.api.Test;
import utils.Constants;

/**
 * Creating a Script Execution rule
 */

public class CreateRuleTest extends BaseTest {


    @Test
    @Owner("Vladislav Sinilov")
    @Description("Creating a Script Execution rule")
    public void createRule() throws InterruptedException {
        String URL = Constants.URL;
        RuleMainPage createRuleMainPage = new RuleMainPage(URL);
        createRuleMainPage.doCreateRule();
        CreateRulePage createRule = new CreateRulePage();
        createRule.addValues("CreateRule");
    }

    @Test
    @Owner("Vladislav Sinilov")
    @Description("Cancel a Script Execution rule")
    public void cancelRule() throws InterruptedException {
        String URL = Constants.URL;
        RuleMainPage createRuleMainPage = new RuleMainPage(URL);
        createRuleMainPage.doCreateRule();
        CreateRulePage cancelRule = new CreateRulePage();
        cancelRule.addValues("CancelRule");
    }

}
