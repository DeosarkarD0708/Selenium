package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot5 {
	
public static void main(String[]args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		
		driver.get("https://www.facebook.com");	
		
		WebElement Facebooklogo = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		Thread.sleep(5000);
	
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(7);
		String Imagename = "Facebook";
		
		//File destination = new File("F:\\Software testing\\Automation testing\\Screenshot-Selenium\\Sample2.jpg");
		File destination = new File("C:\\Users\\admin\\eclipse-workspace\\March_11_Automation\\"+Imagename+""+Random+".jpg");
		
		FileHandler.copy(Source, destination);
		
		driver.quit();
		
}
}
