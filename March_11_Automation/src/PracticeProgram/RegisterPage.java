package PracticeProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"First Name\"]")
	public WebElement Fname;
	
	@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
	public WebElement Lname;
	
	@FindBy(xpath = "//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]")
	public WebElement Address;
	
	@FindBy(xpath = "//input[@type=\"email\"]")
	public WebElement emailId;
	
	@FindBy(xpath = "//input[@type=\"tel\"]")
	public WebElement phone;
	
	@FindBy(xpath = "//input[@value=\"Male\"]")
	public WebElement Gender;
	
	@FindBy(xpath = "//input[@id=\"checkbox1\"]")
	public WebElement Hobbies;
	
	@FindBy(xpath = "//div[@id=\"msdd\"]")
	public WebElement Language;
	
	public void Fname(String FirstName) {
		Fname.sendKeys(FirstName);
	}
	
	public void Lname(String LastName) {
		Lname.sendKeys(LastName);
	}
	
	public void Address(String HomeAddress) {
		Address.sendKeys(HomeAddress);
	}
	
	public void emailId(String email) {
		emailId.sendKeys(email);
	}
	
	public void phone(CharSequence pnumber) {
		phone.sendKeys(pnumber);
	}
	
	public void Gender() {
		Gender.click();
	}
	
	public void Hobbies() {
		Hobbies.click();
	}
	
	public void Language() {
		Language.click();
	}
	
	public void GoTo() {
		driver.get("https://demo.automationtesting.in/Register.html");
	}

}
