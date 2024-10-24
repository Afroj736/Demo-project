package tastCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pages.AddtoCart_icon;
import pages.Checkout_page1;
import pages.Inventorypage;
import pages.Login;

public class Checkout_page1_test extends Testbase {

	Login login;
	Inventorypage invent;// global variable or object of inevnotryy constructor
	AddtoCart_icon cart;
	Checkout_page1 check;
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		login=new Login();
		login.LoginToApplication();
		invent=new Inventorypage();
		invent.addcartproducts();
		cart=new AddtoCart_icon();
		cart.addToCart();
		cart.verifycheckoutbtn();
		check =new Checkout_page1();
	}
	
	@Test
	public void verifyCheckLableTest()
	{
		String expLable="Checkout: Your Information";
		String actLable=check.verifyCheckLable();
		Assert.assertEquals(expLable, actLable);
	}
	
	@Test
	public void inputInformationTest()
	{
		String expUrl="https://www.saucedemo.com/checkout-step-two.html";
		String actUrl=check.inputInformation();
		Assert.assertEquals(expUrl, actUrl);
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
