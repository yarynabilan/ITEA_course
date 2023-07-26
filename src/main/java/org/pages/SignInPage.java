package org.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
   private SelenideElement loginInput = $(By.xpath("//*[@class='account-text']"));
   private SelenideElement passwordInput = $(By.name("auth_password"));

   public void inputLogin(String text) {

      public void inputLogin(String text){
         this.loginInput.val(text);

         public void inputPassword(String text){
            this.passwordInput.val(text);
         }
      }
   }
}