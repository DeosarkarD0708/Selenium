package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle3 {

public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(3000);
		
		Set<String>WindowID=driver.getWindowHandles();
        Iterator <String>IT = WindowID.iterator();
		
		String ParentWindow = IT.next();
		String ChildWindow = IT.next();
		
		System.out.println("ParentWindow--->"+ParentWindow);
		System.out.println("ChildWindow---->"+ChildWindow);
		
		driver.switchTo().window(ParentWindow);
		System.out.println("ParentWindow--->"+driver.getTitle());
		
		driver.switchTo().window(ChildWindow);
		System.out.println("ChildWindow--->"+driver.getTitle());
		
		driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("Ojas@gmail.com");
		driver.findElement(By.id("Form_submitForm_action_request")).click();
		
		driver.switchTo().window(ParentWindow);
		
		driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("Ojas123");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
		
}
}