package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 {
	
public static void main (String[]args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String URL = "https://www.facebook.com/";
		
		driver.get(URL);
		
		//FluentWait
		
		Wait<WebDriver>MyWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);
		
		//usage
		
		WebElement element = MyWait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.id("email12"));
			}
		});
		
		element.sendKeys("Test123");
		

}
}