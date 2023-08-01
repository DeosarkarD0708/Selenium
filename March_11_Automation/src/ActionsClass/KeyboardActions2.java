package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions2 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		act.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		act.sendKeys(Keys.SHIFT).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		

}
}