package stepDefinition;

import PageObjects.RegisterPage_pom;
import Utilities.BaseClass;
import Utilities.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPage_sd extends BaseClass {

	@Given("User is in the register page")
	public void user_is_in_the_register_page() {

		new CommonActions().registerPageUrl();

	}

	@When("Exploring the register page")
	public void exploring_the_register_page() {

		new RegisterPage_pom().regBtnFromRegPage()

				.userNameBtn("Ann").regBtnFromRegPage().userNameBtn("Ann").passwordBtn("Ann1234").regBtnFromRegPage()

				.userNameBtnClear().userNameBtn("!#*$").regBtnFromRegPage().passwordBtnClear().passwordBtn("Ann1234")
				.passwordConfirmation("Ann1234").regBtnFromRegPage()

				.userNameBtn("!#*$").passwordBtn("Ann1234").passwordConfirmation("Ann123456").regBtnFromRegPage()

				.userNameBtn("!#*$").passwordBtn("Ann12").passwordConfirmation("Ann12").regBtnFromRegPage()

				.userNameBtn("!#*$").passwordBtn("12345678").passwordConfirmation("12345678").regBtnFromRegPage()

				.userNameBtn("TechieNinjas").passwordBtn("Techie@132").passwordConfirmation("Techie@132")
				.regBtnFromRegPage();

	}

	@Then("User created account succesfully")
	public void User_created_account_succesfully() {

		new CommonActions().msgText();

	}

}
