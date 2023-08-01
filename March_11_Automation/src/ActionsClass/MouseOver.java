package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	 public static void main(String[]args) throws InterruptedException {
			
			System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\Desktop\\\\Selenium\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			
			WebElement Account = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
			
			Actions act = new Actions(driver);
			act.moveToElement(Account).build().perform();
			
			driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]")).click();
			
			driver.findElement(By.id("ap_email")).sendKeys("Ojas@gmail.com");
			driver.findElement(By.id("continue")).click();
			
			driver.findElement(By.id("ap_password")).sendKeys("15264");
			driver.findElement(By.id("signInSubmit")).click();
			Thread.sleep(5000);
			
			boolean Text = driver.findElement(By.xpath("//span[@class=\"a-list-item\"]")).isDisplayed();
			System.out.println(Text);
			
			driver.quit();
			
			
			

}
}