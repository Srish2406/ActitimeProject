package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id="username")
	private WebElement untbx;   //Store in variable.
		
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;
	
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement chkbx;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Call getters>>source
	public WebElement getUntbx() {
		return untbx;
	}

	public void setUntbx(WebElement untbx) {
		this.untbx = untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public void setPwtbx(WebElement pwtbx) {
		this.pwtbx = pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

	public void setLgbtn(WebElement lgbtn) {
		this.lgbtn = lgbtn;
	}

	public WebElement getChkbx() {
		return chkbx;
	}

	public void setChkbx(WebElement chkbx) {
		this.chkbx = chkbx;
	}
	
}
