package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class RegisterPage_pom extends BaseClass {

	By regBtnFromRegPage = By.xpath("//input[@value='Register']");
	By userNameBtn = By.xpath("//input[@name='username']");
	By passwordBtn = By.xpath("//input[@name='password1']");
	By passwordConfirmation = By.xpath("//input[@name='password2']");

	public regBtnForRegPage regBtnFromRegPage() {

		driver.findElement(regBtnFromRegPage).click();
		return new regBtnForRegPage();

	}

	public RegisterPage_pom userNameBtn(String userName) {

		driver.findElement(userNameBtn).sendKeys(userName);
		return this;

	}

	public RegisterPage_pom passwordBtn(String password) {

		driver.findElement(passwordBtn).sendKeys(password);
		return this;

	}

	public RegisterPage_pom userNameBtnClear() {

		driver.findElement(userNameBtn).clear();
		return this;

	}

	public RegisterPage_pom passwordBtnClear() {

		driver.findElement(passwordBtn).clear();
		return this;

	}

	public RegisterPage_pom passwordConfirmation(String password) {

		driver.findElement(passwordConfirmation).sendKeys(password);
		return this;

	}

}
