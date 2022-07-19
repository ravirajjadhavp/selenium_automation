package mypacakage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		// How to handle Browser Windows in Selenium WebDriver?
		//->By using getWindowHandle() & getWindowHandles() methods.
		
		// Diff bet getWindowHandle() & getWindowHandles() methods?
		//->getWindowHandle() method returns the single window id
		//->getWindowHandles() method returns the Multiple window's id
		
		// How to switch bet Multiple Browser Windows?
		//-> By using switchTo() method ( driver.switchTo().window(parentWindowId);)
		// How to Close all Browser Windows?
		// How to close specific Browser window?

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//String windowID=driver.getWindowHandle(); //return id of the single browser window
		//System.out.println(windowID);             //every time window id will not be the same.
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click(); //here opening another window
		
		//getWindowHandles()
		Set<String> windowIds = driver.getWindowHandles(); //return id's of the multiple browser windows
		//System.out.println(windowIds);
		
		//Method1 = using iterator() method we can capture the multiple window IDs
		 
//		 Iterator<String> it= windowIds.iterator();
//		 String parentWindowId=it.next();
//		 String childWindowId=it.next();
//		 System.out.println("Parent Window Id"+parentWindowId);
//		 System.out.println("Child Window Id"+childWindowId);
		 
		 
		 //Method2 =using List/ArrayList
		 List<String> widowIdsList= new ArrayList(windowIds); //here we are converting Set into List
//		 String parentWindowId =  widowIdsList.get(0);
//		 String childWindowId  =  widowIdsList.get(1);
//		 System.out.println("Parent Window Id"+parentWindowId);
//       System.out.println("Child Window Id"+childWindowId);
         
         
		 //How to use window id's to switch between windows?
		 		 
//		 driver.switchTo().window(parentWindowId);
//		 System.out.println("parent window title"+driver.getTitle());
//		 
//		 driver.switchTo().window(childWindowId);
//		 System.out.println("child window title"+ driver.getTitle());
		 
		 //For each loop
		 
//		 for(String winId:widowIdsList) {
////			 System.out.println(winId);
//			 String title=driver.switchTo().window(winId).getTitle();
//			 System.out.println(title);
//		 }
//		 
//		 driver.close(); //close single browser window 
		 
		  // How to Close all Browser Windows?
		 //->  by using quit() method 
//		 driver.quit(); //close all the browser windows
		
			// How to close specific Browser window?
		 for(String winId:widowIdsList) {
			 String title=driver.switchTo().window(winId).getTitle();
			 System.out.println(title);
			 if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS")) {
				 driver.close();
				 
			 }
			 
		 }
		
	}

}
