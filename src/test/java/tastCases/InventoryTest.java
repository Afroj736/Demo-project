package tastCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pages.Inventorypage;
import pages.Login;
import utility.ReadData;

public class InventoryTest extends Testbase 
{
	Login login;
	Inventorypage invent;// global variable or object of inevnotryy constructor
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		login=new Login();
		login.LoginToApplication();
		invent=new Inventorypage();
		invent.addcartproducts();
	}
	
	@Test
	public void verifyTitleOfInventoryPageTest()
	{
		String expUrl="Swag Labs";
		String actUrl=invent.verifyTitleOfInventoryPage();
		Assert.assertEquals(expUrl, actUrl);
	}
	@Test
	public void verifyTwitterLogoTest()
	{
	boolean result=invent.verifyTwitterLogo();
		Assert.assertEquals(result, true);
	}
	
	
	@Test 
	//test case to verify count of added product in cart is coorect or not
	public void addcartproductsTest()
	{
		String expCount="2";
		String actCount=invent.addcartproducts();
		Assert.assertEquals(expCount,actCount);
	}

	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}
