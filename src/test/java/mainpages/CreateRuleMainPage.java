package mainpages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Description of the main page for configuring script execution rules
 */

public class CreateRuleMainPage {

    private final SelenideElement createRule = $x("//button[contains(text(), 'Создать')]");
  //  private final SelenideElement createRule = $x("//button");
    //  private final SelenideElement deleteRule = $x("");
   // private final SelenideElement editRule = $x("");

    /**
     *
     * @param url - Passing the address to the constructor
     */
    public CreateRuleMainPage(String url)
    {
        Selenide.open(url);
    }

    /**
     * Clicking on the create button
     */
    public void doCreateRule()
    {
        createRule.click();
    }
}
