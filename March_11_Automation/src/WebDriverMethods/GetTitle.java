package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		driver.close();
		
		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if(Title.equals(ExpectedTitle)) {
			System.out.println("Correct title");
		}
		else {

			System.out.println("Incorrect title");
		}
	}

}
