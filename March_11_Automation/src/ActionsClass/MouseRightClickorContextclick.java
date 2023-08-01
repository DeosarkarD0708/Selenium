package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickorContextclick {
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(button).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-copy\"]")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		act.contextClick(button).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-paste\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.quit();
}
}