package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowbrowserPopUp {
	
	public static void main(String[]args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demo.automationtesting.in/Windows.html");
				
				driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
				
				String ParentWindow = driver.getWindowHandle();
				System.out.println(ParentWindow);
				
				Set<String> Childwindows = driver.getWindowHandles();
				
				for(String Childwindow:Childwindows) {
					if(!ParentWindow.equalsIgnoreCase(Childwindow)) {
						driver.switchTo().window(Childwindow);
						
					String Text1 = driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates browsers.')]")).getText();
					System.out.println(Text1);
					driver.close();
					}
				}
				driver.switchTo().window(ParentWindow);
				String Text2=driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site')]")).getText();
				
				System.out.println(Text2);
				driver.quit();
				

}
}