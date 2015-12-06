package Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {
	
	public static WebDriver cloneDriver;
	public static WebDriver driver;
		
	String chrome = "chrome";
	String firefox = "firefox";
	String ie = "ie";
	String html = "html";
	
	protected String user_dir = System.getProperty("user.dir");
	protected Properties prop = new Properties();
	
	protected static final Logger logger = Logger.getLogger(BaseClass.class);
	static {DOMConfigurator.configure("src/main/java/Resources/Log4j/log4j.xml");}

	
	public static void driverCopy()
	 {
	  cloneDriver = driver;
	 }
	 
	 public static WebDriver getClonnedDriver() 
	 {
	 return cloneDriver;
	 }
	 
	 public static int rowNumber(int row)
	 {
		 return row;
	 }
	
	public String getProperty(String configItemName) 
	{
		try{
			FileInputStream f = new FileInputStream(user_dir + "\\src\\main\\java\\Resources\\Properties\\selenium.properties");
		    prop.load(f);
		   }
		catch(Exception e)
		   {
			e.getStackTrace();
	       }
		return prop.getProperty(configItemName);
	}
	
	

	public void startSession()
	{


		if (getProperty("browser").equalsIgnoreCase(firefox))
		{
			//System.setProperty(“webdriver.firefox.profile”, profileName);
			driver= new FirefoxDriver();
		}

		else if (getProperty("browser").equals(chrome))
		{
				
				System.setProperty("webdriver.chrome.driver",user_dir + "\\src\\ExternalJars\\chromedriver_win_23.0.1240.0\\chromedriver.exe" );
				driver =new ChromeDriver();
				logger.info("Chrome Browser called");
				
		}
		
		else if (getProperty("browser").equals(ie))
		{
				
			System.setProperty("webdriver.ie.driver",user_dir + "\\src\\ExternalJars\\IEDriverServer_x64_2.25.3\\IEDriverServer.exe" );
			logger.info("Starting Internet Explorer");
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();  
			
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(ieCapabilities);
			logger.info("Internet Browser called");
		}
		else if (getProperty("browser").equals(html))
		{
			logger.info("Starting HTML UNIT Driver");
			driver= new HtmlUnitDriver();
			logger.info("Started HTML UNIT Driver");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logger.info("Opening the Base URL");
		driver.get(getProperty("baseurl_qa"));
		
		
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
		driver.findElement(By.linkText("UMP Admin")).click();
		logger.info("Opened the UMP Admin site");
		
		
		
		
		

	}
	
	public boolean verifyTextPresent(String value)
	{
	return driver.getPageSource().contains(value);
	}
	
	

}
