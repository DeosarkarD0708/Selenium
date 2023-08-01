package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {

	private static String id;
	private static String name;

	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	   //	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("adbc@gmail.com");
	
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();		
		

		//ID
		 
	//	driver.findElement(By.id(id="email")).sendKeys("1234");
		
	   
		//Name
		
		
		//driver.findElement(By.name("email")).sendKeys("Ojas");
		
		//Classname
		
		
	//	driver.findElement(By.className("[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']").
		
		//css selector
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abc@gmail.com");
		
		//linktext
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partiallinktext
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();	
		

	
}
}