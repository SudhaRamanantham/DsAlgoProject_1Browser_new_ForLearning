package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class QueuePage_pom extends BaseClass {

	By queueGetStartedBtn = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[5]//a");
	String queuePageUrl = "https://dsportalapp.herokuapp.com/queue/";
	By queueImplementQBtn = By.xpath("//a[text()='Implementation of Queue in Python']");
	By queueImpCollectionBtn = By.xpath("//a[text()='Implementation using collections.deque']");
	By queueImpArrayBtn = By.xpath("//a[text()='Implementation using array']");
	By queueOperationBtn = By.xpath("//a[text()='Queue Operations']");

	By practiceQuesBtn = By.xpath("//a[text()='Practice Questions']");

	public queueGetStartedBtnInside queueGetStartedBtn() {

		driver.findElement(queueGetStartedBtn).click();
		return new queueGetStartedBtnInside();

	}

	public QueuePage_pom queueImplementQBtn() {

		driver.findElement(queueImplementQBtn).click();
		return this;

	}

	public QueuePage_pom navigateBackQP() {

		driver.navigate().to(queuePageUrl);
		return this;

	}

	public QueuePage_pom queueImpCollectionBtn() {

		driver.findElement(queueImpCollectionBtn).click();
		return this;

	}

	public QueuePage_pom queueImpArrayBtn() {

		driver.findElement(queueImpArrayBtn).click();
		return this;

	}

	public QueuePage_pom queueOperationBtn() {

		driver.findElement(queueOperationBtn).click();
		return this;

	}

}
