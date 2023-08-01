package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyIndex {
	
	public static void main(String[]args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://www.amazon.in/");
		
		Driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[3]")).click();
		
		Thread.sleep(5000);
		
		Driver.quit();
		

		
	}

}
