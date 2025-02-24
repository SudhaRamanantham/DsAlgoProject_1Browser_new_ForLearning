package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class StackPage_pom extends BaseClass {

	String stackPageUrl = "https://dsportalapp.herokuapp.com/stack/";

	By StackGetStrtdBtn = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[4]//a");
	By OperationsInStackBtn = By.xpath("//a[text()='Operations in Stack']");
	By StackImplemantationBtn = By.xpath("//a[text()='Implementation']");
	By StackApplicationsBtn = By.xpath("//a[text()='Applications']");

	public getStarted_StackArL StackGetStrtdBtn() {

		driver.findElement(StackGetStrtdBtn).click();
		return new getStarted_StackArL();

	}

	public StackPage_pom OperationsInStackBtn() {

		driver.findElement(OperationsInStackBtn).click();
		return this;

	}

	public StackPage_pom navigateBackSP() {

		driver.navigate().to(stackPageUrl);
		return this;

	}

	public StackPage_pom StackImplemantationBtn() {

		driver.findElement(StackImplemantationBtn).click();
		return this;

	}

	public StackPage_pom StackApplicationsBtn() {

		driver.findElement(StackApplicationsBtn).click();
		return this;

	}

}
