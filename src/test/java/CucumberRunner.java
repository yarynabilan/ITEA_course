import org.junit.runner.RunWith;
        import io.cucumber.junit.Cucumber;
        import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Шлях до пакету з feature files
        glue = {"stepsDefinition"} // Шлях до пакету з визначеннями кроків
)
public class CucumberRunner {

}
