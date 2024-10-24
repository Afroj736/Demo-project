package tastCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Testbase;
import pages.Login;
import utility.ReadData;

public class LoginTest  extends Testbase {
	
	Login login;
	@BeforeMethod(alwaysRun = true)
	public void setUp() throws IOException
	{
		initialization();
		login=new Login();
		
	}
	@Test
	public void verifyURLofApplicationTest() throws EncryptedDocumentException, IOException// method to verify url of appliction
	{
		String expURL=ReadData.readExcel(0,0);//"https://www.saucedemo.com/"
		String actURL=login.verifyURLofApplication();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("the url of swag lab webpage = "+actURL);
	}
	
	@Test
	public void verifyTitleOfApplicationTest() throws EncryptedDocumentException, IOException// method to verify title of webpage
	{
		String expTitle=ReadData.readExcel(0, 1); //"Swag Labs";
		String actTitle=login.verifyTitleOfApplication();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("the title of swag lab webpage = "+actTitle);
	}
	
	@Test
	public void LoginToApplicationTest() throws IOException// method to login the application successfull
	{
		
		String expURL=ReadData.readExcel(0, 2);// "https://www.saucedemo.com/inventory.html";
		String actURL=login.LoginToApplication();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("Login Successfully = "+actURL);
	}
	@Test(dataProvider = "testdata")
	public void verifyMultiCreditancialTest(String un,String password)
	{
		SoftAssert s=new SoftAssert();
		String expUrl="https://www.saucedemo.com/inventory.html";
		String actUrl=login.verifyMultiCreditancial(un, password);
		s.assertEquals(expUrl, actUrl);
		s.assertAll();
	}
	@DataProvider(name="testdata")
	public Object [][] getdata()
	{
		return new Object [][] 
				{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
			{"error_user","secret_sauce"},
			{"visual_user","secret_sauce"},
				};
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrower()
	{
	report.flush();
	driver.close();
	}
	
	
}
