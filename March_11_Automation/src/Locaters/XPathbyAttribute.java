package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathbyAttribute {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://www.facebook.com/");
		
	    Driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("Ojas@gmail.com");
}
}