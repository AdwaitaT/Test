package adwaitapractise;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultWindowsTabs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		Navigate to https://rahulshettyacademy.com/angularpractice/
//		Fill the name field with the first couse name available at https://rahulshettyacademy.com/
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow).get("https://rahulshettyacademy.com/");
		
//		We have to capture the first course available at the link https://rahulshettyacademy.com/
//		Point to note here is the first link is available at 1st index and not at 0th index
//		hence CSS or Xpath will be written for 1st index
		
		String course=driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p')]")).get(1).getText();
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(course);
		
//		Take screenshot for the webelement
		File file=driver.findElement(By.xpath("//input[@name='name']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("name.png"));

	}

}
