package FoodScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseClass;
import FoodPage.FoodEdit;
import Utils.Xls_Reader;

public class TestFoodEdit extends BaseClass{
	
protected Xls_Reader d = new Xls_Reader(user_dir + "\\src\\main\\java\\Resources\\ExcelSheets\\TestData.xlsx");
	

	@BeforeMethod
	public void startWebdriverSession()
	{
		logger.info("Calling the Base Class 'Start Session' method from 'TestSuperAdmin' Class");
		driver = BaseClass.getClonnedDriver();
	}
	
	@Parameters({"sheetName"})
	@Test
	public void testEditFoodScreen(String sheetName)
	{
		
		int row_number = TestFoodCreate.row_count;
		String foodName = d.getCellData(sheetName,"FoodName",row_number);
		
		FoodEdit foodEdit = new FoodEdit(driver);
		foodEdit.clickEditFood();
		foodEdit.searchAndSelectFood(foodName);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
					
/*	//	Assert.assertEquals(driver.findElement(By.id("foodName")).getAttribute("value"), d.getCellData(sheetName,"FoodName",row_number), "FoodName is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food.link")).getAttribute("value"), d.getCellData(sheetName,"Link",row_number), "Link is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("description")).getAttribute("value"), d.getCellData(sheetName,"Description",row_number), "Description is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_quantity")).getAttribute("value"), d.getCellData(sheetName,"Quantity",row_number), "Quantity is not mathcing with the actual Value");
	//	Assert.assertEquals(driver.findElement(By.id("measuringUnitControl")).getAttribute("value"), d.getCellData(sheetName,"MeasuringUnit",row_number), "MeasuringUnit is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_ounceWeight")).getAttribute("value"), d.getCellData(sheetName,"Weight",row_number), "Weight is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("foodSupplement")).getAttribute("value"), (d.getCellData(sheetName,"IsSupplement",row_number).toLowerCase()), "IsSupplement is not mathcing with the actual Value");*/
		
		Assert.assertEquals(driver.findElement(By.id("calories")).getAttribute("value"), d.getCellData(sheetName,"Calories",row_number), "Calories is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("protein")).getAttribute("value"), d.getCellData(sheetName,"Protein",row_number), "Protein is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("carbs")).getAttribute("value"), d.getCellData(sheetName,"Carbs",row_number), "Carbs is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_fat")).getAttribute("value"), d.getCellData(sheetName,"Fats",row_number), "Fats is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_iron")).getAttribute("value"), d.getCellData(sheetName,"Iron",row_number), "Iron is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_calcium")).getAttribute("value"), d.getCellData(sheetName,"Calcium",row_number), "Calcium is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_sodium")).getAttribute("value"), d.getCellData(sheetName,"Sodium",row_number), "Sodium is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_fiber")).getAttribute("value"), d.getCellData(sheetName,"Fiber",row_number), "Fiber is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_sugars")).getAttribute("value"), d.getCellData(sheetName,"Sugars",row_number), "Sugars is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_cholesterol")).getAttribute("value"), d.getCellData(sheetName,"Cholesterol",row_number), "Cholesterol is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_saturatedFat")).getAttribute("value"), d.getCellData(sheetName,"SaturatedFat",row_number), "SaturatedFat is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_vitaminA")).getAttribute("value"), d.getCellData(sheetName,"VitaminA",row_number), "VitaminA is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_vitaminC")).getAttribute("value"), d.getCellData(sheetName,"VitaminC",row_number), "VitaminC is not mathcing with the actual Value");
		Assert.assertEquals(driver.findElement(By.id("food_potassium")).getAttribute("value"), d.getCellData(sheetName,"Potassium",row_number), "Potassium is not mathcing with the actual Value");
		
	
	}
}
