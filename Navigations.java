package mypacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {
		// How to Navigate Back And Forward?
		// How to refresh page?
		// what is the diff bet get() and navigate.to()?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		//get() and navigate().to() method both do the same work
		driver.navigate().to("https://www.amazon.com/");
		
		driver.navigate().back(); //by using navigate().back() method we can move back to the previous page
		driver.navigate().forward(); //by using navigate().forward() method we can move forward to the next page
		driver.navigate().refresh(); //by using navigate().refresh() method we can reload the page 

	}

}
