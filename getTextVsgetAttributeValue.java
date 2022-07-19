package mypacakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsgetAttributeValue {

	public static void main(String[] args) {
		// How to Enter & Clear text from InputBox?
		// How to capture text from InputBox?
		//What is the diff bet getText() and getAttribute('Value') methods?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement emailinputbox=driver.findElement(By.id("Email"));
		
		//How to Clear text from InputBox?
		// by using clear()method we can clear the text from InputBox
		emailinputbox.clear();
		
		//How to Enter text in InputBox?
		// by using sendKeys()method we can enter/send the text in InputBox
		emailinputbox.sendKeys("rj@gmail.com");
		
		//How to capture text from InputBox?
		//by using getText() & getAttribute('method')we can capture the text/value from InputBox
		//by using getAttribute('value') method we can capture the value/text of any attribute of the InputBox
		//getAttribute('value') returns the value of any attribute
		System.out.println("available text is:"+emailinputbox.getAttribute("value"));
		
		//What is the diff bet getText() and getAttribute('Value') methods?
		//getText() method returns the innerText of an element
		//inner text is not a part of any attribute or we can say inner text is not associated with any attribute.
		
		//getAttribute('value') returns the value of any attribute
		//getAttribute("value") is the method which will return the value which are associated with the attribute
	}

}
