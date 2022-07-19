package mypacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {
		// How to handle drop down?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement drpCountryEle = driver.findElement(By.id("input-country"));
		
		Select drpCountry = new Select(drpCountryEle);
//		drpCountry.selectByVisibleText("Denmark");
//		drpCountry.selectByValue("3");
//		drpCountry.selectByIndex(12);
		
		//how to handle drop down without using select class method(selectByVisibleText,SelectByValue,SelectByIndex)?
		
		List<WebElement> allOptions= drpCountry.getOptions();
		for(WebElement option:allOptions) {
			if(option.getText().equals("Cuba")){
				option.click();
				break;
			}
			
		}
		
		

	}

}
