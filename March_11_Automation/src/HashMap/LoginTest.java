package HashMap;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static HashMap<String, String> Logindata(){
		
		HashMap<String, String> HM = new HashMap<String, String>();
		
		HM.put("A","Ojas : ojas123");
		HM.put("B", "Shreya : shreya123");
		HM.put("C","Riya : riya123");
		HM.put("D","Siya : siya123");
		return HM;
		
	}
	
	public static void main(String[]args) {
		
    System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String Name = LoginTest.Logindata().get("B");
		
		String arr[] = Name.split(":");
		
		driver.findElement(By.id("email")).sendKeys(arr[0]);
		
		driver.findElement(By.id("pass")).sendKeys(arr[1]);
		
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		
		String Actual_Title = driver.getTitle();
		if(Actual_Title.equals("Log in to facebook")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect Title");
		}
		
		driver.quit();
		
	}

}
