package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {
	
public static void main(String[]args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		File destination = new File("F:\\Software testing\\Automation testing\\Screenshot-Selenium\\Sample2.jpg");
		
		FileHandler.copy(source, destination);
		driver.quit();
}

}
