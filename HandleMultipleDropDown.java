package mypacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDown{
	static WebDriver driver;
	public static void main(String[] args)throws Exception {
		// How to Handle multiple drop down without using generic methods. //generic methods means select class methods
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement  product = driver.findElement(By.xpath("//select[@id='first']"));   
		selectDropdownValue("Google",product);
		
		WebElement  animals = driver.findElement(By.id("animals"));
		selectDropdownValue("Baby Cat",animals);
				
	}
	
	
	public static  void selectDropdownValue(String value,WebElement element) {
		Select drp  = new Select(element);
		  List<WebElement> allOptions=drp.getOptions();		  
		  for(WebElement options:allOptions) { if(options.getText().equals(value)){
		  options.click(); break; 
		  }
		}
}

}
