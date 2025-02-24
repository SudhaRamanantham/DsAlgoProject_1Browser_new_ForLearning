package stepDefinition;

import PageObjects.TreePage_pom;
import Utilities.BaseClass;
import Utilities.CommonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreePage_sd extends BaseClass {

	@Given("User now in the home page before loging in to test tree data structure")
	public void user_now_in_the_home_page_before_loging_in_to_test_tree_data_structure() {

		new CommonActions().homePageUrl();

	}

	@When("User loged in from logIn pageto test tree data structure")
	public void user_loged_in_from_log_in_pageto_test_tree_data_structure() {

		new CommonActions().login();

	}

	@Then("User successfully logged in now to test tree data structure")
	public void user_successfully_logged_in_now_to_test_tree_data_structure() {

		new CommonActions().msgText();

	}

	@When("^User test the tree data structure with simple python code (.*) and gives (.*)$")
	public void user_test_the_tree_data_structure_with_simple_python_code_print_and_gives_expected_output(String input,
			String expectedOutput) throws InterruptedException {

		new TreePage_pom().treeGetStartedBtn();
		new TreePage_pom().treeOverviewOfTrees();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeTerminologies();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeTypesOfTrees();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeTraversals();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeTraversalsIllustration();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeBinaryTrees();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeTypesOfBinary();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeImpInPython();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeBinaryTreeTrav();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeImpBinaryTree();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeAppBinaryTree();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeBinarySrcTrees();
		new CommonActions().tryAndRunValid(input);
		new TreePage_pom().navigateBackTP().treeImpOfBST();
		new CommonActions().tryAndRunValid(input);
		new CommonActions().navigateBack();
		new CommonActions().practiceQuesBtn();

	}

	@When("^User test the tree data structure with wrong python code (.*) and gives (.*)$")
	public void user_test_the_tree_data_structure_with_wrong_python_code_and_gives_error(String wrongInput,
			String errorMsg) throws InterruptedException {

		new TreePage_pom().treeGetStartedBtn();
		new TreePage_pom().treeOverviewOfTrees();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeTerminologies();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeTypesOfTrees();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeTraversals();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeTraversalsIllustration();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeBinaryTrees();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeTypesOfBinary();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeImpInPython();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeBinaryTreeTrav();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeImpBinaryTree();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeAppBinaryTree();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeBinarySrcTrees();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new TreePage_pom().navigateBackTP().treeImpOfBST();
		new CommonActions().tryAndRunInvalid(wrongInput);
		new CommonActions().navigateBack();
		new CommonActions().practiceQuesBtn();

	}

}
