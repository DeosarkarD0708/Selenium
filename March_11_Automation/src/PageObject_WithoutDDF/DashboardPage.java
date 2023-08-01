package PageObject_WithoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	
	//1.
	
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	WebElement Name;
	
	@FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p\"]")
	WebElement Time;
	
	//2.
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//3.
	
	public void Namevalidation() {
		String Text = Name.getText();
		if(Text.equals("Paul Collings")) {
			System.out.println("Correct username");
		}
		else {
			System.out.println("Incorrect username");
		}
	}
	
	public void TimeAt() {
		
		boolean Time1 = Time.isDisplayed();
		System.out.println(Time1);
	}

}
