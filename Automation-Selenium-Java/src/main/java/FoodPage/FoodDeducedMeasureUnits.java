package FoodPage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseClass;

public class FoodDeducedMeasureUnits extends BaseClass{
	
	private WebDriver driver;
	public int numberOfDeducedMeasurementUnits;
	
	
	/********************************** Sets of MU with Non-Zero Wt *************************/
	public static Set<String> actualDeducedMeasuringUnitsOfCup = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfMl = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfTsp = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfPinch = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfDash = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfTbsp = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfFloz = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfPnt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfQt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfLiter = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfGallon = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfG = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfOz = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfLb = new HashSet<String>();
	
	
	/********************************** Sets of MU with Zero Wt *************************/
	public static Set<String> actualDeducedMeasuringUnitsOfCupZeroWt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfMlZeroWt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfTspZeroWt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfPinchZeroWt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfDashZeroWt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfTbspZeroWt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfFlozZeroWt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfPntZeroWt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfQtZeroWt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfLiterZeroWt = new HashSet<String>();
	public static Set<String> actualDeducedMeasuringUnitsOfGallonZeroWt = new HashSet<String>();
	
	
	
	public Set<String> expectedDeducedMeasuringUnits = new HashSet<String>();
	

	

	
	/****************************************** PMU WITH NON-ZERO WEIGHT ******************************************/
	
	public FoodDeducedMeasureUnits(WebDriver driver)
	{
	this.driver = driver;
	}
	
	
	public FoodDeducedMeasureUnits()
	{

	}
	

	public static final Set<String> ActualMeasuringUnitsOfCup()
	{
		Iterator<String> i = actualDeducedMeasuringUnitsOfCup.iterator();
		while (i.hasNext()) 
		{
        i.remove();
		}
		
		actualDeducedMeasuringUnitsOfCup.add("tsp");
		actualDeducedMeasuringUnitsOfCup.add("tbsp");
		actualDeducedMeasuringUnitsOfCup.add("ml");
		actualDeducedMeasuringUnitsOfCup.add("fl-oz");
		actualDeducedMeasuringUnitsOfCup.add("pnt");
		actualDeducedMeasuringUnitsOfCup.add("qt");
		actualDeducedMeasuringUnitsOfCup.add("liter");
		actualDeducedMeasuringUnitsOfCup.add("gallon");
		actualDeducedMeasuringUnitsOfCup.add("g");
		actualDeducedMeasuringUnitsOfCup.add("lb");
		actualDeducedMeasuringUnitsOfCup.add("oz");
		
		return actualDeducedMeasuringUnitsOfCup;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfMl()

	{
		Iterator<String> i = actualDeducedMeasuringUnitsOfMl.iterator();
		while (i.hasNext()) 
		{
        i.remove();
		}
		
		actualDeducedMeasuringUnitsOfMl.add("tsp");
		actualDeducedMeasuringUnitsOfMl.add("tbsp");
		actualDeducedMeasuringUnitsOfMl.add("fl-oz");
		actualDeducedMeasuringUnitsOfMl.add("cup");
		actualDeducedMeasuringUnitsOfMl.add("pnt");
		actualDeducedMeasuringUnitsOfMl.add("liter");
		actualDeducedMeasuringUnitsOfMl.add("g");
		actualDeducedMeasuringUnitsOfMl.add("lb");
		actualDeducedMeasuringUnitsOfMl.add("oz");
		
		return actualDeducedMeasuringUnitsOfMl;
	}
	
	
	public static final  Set<String> ActualMeasuringUnitsOfTsp()
	{
		actualDeducedMeasuringUnitsOfTsp.add("pinch");
		actualDeducedMeasuringUnitsOfTsp.add("tbsp");
		actualDeducedMeasuringUnitsOfTsp.add("fl-oz");
		actualDeducedMeasuringUnitsOfTsp.add("ml");
		actualDeducedMeasuringUnitsOfTsp.add("cup");
		actualDeducedMeasuringUnitsOfTsp.add("g");
		actualDeducedMeasuringUnitsOfTsp.add("lb");
		actualDeducedMeasuringUnitsOfTsp.add("oz");
		actualDeducedMeasuringUnitsOfTsp.add("dash");
		
		return actualDeducedMeasuringUnitsOfTsp;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfPinch()
	{
		actualDeducedMeasuringUnitsOfPinch.add("tsp");
		actualDeducedMeasuringUnitsOfPinch.add("tbsp");
		actualDeducedMeasuringUnitsOfPinch.add("dash");
		actualDeducedMeasuringUnitsOfPinch.add("g");
		actualDeducedMeasuringUnitsOfPinch.add("lb");
		actualDeducedMeasuringUnitsOfPinch.add("oz");
		
		return actualDeducedMeasuringUnitsOfPinch;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfDash()
	{
		actualDeducedMeasuringUnitsOfDash.add("tsp");
		actualDeducedMeasuringUnitsOfDash.add("tbsp");
		actualDeducedMeasuringUnitsOfDash.add("pinch");
		actualDeducedMeasuringUnitsOfDash.add("g");
		actualDeducedMeasuringUnitsOfDash.add("lb");
		actualDeducedMeasuringUnitsOfDash.add("oz");
		
		return actualDeducedMeasuringUnitsOfDash;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfTbsp()
	{
		actualDeducedMeasuringUnitsOfTbsp.add("tsp");
		actualDeducedMeasuringUnitsOfTbsp.add("pinch");
		actualDeducedMeasuringUnitsOfTbsp.add("ml");
		actualDeducedMeasuringUnitsOfTbsp.add("fl-oz");
		actualDeducedMeasuringUnitsOfTbsp.add("pnt");
		actualDeducedMeasuringUnitsOfTbsp.add("cup");;
		actualDeducedMeasuringUnitsOfTbsp.add("g");
		actualDeducedMeasuringUnitsOfTbsp.add("lb");
		actualDeducedMeasuringUnitsOfTbsp.add("oz");
		actualDeducedMeasuringUnitsOfTbsp.add("dash");
		
		return actualDeducedMeasuringUnitsOfTbsp;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfFloz()
	{
		actualDeducedMeasuringUnitsOfFloz.add("tsp");
		actualDeducedMeasuringUnitsOfFloz.add("tbsp");
		actualDeducedMeasuringUnitsOfFloz.add("ml");
		actualDeducedMeasuringUnitsOfFloz.add("cup");
		actualDeducedMeasuringUnitsOfFloz.add("pnt");
		actualDeducedMeasuringUnitsOfFloz.add("qt");;
		actualDeducedMeasuringUnitsOfFloz.add("g");
		actualDeducedMeasuringUnitsOfFloz.add("lb");
		actualDeducedMeasuringUnitsOfFloz.add("oz");
		
		return actualDeducedMeasuringUnitsOfFloz;
	}
	
		
	public static final Set<String> ActualMeasuringUnitsOfPnt()
	{
		actualDeducedMeasuringUnitsOfPnt.add("tsp");
		actualDeducedMeasuringUnitsOfPnt.add("tbsp");
		actualDeducedMeasuringUnitsOfPnt.add("ml");
		actualDeducedMeasuringUnitsOfPnt.add("fl-oz");
		actualDeducedMeasuringUnitsOfPnt.add("cup");
		actualDeducedMeasuringUnitsOfPnt.add("qt");;
		actualDeducedMeasuringUnitsOfPnt.add("liter");
		actualDeducedMeasuringUnitsOfPnt.add("gallon");
		actualDeducedMeasuringUnitsOfPnt.add("g");
		actualDeducedMeasuringUnitsOfPnt.add("lb");
		actualDeducedMeasuringUnitsOfPnt.add("oz");
		
		return actualDeducedMeasuringUnitsOfPnt;
	}
	
		
	public static final Set<String> ActualMeasuringUnitsOfQt()
	{
		actualDeducedMeasuringUnitsOfQt.add("ml");
		actualDeducedMeasuringUnitsOfQt.add("fl-oz");
		actualDeducedMeasuringUnitsOfQt.add("cup");
		actualDeducedMeasuringUnitsOfQt.add("pnt");;
		actualDeducedMeasuringUnitsOfQt.add("liter");
		actualDeducedMeasuringUnitsOfQt.add("gallon");
		actualDeducedMeasuringUnitsOfQt.add("g");
		actualDeducedMeasuringUnitsOfQt.add("lb");
		actualDeducedMeasuringUnitsOfQt.add("oz");
		
		return actualDeducedMeasuringUnitsOfQt;
	}
	
		
	public static final Set<String> ActualMeasuringUnitsOfLiter()
	{
		actualDeducedMeasuringUnitsOfLiter.add("ml");
		actualDeducedMeasuringUnitsOfLiter.add("fl-oz");
		actualDeducedMeasuringUnitsOfLiter.add("cup");
		actualDeducedMeasuringUnitsOfLiter.add("pnt");
		actualDeducedMeasuringUnitsOfLiter.add("qt");
		actualDeducedMeasuringUnitsOfLiter.add("gallon");
		actualDeducedMeasuringUnitsOfLiter.add("g");
		actualDeducedMeasuringUnitsOfLiter.add("lb");
		actualDeducedMeasuringUnitsOfLiter.add("oz");
		
		return actualDeducedMeasuringUnitsOfLiter;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfGallon()
	{
		actualDeducedMeasuringUnitsOfGallon.add("cup");
		actualDeducedMeasuringUnitsOfGallon.add("pnt");
		actualDeducedMeasuringUnitsOfGallon.add("qt");
		actualDeducedMeasuringUnitsOfGallon.add("liter");
		actualDeducedMeasuringUnitsOfGallon.add("g");
		actualDeducedMeasuringUnitsOfGallon.add("lb");
		actualDeducedMeasuringUnitsOfGallon.add("oz");
		
		return actualDeducedMeasuringUnitsOfGallon;
	}
	

	public static final Set<String> ActualMeasuringUnitsOfG()
	{
		actualDeducedMeasuringUnitsOfG.add("lb");
		actualDeducedMeasuringUnitsOfG.add("oz");
		
		return actualDeducedMeasuringUnitsOfG;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfOz()
	{

		actualDeducedMeasuringUnitsOfOz.add("g");
		actualDeducedMeasuringUnitsOfOz.add("lb");
		
		return actualDeducedMeasuringUnitsOfOz;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfLb()
	{

		actualDeducedMeasuringUnitsOfLb.add("g");
		actualDeducedMeasuringUnitsOfLb.add("oz");
		
		return actualDeducedMeasuringUnitsOfLb;
	}


	
	/*********************************************** PMU WITH ZERO WEIGHT *************************************************/
	
	public static final Set<String> ActualMeasuringUnitsOfCupZeroWt()
	{
		actualDeducedMeasuringUnitsOfCupZeroWt.add("tsp");
		actualDeducedMeasuringUnitsOfCupZeroWt.add("tbsp");
		actualDeducedMeasuringUnitsOfCupZeroWt.add("ml");
		actualDeducedMeasuringUnitsOfCupZeroWt.add("fl-oz");
		actualDeducedMeasuringUnitsOfCupZeroWt.add("pnt");
		actualDeducedMeasuringUnitsOfCupZeroWt.add("qt");
		actualDeducedMeasuringUnitsOfCupZeroWt.add("liter");
		actualDeducedMeasuringUnitsOfCupZeroWt.add("gallon");
			
		return actualDeducedMeasuringUnitsOfCupZeroWt;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfMlZeroWt()

	{
		actualDeducedMeasuringUnitsOfMlZeroWt.add("tsp");
		actualDeducedMeasuringUnitsOfMlZeroWt.add("tbsp");
		actualDeducedMeasuringUnitsOfMlZeroWt.add("fl-oz");
		actualDeducedMeasuringUnitsOfMlZeroWt.add("cup");
		actualDeducedMeasuringUnitsOfMlZeroWt.add("pnt");
		actualDeducedMeasuringUnitsOfMlZeroWt.add("liter");
				
		return actualDeducedMeasuringUnitsOfMlZeroWt;
	}
	
	
	public static final  Set<String> ActualMeasuringUnitsOfTspZeroWt()
	{
		actualDeducedMeasuringUnitsOfTspZeroWt.add("pinch");
		actualDeducedMeasuringUnitsOfTspZeroWt.add("tbsp");
		actualDeducedMeasuringUnitsOfTspZeroWt.add("fl-oz");
		actualDeducedMeasuringUnitsOfTspZeroWt.add("ml");
		actualDeducedMeasuringUnitsOfTspZeroWt.add("cup");
		actualDeducedMeasuringUnitsOfTspZeroWt.add("dash");
		
		return actualDeducedMeasuringUnitsOfTspZeroWt;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfPinchZeroWt()
	{
		actualDeducedMeasuringUnitsOfPinchZeroWt.add("tsp");
		actualDeducedMeasuringUnitsOfPinchZeroWt.add("tbsp");
		actualDeducedMeasuringUnitsOfPinchZeroWt.add("dash");
		
		return actualDeducedMeasuringUnitsOfPinchZeroWt;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfDashZeroWt()
	{
		actualDeducedMeasuringUnitsOfDashZeroWt.add("tsp");
		actualDeducedMeasuringUnitsOfDashZeroWt.add("tbsp");
		actualDeducedMeasuringUnitsOfDashZeroWt.add("pinch");
				
		return actualDeducedMeasuringUnitsOfDashZeroWt;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfTbspZeroWt()
	{
		actualDeducedMeasuringUnitsOfTbspZeroWt.add("tsp");
		actualDeducedMeasuringUnitsOfTbspZeroWt.add("pinch");
		actualDeducedMeasuringUnitsOfTbspZeroWt.add("ml");
		actualDeducedMeasuringUnitsOfTbspZeroWt.add("fl-oz");
		actualDeducedMeasuringUnitsOfTbspZeroWt.add("pnt");
		actualDeducedMeasuringUnitsOfTbspZeroWt.add("cup");;
		actualDeducedMeasuringUnitsOfTbspZeroWt.add("dash");
		
		return actualDeducedMeasuringUnitsOfTbspZeroWt;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfFlozZeroWt()
	{
		actualDeducedMeasuringUnitsOfFlozZeroWt.add("tsp");
		actualDeducedMeasuringUnitsOfFlozZeroWt.add("tbsp");
		actualDeducedMeasuringUnitsOfFlozZeroWt.add("ml");
		actualDeducedMeasuringUnitsOfFlozZeroWt.add("cup");
		actualDeducedMeasuringUnitsOfFlozZeroWt.add("pnt");
		actualDeducedMeasuringUnitsOfFlozZeroWt.add("qt");;
				
		return actualDeducedMeasuringUnitsOfFlozZeroWt;
	}
	
		
	public static final Set<String> ActualMeasuringUnitsOfPntZeroWt()
	{
		actualDeducedMeasuringUnitsOfPntZeroWt.add("tsp");
		actualDeducedMeasuringUnitsOfPntZeroWt.add("tbsp");
		actualDeducedMeasuringUnitsOfPntZeroWt.add("ml");
		actualDeducedMeasuringUnitsOfPntZeroWt.add("fl-oz");
		actualDeducedMeasuringUnitsOfPntZeroWt.add("cup");
		actualDeducedMeasuringUnitsOfPntZeroWt.add("qt");;
		actualDeducedMeasuringUnitsOfPntZeroWt.add("liter");
		actualDeducedMeasuringUnitsOfPntZeroWt.add("gallon");
			
		return actualDeducedMeasuringUnitsOfPntZeroWt;
	}
	
		
	public static final Set<String> ActualMeasuringUnitsOfQtZeroWt()
	{
		actualDeducedMeasuringUnitsOfQtZeroWt.add("ml");
		actualDeducedMeasuringUnitsOfQtZeroWt.add("fl-oz");
		actualDeducedMeasuringUnitsOfQtZeroWt.add("cup");
		actualDeducedMeasuringUnitsOfQtZeroWt.add("pnt");;
		actualDeducedMeasuringUnitsOfQtZeroWt.add("liter");
		actualDeducedMeasuringUnitsOfQtZeroWt.add("gallon");
			
		return actualDeducedMeasuringUnitsOfQtZeroWt;
	}
	
		
	public static final Set<String> ActualMeasuringUnitsOfLiterZeroWt()
	{
		actualDeducedMeasuringUnitsOfLiterZeroWt.add("ml");
		actualDeducedMeasuringUnitsOfLiterZeroWt.add("fl-oz");
		actualDeducedMeasuringUnitsOfLiterZeroWt.add("cup");
		actualDeducedMeasuringUnitsOfLiterZeroWt.add("pnt");
		actualDeducedMeasuringUnitsOfLiterZeroWt.add("qt");
		actualDeducedMeasuringUnitsOfLiterZeroWt.add("gallon");
				
		return actualDeducedMeasuringUnitsOfLiterZeroWt;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfGallonZeroWt()
	{
		actualDeducedMeasuringUnitsOfGallonZeroWt.add("cup");
		actualDeducedMeasuringUnitsOfGallonZeroWt.add("pnt");
		actualDeducedMeasuringUnitsOfGallonZeroWt.add("qt");
		actualDeducedMeasuringUnitsOfGallonZeroWt.add("liter");
				
		return actualDeducedMeasuringUnitsOfGallonZeroWt;
	}
	

	/********************************************** MISC TEST CASES**************************************************/
	

	
	public static final Set<String> ActualMeasuringUnitsOfOthers()
	{

		Set<String> ActualMeasuringUnitsOfOthers = new HashSet<String>();
		
		ActualMeasuringUnitsOfOthers.add("g");
		ActualMeasuringUnitsOfOthers.add("lb");
		ActualMeasuringUnitsOfOthers.add("oz");
		
		return ActualMeasuringUnitsOfOthers;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfCupParamterNonZeroWt()
	{
		
		Set<String> ActualMeasuringUnitsOfCupParamterNonZeroWt = new HashSet<String>();
		
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("tsp, slivered");
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("tbsp, slivered");
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("ml, slivered");
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("fl-oz, slivered");
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("pnt, slivered");
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("qt, slivered");;
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("liter, slivered");
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("gallon, slivered");
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("g");
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("lb");
		ActualMeasuringUnitsOfCupParamterNonZeroWt.add("oz");
		
		return ActualMeasuringUnitsOfCupParamterNonZeroWt;
	}
	
	public static final Set<String> ActualMeasuringUnitsOfCupParamterZeroWt()
	{
		
		Set<String> ActualMeasuringUnitsOfCupParamterZeroWt = new HashSet<String>();
		
		ActualMeasuringUnitsOfCupParamterZeroWt.add("tsp, slivered");
		ActualMeasuringUnitsOfCupParamterZeroWt.add("tbsp, slivered");
		ActualMeasuringUnitsOfCupParamterZeroWt.add("ml, slivered");
		ActualMeasuringUnitsOfCupParamterZeroWt.add("fl-oz, slivered");
		ActualMeasuringUnitsOfCupParamterZeroWt.add("pnt, slivered");
		ActualMeasuringUnitsOfCupParamterZeroWt.add("qt, slivered");;
		ActualMeasuringUnitsOfCupParamterZeroWt.add("liter, slivered");
		ActualMeasuringUnitsOfCupParamterZeroWt.add("gallon, slivered");

		
		return ActualMeasuringUnitsOfCupParamterZeroWt;
	}

	
	public static final Set<String> ActualMeasuringUnitsOfTspParamterNonZeroWt()
	{
		
		Set<String> ActualMeasuringUnitsOfTspParamterNonZeroWt = new HashSet<String>();
		
		ActualMeasuringUnitsOfTspParamterNonZeroWt.add("pinch, crumbled");
		ActualMeasuringUnitsOfTspParamterNonZeroWt.add("tbsp, crumbled");
		ActualMeasuringUnitsOfTspParamterNonZeroWt.add("ml, crumbled");
		ActualMeasuringUnitsOfTspParamterNonZeroWt.add("fl-oz, crumbled");
		ActualMeasuringUnitsOfTspParamterNonZeroWt.add("cup, crumbled");
		ActualMeasuringUnitsOfTspParamterNonZeroWt.add("dash, crumbled");;
		ActualMeasuringUnitsOfTspParamterNonZeroWt.add("g");
		ActualMeasuringUnitsOfTspParamterNonZeroWt.add("lb");
		ActualMeasuringUnitsOfTspParamterNonZeroWt.add("oz");
		
		return ActualMeasuringUnitsOfTspParamterNonZeroWt;
	}
	
	
	public static final Set<String> ActualMeasuringUnitsOfTspParamterZeroWt()
	{
		
		Set<String> ActualMeasuringUnitsOfTspParamterZeroWt = new HashSet<String>();
		
		ActualMeasuringUnitsOfTspParamterZeroWt.add("pinch, crumbled");
		ActualMeasuringUnitsOfTspParamterZeroWt.add("tbsp, crumbled");
		ActualMeasuringUnitsOfTspParamterZeroWt.add("ml, crumbled");
		ActualMeasuringUnitsOfTspParamterZeroWt.add("fl-oz, crumbled");
		ActualMeasuringUnitsOfTspParamterZeroWt.add("cup, crumbled");
		ActualMeasuringUnitsOfTspParamterZeroWt.add("dash, crumbled");;
			
		return ActualMeasuringUnitsOfTspParamterZeroWt;
	}
	
	
	
	
	
	
	
	
	
	
	public  void checkDMUValues()
	{
		
	numberOfDeducedMeasurementUnits = driver.findElement(By.id("createMeasureUnitBody")).getText().split("\r\n|\r|\n").length;
	
		Iterator<String> i = expectedDeducedMeasuringUnits.iterator();
		while (i.hasNext()) 
		{
        i.remove();
		}
	
	 	for (int count = 1;count<=numberOfDeducedMeasurementUnits;count++)
	 	{
		expectedDeducedMeasuringUnits.add(driver.findElement(By.xpath("//*[@id='createMeasureUnitBody']/tr["+count+"]/td[1]")).getText());
	 	}
	}



}
