package Popups;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class popup2_JS4 {
	
	public static void main(String[]args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String ExpectedalertMsg = "Please enter your password";
		
		Alert alert = driver.switchTo().alert();
		
		String Alertmessage = alert.getText();
		
		if(ExpectedalertMsg.equals(Alertmessage))
			System.out.println("Correct alert message");
		else
			System.out.println("Incorrect alert message");
		
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}

