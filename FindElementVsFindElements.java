package mypacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
//      findElement() --------> returns single web elements		
		
		//here the locator is pointing to single element, so it returning the single element only
		WebElement searchBox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchBox.sendKeys("XYZ");
		
		//here the locator is pointing to multiple element, but it returning the first element only
//		WebElement ele= driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
//		System.out.println(ele.getText());
//		
		//here if there is no matching element present , its throwing the exception: "NoSucElementException"
		//WebElement searchButton= driver.findElement(By.xpath("//button[contains(text(),'login')]"));
		
//		findElements() --------> returns multiple web elements
		
//		List<WebElement> links= driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		//System.out.println("total elements captured:"+ driver.findElements(By.xpath("//div[@class='footer-upper']//a")).size());
//		System.out.println("elements found:"+links.size());
		
		//if the single element is there we can directly perform the action on the element but
		//whenever there is  multiple element found  we have to write the looping statement to perform the action on particular element
		
//		for(WebElement elem:links) {
//			System.out.println(elem.getText());
//		}
		
		//if the single element is found in list of elements,then  still the return type of findElements() is List<WebElement>
//		List<WebElement> logo= driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println("logo sizeis:"+ logo.size());
//		driver.close();
		
		//if the element is not found using findElements() method, it will return 0. it will not throw any exception 
//		List<WebElement> img= driver.findElements(By.xpath("//img[contains(title, 'Electronics')]"));
//		System.out.println(img.size());
		
	}

}
