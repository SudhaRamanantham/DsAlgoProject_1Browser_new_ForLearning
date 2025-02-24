package stepDefinition;

import PageObjects.GraphPage_pom;
import Utilities.BaseClass;
import Utilities.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphPage_sd extends BaseClass {

	@Given("User opens home page before login to test graphs")
	public void user_opens_home_page_before_login_to_test_graphs() {

		new CommonActions().logInPageUrl();

	}

	@When("User logged in from login page to test graphs")
	public void User_logged_in_from_login_page_to_test_graphs() {

		new CommonActions().login();
	}

	@Then("User successfully logged in now to test graphs")
	public void user_successfully_logged_in_now_to_test_graphs() {

		new CommonActions().msgText();

	}

	@When("^User tests graph page and enters (.*) in text editor box and gives (.*)$")
	public void user_tests_graph_page_and_enters_input_in_text_editor_box_and_gives_expectedOutput(String input,
			String expectedOutput) throws InterruptedException {

		new GraphPage_pom().getStarted_graph();
		new GraphPage_pom().topic_graph();
		new CommonActions().tryAndRunValid(input);
		new GraphPage_pom().navigateBackGP();
		new GraphPage_pom().topic_graphRep();
		new CommonActions().tryAndRunValid(input);

	}

	@When("^User clicks graph button for wrong input and gives (.*) and gets (.*)$")
	public void User_clicks_graph_button_for_wrong_input_and_gives_errorInput_and_gets_errorMsg(String errorInput,
			String errorMsg) throws InterruptedException {

		new GraphPage_pom().getStarted_graph();
		new GraphPage_pom().topic_graph();
		new CommonActions().tryAndRunInvalid(errorInput);
		new GraphPage_pom().navigateBackGP();
		new GraphPage_pom().topic_graphRep();
		new CommonActions().tryAndRunInvalid(errorInput);

	}

}
