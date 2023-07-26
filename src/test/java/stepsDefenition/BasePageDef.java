package stepsDefenition;

import io.cucumber.java.en.Then;
import org.pages.BasePage;

public class BasePageDef {
    BasePage basePage = new BasePage();
    @Then("Click {string}")
    public void click(String arg0) {
        basePage.clickLoginButton(arg0);
    }
}
