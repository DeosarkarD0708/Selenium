package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	

	public static void main(String[]args) throws InterruptedException {
			
			System.setProperty("WebDriver,chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			
					//driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Ojas");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Deosarkar");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("2354");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ACXF");
			
			WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
			WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
			WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
			
			
			String DOB = "7/Aug/2022";
			
			String[] Date = DOB.split("/");
			
			ListBox(Day,Date[0]);
			ListBox(Month,Date[1]);
			ListBox(Year,Date[2]);
			
	 }
	 
	 public static void ListBox (WebElement element,String Text) {
			
			Select Select1 = new Select(element);
			
		     Select1.selectByVisibleText(Text);
			
		    //Select Select2 = new Select(Month);
			//Select2.selectByVisibleText("Mar");
			
			//Select Select3 = new Select(Year);
			//Select3.selectByVisibleText("2023");
			
			//Select Select4 = new Select(Day);
			//Select4.selectByValue("7");
			
			//Select Select5 = new Select(Month);
			//Select5.selectByValue("Aug");
				
			//Select Select6 = new Select(Year);
			//Select6.selectByValue("2022");
			
			//Select Select7 = new Select(Day);
			//Select7.selectByIndex(4);
			
			//Select Select8 = new Select(Month);
			//Select8.selectByIndex(1);
			
			//Select Select9 = new Select(Year);
			//Select9.selectByIndex(22);
		
		
	}
}
