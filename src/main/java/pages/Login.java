package pages;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import base.Testbase;
import utility.ReadData;


public class Login extends Testbase {

	
	//object repository where element can be storre. and vaiable is private for encapsulation and method is public
	@FindBy(xpath="//input[@id='user-name']") private WebElement usernameTxtBox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextBox;
	@FindBy(xpath="//input[@id='login-button']") private WebElement loginBtn;
	
	//constructor
	public Login()
	{
		PageFactory.initElements(driver, this);
	}
	
	//create a method to login by using valid credentials
	public String LoginToApplication() throws IOException
	{
		logger=report.createTest("Login into the sauce lab Application");
		usernameTxtBox.sendKeys(ReadData.readpropertyfile("Username"));
		logger.log(Status.INFO, "Username is entered");
		passwordTextBox.sendKeys(ReadData.readpropertyfile("password"));
		logger.log(Status.INFO, "password is enetered");
		loginBtn.click();
		logger.log(Status.INFO, "login button is clicked");
		logger.log(Status.PASS, "succesfully login");
		return driver.getCurrentUrl();
	}
	
	
	public String verifyMultiCreditancial(String un,String password)
	{
		usernameTxtBox.sendKeys(un);
		passwordTextBox.sendKeys(password);
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	
	
	public String verifyURLofApplication()
	{
		return driver.getCurrentUrl();
	}
	
	public String verifyTitleOfApplication()
	{
		return driver.getTitle();
	}
	
	
	
}
