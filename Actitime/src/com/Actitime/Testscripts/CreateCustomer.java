package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.Filelibrary;
import com.Actitime.GenericLibrary.ListenerImplementation;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;

@Listeners(ListenerImplementation.class)

public class CreateCustomer extends  Baseclass
{
	
	Filelibrary f = new Filelibrary();
	
@Test
public void createCustomer() throws EncryptedDocumentException, IOException
{
	//1st click on task :: create object of home page
	
	HomePage hp = new HomePage(driver);
	hp.getTaskelement().click();
	
	//add
	
	TaskPage tp= new TaskPage(driver);
	tp.getAddnewbtn().click();
	tp.getNewcust().click();
	String name = f.readDataFromExcelFile("Sheet1", 3, 1);
	tp.getCustname().sendKeys(name);
	String desp = f.readDataFromExcelFile("Sheet1", 3, 2);
	tp.getCustdesp().sendKeys(desp);
	tp.getCreatecustbtn().click();
	 String ExpectedResult = name;
	  WebElement ActualResult = driver.findElement(By.xpath("(//div[.='"+name+"'])[2]"));
	  SoftAssert s= new SoftAssert();
	  s.assertEquals(ExpectedResult, ActualResult);
	  Reporter.log("TS Successfully passed",true);
	  s.assertAll();
	  
	
	
	
	//We have already wrote testdata in 1 excel and also have created 1 method , so will not hard code for send keys.
//create object of filelibrary class and import it.

}
}
