package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(3000);
		
		Set<String>WindowID=driver.getWindowHandles();
		
		//first Method
		Iterator <String>IT = WindowID.iterator();
		
		String ParentWindow = IT.next();
		String ChildWindow = IT.next();
		
		System.out.println("ParentWindow--->"+ParentWindow);
		System.out.println("ChildWindow---->"+ChildWindow);
		
		//Second way
		
		List<String> WindowList = new ArrayList(WindowID);
		
		String Parent = WindowList.get(0);
		String Child = WindowList.get(1);
		
		System.out.println("ParentWindow---->"+Parent);
		System.out.println("ChildWindow--->"+Child);
		
		
		//how to switch selenium focus on child window
		
		driver.switchTo().window(ParentWindow);
		System.out.println("ParentWindow--->"+driver.getTitle());
		
		driver.switchTo().window(ChildWindow);
		System.out.println("ChildWindow--->"+driver.getTitle());
		
		driver.quit();
		
		
		
}
}