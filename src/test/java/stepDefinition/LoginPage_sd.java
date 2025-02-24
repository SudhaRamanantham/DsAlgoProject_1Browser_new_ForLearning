package stepDefinition;

import PageObjects.LoginPage_pom;
import Utilities.BaseClass;
import Utilities.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_sd extends BaseClass {

	@Given("User enters login page")
	public void User_enters_login_page() {

		new CommonActions().logInPageUrl();
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {

		new LoginPage_pom().signIn_userName(username).signIn_passwordBtn(password).loginBtn();

	}

	@Then("User successfully logged in")
	public void User_successfully_logged_in() {

		new CommonActions().msgText();

	}

}
