package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public void clickButton(String text) {
        SelenideElement button = $(By.xpath("//*[@class='account-text']"));
        if (button.shouldBe(Condition.visible).isDisplayed()) {
            button.click();
        } else {
            System.out.println("Елемент не видимий на сторінці!");
        }
    }

//      public void clickSearchInput(String text) {
//        $(byXpath("//*[@id='search']")).click();
//    }

    public void clickSubmitButton(String text) {
        $(".ui-btn-primary").click();
    }

    public void contentVisible(String text) {
        $(byText("Нація, що читає – непереможна!")).shouldBe(Condition.visible);
    }
}
