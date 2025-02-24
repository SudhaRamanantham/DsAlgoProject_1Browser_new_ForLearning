package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class LinkedListPage_pom extends BaseClass {

	By linkedListGetstartedBtn = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[3]//a");
	By lLIntroBtn = By.xpath("//a[text()='Introduction']");

	String lLPageUrl = "https://dsportalapp.herokuapp.com/linked-list/";

	By lLCreateLlBtn = By.xpath("//a[text()='Creating Linked LIst']");
	By lLTypesLlBtn = By.xpath("//a[text()='Types of Linked List']");
	By lLImplementLlBtn = By.xpath("//a[text()='Implement Linked List in Python']");
	By lLTraversalBtn = By.xpath("//a[text()='Traversal']");
	By lLDeletionBtn = By.xpath("//a[text()='Deletion']");

	public linkedListGetstartedBtnArL linkedListGetstartedBtn() {

		driver.findElement(linkedListGetstartedBtn).click();
		return new linkedListGetstartedBtnArL();

	}

	public LinkedListPage_pom lLIntroBtn() {

		driver.findElement(lLIntroBtn).click();
		return this;

	}

	public LinkedListPage_pom navigateBackLlP() {

		driver.navigate().to(lLPageUrl);
		return this;

	}

	public LinkedListPage_pom lLCreateLlBtn() {

		driver.findElement(lLCreateLlBtn).click();
		return this;

	}

	public LinkedListPage_pom lLTypesLlBtn() {

		driver.findElement(lLTypesLlBtn).click();
		return this;

	}

	public LinkedListPage_pom lLImplementLlBtn() {

		driver.findElement(lLImplementLlBtn).click();
		return this;

	}

	public LinkedListPage_pom lLTraversalBtn() {

		driver.findElement(lLTraversalBtn).click();
		return this;

	}

	public LinkedListPage_pom lLDeletionBtn() {

		driver.findElement(lLDeletionBtn).click();
		return this;

	}

}
