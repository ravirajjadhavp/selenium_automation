package mypacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {
		// How to locate links in selenium?
		// what is diff bet LinkText() and PatialLinkText() method?
		//How to capture all the links from the webpaage?
		//what is broken link? How to find broken links?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.partialLinkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Deals")).click();
		
		//How to capture all the links from the webpaage?
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println("total no of links is:"+links.size());
		
		//using for loop
		
//		for(int i=0;i<links.size(); i++) {
//			System.out.println(links.get(i).getText());
//			System.out.println(links.get(i).getAttribute("href"));
//			
//		}
		
		//using for each loop
//		for(WebElement link:links) {
//			System.out.println(link.getText());
//			System.out.println(link.getAttribute("href"));
//		}
		
		//what is broken link? How to find broken links?
		//broken link is something which does not have any target page
		//link is available on the web page but when you click on that it will not redirect anywhere
		
		
		

	}

}
