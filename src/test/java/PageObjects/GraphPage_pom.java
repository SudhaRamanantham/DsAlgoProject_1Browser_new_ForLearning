package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class GraphPage_pom extends BaseClass {

	By getStarted_graph = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[7]/div//a");
	By topic_graph = By.xpath(
			"//div[@style='margin-top: 40px;margin-bottom: 40px;margin-right: 150px;margin-left: 80px;background-color: ;']/ul[2]/a");
	By topic_graphRep = By.xpath("//a[text()='Graph Representations']");
	String graphPageURL = "https://dsportalapp.herokuapp.com/graph/";

	public getStarted_graphArL getStarted_graph() {

		driver.findElement(getStarted_graph).click();
		return new getStarted_graphArL();

	}

	public GraphPage_pom navigateBackGP() {

		driver.navigate().to(graphPageURL);
		return this;
		
	}

	public GraphPage_pom topic_graph() {

		driver.findElement(topic_graph).click();
		return this;

	}

	public GraphPage_pom topic_graphRep() {

		driver.findElement(topic_graphRep).click();
		return this;

	}

}
