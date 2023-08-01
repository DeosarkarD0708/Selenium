package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fregister");
		
	    WebElement Input=driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
	    
	    System.out.println(Input.isDisplayed());
	    
	    driver.quit();	
	    }
	

}
