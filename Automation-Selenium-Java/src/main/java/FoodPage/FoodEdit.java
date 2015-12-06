package FoodPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Utils.Xls_Reader;

public class FoodEdit extends BaseClass{



	private WebDriver driver;
	public FoodEdit(WebDriver driver) 
	{
		this.driver = driver;
	}
	


	public void clickEditFood()
	{
		logger.info("Clicking on UMP Food Tab");
		driver.findElement(By.id("_umpAdmin_WAR_UMPportlet_tabs1foodTabsId")).click();
		logger.info("Clicking on UMP Food Edit Radio Button");
		driver.findElement(By.id("edit-food")).click();
	}
	
	public void searchAndSelectFood(String foodName)
	{
	logger.info("Clicking Search box to clear & enter food name");
	driver.findElement(By.id("searchBox")).clear();
	driver.findElement(By.id("searchBox")).sendKeys(foodName);
	logger.info("Waiting for food in search results");
	logger.info("Selecting & clicking food from search results");
	driver.findElement(By.linkText(foodName)).click();
	logger.info("Waiting for food details to display");
	}
	
	
	
	

}
