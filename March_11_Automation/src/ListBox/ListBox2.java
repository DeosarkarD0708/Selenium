package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox2 {
	
	public static void main(String[]args) throws InterruptedException {
		
		//handle listbox without select class
		
		System.setProperty("WebDriver,chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
		
	  //  List<WebElement> cityfrom=driver.findElements(By.xpath("//text[@class=\"placeHolderMainText\"]"));
	    
		
}
}