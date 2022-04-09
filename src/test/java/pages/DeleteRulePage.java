package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class DeleteRulePage {

    private final SelenideElement textOnPage = $x("//*[@id=\"mui-3\"]").shouldHave(text("Вы уверены, что хотите удалить правило?"));
    private final SelenideElement buttonYes = $x("//button[contains(text(), 'Да')]");
    private final SelenideElement buttonNo = $x("//button[contains(text(), 'Нет')]");

    public void checkText(SelenideElement textOnPage){
        // Think
    }

    public void chooseButton(String scenario){
        if(scenario.contains("Delete")) {
            buttonYes.click();
        } else{
            buttonNo.click();
        }
    }
}


