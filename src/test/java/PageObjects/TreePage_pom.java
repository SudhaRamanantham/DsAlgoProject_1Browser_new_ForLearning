package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class TreePage_pom extends BaseClass {

	By treeGetStartedBtn = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[6]//a");
	String treePageUrl = "https://dsportalapp.herokuapp.com/tree/";
	By treeOverviewOfTrees = By.xpath("//a[text()='Overview of Trees']");
	By treeTerminologies = By.xpath("//a[text()='Terminologies']");
	By treeTypesOfTrees = By.xpath("//a[text()='Types of Trees']");
	By treeTraversals = By.xpath("//a[text()='Tree Traversals']");
	By treeTraversalsIllustration = By.xpath("//a[text()='Traversals-Illustration']");
	By treeBinaryTrees = By.xpath("//a[text()='Binary Trees']");
	By treeTypesOfBinary = By.xpath("//a[text()='Types of Binary Trees']");
	By treeImpInPython = By.xpath("//a[text()='Implementation in Python']");
	By treeBinaryTreeTrav = By.xpath("//a[text()='Binary Tree Traversals']");
	By treeImpBinaryTree = By.xpath("//a[text()='Implementation of Binary Trees']");
	By treeAppBinaryTree = By.xpath("//a[text()='Applications of Binary trees']");
	By treeBinarySrcTrees = By.xpath("//a[text()='Binary Search Trees']");
	By treeImpOfBST = By.xpath("//a[text()='Implementation Of BST']");
	By practiceQuesBtn = By.xpath("//a[text()='Practice Questions']");

	public treeGetStartedBtnArL treeGetStartedBtn() {

		driver.findElement(treeGetStartedBtn).click();
		return new treeGetStartedBtnArL();

	}

	public TreePage_pom navigateBackTP() {

		driver.navigate().to(treePageUrl);
		return this;

	}

	public TreePage_pom treeOverviewOfTrees() {

		driver.findElement(treeTerminologies).click();
		return this;

	}

	public TreePage_pom treeTerminologies() {

		driver.findElement(treeTerminologies).click();
		return this;

	}

	public TreePage_pom treeTypesOfTrees() {

		driver.findElement(treeTypesOfTrees).click();
		return this;

	}

	public TreePage_pom treeTraversals() {

		driver.findElement(treeTraversals).click();
		return this;

	}

	public TreePage_pom treeTraversalsIllustration() {

		driver.findElement(treeTraversalsIllustration).click();
		return this;

	}

	public TreePage_pom treeBinaryTrees() {

		driver.findElement(treeBinaryTrees).click();
		return this;

	}

	public TreePage_pom treeTypesOfBinary() {

		driver.findElement(treeTypesOfBinary).click();
		return this;

	}

	public TreePage_pom treeImpInPython() {

		driver.findElement(treeImpInPython).click();
		return this;

	}

	public TreePage_pom treeBinaryTreeTrav() {

		driver.findElement(treeBinaryTreeTrav).click();
		return this;

	}

	public TreePage_pom treeImpBinaryTree() {

		driver.findElement(treeImpBinaryTree).click();
		return this;

	}

	public TreePage_pom treeAppBinaryTree() {

		driver.findElement(treeAppBinaryTree).click();
		return this;

	}

	public TreePage_pom treeBinarySrcTrees() {

		driver.findElement(treeBinarySrcTrees).click();
		return this;

	}

	public TreePage_pom treeImpOfBST() {

		driver.findElement(treeImpOfBST).click();
		return this;

	}

}
