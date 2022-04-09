package pages;

import com.codeborne.selenide.SelenideElement;
import utils.GenerateRndStr;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Description of the Script Rule creation page
 */

public class CreateRulePage {

    private final SelenideElement textInName = $x("//input[@id='name']");
    private final SelenideElement textInCode = $x("//input[@id='code']");
    private final SelenideElement checkBoxIsForBo = $x("//input[@id='isForBO']");
    private final SelenideElement checkBoxIsForIIS = $x("//*[@id=\"isForIIS\"]");
    private final SelenideElement checkBoxIsForStateNew = $x("//input[@id='isForStateNew']");
    private final SelenideElement checkBoxIsForStateActive = $x("//*[@id=\"isForStateActive\"]");
    private final SelenideElement checkBoxIsForStateClosed = $x("//*[@id=\"isForStateClosed\"]");
    private final SelenideElement checkBoxIsForStateBroken= $x("//*[@id=\"isForStateBroken\"]");
    private final SelenideElement checkBoxIsForNoDepo= $x("//*[@id=\"isForNoDepo\"]");
    private final SelenideElement checkBoxIsIgnoreBlackList= $x("//*[@id=\"isIgnoreBlackList\"]");
    private final SelenideElement checkBoxIsFor3dParty= $x("//*[@id=\"isFor3dParty\"]");
    private final SelenideElement checkBoxIsPhoneRequired= $x("//*[@id=\"isPhoneRequired\"]");
    private final SelenideElement checkBoxIsEmailRequired= $x("//*[@id=\"isEmailRequired\"]");
    private final SelenideElement checkBoxIsControlPos= $x("//*[@id=\"isControlPos\"]");
    private final SelenideElement checkBoxIsControlHQ= $x("//*[@id=\"isControlHQ\"]");
     private final SelenideElement buttonSave = $x("//button[contains(text(), 'Сохранить')]");
    private final SelenideElement buttonCancel = $x("//button[contains(text(), 'Отмена')]");

    /**
     *
     * Filling in the create rule page parameters
     */
    public void fillRulePage(int numberOfScenario) throws InterruptedException {
        switch (numberOfScenario) {
            case 1:
                textInName.setValue(GenerateRndStr.getAlphaNumericString(10));
                Thread.sleep(300);
                textInCode.setValue(GenerateRndStr.getAlphaNumericString(5));
                Thread.sleep(300);
                checkBoxIsForBo.click();
                checkBoxIsForStateNew.click();
                Thread.sleep(300);
                buttonSave.click();
                break;
            case 2:
                buttonCancel.click();
                break;
        }
    }
}

