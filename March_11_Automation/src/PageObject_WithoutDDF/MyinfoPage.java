package PageObject_WithoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyinfoPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name=\"middleName\"]")
	WebElement MiddleName;
	
	@FindBy(xpath="//input[@name=\"lastName\"]")
	WebElement LastName;
	
	public MyinfoPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
