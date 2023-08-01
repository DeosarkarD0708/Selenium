package PageObject_WithoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		//initialization
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//pageFactory
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	public WebElement usermail;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement Button;
	
	public void Usermail(String email) {
		usermail.sendKeys(email);
	}
	
	public void Password1(String pass) {
		Password.sendKeys(pass);
	}
	
	public void Login() {
		Button.click();
	}
	
	public void GoTo() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
