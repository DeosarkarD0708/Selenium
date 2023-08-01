package Webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	
     public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("WebDriver,chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String ExpectedText ="Facebook helps you connect and share with the people in your life.";
		
		String Actualtext=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps ')]")).getText();
		
		if(ExpectedText.equals(Actualtext)) {
			
			System.out.println("Correct Text");
		}
		else
			System.out.println("Incorrect Text");
		
		driver.quit();

}
}
