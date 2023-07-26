package org.pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public void clickButton(String text){
        $(byXpath("//*[@class='account-text']"));
    }
    public void clickSearchInput(String text){
        $("//*[@id='search']").click();
    }

}
