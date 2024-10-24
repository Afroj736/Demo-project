package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Testbase;
import utility.HandleDropDownList;
public class Inventorypage extends Testbase {
	
	//object repository 
		@FindBy(xpath="//span[text()='Products']") private WebElement productLable;
		@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-backpack']") private WebElement backpackProductk;
		@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bike-light']") private WebElement bikelightProduct; 
		@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement boltTShirtProduct;
		@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-fleece-jacket']") private WebElement jacketProduct;
		@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterLogo;
		@FindBy(xpath="//select[@class='product_sort_container']") private WebElement dropdownlistBox;
		@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement cartCount;

		public Inventorypage()
		{
			PageFactory.initElements(driver,this);
		} 
		
		public String verifyTitleOfInventoryPage()
		{
			return driver.getTitle();
		}

		public boolean verifyTwitterLogo()
		{
			return twitterLogo.isDisplayed();
		}

	
	//creating add to cart method to see the product is added to cart or not
	public String addcartproducts()
	{
		
		Select s=new Select(dropdownlistBox);
		s.selectByVisibleText("Price (low to high)");
		backpackProductk.click(); 
		bikelightProduct.click(); 
		return cartCount.getText();

		

	}


}
