package stepDefinition;

import PageObjects.QueuePage_pom;
import Utilities.BaseClass;
import Utilities.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueuePage_sd extends BaseClass {

	@Given("User now in the home page before loging in to test queue")
	public void user_now_in_the_home_page_before_loging_in_to_test_queue() {

		new CommonActions().homePageUrl();

	}

	@When("User loged in from logIn page to test queue")
	public void user_loged_in_from_log_in_page_to_test_queue() {

		new CommonActions().login();

	}

	@Then("User successfully logged in now to test queue")
	public void user_successfully_logged_in_now_to_test_queue() {

		new CommonActions().msgText();

	}

	@When("^User test the queue data structure with simple python code (.*) and gives (.*)$")
	public void user_test_the_queue_data_structure_with_simple_python_code_and_gives(String input,
			String expectedOutput) throws InterruptedException {

		new QueuePage_pom().queueGetStartedBtn();
		new QueuePage_pom().queueImplementQBtn();
		new CommonActions().tryAndRunValid(input);
		new QueuePage_pom().navigateBackQP().queueImpCollectionBtn();
		new CommonActions().tryAndRunValid(input);
		new QueuePage_pom().navigateBackQP().queueImpArrayBtn();
		new CommonActions().tryAndRunValid(input);
		new QueuePage_pom().navigateBackQP().queueOperationBtn();
		new CommonActions().tryAndRunValid(input);
		new CommonActions().navigateBack();
		new CommonActions().practiceQuesBtn();

	}

	@When("^User test the queue data structure with wrong python code (.*) and gives (.*)$")
	public void user_test_the_queue_data_structure_with_wrong_python_code_and_gives_error(String wrongInput,
			String errorMsg) throws InterruptedException {

		new QueuePage_pom().queueGetStartedBtn();
		new QueuePage_pom().queueImplementQBtn();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new QueuePage_pom().navigateBackQP().queueImpCollectionBtn();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new QueuePage_pom().navigateBackQP().queueImpArrayBtn();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new QueuePage_pom().navigateBackQP().queueOperationBtn();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new CommonActions().navigateBack();
		new CommonActions().practiceQuesBtn();

	}

}
