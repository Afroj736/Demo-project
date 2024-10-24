package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownList {
	
	public static void handlelistBox(WebElement ele,String value)
	{
		Select s=new Select(ele);//webelement
		s.selectByVisibleText(value);// getting option in dropdown
	}
	
	
	
	
	
}
