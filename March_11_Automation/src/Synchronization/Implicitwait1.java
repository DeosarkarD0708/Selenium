package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait1 {
	
public static void main (String[]args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String URL = "https://www.facebook.com/";
		
		driver.get(URL);
		
		driver.findElement(By.id("email")).sendKeys("123456");
		driver.findElement(By.id("pass1")).sendKeys("1245");
		driver.quit();

}
}