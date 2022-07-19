package mypacakage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) {
		// How to select specific Check Box?
		// How to select all the Check Boxes?
		// How to select multiple Check Boxes by choice?
		// How to select last 2 Check Boxes?
		// How to select first 2 Check Boxes?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// How to select specific Check Box?
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		
		// How to select all the Check Boxes?
		List<WebElement> cbs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		//System.out.println("total cbs:"+cbs.size());
		
		//by using for loop
//		for(int i=0; i<cbs.size(); i++) {
//			cbs.get(i).click();
//		}
		
		//by using for each loop
		
//		for(WebElement newcb:cbs) {
//			newcb.click();
//		}
		
		// How to select multiple Check Boxes by choice?
		
//		for(WebElement newcb:cbs) {
//			String cbname = newcb.getAttribute("id");
//			if(cbname.equals("checkBoxOption1") || cbname.equals("checkBoxOption3")) {
//				newcb.click();
//			}
//		}
		
		// How to select last 2 Check Boxes?
		//first we need to count how many number of check boxes are there and
		//then how many check boxes we need to select from the last
		
//		       int totalcheckboxes= cbs.size();
//		       for(int i=totalcheckboxes-2; i<totalcheckboxes; i++) {
//		    	   cbs.get(i).click();
//		       }
		       
		      // How to select first 2 Check Boxes?
		       int totalcheckboxes= cbs.size();
		       for(int i=0; i<totalcheckboxes; i++) {
		    	   if(i<2) {
		    	   cbs.get(i).click();
		    	   }
		       }
		       
		
		
		
		

	}

}
