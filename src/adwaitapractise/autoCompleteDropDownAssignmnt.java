package adwaitapractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoCompleteDropDownAssignmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Actions a =new Actions(driver);
		driver.findElement(By.xpath("//div[Text()='India']")).click();
//		a.moveToElement(driver.findElement(By.xpath("//div[Text()='India']"))).build().perform();
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('ui-id-156')");
//		a.moveToElement(js.executeScript("document.getElementById('ui-id-156')"));
		
	}

}
