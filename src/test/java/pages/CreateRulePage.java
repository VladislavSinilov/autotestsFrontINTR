package pages;

import com.codeborne.selenide.SelenideElement;

import java.nio.charset.StandardCharsets;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Description of the Script Rule creation page
 */

public class CreateRulePage {

    private final SelenideElement textInName = $x("//input[@id='name']");
    private final SelenideElement textInCode = $x("//input[@id='code']");
    private final SelenideElement checkboxtInIsForBo = $x("//input[@id='isForBO']");
    private final SelenideElement checkboxtInIsForStateNew = $x("//input[@id='isForStateNew']");
     private final SelenideElement buttonSave = $x("//button[contains(text(), 'Сохранить')]");
    private final SelenideElement buttonCancel = $x("//button[contains(text(), 'Отмена')]");


    /**
     *
     * @return A set of random Strings  - // need rework
     */
    public static String generateRndChar() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return  new String(array, StandardCharsets.UTF_8);
    }

    /**
     *
     * Filling in the create rule page parameters
     */
    public void addValues(String scenario) throws InterruptedException {
        if(scenario.contains("Create")) {
            textInName.setValue(generateRndChar());
            Thread.sleep(300);
            textInCode.setValue(generateRndChar());
            Thread.sleep(300);
            checkboxtInIsForBo.click();
            checkboxtInIsForStateNew.click();
            Thread.sleep(300);
            buttonSave.click();
        } else if
        (scenario.contains("Cancel"))
        {
            Thread.sleep(300);
          buttonCancel.click();
        }
    }
}

