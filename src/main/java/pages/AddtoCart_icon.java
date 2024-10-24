package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;
public class AddtoCart_icon extends Testbase {
	//object repositary
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement addToCart;
	@FindBy(xpath="//span[text()='Your Cart']") private WebElement cartLabel;
	//@FindBy(xpath="//div[text()='Swag Labs']") private WebElement swaglablabelCart;
	@FindBy(xpath="//div[text()='QTY']") private WebElement quantityLabel;
	@FindBy(xpath="//div[text()='Description']") private WebElement desctriptionLabel;
	@FindBy(xpath="//button[@id='continue-shopping']") private WebElement continueBtn;
	@FindBy(xpath="//button[@id='checkout']") private WebElement checkoutBtn;
	
	//constructor
	public AddtoCart_icon()
	{
		PageFactory.initElements(driver, this);
	}
	public String addToCart()
	{
		
		addToCart.click();
		return driver.getCurrentUrl();//https://www.saucedemo.com/cart.html
	}
	
	public boolean verifycartLabel()
	{
		
		return cartLabel.isDisplayed();
	}
	
	public String verifySwaglabTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyQtyLabel()
	{
		return quantityLabel.isDisplayed();
	}
	
	public boolean verifyDescriptionLabel()
	{
		return desctriptionLabel.isDisplayed();
	}
	public boolean verifycontinueBtn()
	{
		return continueBtn.isEnabled();
	}
	
	public String verifycheckoutbtn()
	{
		addToCart();
		checkoutBtn.click();
		return driver.getCurrentUrl();//https://www.saucedemo.com/checkout-step-one.html
	}
	
}
