package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Actitime.pom.HomePage;
import com.Actitime.pom.LoginPage;

public class Baseclass {
	public static WebDriver driver;
	Filelibrary f = new Filelibrary(); // cut from launch browser and added as global

	
	@BeforeSuite	
	public void databaseconnection() 
	{
		Reporter.log("Database is connected",true);
	}
	
	@BeforeTest
	public void launchBrowser() throws IOException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//need to create object of class
		
	    String URL = f.readDataFromPropertyFile("url");
		driver.get(URL);
		Reporter.log("Browser launched",true);
	}

	@BeforeMethod
	public void  login() throws IOException 
	{
		String un = f.readDataFromPropertyFile("username");
		//driver.findElement(By.id("username")).sendKeys(un);
		
	    LoginPage lp = new LoginPage(driver);
	    lp.getUntbx().sendKeys(un);
		
		String pwd = f.readDataFromPropertyFile("password");
		//driver.findElement(By.name("pwd")).sendKeys(pwd);
		lp.getPwtbx().sendKeys(pwd);
		
		//driver.findElement(By.xpath("//div[.='Login ']")).click();
		lp.getLgbtn().click();
		
		Reporter.log("Logged in succesfully",true);;
		//cuz webdriver became local ,so cannot work for different, to use driver.findelement
	}
	
	@AfterMethod
	public void logout() 
	{
		HomePage hp = new HomePage(driver);
		hp.getLogoutlnk().click();
		
		//driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Loggedout Successfully",true);
	}
	
	@AfterTest
	public void closeBrowser() 
	{
		driver.close();
		Reporter.log("Browser Closed Successfully",true);
	}
	
	@AfterSuite()
		public void DatabaseDisconnection()
	    {
			Reporter.log("Database Disconnected",true);
		}
	
      
}
