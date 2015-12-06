package FoodScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import FoodPage.FoodDeducedMeasureUnits;
import FoodPage.FoodSuperAdmin;

public class TestFoodDeducedMeasureUnits extends BaseClass{
	
	int expectedDMU,ActualDeducedMeasureUnits;	
	WebDriver driver;
	FoodDeducedMeasureUnits fdmu;
	FoodSuperAdmin fsa;
	
	@BeforeMethod
	public void BeforeMethod()
	{
		 driver = BaseClass.getClonnedDriver();		
		 fdmu = new FoodDeducedMeasureUnits(driver);
		 fsa = new FoodSuperAdmin(driver);
	}
	
	/******************************************* Create Sets of Drop Down PMU with NON-ZERO Weight *************************************************/
	@Test
	public void testDMUOfCup()
	{
		
		
		expectedDMU = 11;
		System.out.println("Expected DUM  is"+expectedDMU);
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of cup are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfCup()),true,"Deduced Measurement Units of CUP are not according to the Primary Measurement Unit");
		
		for (int counter=1;counter<=expectedDMU;counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(), "The Quantity entered in the Create Food Screen for CUP is not equal in the Approval Screen");
		
		}
	}
	
		
	@Test
	public void testDMUOfMl()
	{
			
		expectedDMU = 9;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of ML are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfMl()),true,"Deduced Measurement Units of ML are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for ML is not equal in the Approval Screen");
		}
	}
	
		
	@Test
	public void testDMUOfTsp()
	{
		
		
		expectedDMU= 9;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of TSP are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfTsp()),true,"Deduced Measurement Units of TSP are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for TSP is not equal in the Approval Screen");
		}
	}
	
		
	@Test
	public void testDMUOfPinch()
	{
		
		expectedDMU= 6;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of PINCH are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfPinch()),true,"Deduced Measurement Units of PINCH are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for PINCH is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfDash()
	{
		
		expectedDMU= 6;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of DASH are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfDash()),true,"Deduced Measurement Units of DASH are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for DASH is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfTbsp()
	{
		
		expectedDMU= 10;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of TBSP are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfTbsp()),true,"Deduced Measurement Units of TBSP are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for TBSP is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfFloz()
	{
		
		expectedDMU= 9;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of FLOZ are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfFloz()),true,"Deduced Measurement Units of FLOZ are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for FLOZ is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfPnt()
	{
		
		expectedDMU= 11;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of PNT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfPnt()),true,"Deduced Measurement Units of PNT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for PNT is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfQt()
	{
		
		expectedDMU= 9;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of QT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfQt()),true,"Deduced Measurement Units of QT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for QT is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfLiter()
	{
		
		expectedDMU= 9;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of LITER are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfLiter()),true,"Deduced Measurement Units of LITER are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for LITER is not equal in the Approval Screen");
		}
	}
		
	
	@Test
	public void testDMUOfGallon()
	{
		expectedDMU= 7;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of GALLON are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfGallon()),true,"Deduced Measurement Units of GALLON are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for GALLON is not equal in the Approval Screen");
		}
	}

	
	@Test
	public void testDMUOfG()
	{
		expectedDMU= 2;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of GRAM are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfG()),true,"Deduced Measurement Units of GRAM are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for GRAM is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfOz()
	{
		expectedDMU= 2;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of OZ are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfOz()),true,"Deduced Measurement Units of OZ are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for OZ is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfLb()
	{
		expectedDMU= 2;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of LB are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfLb()),true,"Deduced Measurement Units of LB are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for LB is not equal in the Approval Screen");
		}
	}
	
	/******************************************* Create Sets of Custom PMU with ZERO Weight *************************************************/
	
	
	@Test
	public void testDMUOfCupZeroWt()
	{
		
		
		expectedDMU = 8;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of CUP WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfCupZeroWt()),true,"Deduced Measurement Units of CUP WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter=1;counter<=expectedDMU;counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(), "The Quantity entered in the Create Food Screen for CUP WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
		
	@Test
	public void testDMUOfMlZeroWt()
	{
			
		expectedDMU = 6;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of ML  WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfMlZeroWt()),true,"Deduced Measurement Units of ML WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for ML WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
		
	@Test
	public void testDMUOfTspZeroWt()
	{
		
		
		expectedDMU= 6;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of TSP WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfTspZeroWt()),true,"Deduced Measurement Units of TSP WITH ZERO WTare  not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for TSP WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
		
	@Test
	public void testDMUOfPinchZeroWt()
	{
		
		expectedDMU= 3;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of PINCH WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfPinchZeroWt()),true,"Deduced Measurement Units of PINCH WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for PINCH WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfDashZeroWt()
	{
		expectedDMU= 3;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of DASH WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfDashZeroWt()),true,"Deduced Measurement Units of DASH WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for DASH WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfTbspZeroWt()
	{
		
		expectedDMU= 7;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of TBSP WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfTbspZeroWt()),true,"Deduced Measurement Units of  TBSP WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for TBSP WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfFlozZeroWt()
	{
		
		expectedDMU= 6;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of FLOZ WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfFlozZeroWt()),true,"Deduced Measurement Units of FLOZ WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for FLOZ WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfPntZeroWt()
	{
		
		expectedDMU= 8;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of PNT WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfPntZeroWt()),true,"Deduced Measurement Units of PNT WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for PNT WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfQtZeroWt()
	{
		
		expectedDMU= 6;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of QT WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfQtZeroWt()),true,"Deduced Measurement Units of QT WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for QT WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfLiterZeroWt()
	{
		
		expectedDMU= 6;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of LITER WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfLiterZeroWt()),true,"Deduced Measurement Units of LITER WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for LITER WITH ZERO WT is not equal in the Approval Screen");
		}
	}
		
	
	@Test
	public void testDMUOfGallonZeroWt()
	{
		expectedDMU= 4;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of GALLON WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfGallonZeroWt()),true,"Deduced Measurement Units of GALLON WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter =1 ;counter<=expectedDMU; counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(),"The Quantity entered in the Create Food Screen for GALLON WITH ZERO WT is not equal in the Approval Screen");
		}
	}

	
	
	/****************************************** MISC FOOD CREATE TEST CASES ***********************************************/
	
		
	@Test
	public void testDMUOfOthersNonZeroWt()
	{
		expectedDMU = 3;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of BOX WITH NON ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfOthers()),true,"Deduced Measurement Units of BOX WITH NON-ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter=1;counter<=expectedDMU;counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(), "The Quantity entered in the Create Food Screen for BOX WITH NON-ZERO WT is not equal in the Approval Screen");
		}
	}

	
	@Test
	public void testDMUOfOthersZeroWt()
	{
		expectedDMU = 0;
		Assert.assertEquals(driver.getPageSource().contains("createMeasureUnitBody"), false, "There should be No Measure units shown in the Super Admin Page for this Food");
	}


	@Test
	public void testDMUOfTspSuffixNonZeroWt()
	{
		expectedDMU = 9;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of TSP WITH SUFFIX WITH NON ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfTspParamterNonZeroWt()),true,"Deduced Measurement Units of TSP WITH SUFFIX WITH NON-ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter=1;counter<=expectedDMU;counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(), "The Quantity entered in the Create Food Screen for TSP WITH SUFFIX WITH NON-ZERO WT is not equal in the Approval Screen");
		}
	}
	
	
	@Test
	public void testDMUOfTspSuffixZeroWt()
	{
		expectedDMU = 6;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of TSP WITH SUFFIX WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfTspParamterZeroWt()),true,"Deduced Measurement Units of TSP WITH SUFFIX WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter=1;counter<=expectedDMU;counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(), "The Quantity entered in the Create Food Screen for TSP WITH SUFFIX WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
	
	
	@Test
	public void testDMUOfCupSuffixNonZeroWt()
	{
		expectedDMU = 11;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of CUP WITH SUFFIX WITH NON ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfCupParamterNonZeroWt()),true,"Deduced Measurement Units of CUP WITH SUFFIX WITH NON-ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter=1;counter<=expectedDMU;counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(), "The Quantity entered in the Create Food Screen for CUP WITH SUFFIX WITH NON-ZERO WT is not equal in the Approval Screen");
		}
	}
	
	
	
	@Test
	public void testDMUOfCupSuffixZeroWt()
	{
		expectedDMU = 8;
		fdmu.checkDMUValues();
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The deduced measurement units of CUP WITH SUFFIX WITH ZERO WT are not equal to "+expectedDMU);
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.ActualMeasuringUnitsOfCupParamterZeroWt()),true,"Deduced Measurement Units of CUP WITH SUFFIX WITH ZERO WT are not according to the Primary Measurement Unit");
		
		for (int counter=1;counter<=expectedDMU;counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(), "The Quantity entered in the Create Food Screen for CUP WITH SUFFIX WITH ZERO WT is not equal in the Approval Screen");
		}
	}
	
	
	
	@Test
	public void testCupAsPmuDashAsAmu()
	{
		expectedDMU = 13;
		fdmu.checkDMUValues();
		
		Assert.assertEquals(fdmu.numberOfDeducedMeasurementUnits,expectedDMU,"The number of deduced measurement units of CUP as PMU and Ml as AMU are not equal to "+expectedDMU);
		
		FoodDeducedMeasureUnits.ActualMeasuringUnitsOfCup();
		FoodDeducedMeasureUnits.ActualMeasuringUnitsOfDash();
		FoodDeducedMeasureUnits.actualDeducedMeasuringUnitsOfCup.addAll(FoodDeducedMeasureUnits.actualDeducedMeasuringUnitsOfDash);
		FoodDeducedMeasureUnits.actualDeducedMeasuringUnitsOfCup.add("dash");
		System.out.println(FoodDeducedMeasureUnits.actualDeducedMeasuringUnitsOfCup);
		
		Assert.assertEquals(fdmu.expectedDeducedMeasuringUnits.equals(FoodDeducedMeasureUnits.actualDeducedMeasuringUnitsOfCup),true,"Deduced Measurement Units of CUP as PMU and Ml as AMU are not according to the Primary Measurement Unit");
				
		for (int counter=1;counter<=expectedDMU;counter++)
		{
			Assert.assertEquals("1.0",driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+counter+"]/td[2]")).getText(), "The Quantity entered in the Create Food Screen for CUP as PMU and Ml as AMU is not equal in the Approval Screen");
		}
	}
	
	
	
	
	
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException
	{
		
		fsa.clickToApproveFood();
		BaseClass.driverCopy();
	}
	
	
}
