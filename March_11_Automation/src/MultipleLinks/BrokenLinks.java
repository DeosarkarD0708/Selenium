package MultipleLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
public static void main(String[]args) throws InterruptedException, IOException {
		
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		int Brokenlinks = 0;
		
		for(WebElement element : Links) {
			
			String url = element.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				System.out.println("URL is empty or null");
			}
			
			URL Link = new URL(url);
			
			HttpsURLConnection httpscode =(HttpsURLConnection) Link.openConnection();
			httpscode.connect();
			
			if(httpscode.getResponseCode()>=400) {
				
				System.out.println(httpscode.getResponseCode()+"--->"+url+"is --->Broken Link");
				Brokenlinks++;
			}
			else {
				System.out.println(httpscode.getResponseCode()+"--->"+url+"is--->valid Link");
			}
			
		}
		
		System.out.println("Number of broken links --->"+Brokenlinks);
		
		driver.quit();
        
}
}