package FoodPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.HasInputDevices;
import org.openqa.selenium.Mouse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

import Utils.Xls_Reader;
import Base.BaseClass;
public class FoodCreate extends BaseClass{
protected Xls_Reader d = new Xls_Reader(user_dir + "\\src\\main\\java\\Resources\\ExcelSheets\\TestData.xlsx");


	private WebDriver driver;
	public FoodCreate(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void createFoodWithAllProperFields(int row_number, String sheetName)
	{
		
		
		/************************************************** STARTED CREATING FOOD,DESCRIPTION,QTY AND PMU ******************************************************/
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Started Creating Foods");
		
		driver.findElement(By.id("foodName")).sendKeys(d.getCellData(sheetName,"FoodName",row_number));
		logger.info("Food Inserted");
		
		driver.findElement(By.id("food.link")).sendKeys(d.getCellData(sheetName,"Link",row_number));
		logger.info("Inserted the Food Value");
		
		driver.findElement(By.id("description")).sendKeys(d.getCellData(sheetName,"Description",row_number));
		logger.info("Inserted the Description");
		
		
		/********************************* Inserting PMU *********************************/
		
		driver.findElement(By.id("food.quantity")).clear();
		driver.findElement(By.id("food.quantity")).sendKeys(d.getCellData(sheetName,"Quantity",row_number));
		logger.info("Inserted Food Quantity");
		
		driver.findElement(By.id("measuringUnitControl")).sendKeys(d.getCellData(sheetName,"PrimaryMeasuringUnit",row_number));
		logger.info("Inserted measure Unit");
		
		if ((d.getCellData(sheetName,"PrimaryMeasuringUnit",row_number)).equalsIgnoreCase("custom")){
		driver.findElement(By.id("foodBaseMeasureUnitCode")).sendKeys(d.getCellData(sheetName,"Abbrev",row_number));}
		
		driver.findElement(By.id("food_ounceWeight")).clear();
		driver.findElement(By.id("food_ounceWeight")).sendKeys(d.getCellData(sheetName,"Weight",row_number));
		logger.info("Inserted Weight");
		
		
		/********************************* Inserting DMU **********************************/
		
		if (d.getColumnCount(sheetName) > 25)
		{
			driver.findElement(By.id("showAdditionalMeasures")).click();
			
			driver.findElement(By.id("foodAdditionalMeasures_0_AbbrevSelect")).sendKeys(d.getCellData(sheetName,"AMU",row_number));
			
			if ((d.getCellData(sheetName,"AMU",row_number)).equalsIgnoreCase("custom")){
				driver.findElement(By.id("foodAdditionalMeasures_0_Abbrev")).sendKeys(d.getCellData(sheetName,"AmuAbbrev",row_number));}
			
			System.out.println("The value of Quantity is"+d.getCellData(sheetName,"AmuQty",row_number));
			
			driver.findElement(By.id("foodAdditionalMeasures_0_quantity")).clear();
			driver.findElement(By.id("foodAdditionalMeasures_0_ounceWgt")).clear();
			
			driver.findElement(By.id("foodAdditionalMeasures_0_quantity")).sendKeys(d.getCellData(sheetName,"AmuQty",row_number));
			driver.findElement(By.id("foodAdditionalMeasures_0_ounceWgt")).sendKeys(d.getCellData(sheetName,"AmuWt",row_number));
			
		}
		
		
		
		
		
		
			if((d.getCellData(sheetName,"IsSupplement",row_number).equalsIgnoreCase("Yes")))
		{driver.findElement(By.id("food.supplement1")).click();
		logger.info("Clicked on Is Supplement");}
			else
			{ logger.info("Did not click 'Is Supplement' radio button");
			}
			
			
			/************************************************** CLICKING EDIT TAGS ******************************************************/	
		
		logger.info("Clicking on Edit Tags");
		driver.findElement(By.id("editTags")).click();
		
		logger.info("Clicking on Food Aversion Tag");
		driver.findElement(By.cssSelector("option[value='2338609']")).click();
		
		logger.info("Clicking on the Values of Food Acersion Tag Groups");
		driver.findElement(By.cssSelector("option[value='2338624']")).click();  /*Fish and Shell Fish*/
		driver.findElement(By.cssSelector("option[value='2338625']")).click();  /*Gluten*/
		driver.findElement(By.cssSelector("option[value='2338626']")).click();	/*Dairy and Lactose*/
		driver.findElement(By.cssSelector("option[value='2338627']")).click();  /*Nuts*/
		driver.findElement(By.cssSelector("option[value='2338628']")).click();  /*Pork and Ham*/
		driver.findElement(By.cssSelector("option[value='2338629']")).click();	/*Red Meat*/
		driver.findElement(By.cssSelector("option[value='2338630']")).click();	/*Soy*/
		driver.findElement(By.cssSelector("option[value='2350386']")).click();	/*Poultry*/
		driver.findElement(By.cssSelector("option[value='2350387']")).click();	/*Eggs*/
		logger.info("Clicked on All Food Categories");
		
		/************************************************** CLICKING CATEGORY TAG GROUP ******************************************************/
		logger.info("Clicking on Category");
		driver.findElement(By.cssSelector("option[value='2341146']")).click();
				
		logger.info("Clicking on the Category Values");
		if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Alcohol"))
		{
			driver.findElement(By.cssSelector("option[value='2341149']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Already In Your Pantry?"))
		{
			driver.findElement(By.cssSelector("option[value='2341150']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Frozen Foods"))
		{
			driver.findElement(By.cssSelector("option[value='2341151']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Baking/Dry Goods"))
		{
			driver.findElement(By.cssSelector("option[value='2341152']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Beachbody Products"))
		{
			driver.findElement(By.cssSelector("option[value='2341153']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Beverages"))
		{
			driver.findElement(By.cssSelector("option[value='2341154']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Bread/Bakery"))
		{
			driver.findElement(By.cssSelector("option[value='2341155']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Canned Goods"))
		{
			driver.findElement(By.cssSelector("option[value='2341156']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Cereals"))
		{
			driver.findElement(By.cssSelector("option[value='2341157']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Meat/Poultry/Fish"))
		{
			driver.findElement(By.cssSelector("option[value='2341158']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Chips &amp; Snacks"))
		{
			driver.findElement(By.cssSelector("option[value='2341159']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Condiments"))
		{
			driver.findElement(By.cssSelector("option[value='2341160']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Dairy &amp; Eggs"))
		{
			driver.findElement(By.cssSelector("option[value='2341161']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Pasta &amp; Sauce"))
		{
			driver.findElement(By.cssSelector("option[value='2341163']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Produce"))
		{
			driver.findElement(By.cssSelector("option[value='2341164']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Salad Dressings"))
		{
			driver.findElement(By.cssSelector("option[value='2341165']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Spices &amp; Herbs"))
		{
			driver.findElement(By.cssSelector("option[value='2341166']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Deli"))
		{
			driver.findElement(By.cssSelector("option[value='2351212']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Ethnic Foods"))
		{
			driver.findElement(By.cssSelector("option[value='2351213']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Meat Alternatives"))
		{
			driver.findElement(By.cssSelector("option[value='2351214']")).click();
		}
		else if (d.getCellData(sheetName,"Category",row_number).equalsIgnoreCase("Nutrition Supplements"))
		{
			driver.findElement(By.cssSelector("option[value='2351215']")).click();
		}
		
		logger.info("Closing the tag Groups Pop up");
		driver.findElement(By.id("close")).click();
		
		
		/************************************************** UPDATING NUTRIENTS******************************************************/
		logger.info("Updating the Values of Nutrients");
		
		driver.findElement(By.id("calories")).clear();
		driver.findElement(By.id("calories")).sendKeys(d.getCellData(sheetName,"Calories",row_number));
		
		driver.findElement(By.id("protein")).clear();
		driver.findElement(By.id("protein")).sendKeys(d.getCellData(sheetName,"Protein",row_number));
		
		driver.findElement(By.id("carbs")).clear();
		driver.findElement(By.id("carbs")).sendKeys(d.getCellData(sheetName,"Carbs",row_number));
		
		driver.findElement(By.id("food.fat")).clear();
		driver.findElement(By.id("food.fat")).sendKeys(d.getCellData(sheetName,"Fats",row_number));
		
		driver.findElement(By.id("food.iron")).clear();
		driver.findElement(By.id("food.iron")).sendKeys(d.getCellData(sheetName,"Iron",row_number));
		
		driver.findElement(By.id("food.calcium")).clear();
		driver.findElement(By.id("food.calcium")).sendKeys(d.getCellData(sheetName,"Calcium",row_number));
		
		driver.findElement(By.id("food.sodium")).clear();
		driver.findElement(By.id("food.sodium")).sendKeys(d.getCellData(sheetName,"Sodium",row_number));
		
		driver.findElement(By.id("food.fiber")).clear();
		driver.findElement(By.id("food.fiber")).sendKeys(d.getCellData(sheetName,"Fiber",row_number));
		
		driver.findElement(By.id("food.sugar")).clear();
		driver.findElement(By.id("food.sugar")).sendKeys(d.getCellData(sheetName,"Sugars",row_number));
		
		driver.findElement(By.id("food.cholesterol")).clear();
		driver.findElement(By.id("food.cholesterol")).sendKeys(d.getCellData(sheetName,"Cholesterol",row_number));
		
		driver.findElement(By.id("food.saturatedFat")).clear();
		driver.findElement(By.id("food.saturatedFat")).sendKeys(d.getCellData(sheetName,"SaturatedFat",row_number));
		
		driver.findElement(By.id("food.vitaminA")).clear();
		driver.findElement(By.id("food.vitaminA")).sendKeys(d.getCellData(sheetName,"VitaminA",row_number));
		
		driver.findElement(By.id("food.vitaminC")).clear();
		driver.findElement(By.id("food.vitaminC")).sendKeys(d.getCellData(sheetName,"VitaminC",row_number));
		
		driver.findElement(By.id("food.potassium")).clear();
		driver.findElement(By.id("food.potassium")).sendKeys(d.getCellData(sheetName,"Potassium",row_number));
		
		/************************************************** ATTACH A FILE ******************************************************/
		Locatable hoverItem = (Locatable) driver.findElement(By.id("upload_image_button"));
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		Coordinates c = hoverItem.getCoordinates();
		mouse.mouseMove(c);
		  
		//driver.findElement(By.id("upload_image_button")).sendKeys(user_dir +"\\src\\main\\java\\Resources\\Images\\ImageOne.jpg");
		driver.findElement(By.id("upload_image_button")).sendKeys("C:\\Users\\xebia\\Desktop");
		
		
			
	}
	/************************************************** CLICKING SUBMIT FOR APPROVAL BUTTON ******************************************************/
	public void clickSubmitForApproval()
	{
		driver.findElement(By.id("submitButton")).click();	
	}
	
	/************************************************** CLICKING SUBMIT FOR APPROVAL AND COPY ******************************************************/
	public void clickSubmitForApprovalAndCopy()
	{
		//((JavascriptExecutor)driver).executeScript("submitAndCopy()");
		driver.findElement(By.cssSelector("input[type='button'][value='Submit for Approval & Copy']")).click();
	}
	
	/************************************************** CLICKING CLEAR BUTTON ******************************************************/
	public void clickClear()
	{
		driver.findElement(By.id("clear")).click();
	}
	
	/************************************************** CLICKING FOOD TAB ******************************************************/
	public void clickFoodTab()
	{
		driver.findElement(By.id("_umpAdmin_WAR_UMPportlet_tabs1foodTabsId")).click();
	}
	

	

}
