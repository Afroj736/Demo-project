package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class Checkout_page2 extends Testbase {
	//create object repositary
	@FindBy(xpath="//span[text()='Checkout: Overview']") private WebElement checkout2Label;
	@FindBy(xpath="//div[text()='QTY']") private WebElement QtyLabel;
	@FindBy(xpath="//div[text()='Description']") private WebElement DescriptionLabel;
	@FindBy(xpath="//button[@id='finish']") private WebElement finishBtn;
	@FindBy(xpath="//button[@id='cancel']") private WebElement cancelBtn;
	@FindBy(xpath="//div[@class='summary_total_label']") private WebElement totalAmountLabel;
	@FindBy(xpath="//div[@class='summary_info']") private WebElement paymentInfo;
	
	//constructor
	public Checkout_page2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCheckOutLabel()
	{
		return checkout2Label.getText();
		
	}

	public String verifyQtyLabel()
	{
		return QtyLabel.getText();
	}
	public String verifyDescriptionLabel()
	{
		return DescriptionLabel.getText();
	}
	/*public String verifypaymentInfo()
	{
		return paymentInfo.getText();
	}
	public String verifyTotalAmount()
	{
		return totalAmountLabel.getText();
	}*/
	public String verifyfinishPage()
	{
		
		
		finishBtn.click();
		return driver.getCurrentUrl();
	}
}
