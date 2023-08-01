package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(4000);
		
		String Title = Driver.getTitle();
		System.out.println(Title);
		
		Driver.navigate().to("https://www.flipkart.com/");
		
		String Title1 = Driver.getTitle();
		
		System.out.println(Title1);
		
		Driver.navigate().back();
		Thread.sleep(5000);
		
		Driver.navigate().forward();
		Thread.sleep(5000);
		
		Driver.navigate().refresh();
		Thread.sleep(5000);
		
		Driver.close();
		
		
		}

}
