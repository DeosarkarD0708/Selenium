package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.amazon.in/");
		
		String URL = Driver.getCurrentUrl();
		
		System.out.println(URL);
		
		if(URL.equals("https://www.amazon.in/"))
			System.out.println("Correct URL");
		else {
			System.out.println("Incorrect URL");
		}
		
		Driver.close();
	}

}
