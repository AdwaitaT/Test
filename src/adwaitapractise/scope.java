package adwaitapractise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#");
		driver.manage().window().maximize();
		
//		Count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//		Count of links on Footer(below mentioned both ways work)
//		System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size());
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
//		Count of links from the first column of footer
		WebElement column1= footerDriver.findElement(By.xpath("//td[1]/ul"));
		System.out.println(column1.findElements(By.tagName("a")).size());
		
//		Click on each link in the column and check if pages are opening
		int c=column1.findElements(By.tagName("a")).size();
		
		for (int i=1; i<c; i++) {
			
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column1.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			//column1.findElement(By.xpath("//li[i]//a")).click();
		}
		
		Thread.sleep(5000);
		Set<String> S1=driver.getWindowHandles();	
		Iterator<String> it=S1.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
