package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Utilities.BaseClass;

public class ArrayPage_pom extends BaseClass {

	By getStarted_Arrays = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[2]//a");
	By arraysPythonBtn = By.xpath("//a[text()='Arrays in Python']");

	By arraysListBtn = By.xpath("//a[text()='Arrays Using List']");
	By basicOperationBtn = By.xpath("//a[text()='Basic Operations in Lists']");
	By applcnOfArrayBtn = By.xpath("//a[text()='Applications of Array']");

	By searchArrayBtn = By.xpath("//a[text()='Search the array']");
	By maxConsOnesBtn = By.xpath("//a[text()='Max Consecutive Ones']");
	By evenNoOfDigitsBtn = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	By sqOfSortedArrayBtn = By.xpath("//a[text()='Squares of  a Sorted Array']");

	String arrayPageURL = "https://dsportalapp.herokuapp.com/array/";

	By pracPage_tryEditorBox = By.cssSelector("div.CodeMirror textarea");
	By submitBtn = By.xpath("//input[@class='button']");

	public getStarted_ArraysArL getStarted_Arrays() {

		driver.findElement(getStarted_Arrays).click();
		return new getStarted_ArraysArL();

	}

	public ArrayPage_pom arraysPythonBtn() {

		driver.findElement(arraysPythonBtn).click();
		return this;

	}

	public ArrayPage_pom arraysListBtn() {

		driver.findElement(arraysListBtn).click();
		return this;

	}

	public ArrayPage_pom basicOperationBtn() {

		driver.findElement(basicOperationBtn).click();
		return this;

	}

	public ArrayPage_pom navigateBackAP() {

		driver.navigate().to(arrayPageURL);
		return this;
	}

	public ArrayPage_pom applcnOfArrayBtn() {

		driver.findElement(applcnOfArrayBtn).click();
		return this;

	}

	public searchtheArrayPage searchArrayBtn() {

		driver.findElement(searchArrayBtn).click();
		return new searchtheArrayPage();

	}

	public ArrayPage_pom maxConsOnesBtn() {

		driver.findElement(maxConsOnesBtn).click();
		return this;

	}

	public ArrayPage_pom evenNoOfDigitsBtn() {

		driver.findElement(evenNoOfDigitsBtn).click();
		return this;

	}

	public ArrayPage_pom sqOfSortedArrayBtn() {

		driver.findElement(sqOfSortedArrayBtn).click();
		return this;

	}

	public ArrayPage_pom pracPage_tryEditorBox() throws InterruptedException {

		driver.findElement(pracPage_tryEditorBox).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		driver.findElement(pracPage_tryEditorBox).sendKeys("def search(lst,value):", Keys.ENTER);
		driver.findElement(pracPage_tryEditorBox).sendKeys("if value in lst:", Keys.ENTER);
		driver.findElement(pracPage_tryEditorBox).sendKeys("return \"Element Found\"", Keys.ENTER);
		driver.findElement(pracPage_tryEditorBox).sendKeys("else:", Keys.ENTER);
		driver.findElement(pracPage_tryEditorBox).sendKeys("return \"Not Found\"", Keys.ENTER);
		driver.findElement(pracPage_tryEditorBox).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE);
		driver.findElement(pracPage_tryEditorBox).sendKeys("print(\"Check for found: \"+search([12,23,45,67,6,90],12))",
				Keys.ENTER);
		driver.findElement(pracPage_tryEditorBox)
				.sendKeys("print(\"Check for not found: \"+search([12,23,45,67,6,90],25))");

		Thread.sleep(300);

		return this;

	}

	public ArrayPage_pom submitBtn() throws InterruptedException {
		driver.findElement(submitBtn).click();
		Thread.sleep(300);
		return this;
	}

}
