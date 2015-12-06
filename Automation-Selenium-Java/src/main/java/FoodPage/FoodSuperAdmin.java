package FoodPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.BaseClass;


public class FoodSuperAdmin extends BaseClass{

	
		private WebDriver driver;
		public FoodSuperAdmin()
	{
		
	}
		
	public FoodSuperAdmin(WebDriver driver)
		{
		this.driver = driver;
		}


	public void openFoodSuperAdminPage()
		{
		logger.info("Clicking on UMP Super Admin Tab");
		driver.findElement(By.id("_umpAdmin_WAR_UMPportlet_tabs1superAdminTabsId")).click();		
		logger.info("Opened the Super Admin Page");
		}

	public void clickFoodRadioButton()
		{
		logger.info("Clicking on Food radio button");
		driver.findElement(By.id("foodButton")).click();
		logger.info("Opened the Food Super Admin Page");

		logger.info("Verifying that food radio button is still enabled");
		Assert.assertEquals("on", driver.findElement(By.id("foodButton")).getAttribute("value"),"FoodButton in Super Admin is not Clicked");
	    }
	
	public void clickRecipeRadioButton()
		{
		
		}
	
	public void clickMealRadioButton()
		{
	
		}

	public void searchAndSelectFood(String foodName) throws InterruptedException
		{
		logger.info("Clicking Search box to clear & enter food name");
		driver.findElement(By.id("searchBox")).clear();
		driver.findElement(By.id("searchBox")).sendKeys(foodName);
		logger.info("Waiting for food in search results");
		logger.info("Selecting & clicking food from search results");
		Thread.sleep(2000L);
		driver.findElement(By.linkText(foodName)).click();
		logger.info("Waiting for food details to display");
		}
	
	
	public void searchAndSelectRecipe(String recipeName)
		{
		logger.info("Clicking Search box to clear & enter food name");
		driver.findElement(By.id("searchBox")).clear();
		driver.findElement(By.id("searchBox")).sendKeys(recipeName);
		logger.info("Waiting for food in search results");
		logger.info("Selecting & clicking food from search results");
		driver.findElement(By.linkText(recipeName)).click();
		logger.info("Waiting for food details to display");
		}
	
	public void searchAndSelectMeal(String mealName)
		{
		logger.info("Clicking Search box to clear & enter food name");
		driver.findElement(By.id("searchBox")).clear();
		driver.findElement(By.id("searchBox")).sendKeys(mealName);
		logger.info("Waiting for food in search results");
		logger.info("Selecting & clicking food from search results");
		driver.findElement(By.linkText(mealName)).click();
		logger.info("Waiting for food details to display");
		}

	
	public void clickToRejectFood() 
		{
		
		logger.info("Clicking button to reject a food");
		driver.findElement(By.id("reject")).click();
		logger.info("Waiting for success message to display on food reject");
		Assert.assertEquals("Unable to see message on reject", "Food rejected successfully.", driver.findElement(By.id("success-flash")).getText());
		}
	
	public void clickToEditFood() 
		{
		
		logger.info("Clicking button to edit a food");
		driver.findElement(By.id("edit")).click();
		logger.info("Waiting for Super Admin -> Edit Food page to display food details");
		Assert.assertTrue(verifyTextPresent(driver.findElement(By.xpath("//*[@id='umpAdminForm']/div[3]/div[1]/ul/li[1]/dl/dt")).getText()));
		}
	
	public void clickToApproveFood() throws InterruptedException 
		{
		logger.info("Clicking button to approve a food");
		driver.findElement(By.id("approve")).click();
		logger.info("Waiting for success message to display on food approval");
		Thread.sleep(3000L);
		Assert.assertEquals(driver.findElement(By.id("success-flash")).getText(),"FOOD APPROVED SUCCESSFULLY.","Unable to see Approved Message on Approval Screen");
		
		}
}




