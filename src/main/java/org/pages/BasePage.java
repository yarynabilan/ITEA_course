package org.pages;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public void clickSearchInput(String text){
        $("//*[@id='search']").click();
    }

}
