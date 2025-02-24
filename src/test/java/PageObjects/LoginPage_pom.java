package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class LoginPage_pom extends BaseClass {

	By signIn_userName = By.xpath("//input[@name='username']");
	By signIn_passwordBtn = By.xpath("//input[@name='password']");
	By loginBtn = By.xpath("//input[@value='Login']");

	public LoginPage_pom signIn_userName(String username) {

		driver.findElement(signIn_userName).sendKeys(username);
		return this;

	}

	public LoginPage_pom signIn_passwordBtn(String password) {

		driver.findElement(signIn_passwordBtn).sendKeys(password);
		return this;

	}

	public logInBtnArL loginBtn() {

		driver.findElement(loginBtn).click();
		return new logInBtnArL();

	}

}
