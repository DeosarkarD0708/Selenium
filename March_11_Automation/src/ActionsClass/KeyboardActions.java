package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	
	public static void main(String[]args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			WebElement input1 = driver.findElement(By.id("email"));
			WebElement input2 = driver.findElement(By.id("pass"));
			
			Thread.sleep(5000);
			
			input1.sendKeys("Thisismyfirstjavaprogram");
			
			Actions act = new Actions(driver);
			
			//CTRL+A
			act.keyDown(Keys.CONTROL);
			act.sendKeys("a");
			act.keyUp(Keys.CONTROL);
			act.build().perform();
			
			//CTRL+C
			act.keyDown(Keys.CONTROL);
			act.sendKeys("c");
			act.keyUp(Keys.CONTROL);
			act.build().perform();
			
			//Tab
			act.sendKeys(Keys.TAB);
			act.build().perform();
			
			//CTRL+V
			act.keyDown(Keys.CONTROL);
			act.sendKeys("v");
			act.keyUp(Keys.CONTROL);
			act.build().perform();
			
			//compare text
			if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
				System.out.println("Correct copied");
			}
			else {
				System.out.println("Incorrect copied");
			}
			
			
	}

}
