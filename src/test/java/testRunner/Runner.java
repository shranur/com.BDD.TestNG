package testRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java",
				glue="stepDefintions"
				,tags = "not (@reg and @smoke)")
				//"not @run"
				//@reg or @smoke" , @reg and @smoke ,ot (@reg and @smoke)
public class Runner extends AbstractTestNGCucumberTests {
	
	

}
