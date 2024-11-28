package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)  
@CucumberOptions(plugin={ "pretty" }, features="src/test/java/com/bancolombia/bancolombia.feature", 
                                      tags="@bancolombia",
                                      glue="com.bancolombia")


/*r
@RunWith(CucumberWithSerenity.class) 
@CucumberOptions(features="src/test/java/com/bancolombia/bancolombia.feature", tags="@bancolombia", glue="com.bancolombia")
*/

public class RunnerBancolombia {}