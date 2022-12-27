package adwaitapractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		
//		We have to import a package for relative locator. Selenium will not give auto suggestion
//		import static org.openqa.selenium.support.locators.RelativeLocator.*
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
//		Clicking on element below given webelement
		WebElement dob=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
//		Clicking on element which is to the left side of given webelement
//		Clicking on checkbox
		WebElement iceCreamLabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
		
//		Clicking on element which is to the right side of given webelement
//		Capture text mentioned to the right of radio button
		WebElement rb=driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rb)).getText());
	}

}
