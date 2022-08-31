import io.cucumber.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", plugin = {"pretty", "html:out"})

public class FeaturesRunner {
}