package mypacakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	//how to launch browser in WebDriver?
	//how to open URL?
	//how to capture Title of the page?
	//how to capture current URL of the page?
	//how to capture pager source of the page?
	
	public static void main(String[] args) {
		
		// we can launch the browser in WebDriver in two ways:
		//first by using System.setProperty("key","Value") in which we give the path of the driver we have downloaded in our system
		//second by using WebdriverManager API. For that we need to add Webdrivermanager dependancy in pom.xml file
		 
       //System.setProperty("webdriver.chrome.driver","C:\\Users\\Raviraj jadhav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//then we need to create the instance of the WebDriver which can be implemented by particular browser class.
		WebDriver driver = new ChromeDriver();
		
		//By using get() method we can open the URL
		driver.get("https://frontend.nopcommerce.com/");
		
		//by using getTitle() method we can capture Title of the page
		System.out.println("Title of te webPage is:"+driver.getTitle());
		
		//by using getCurrentUrl() method we can capture Current URL of the page
		System.out.println("current url is:" +driver.getCurrentUrl());
		
		//by using getPageSource() method we can capture page source of the page
		System.out.println("PageSource is:" +driver.getPageSource());
		

	}

}
