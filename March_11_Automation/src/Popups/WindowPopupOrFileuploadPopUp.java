package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupOrFileuploadPopUp {
	public static void main(String[]args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://the-internet.herokuapp.com/upload");
				driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\admin\\Desktop\\TestData\\Sheet1.xlsx");
				
				driver.findElement(By.id("file-submit")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]")).isDisplayed();
	}
}