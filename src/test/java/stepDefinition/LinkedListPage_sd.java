package stepDefinition;

import PageObjects.LinkedListPage_pom;
import Utilities.BaseClass;
import Utilities.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListPage_sd extends BaseClass {

	@Given("User is in the home page before loging in to test linked list")
	public void user_is_in_the_home_page_before_loging_in_to_test_linked_list() {

		new CommonActions().homePageUrl();

	}

	@When("User clicks sign in and loged in from logIn page to test linked list")
	public void user_clicks_sign_in_and_loged_in_from_log_in_page_to_test_linked_list() {

		new CommonActions().login();
	}

	@Then("User successfully logged in to test linked list")
	public void User_successfully_logged_in_to_test_linked_list() {

		new CommonActions().msgText();

	}

	@When("^User test the linked list data structure with simple python code (.*) and gives (.*)$")
	public void user_test_the_linked_list_data_structure_with_simple_python_code_and_gives(String input,
			String expectedOutput) throws InterruptedException {

		new LinkedListPage_pom().linkedListGetstartedBtn();
		new LinkedListPage_pom().lLIntroBtn();
		new CommonActions().tryAndRunValid(input);
		new LinkedListPage_pom().navigateBackLlP().lLCreateLlBtn();
		new CommonActions().tryAndRunValid(input);
		new LinkedListPage_pom().navigateBackLlP().lLTypesLlBtn();
		new CommonActions().tryAndRunValid(input);
		new LinkedListPage_pom().navigateBackLlP().lLImplementLlBtn();
		new CommonActions().tryAndRunValid(input);
		new LinkedListPage_pom().navigateBackLlP().lLTraversalBtn();
		new CommonActions().tryAndRunValid(input);
		new LinkedListPage_pom().navigateBackLlP().lLDeletionBtn();
		new CommonActions().tryAndRunValid(input);
		new CommonActions().navigateBack();
		new CommonActions().practiceQuesBtn();

	}

	@When("^User test the linked list data structure with wrong python code (.*) and gives (.*)")
	public void User_test_the_linked_list_data_structure_with_wrong_python_code_input_and_gives_expectedOutput(
			String wrongInput, String errorMsg) throws InterruptedException {

		new LinkedListPage_pom().linkedListGetstartedBtn();
		new LinkedListPage_pom().lLIntroBtn();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new LinkedListPage_pom().navigateBackLlP().lLCreateLlBtn();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new LinkedListPage_pom().navigateBackLlP().lLTypesLlBtn();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new LinkedListPage_pom().navigateBackLlP().lLImplementLlBtn();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new LinkedListPage_pom().navigateBackLlP().lLTraversalBtn();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new LinkedListPage_pom().navigateBackLlP().lLDeletionBtn();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new CommonActions().navigateBack();
		new CommonActions().practiceQuesBtn();

	}

}
