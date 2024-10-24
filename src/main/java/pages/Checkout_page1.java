package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class Checkout_page1 extends Testbase {
	//object repositary
	@FindBy(xpath="//span[text()='Checkout: Your Information']") private WebElement CheckLable ;
	@FindBy(xpath="//input[@id='first-name']") private WebElement firstnameTextBox ;
	@FindBy(xpath="//input[@id='last-name']") private WebElement lastnameTextBox ;
	@FindBy(xpath="//input[@id='postal-code']") private WebElement zipcodetextBox ;
	@FindBy(xpath="//input[@id='continue']") private WebElement continueBtn ;
	//@FindBy(xpath="//button[@id='cancel']") private WebElement cancelBtn  ;
	
	//create consturctor
	public Checkout_page1()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyCheckLable()
	{
		return CheckLable.getText();
	}
	
	public String inputInformation()
	{
		firstnameTextBox.sendKeys("Aahil");
		lastnameTextBox.sendKeys("Raj");
		zipcodetextBox.sendKeys("801103");
		continueBtn.click();
		return driver.getCurrentUrl();
		
	}
	
	
}
