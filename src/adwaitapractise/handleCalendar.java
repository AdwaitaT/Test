package adwaitapractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
//		WebElement currentMonth=driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch'] "));
		
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch'] ")).getText().contains("April 2023"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
//		April 23
		driver.findElement(By.id("travel_date")).click();
		List<WebElement> dates=driver.findElements(By.className("day"));
		
		for(int i=0; i<driver.findElements(By.className("day")).size();i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
