package PageObject_WithoutDDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseorTestclass {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPage LP = new LoginPage(driver);
		
		LP.GoTo();
		LP.Usermail("Admin");
		LP.Password1("admin123");
		LP.Login();
		
		DashboardPage DP = new DashboardPage(driver);
		DP.Namevalidation();
		DP.TimeAt();
		
		//MyinfoPage MP = new MyinfoPage(driver);
		
		
		driver.quit();
		
	}

}
