package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class HomePage_pom extends BaseClass {

	By getStartedBtn = By.xpath("//button[text()='Get Started']");
	By dataStrDropDownBtn = By.xpath("//a[@class=\"nav-link dropdown-toggle\"]");
	By anyGetStartedBtn = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[1]//a");
	By dataStrDropDownBtn_item = By.xpath("//a[text()='Arrays']");
	By regBtnFromLogInPage = By.xpath("//a[text()='Register!']");

	public getStartedBtnBfL getStartedBtn() {

		driver.findElement(getStartedBtn).click();
		return new getStartedBtnBfL();

	}

	public HomePage_pom dataStrDropDownBtn() {

		driver.findElement(dataStrDropDownBtn).click(); // We are in -> https://dsportalapp.herokuapp.com/home
		return this;

	}

	public HomePage_pom anyGetStartedBtn() {

		driver.findElement(anyGetStartedBtn).click();
		return this;

	}

	public HomePage_pom dataStrDropDownBtn_item() {

		driver.findElement(dataStrDropDownBtn_item).click(); // It will show -> You are not logged in
		return this;

	}

	public regBtnFromLogInPageBrL regBtnFromLogInPage() {

		driver.findElement(regBtnFromLogInPage).click();
		return new regBtnFromLogInPageBrL();

	}

}
