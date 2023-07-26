package org.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
   private SelenideElement loginInput = $(byXpath("//*[@class='account-text']"));
   private SelenideElement passwordInput = $(byXpath(""));
}
