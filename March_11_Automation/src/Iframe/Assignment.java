package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	
	public static void main(String[]args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("frame1");
		
		String Text = driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]")).getText();
		System.out.println(Text);
		driver.quit();
		
			
			
	}
}
