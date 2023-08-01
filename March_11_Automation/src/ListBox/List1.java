package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List1 {
	
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
		
		Select S1 = new Select(Day);
		List<WebElement> ListDay = S1.getOptions();
		System.out.println("Totaldays-->"+ListDay.size());
		
		for (int i = 0;i<ListDay.size();i++) {
			
			String DayValues = ListDay.get(i).getText();
			
			System.out.println(DayValues);
		    
			if(DayValues.equals("14")) {
				
				ListDay.get(i).click();
			}
		}
		
		Select S2 = new Select(Month);
		
		List<WebElement>MonthValues = S2.getOptions();
		System.out.println("Total month--->"+MonthValues.size());
		
		for(int j = 0;j<MonthValues.size();j++) { 
			
			String Months = MonthValues.get(j).getText();
			System.out.println(Months);
			
			if(Months.equals("Aug")){		
				
				MonthValues.get(j).click();
			}
			
		}
		
		Select S3 = new Select(Year);
		
	    List<WebElement>Years = S3.getOptions();
		System.out.println("Total Year--->"+Years.size());
		
		for(int k =0;k<Years.size();k++) {
			
			String YearValues = Years.get(k).getText();
			System.out.println(YearValues);
			
			if(YearValues.equals("2019")) {
				
				Years.get(k).click();
			}
			
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		

}
}
