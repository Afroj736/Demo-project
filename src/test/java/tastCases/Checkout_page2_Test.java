package tastCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pages.AddtoCart_icon;
import pages.Checkout_page1;
import pages.Checkout_page2;
import pages.Inventorypage;
import pages.Login;

public class Checkout_page2_Test extends Testbase {

	Login login;
	Inventorypage invent;// global variable or object of inevnotryy constructor
	AddtoCart_icon cart;
	Checkout_page1 check;
	Checkout_page2 check2;
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
		check.inputInformation();
		check2=new Checkout_page2();
	}
	@Test
	public void verifyCheckOutLabelTest()
	{
		String expUrl="Checkout: Overview";
		String actUrl=check2.verifyCheckOutLabel();
		Assert.assertEquals(expUrl, actUrl);
	}
	
	@Test
	public void verifyQtyLabelTest()
	{
		String expUrl="QTY";
		String actUrl=check2.verifyQtyLabel();
		Assert.assertEquals(expUrl, actUrl);
	}
	
	@Test
	public void  verifyDescriptionLabelTest()
	{
		String expUrl="Description";
		String actUrl=check2.verifyDescriptionLabel();
		Assert.assertEquals(expUrl, actUrl);
	}
	
	@Test
	public void verifyfinishPageTest()
	{
		String expUrl="https://www.saucedemo.com/checkout-complete.html";
		String actUrl=check2.verifyfinishPage();
		Assert.assertEquals(expUrl, actUrl);
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
}
