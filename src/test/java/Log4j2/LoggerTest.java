package Log4j2;

import org.testng.annotations.Test;

import Utilities.LoggerLoad;

public class LoggerTest {

	@Test
	public void test01() throws InterruptedException {
		// if want to display info message
		LoggerLoad.info("--------Testing Info--------");

		// If want to display warn message
		LoggerLoad.warn("--------Testing Warn--------");

		// if want to display error message
		LoggerLoad.error("-------Testing Error--------");
	}

}
