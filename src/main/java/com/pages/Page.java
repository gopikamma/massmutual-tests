package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page 
{
	private WebDriver driver;
	/**
	 * Description: This is Page constructor. It holds all the element locators in Page
	 * 
	 * @param driver
	 */
	public Page(WebDriver driver) {
		this.driver = driver;
	}
	
	private By VALUE_1_TXT = By.id("txt_val_1");
	private By VALUE_2_TXT = By.id("txt_val_2");
	private By VALUE_3_TXT = By.id("txt_val_4");
	private By VALUE_4_TXT = By.id("txt_val_5");
	private By VALUE_5_TXT = By.id("txt_val_6");
	private By TOTAL_BALANCE_TXT = By.id("txt_ttl_val");
	private By VALUE_1_LBL = By.id("lbl_val_1");
	private By VALUE_2_LBL = By.id("lbl_val_2");
	private By VALUE_3_LBL = By.id("lbl_val_3");
	private By VALUE_4_LBL = By.id("lbl_val_4");
	private By VALUE_5_LBL = By.id("lbl_val_5");
	private By TOTAL_BALANCE_LBL = By.id("lbl_ttl_val");
	
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String getText_Of_Value_1()
	{
	WebElement TxtBoxContent = driver.findElement(VALUE_1_TXT);
	return TxtBoxContent.getText();
	}
	
	public String getText_Of_Value_2()
	{
	WebElement TxtBoxContent = driver.findElement(VALUE_2_TXT);
	return TxtBoxContent.getText();
	}
	
	public String getText_Of_Value_3()
	{
	WebElement TxtBoxContent = driver.findElement(VALUE_3_TXT);
	return TxtBoxContent.getText();
	}
	
	public String getText_Of_Value_4()
	{
	WebElement TxtBoxContent = driver.findElement(VALUE_4_TXT);
	return TxtBoxContent.getText();
	}
	
	public String getText_Of_Value_5()
	{
	WebElement TxtBoxContent = driver.findElement(VALUE_5_TXT);
	return TxtBoxContent.getText();
	}
	
	public String getText_Of_Total_Balance()
	{
	WebElement TxtBoxContent = driver.findElement(TOTAL_BALANCE_TXT);
	return TxtBoxContent.getText();
	}
	
	public void clickOnValue1() {
		driver.findElement(VALUE_1_LBL).click();
	}
	public void clickOnValue2() {
		driver.findElement(VALUE_2_LBL).click();
	}
	public void clickOnValue3() {
		driver.findElement(VALUE_3_LBL).click();
	}
	public void clickOnValue4() {
		driver.findElement(VALUE_4_LBL).click();
	}
	public void clickOnValue5() {
		driver.findElement(VALUE_5_LBL).click();
	}
	public void clickOnTotalBalance() {
		driver.findElement(TOTAL_BALANCE_LBL).click();
	}
}
