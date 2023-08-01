package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_with_DDF {
	
	public static void main(String[]args) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Enter username
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		//Enter password
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String Username = "Paul Collings";
		
		String Name = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		
		System.out.println(Name);
		if(Username.equals(Name)) {
			System.out.println("Correct Username or login successfully");
		}
		else
			System.out.println("Incorrect username or password");
		}
		
		
	}


