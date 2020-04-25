package RunnerUtility;

import org.junit.runner.RunWith;
import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//We can pull multiple feature file all together

/*@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources",glue="stepDefinition",tags= {"@Smoke"})
public class RunnerClass {

}
*/
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources",glue="stepDefinition",
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/Reports/MyFirstReport.html"})
public class RunnerClass {

}

/*@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources",glue="stepDefinition",tags= {"@RunOnlyThis"})
public class RunnerClass {

}*/

/*@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features/Second.feature",glue="stepDefinition")
public class RunnerClass {

}*/

/*@RunWith(Cucumber.class)=We are going to run with our class with the cucumber class itself.
 *                        This is annotation provided by junit*/
