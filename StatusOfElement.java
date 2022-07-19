package mypacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfElement {

	public static void main(String[] args) {
		
		//How to check WebElemenet is Displayed, Enabled, and Selected?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		//By using isDisplayed() method we can check weather the element is Displayed or Not
		System.out.println("display status:"+searchStore.isDisplayed());      //True expected
		
		//By using isEnabled() method we can check weather the element is Enabled or Not
		System.out.println("Enabled status:"+searchStore.isEnabled());      //True expected
		
		//By using isSeected() method we can check weather the element is Selected or Not
		//isSelected(): specially use for radio buttons , check boxes and drop downs
		
		WebElement male= driver.findElement(By.xpath(" //input[@id='gender-male']"));
		WebElement female= driver.findElement(By.xpath(" //input[@id='gender-female']"));
		
		// nothing is selected so both is false
		System.out.println(male.isSelected()); //false
		System.out.println(female.isSelected()); //false
		
		male.click();
		//here male is selected so it will return true for male
		System.out.println(male.isSelected()); //true
		System.out.println(female.isSelected()); //false
		
		female.click();
		//here female is selected so male becomes false
		System.out.println(male.isSelected()); //false
		System.out.println(female.isSelected()); //true
		
	}

}
