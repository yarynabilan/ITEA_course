package stepsDefenition;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class BeforeAfterSteps {

    @Before
    public void openUrl(){
        open("https://www.yakaboo.ua/");
    }
    @After
    public void tearDown(){
        WebDriverRunner.getWebDriver().quit();
    }
    @AfterStep
    public void makeScreenshot(){
        Selenide.screenshot(System.currentTimeMillis() + "step");
    }
}
