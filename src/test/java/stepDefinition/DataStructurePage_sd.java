package stepDefinition;

import PageObjects.DataStructurePage_pom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.BaseClass;
import Utilities.CommonActions;

public class DataStructurePage_sd extends BaseClass {

	@Given("User is in the Home Page before logging in to test DataStructures introduction")
	public void user_is_in_the_home_page_before_logging_in_to_test_data_structures_introduction() {

		new CommonActions().homePageUrl();

	}

	@When("User clicks Signin and logged in from the login page to test DataStructure introduction")
	public void user_clicks_signin_and_logged_in_from_the_login_page_to_test_data_structure_introduction() {

		new CommonActions().login();

	}

	@Then("User successfully logged in to test DataStructure introduction")
	public void user_successfully_logged_in_to_test_data_structure_introduction() throws InterruptedException {

		new CommonActions().msgText();

	}

	@When("^User tests the DataStructures introduction with simple python code (.*) and gives the(.*)$")
	public void user_tests_the_data_structures_introduction_with_simple_python_code_input_and_gives_the_output(
			String input, String output) throws InterruptedException {

		new DataStructurePage_pom().DataStructuresGetStrtd();
		new DataStructurePage_pom().TimeComplexity();
		new CommonActions().tryAndRunValid(input);
		new CommonActions().navigateBack();
		new CommonActions().practiceQuesBtn();

	}

	@When("^User tests the DataStructures introduction with wrong (.*) and gives the (.*)$")
	public void user_tests_the_data_structure_with_wrong_input(String wronginput, String errortext)
			throws InterruptedException {

		new DataStructurePage_pom().DataStructuresGetStrtd();
		new DataStructurePage_pom().TimeComplexity();
		new CommonActions().tryAndRunInvalid(wronginput);
		new CommonActions().navigateBack();
		new CommonActions().practiceQuesBtn();

	}

}
