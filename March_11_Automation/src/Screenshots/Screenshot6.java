package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot6 {
	
  static WebDriver driver;

	public static void main(String[]args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		String File = "Facebook";
		
		Screenshot6.Takescreenshot(File);
		Screenshot6.Takescreenshot("Test"+File);
		Screenshot6.Takescreenshot("Test1"+File);
		driver.quit();
		
	}

	
	public static void Takescreenshot(String Filename) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(5);
		File destination = new File("C:\\Users\\admin\\eclipse-workspace\\March_11_Automation\\"+Filename+""+Random+".jpg");
		FileHandler.copy(source, destination);
		
		
		
		
	}
}
