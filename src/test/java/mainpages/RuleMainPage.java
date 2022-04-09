package mainpages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Description of the main page for configuring script execution rules
 */

public class RuleMainPage {

    private final SelenideElement createRule = $x("//button[contains(text(), 'Создать')]");
    //  private final SelenideElement deleteRule = $x("");
   // private final SelenideElement editRule = $x("");

    /**
     *
     * @param url - Passing the address to the constructor
     */
    public RuleMainPage(String url)
    {
        Selenide.open(url);
    }

    /**
     * Clicking on the create button
     */
    public void doCreateRule() throws InterruptedException {
        createRule.click();
        Thread.sleep(300);
    }
}
