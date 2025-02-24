package stepDefinition;

import PageObjects.HomePage_pom;
import Utilities.BaseClass;
import Utilities.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePage_sd extends BaseClass {

	@Given("User opens the dsportal page")
	public void user_opens_the_dsportal_page() {

		new CommonActions().dsPortalUrl();

	}

	@When("User exploring the home page without logging in")
	public void user_exploring_the_home_page_without_logging_in() {

		new HomePage_pom().getStartedBtn();
		new HomePage_pom().dataStrDropDownBtn().anyGetStartedBtn();

		new CommonActions().msgText();

		new HomePage_pom().dataStrDropDownBtn().dataStrDropDownBtn_item();

		new CommonActions().msgText();
		new CommonActions().signInBtn();

		new HomePage_pom().regBtnFromLogInPage();

	}

}
