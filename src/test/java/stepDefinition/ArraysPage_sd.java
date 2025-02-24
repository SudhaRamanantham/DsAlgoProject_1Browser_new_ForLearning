package stepDefinition;

import PageObjects.ArrayPage_pom;
import Utilities.BaseClass;
import Utilities.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraysPage_sd extends BaseClass {

	@Given("User opens home page before login to test arrays")
	public void user_opens_home_page_before_login_to_test_arrays() {

		new CommonActions().logInPageUrl();

	}

	@When("User logged in from login page to test arrays")
	public void User_logged_in_from_login_page_to_test_arrays() {

		new CommonActions().login();

	}

	@Then("User successfully logged in now to test arrays")
	public void user_successfully_logged_in_now_to_test_arrays() {

		new CommonActions().msgText();

	}

	@When("^User tests array page enters (.*) in text editor box and it gives (.*)$")
	public void user_tests_array_page_enters_input_in_text_editor_box_and_it_gives_expectedOutput(String input,
			String expectedOutput) throws InterruptedException {

		new ArrayPage_pom().getStarted_Arrays();
		new ArrayPage_pom().arraysPythonBtn();
		new CommonActions().tryAndRunValid(input);
		new ArrayPage_pom().navigateBackAP();

		new ArrayPage_pom().arraysListBtn();
		new CommonActions().tryAndRunValid(input);
		new ArrayPage_pom().navigateBackAP();

		new ArrayPage_pom().basicOperationBtn();
		new CommonActions().tryAndRunValid(input);
		new ArrayPage_pom().navigateBackAP();

		new ArrayPage_pom().applcnOfArrayBtn();
		new CommonActions().tryAndRunValid(input);
		new CommonActions().navigateBack();

		new CommonActions().practiceQuesBtn();
		new ArrayPage_pom().searchArrayBtn();
		new ArrayPage_pom().pracPage_tryEditorBox();
		new CommonActions().runBtn();
		new CommonActions().outputText(); //sudha added
		new ArrayPage_pom().submitBtn(); //sudha added
		new CommonActions().outputText(); //sudha added
		new CommonActions().navigateBack();

		new ArrayPage_pom().maxConsOnesBtn();
		new CommonActions().navigateBack();

		new ArrayPage_pom().evenNoOfDigitsBtn();
		new CommonActions().navigateBack();

		new ArrayPage_pom().sqOfSortedArrayBtn();
		new CommonActions().navigateBack();

	}

	@When("^User clicks array button for wrong input and gives (.*) and gets (.*)$")
	public void user_clicks_array_button_for_wrong_input_and_gives_errorInput_and_gets_errorMsg(String errorInput,
			String errorMsg) throws InterruptedException {

		new ArrayPage_pom().getStarted_Arrays();
		new ArrayPage_pom().arraysPythonBtn();
		new CommonActions().tryAndRunInvalid(errorInput);
		new ArrayPage_pom().navigateBackAP();

		new ArrayPage_pom().arraysListBtn();
		new CommonActions().tryAndRunInvalid(errorInput);
		new ArrayPage_pom().navigateBackAP();

		new ArrayPage_pom().basicOperationBtn();
		new CommonActions().tryAndRunInvalid(errorInput);
		new ArrayPage_pom().navigateBackAP();

		new ArrayPage_pom().applcnOfArrayBtn();
		new CommonActions().tryAndRunInvalid(errorInput);
		new CommonActions().navigateBack();

		new CommonActions().practiceQuesBtn();
		new ArrayPage_pom().searchArrayBtn();
		new CommonActions().navigateBack();

		new ArrayPage_pom().maxConsOnesBtn();
		new CommonActions().navigateBack();

		new ArrayPage_pom().evenNoOfDigitsBtn();
		new CommonActions().navigateBack();

		new ArrayPage_pom().sqOfSortedArrayBtn();
		new CommonActions().navigateBack();

	}

}
