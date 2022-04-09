package tests;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import mainpages.RuleMainPage;
import org.junit.jupiter.api.Test;
import utils.Constants;

public class EditRuleTest extends BaseTest {

    @Test
    @Owner("Vladislav Sinilov")
    @Description("Creating a Script Execution rule")
    public void editRule() throws InterruptedException {
        String URL = Constants.URL;
        RuleMainPage editRuleMainPage = new RuleMainPage(URL);
        editRuleMainPage.actionsOnPage("EditRule");
        // need to finish
    }
}
