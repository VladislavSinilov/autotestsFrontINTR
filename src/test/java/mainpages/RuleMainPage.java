package mainpages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Description of the main page for configuring script execution rules
 */

public class RuleMainPage {

    private final SelenideElement tableOfRulesList = $x("/html/body/div/div/div/div/div/table"); // need refactor
    private final SelenideElement headOfRulesList = $x("/html/body/div/div/div/div/div/table/thead/tr"); // the same as above
    private final SelenideElement bodyfRulesList = $x("/html/body/div/div/div/div/div/table/tbody"); // the same as above
    private final SelenideElement createRule = $x("//button[contains(text(), 'Создать')]");
    private final SelenideElement deleteRule = $x("//*[@data-testid=\"DeleteOutlineIcon\"]");
    private final SelenideElement editRule = $x("//*[@data-testid=\"EditIcon\"]");

    /**
     *
     * @param url - Passing the address to the constructor
     */
    public RuleMainPage(String url)
    {
        Selenide.open(url);
    }

    /**
     * Method for controlling 3 buttons on MainPage
     */
    public void actionsOnPage(String scenario) throws InterruptedException {
        if(scenario.contains("Create")){
            createRule.click();
            Thread.sleep(300);
        }
       else if(scenario.contains("Edit")){
           editRule.click();
        }
       else {
           deleteRule.click();
        }
    }
}
