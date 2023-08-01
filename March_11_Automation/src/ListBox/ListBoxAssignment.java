package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxAssignment {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("WebDriver,chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Ojas");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Deosarkar");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Wakad");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Ojas.deo@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9635156852");
		driver.findElement( By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox2\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		//driver.findElement(By.xpath("//div[@class=\"ui-autocomplete-multiselect-item\"]")).click();
		
	WebElement Skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		Select S1 = new Select(Skills);
		S1.selectByValue("Software");
		
	WebElement Country = driver.findElement(By.xpath("//span[@class=\"select2-selection__arrow\"]"));
	
	Select S2 = new Select(Country);
	S2.deselectByValue("India");
	
				
				
					}
			
	}
