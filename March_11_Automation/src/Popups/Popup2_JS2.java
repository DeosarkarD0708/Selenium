package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2_JS2 {
	
	public static void main(String[]args) throws InterruptedException {
		
		//javascript alert and confirmation popup
		
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
			Thread.sleep(5000);
			
			driver.switchTo().alert().dismiss();
			Thread.sleep(2000);
			
			Boolean Text = driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
			
			System.out.println(Text);
			
			driver.quit();
			
		
		
	}
}