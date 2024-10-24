package tastCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pages.AddtoCart_icon;
import pages.Inventorypage;
import pages.Login;

public class AddtoCart_Test extends Testbase{
	
	Login login;
	Inventorypage invent;// global variable or object of inevnotryy constructor
	AddtoCart_icon cart;
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		login=new Login();
		login.LoginToApplication();
		invent=new Inventorypage();
		//invent.addcartproducts();
		cart=new AddtoCart_icon();
		cart.addToCart();
	}
	@Test
	public void addToCartTest()
	{
		String expUrl="www.saucedemo.com/cart.html";
		String actUrl=cart.addToCart();
		Assert.assertEquals(expUrl, actUrl);
	}
	@Test
	public void verifycartLabelTest()
	{
		boolean result=cart.verifycartLabel();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifySwaglabTitleTest()
	{
		String expTitle="Swag Labs";
		String actTitle=cart.verifySwaglabTitle();
		Assert.assertEquals(expTitle, actTitle);
	}
	@Test
	public void verifyQtyLabelTest()
	{
		boolean result=cart.verifyQtyLabel();
		Assert.assertEquals(result, true);
		
	}
	@Test
	public void verifyDescriptionLabelTest()
	{
		boolean result=cart.verifyDescriptionLabel();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifycontinueBtnTest()
	{
		boolean result=cart.verifycontinueBtn();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifycheckoutbtnTest()
	{
		String expUrl="https://www.saucedemo.com/checkout-step-one.html";
		String actUrl=cart.verifycheckoutbtn();
		Assert.assertEquals(expUrl, actUrl);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
