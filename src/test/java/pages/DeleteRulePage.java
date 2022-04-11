package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DeleteRulePage {

    private final SelenideElement textOnPage = $x("//*[@id=\"mui-3\"]");
    private final SelenideElement buttonYes = $x("//button[contains(text(), 'Да')]");
    private final SelenideElement buttonNo = $x("//button[contains(text(), 'Нет')]");

    public void chooseButton(String scenario){
        if(scenario.contains("Delete")) {
            buttonYes.click();
        } else{
            buttonNo.click();
        }
    }
}


