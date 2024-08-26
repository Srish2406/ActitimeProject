package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage 
{
	
	//Declaration
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustbtn;
	
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelbtn;
	
	//Initialization
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Call getters
	
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public void setAddnewbtn(WebElement addnewbtn) {
		this.addnewbtn = addnewbtn;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public void setNewcust(WebElement newcust) {
		this.newcust = newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public void setCustname(WebElement custname) {
		this.custname = custname;
	}

	public WebElement getCustdesp() {
		return custdesp;
	}

	public void setCustdesp(WebElement custdesp) {
		this.custdesp = custdesp;
	}

	public WebElement getCreatecustbtn() {
		return createcustbtn;
	}

	public void setCreatecustbtn(WebElement createcustbtn) {
		this.createcustbtn = createcustbtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public void setCancelbtn(WebElement cancelbtn) {
		this.cancelbtn = cancelbtn;
	}

}
