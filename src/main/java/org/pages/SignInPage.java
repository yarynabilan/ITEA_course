package org.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement authWindow = $(By.xpath("//div[@data-v-656ac337][@data-v-052ef122][contains(@class, 'auth-scroller')]")).shouldBe(Condition.visible);
    private SelenideElement loginInput = $(By.xpath("//*[@class='account-text']")).shouldBe(Condition.visible);
    private SelenideElement passwordInput = $(By.name("auth_password")).shouldBe(Condition.visible);


    public boolean isAuthWindowVisible() {
        return $("div[data-v-656ac337][data-v-052ef122].auth-scroller").shouldBe(Condition.visible).exists();
    }
    public void inputLogin(String text) {
        this.loginInput.val(text);
    }
        public void inputPassword(String text){
            this.passwordInput.val(text);
        }
    }
