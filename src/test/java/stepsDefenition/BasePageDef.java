package stepsDefenition;

import io.cucumber.java.en.Then;
import org.pages.BasePage;

public class BasePageDef {
    BasePage basePage = new BasePage();
    @Then("Click {string}")
    public void clickButton(String arg0) {
        basePage.clickButton(arg0);
    }
}
