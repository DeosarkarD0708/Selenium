package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait2 {
	
public static void main (String[]args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String URL = "https://www.w3schools.com/";
		
		driver.get(URL);
		
		driver.findElement(By.id("search2")).sendKeys("Automation");
		
	    driver.findElement(By.id("learntocode_searchicon1")).click();
	    
	    driver.quit();

}
}