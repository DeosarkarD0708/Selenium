package MainMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}

}
