package commonFunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class FunctionLibrary 
{
	public static WebDriver driver;
	public static Properties conpro;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public static WebDriver startbrowser() throws Throwable
	{
		conpro = new Properties();
		conpro.load(new FileInputStream("./PropertyFiles/Environment.properties"));
		
		if(conpro.getProperty("Browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else if(conpro.getProperty("Browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	public static void openUrl()
	{
		driver.get(conpro.getProperty("Url"));
	}
	
	public static void waitForElement(String LocatorType,String LocatorValue,String TestData)
	{
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(TestData)));
		
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorValue)));
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LocatorValue)));
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(LocatorValue)));
		}
	}
	
	public static void typeAction(String LocatorType,String LocatorValue,String TestData)
	{
		if(LocatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(LocatorValue)).clear();
			driver.findElement(By.id(LocatorValue)).sendKeys(TestData);
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(LocatorValue)).clear();
			driver.findElement(By.name(LocatorValue)).sendKeys(TestData);
		}
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(LocatorValue)).clear();
			driver.findElement(By.xpath(LocatorValue)).sendKeys(TestData);
		}
	}
	
	public static void clickAction(String locatorType,String LocatorValue)
	{
		if(locatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(LocatorValue)).click();
		}
		if(locatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(LocatorValue)).click();
		}
		if(locatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(LocatorValue)).sendKeys(Keys.ENTER);;
		}
	}
	
	public static void validateTitle(String Exp_Value)
	{
		String Act_value = driver.getTitle();
		try {
		Assert.assertEquals(Act_value, Exp_Value,"Title not Matching");
		}
		catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void closebrowser()
	{
		driver.quit();
	}
	
	public static String generateDate()
	{
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
		return df.format(date);
	}
	public static void dropDownAction(String LocatorType,String LocatorValue,String TestData)
	{
		if(LocatorType.equalsIgnoreCase("id"))
		{
			int value = Integer.parseInt(TestData);
			Select element = new Select(driver.findElement(By.id(LocatorValue)));
			element.selectByIndex(value);
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			int value = Integer.parseInt(TestData);
			Select element = new Select(driver.findElement(By.name(LocatorValue)));
			element.selectByIndex(value);
		}
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			int value = Integer.parseInt(TestData);
			Select element = new Select(driver.findElement(By.xpath(LocatorValue)));
			element.selectByIndex(value);
		}
	}
	public static void captureStock(String LocatorType,String LocatorValue) throws Throwable
	{
		String StockNum="";
		if(LocatorType.equalsIgnoreCase("id"))
		{
			StockNum = driver.findElement(By.id(LocatorValue)).getAttribute("value");
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			StockNum = driver.findElement(By.name(LocatorValue)).getAttribute("value");
		}
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			StockNum = driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
		}
		FileWriter fw = new FileWriter("./CaptureData/StockNum.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(StockNum);
		bw.flush();
		bw.close();
	}
	public static void stockTable() throws Throwable
	{
		FileReader fr = new FileReader("./CaptureData/StockNum.txt");
		BufferedReader br = new BufferedReader(fr);
		String Exp_Data = br.readLine();
		
		if(!driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).isDisplayed())
		{
			driver.findElement(By.xpath(conpro.getProperty("search-panel"))).click();
		}
		
		driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).clear();
		driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).sendKeys(Exp_Data);
		driver.findElement(By.xpath(conpro.getProperty("search-button"))).click();
		
		Thread.sleep(3000);
		String Act_Data =driver.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[8]/div/span/span")).getText();
		
		Reporter.log(Act_Data+"        "+Exp_Data,true);
		try {
		Assert.assertEquals(Act_Data, Exp_Data,"Stock number Should not Match");
		}catch(AssertionError a)
		{
			Reporter.log(a.getMessage(),true);
		}

		
	}
	
	public static void captureSup(String LocatorType,String LocatorValue) throws Throwable
	{
		String SupplierNum="";
		if(LocatorType.equalsIgnoreCase("id"))
		{
			SupplierNum = driver.findElement(By.id(LocatorValue)).getAttribute("value");
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			SupplierNum = driver.findElement(By.name(LocatorValue)).getAttribute("value");
		}
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			SupplierNum = driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
		}
		FileWriter fw = new FileWriter("./CaptureData/SupplierNumber.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(SupplierNum);
		bw.flush();
		bw.close();
	}
	
	public static void supplierTable() throws Throwable
	{
		FileReader fr = new FileReader("./CaptureData/SupplierNumber.txt");
		BufferedReader br = new BufferedReader(fr);
		String Exp_Data = br.readLine();
		br.close();
		
		if(!driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).isDisplayed())
		{
			driver.findElement(By.xpath(conpro.getProperty("search-panel"))).click();
		}
		
		driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).clear();
		driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).sendKeys(Exp_Data);
		driver.findElement(By.xpath(conpro.getProperty("search-button"))).click();
		
		Thread.sleep(3000);
		
		String Act_Data =driver.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[6]/div/span/span")).getText();
		
		Reporter.log(Act_Data+"        "+Exp_Data,true);
		
		try {
		Assert.assertEquals(Act_Data, Exp_Data,"Stock number Should not Match");
		}catch(AssertionError a)
		{
			Reporter.log(a.getMessage(),true);
		}

	}
	
	public static void captureCus(String LocatorType,String Locatorvalue) throws Throwable
	{
		String CustomerNum="";
		if(LocatorType.equalsIgnoreCase("id"))
		{
			CustomerNum = driver.findElement(By.id(Locatorvalue)).getAttribute("value");
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			CustomerNum = driver.findElement(By.name(Locatorvalue)).getAttribute("value");
		}
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			CustomerNum = driver.findElement(By.xpath(Locatorvalue)).getAttribute("value");
		}
		FileWriter fw = new FileWriter("./CaptureData/CustomerNumber.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(CustomerNum);
		bw.flush();
		bw.close();
	}
	
	public static void customerTable() throws Throwable
	{
		FileReader fr = new FileReader("./CaptureData/CustomerNumber.txt");
		BufferedReader br = new BufferedReader(fr);
		String Exp_Data = br.readLine();
		br.close();
		
		if(!driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).isDisplayed())
		{
			driver.findElement(By.xpath(conpro.getProperty("search-panel"))).click();
		}
		
		driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).clear();
		driver.findElement(By.xpath(conpro.getProperty("search-textbox"))).sendKeys(Exp_Data);
		driver.findElement(By.xpath(conpro.getProperty("search-button"))).click();
		
		String Act_Data = driver.findElement(By.xpath("//table[@id='tbl_a_customerslist']/tbody/tr/td[5]/div/span/span")).getText();
		
		Reporter.log(Act_Data+"        "+Exp_Data,true);
		
		try {
		Assert.assertEquals(Act_Data, Exp_Data,"Stock number Should not Match");
		}catch(AssertionError a)
		{
			Reporter.log(a.getMessage(),true);
		}
		
	}
}
