package Runner;

import Base.BaseClass;
import io.cucumber.testng.CucumberOptions;

public class RunnerClass {
	
	@CucumberOptions(features = "src/test/java/Featurefile/Login.feature", glue = "Pages", publish = true)

	public class LoginRunner extends BaseClass{
	}
}
