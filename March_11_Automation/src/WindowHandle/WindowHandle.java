package WindowHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		String WindowID = driver.getWindowHandle();
		
		System.out.println(WindowID);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
		
		Set<String>WindowID1 = driver.getWindowHandles();
		
		List<String> WindowList = new ArrayList(WindowID1);
		
		String Parent = WindowList.get(0);
		String Child =WindowList.get(1);
		
		System.out.println("ParentWindow--->"+Parent);
		System.out.println("ChildWindow--->"+Child);
		
		driver.switchTo().window(Parent);
		System.out.println("ParentWindow--->"+driver.getTitle());
		
		driver.switchTo().window(Child);
		System.out.println("ChildWindow--->"+driver.getTitle());
		
		driver.switchTo().window(Parent);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class=\"w3-button w3-bar-item w3-hover-white w3-hover-text-green ga-tryit\"]")).getText();
		driver.quit();
		
	}

}
