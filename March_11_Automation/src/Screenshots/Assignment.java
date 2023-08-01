package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Assignment {
	
	public static void main(String[]args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(5000);
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(source);
	//File destination = new File("F:\\Software testing\\Automation testing\\Screenshot-Selenium\\Sample2.jpg");
	
	WebElement LogintoKite = driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]"));
	File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	String Random = RandomString.make(3);
	String Imagename = "Login to Kite";
	
	File destination1 = new File("C:\\Users\\admin\\eclipse-workspace\\March_11_Automation\\"+Imagename+" "+Random+".jpg");
		
	FileHandler.copy(source, destination1);
	driver.quit();
}

}
