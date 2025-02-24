package ApplicationHooks;

import Utilities.BaseClass;
import Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks extends BaseClass {

	@Before
	public static void beforeScenario() throws Throwable {

		BaseClass.openDriver(ConfigReader.getBrowserType());

	}

	@After
	public void afterScenario(Scenario scenario) {

		BaseClass.closeDriver();

	}

}
