package Pages;

import com.codeborne.selenide.SelenideElement;

import java.nio.charset.StandardCharsets;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница - Создания правила
 */

public class CreateRulePage {

    private final SelenideElement textInName = $x("//input[@id='name']");
    private final SelenideElement textInCode = $x("//input[@id='code']");
    private final SelenideElement checkboxtInIsForBo = $x("//input[@id='isForBO']");
    private final SelenideElement checkboxtInIsForStateNew = $x("//input[@id='isForStateNew']");
    private final SelenideElement buttonSave = $x("/html/body/div[2]/div[3]/div/div[3]/button[1]");


    public static String generateRndChar() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        return  new String(array, StandardCharsets.UTF_8);
    }

    public void addValues() throws InterruptedException {
        textInName.setValue(generateRndChar());
        Thread.sleep(500);
        textInCode.setValue(generateRndChar());
        Thread.sleep(500);
        checkboxtInIsForBo.click();
        checkboxtInIsForStateNew.click();
        Thread.sleep(300);
        buttonSave.click();
    }
}

