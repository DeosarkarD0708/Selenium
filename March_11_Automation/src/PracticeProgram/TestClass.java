package PracticeProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Desktop\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		RegisterPage RP = new RegisterPage(driver);
		
	    RP.GoTo();
	    RP.Fname("Ojas");
	    RP.Lname("Deosarkar");
	    RP.Address("Wakad");
	    RP.emailId("ojas@gmail.com");
	    RP.phone("256352");
	    RP.Gender();
	    RP.Hobbies();
	    RP.Language();
	    
	  //  driver.quit();
	}

}
