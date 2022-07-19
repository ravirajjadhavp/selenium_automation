package mypacakage;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {
	//what is broken link? 
	//-->broken link is something which does not have any target page
	//-->link is available on the web page but when you click on that it will not redirect anywhere
	
	//How to find broken links?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(WebElement ele:links) {
			String url=ele.getAttribute("href");
			if(url==null ||url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
			URL link=new URL(url);
			
			HttpURLConection httpcon(HttpURLConnection) link.openConnection();
			httpcon.connect();
		}
		

	}

}
