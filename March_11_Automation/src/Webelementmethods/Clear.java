package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("WebDriver,chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("AVGF");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='u_0_5_Qe']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();		

}
}
