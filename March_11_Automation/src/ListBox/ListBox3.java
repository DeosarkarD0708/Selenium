package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox3 {
	
	static WebDriver driver;
	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("WebDriver,chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
				//driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Ojas");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Deosarkar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("2354");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ACXF");
		
		String Day = "//select[@id='day']/option";
		String Month = "//select[@id='month']/option";
		String Year = "//select[@id=\"year\"]/option";
		
		String DOB = "7-Aug-2015";
		
		String date[]= DOB.split("-");
		
		Selectdropdown(Day,date[0]);
		Selectdropdown(Month,date[1]);
		Selectdropdown(Year,date[2]);
}

private static void Selectdropdown(String element, String values) {
	
	List<WebElement> V1 = driver.findElements(By.xpath(element));
	System.out.println(V1);
	System.out.println(V1.size());
	
	for (int i =0;i<V1.size();i++) {
		
		System.out.println(V1.get(i).getText());
		
		if(V1.get(i).getText().equals(values)) {
			V1.get(i).click();
		}
	}
 
}

      
		
		
		

}
