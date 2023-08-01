package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot3 {
	
public static void main(String[]args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(7);
		String Imagename = "Redbus";
		File destination = new File("F:\\Software testing\\Automation testing\\Screenshot-Selenium\\"+Imagename+""+Random+".jpg");
		
		FileHandler.copy(source, destination);
		driver.quit();

}
}