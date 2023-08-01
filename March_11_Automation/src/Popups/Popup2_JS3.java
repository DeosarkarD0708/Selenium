package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2_JS3 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Thread.sleep(5000);
		
		Alert Text = driver.switchTo().alert();
		
		System.out.println("Alert Message --->"+Text.getText());
		
		Text.sendKeys("Welcome");
		Thread.sleep(5000);
		Text.accept();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
