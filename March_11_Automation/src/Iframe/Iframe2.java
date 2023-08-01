package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	
	public static void main(String[]args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
			
			driver.manage().window().maximize();
			
			driver.switchTo().frame("iframeResult");
			
			Thread.sleep(5000);
			
			driver.switchTo().frame(0);
			
			String Text = driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).getText();
			
			System.out.println(Text);
			
			driver.switchTo().parentFrame();
			//String Text1 = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]");
			
			driver.quit();
			
	}
}
