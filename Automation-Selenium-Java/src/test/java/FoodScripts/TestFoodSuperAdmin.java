package FoodScripts;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.Xls_Reader;

import Base.BaseClass;
import FoodPage.FoodSuperAdmin;

import org.openqa.selenium.By;

public class TestFoodSuperAdmin extends BaseClass{
	
protected Xls_Reader d = new Xls_Reader(user_dir + "\\src\\main\\java\\Resources\\ExcelSheets\\TestData.xlsx");
int row_number,expectedDMU;
String foodname,calcium,calories,protein,carbs,fats,iron,sodium,fiber,sugars,cholesterol,saturatedFat,vitaminC,vitaminA,potassium;
String imagePath = user_dir + "\\src\\SikuliImages\\Image_One_Sikuli.png";

	@BeforeMethod
	public void startWebdriverSession()
	{
		logger.info("Calling the Base Class 'Start Session' method from 'TestSuperAdmin' Class");
	    driver = BaseClass.getClonnedDriver();
	   
	}
	
	@Parameters({"sheetName"})
	@Test(priority=2)
	public void testSuperAdmin(String sheetName) throws InterruptedException
	{
		
		row_number = TestFoodCreate.row_count;
		
		foodname = d.getCellData(sheetName, "FoodName", row_number);
		calories = d.getCellData(sheetName, "Calories", row_number);
		protein = d.getCellData(sheetName, "Protein", row_number) + " g";
		carbs = d.getCellData(sheetName, "Carbs", row_number) + " g";
		fats = d.getCellData(sheetName, "Fats", row_number) + " g";
		iron = d.getCellData(sheetName, "Iron", row_number) + " mg";
		sodium = d.getCellData(sheetName, "Sodium", row_number) + " mg";
		fiber = d.getCellData(sheetName, "Fiber", row_number) + " g";
		sugars = d.getCellData(sheetName, "Sugars", row_number) + " g";
		cholesterol = d.getCellData(sheetName, "Cholesterol", row_number) + " mg";
		saturatedFat = d.getCellData(sheetName, "SaturatedFat", row_number) + " g";
	    vitaminC = d.getCellData(sheetName, "VitaminC", row_number) + " mg";
		potassium = d.getCellData(sheetName, "Potassium", row_number) + " mg";
		calcium = d.getCellData(sheetName, "Calcium", row_number) + " mg";
		vitaminA= d.getCellData(sheetName, "VitaminA", row_number) + " IU";
		
				
		FoodSuperAdmin foodSuperAdmin = new FoodSuperAdmin(driver);
		foodSuperAdmin.openFoodSuperAdminPage();
		foodSuperAdmin.searchAndSelectFood(foodname);
		
				
		/*********************************************************************************************************************************************************************/
		
		logger.info("Starting verifying the food details with test data in excel");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		/*****************************************************ASSERT THE NUTRIENTS VALUES************************************************************************************/
				
		Assert.assertEquals(calories,driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[2]/p")).getText(),"Unable to match calories");
		Assert.assertEquals(protein,driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[3]/p")).getText(),"Unable to match protein");
		Assert.assertEquals(carbs, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[4]/p")).getText(),"Unable to match carbs");
		Assert.assertEquals(fats, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[5]/p")).getText(),"Unable to match fats");
		Assert.assertEquals(iron, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[6]/p")).getText(),"Unable to match iron" );
		Assert.assertEquals(calcium, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[7]/p")).getText(),"Unable to match calcium");
		Assert.assertEquals(sodium, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[8]/p")).getText(),"Unable to match sodium");
		Assert.assertEquals(fiber, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[9]/p")).getText(),"Unable to match fiber");
		Assert.assertEquals(sugars, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[10]/p")).getText(),"Unable to match sugars");
		Assert.assertEquals(cholesterol, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[11]/p")).getText(),"Unable to match cholestrol");
		Assert.assertEquals(saturatedFat, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[12]/p")).getText(),"Unable to match saturatedFat");
		Assert.assertEquals(vitaminA, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[13]/p")).getText(),"Unable to match vitaminA");
		Assert.assertEquals(vitaminC, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[14]/p")).getText(),"Unable to match vitaminC");
		Assert.assertEquals(potassium, driver.findElement(By.xpath("//*[@id='foodApprovalForm']/div[3]/div/ul/li[3]/ul/li[15]/p")).getText(),"Unable to match potassium");
		
		logger.info("Verifying whether correct image is uploaded or not");
		//Screen s = new Screen();
		
		logger.info("Verifying the presence of image...");
		/*s.wait(imagePath);
		s.exists(imagePath);*/
			
	}
	
	
	@AfterMethod
	public void stopWebdriverSession()
	{
		logger.info("Calling the DriverCopy from 'TestSuperAdmin'");
		BaseClass.driverCopy();
	}

}
