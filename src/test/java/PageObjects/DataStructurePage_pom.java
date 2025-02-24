package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class DataStructurePage_pom extends BaseClass {

	By DatastructuresGetStrtd = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[1]//div[1]//div[1]//a");
	By TimeComplexity = By.className("list-group-item");

	public DataStructuresPage DataStructuresGetStrtd() {
		
		driver.findElement(DatastructuresGetStrtd).click();
		return new DataStructuresPage();
		
	}

	public DataStructurePage_pom TimeComplexity() {
		
		driver.findElement(TimeComplexity).click();
		return this;
		
	}

}
