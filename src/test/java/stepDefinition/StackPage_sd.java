package stepDefinition;

import PageObjects.StackPage_pom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.BaseClass;
import Utilities.CommonActions;

public class StackPage_sd extends BaseClass {

	@Given("User is in the Home Page before logging in to test Stack datastructure")
	public void user_is_in_the_home_page_before_logging_in_to_test_stack_datastructure() {

		new CommonActions().homePageUrl();

	}

	@When("User clicks Signin and logged in from the login page to test Stack datastructure")
	public void user_clicks_signin_and_logged_in_from_the_login_page_to_test_stack_datastructure() {

		new CommonActions().login();

	}

	@Then("User successfully logged in to test Stack datastructure")
	public void user_successfully_logged_in_to_test_stack_datastructure() {

		new CommonActions().msgText();

	}

	@When("^User tests the Stack datastructure with simple python code (.*) and gives the (.*)$")
	public void user_tests_the_stack_datastructure_with_simple_python_code_print_hello_and_gives_the_hello(String input,
			String output) throws InterruptedException {

		new StackPage_pom().StackGetStrtdBtn();
		new StackPage_pom().OperationsInStackBtn();
		new CommonActions().tryAndRunValid(input);
		new StackPage_pom().navigateBackSP();
		new StackPage_pom().StackImplemantationBtn();
		new CommonActions().tryAndRunValid(input);
		new StackPage_pom().navigateBackSP();
		new StackPage_pom().StackApplicationsBtn();
		new CommonActions().tryAndRunValid(input);
		new CommonActions().navigateBack();
		new CommonActions().practiceQuesBtn();

	}

	@When("^User tests the Stack datastructure with wrong (.*) and gives the (.*)$")
	public void user_tests_the_stack_datastructure_with_wrong_hello_and_gives_the_error(String wronginput,
			String errortext) throws InterruptedException {

		new StackPage_pom().StackGetStrtdBtn();
		new StackPage_pom().OperationsInStackBtn();
		new CommonActions().tryAndRunInvalid(wronginput);
		new StackPage_pom().navigateBackSP();
		new StackPage_pom().StackImplemantationBtn();
		new CommonActions().tryAndRunInvalid(wronginput);
		new StackPage_pom().navigateBackSP();
		new StackPage_pom().StackApplicationsBtn();
		new CommonActions().tryAndRunInvalid(wronginput);
		new CommonActions().navigateBack();
		new CommonActions().practiceQuesBtn();

	}

}
