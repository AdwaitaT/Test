package adwaitapractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTablesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		System.out.println(driver.findElements(By.xpath("//table[@class='table-display']//tr")).size());
		
		System.out.println(driver.findElements(By.xpath("//table[@class='table-display']//tr[1]/th")).size());
		
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display']//tr[3]")).getText());

	}

}
