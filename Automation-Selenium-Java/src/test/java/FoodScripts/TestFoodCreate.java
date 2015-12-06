package FoodScripts;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseClass;
import FoodPage.FoodCreate;
 

public class TestFoodCreate extends BaseClass{
	
	public static int row_count;
	
	@BeforeSuite
	public void startWebdriverSession()
	{
		logger.info("Calling the Base Class 'Start Session' method from 'TestFoodCreate' Class");
		startSession();
		row_count=1;
	}
		
	@BeforeMethod
	public void incrementRowNumber()
	{
		row_count++;
	}
	
	@Parameters({"sheetName"})
	@Test(priority=1)
	public void testCreateFood(String sheetName)
	
	{
		
		FoodCreate foodCreate = new FoodCreate(driver);
		foodCreate.clickFoodTab();
		Assert.assertTrue(verifyTextPresent("CREATE NEW FOOD"), "The Title of the Create Food Page is not available or incorrect");
		foodCreate.createFoodWithAllProperFields(row_count,sheetName);
		foodCreate.clickSubmitForApproval();
		Assert.assertEquals(verifyTextPresent("Food submitted for approval."), true, "'Food Submitted for Approval' message has not been shown after clicking the Approval button");
		
	}
	
	
	@AfterMethod
	public void stopWebdriverSession()
	{
		BaseClass.driverCopy();
	}
	
	
	
	
	

	
	
	
	

}
