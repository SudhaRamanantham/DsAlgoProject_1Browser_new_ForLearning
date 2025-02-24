package Utilities;

import org.openqa.selenium.By;

public class CommonActions extends BaseClass {

	String dsPortalUrl = "https://dsportalapp.herokuapp.com/";
	String registerPageUrl = "https://dsportalapp.herokuapp.com/register";
	String homePageUrl = "https://dsportalapp.herokuapp.com/home";
	String logInPageUrl = "https://dsportalapp.herokuapp.com/login";

	By tryHereBtn = By.xpath("//a[contains(text(),'Try here')]");
	By tryEditorBox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By runBtn = By.xpath("//button[text()='Run']");
	By outputText = By.xpath("//pre[@id='output']");

	By msgText = By.xpath("//div[@class='alert alert-primary']");

	By practiceQuesBtn = By.xpath("//a[text()='Practice Questions']");

	By signInBtn = By.xpath("//a[text()='Sign in']");

	By signInUsername = By.xpath("//input[@id='id_username']");
	By signInPassword = By.xpath("//input[@id='id_password']");
	By logInBtn = By.xpath("//input[@value='Login']");

	public CommonActions dsPortalUrl() {
		driver.get(dsPortalUrl);
		return this;
	}

	public CommonActions registerPageUrl() {
		driver.get(registerPageUrl);
		return this;
	}

	public CommonActions homePageUrl() {
		driver.get(homePageUrl);
		return this;
	}

	public CommonActions logInPageUrl() {
		driver.get(logInPageUrl);
		return this;
	}

	public CommonActions signInBtn() {
		driver.findElement(signInBtn).click();
		return this;
	}

	public CommonActions msgText() {
		driver.findElement(msgText).isDisplayed();
		return this;
	}

	public CommonActions login() {
		driver.findElement(signInBtn).click();
		driver.findElement(signInUsername).sendKeys("TechieNinjas");
		driver.findElement(signInPassword).sendKeys("Techie@132");
		driver.findElement(logInBtn).click();
		return this;
	}

	public CommonActions navigateBack() {
		driver.navigate().back();
		return this;
	}
	
	public CommonActions tryAndRunValid(String pyInput) throws InterruptedException {
		driver.findElement(tryHereBtn).click();
		Thread.sleep(300);
		driver.findElement(tryEditorBox).sendKeys(pyInput);
		driver.findElement(runBtn).click();
		driver.findElement(outputText).isDisplayed();
		return this;
	}

	public CommonActions tryAndRunInvalid(String wrongPyInput) throws InterruptedException {
		driver.findElement(tryHereBtn).click();
		Thread.sleep(300);
		driver.findElement(tryEditorBox).sendKeys(wrongPyInput);
		driver.findElement(runBtn).click();
		Thread.sleep(300);
		driver.switchTo().alert().accept();
		return this;
	}
	
	public CommonActions runBtn() throws InterruptedException {
		driver.findElement(runBtn).click();
		Thread.sleep(300);
		return this;
	}

	public CommonActions outputText() throws InterruptedException {
		driver.findElement(outputText).isDisplayed();
		Thread.sleep(300);
		return this;
	}
	
	public CommonActions practiceQuesBtn() {
		driver.findElement(practiceQuesBtn).click();
		return this;
	}

}
