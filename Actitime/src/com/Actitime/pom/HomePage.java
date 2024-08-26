package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath ="//div[.='Tasks']")
	private WebElement taskelement;
	
	@FindBy(xpath ="//div[.='Time-Track']")
	private WebElement timeelement;
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportselement;
	
	@FindBy(xpath ="//div[.='Users']")
	private WebElement userelement;
	
	@FindBy(id="logoutLink")
	private WebElement logoutlnk;
	
	
	//Initialization
	 public HomePage(WebDriver driver) //Constructor
	 {
		 PageFactory.initElements(driver, this);
	 }

	//call gettersandsetters >>Source

	public WebElement getTaskelement() {
		return taskelement;
	}
	public void setTaskelement(WebElement taskelement) {
		this.taskelement = taskelement;
	}
	public WebElement getTimeelement() {
		return timeelement;
	}
	public void setTimeelement(WebElement timeelement) {
		this.timeelement = timeelement;
	}
	public WebElement getReportselement() {
		return reportselement;
	}
	public void setReportselement(WebElement reportselement) {
		this.reportselement = reportselement;
	}
	public WebElement getUserelement() {
		return userelement;
	}
	public void setUserelement(WebElement userelement) {
		this.userelement = userelement;
	}
	public WebElement getLogoutlnk() {
		return logoutlnk;
	}
	public void setLogoutlnk(WebElement logoutlnk) {
		this.logoutlnk = logoutlnk;
	}
	 
}
