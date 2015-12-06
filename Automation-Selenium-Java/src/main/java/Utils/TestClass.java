package Utils;
import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.HasInputDevices;
import org.openqa.selenium.Keyboard;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Mouse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.seleniumemulation.AltKeyDown;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;

import Base.BaseClass;

public class TestClass extends BaseClass{

	//public Xls_Reader d = new Xls_Reader(user_dir + "\\src\\main\\java\\Resources\\ExcelSheets\\TestData.xlsx");
	
	@Test
	public void abc() throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",user_dir + "\\src\\ExternalJars\\chromedriver_win_23.0.1240.0\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get(getProperty("baseurl_staging"));
		driver.manage().window().maximize();
		
		logger.info("Clicking on the Sign In Link");
		driver.findElement(By.cssSelector(getProperty("sign_in_link"))).click();
		
		logger.info("Logging In with Username and Password");
		driver.findElement(By.name(getProperty("username"))).sendKeys(getProperty("uname"));
		driver.findElement(By.name(getProperty("password"))).sendKeys(getProperty("pwd"));
		
		logger.info("Clicking on Submit Button");
		driver.findElement(By.xpath(getProperty("submit_button"))).click();
		
		logger.info("Clicking on the Control Panel");
		driver.findElement(By.linkText("Control Panel")).click();
		
		logger.info("Clicking on UMP ADMIN Link");
		driver.findElement(By.xpath("//*[@id='panel-manage-content']/div[2]/ul/li[37]/a")).click();
		logger.info("Opened the UMP Admin site");
		
		System.out.println("first");
		
		
		Locatable hoverItem = (Locatable) driver.findElement(By.cssSelector("button#upload_image_button"));
	
		  Mouse mouse = ((HasInputDevices) driver).getMouse();
		  mouse.mouseMove(hoverItem.getCoordinates());
	//	  mouse.mouseDown(hoverItem.getCoordinates());
		  mouse.click(hoverItem.getCoordinates());
		  
		  Thread.sleep(5000L);
		  
		  
		//  driver.findElement(By.cssSelector("input[type='file'][name='image']")).sendKeys("C:\\Users\\xebia\\Desktop\\abc.jpg");
		  
		  Keyboard k =((HasInputDevices) driver).getKeyboard();
		/*  k.sendKeys("C:\\Users\\xebia\\Desktop\\abc.jpg");*/
	//	  k.pressKey(Keys.valueOf("C:\\Users\\xebia\\Desktop\\abc.jpg"));
	Actions b =new Actions(driver);
	b.keyDown(Keys.NUMPAD2);
	Selenium selenium = new WebDriverBackedSelenium(driver, "http://qump-appso2.dc1.beachbody.com:8080");
	String locator = "css=button#upload_image_button";
	String filename = "C:/Users/xebia/Desktop/abc.jpg";
	selenium.attachFile(locator,filename);
		 
		//  k.pressKey(Keys.NUMPAD3);
		/*  k.pressKey(Keys.ESCAPE);*/
		
		  
		/*WebElement element =   driver.findElement(By.id("imagePreviewDiv"));
		org.openqa.selenium.Point p = element.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println(x);
		System.out.println(y);
		
		Actions clicker = new Actions(driver);
		clicker.moveByOffset(x,y).click();
		clicker.moveToElement(element,x,y).click();
		clicker.
	//	clicker.moveToElement(element).moveByOffset(x,y).click().perform();
		//element.sendKeys("C:\\Users\\xebia\\Desktop\\abc.jpg");
	
		  
			System.out.println("second");
	*/
	
	}
	
}
