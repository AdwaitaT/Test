package adwaitapractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExplicitWaitAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement staticDropdown= driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='admin']")).click();
		
		//driver.findElement(By.xpath("//select[@class=form-control]")).click();
		
		//Dropdown
		Select dropdown= new Select(staticDropdown);
		dropdown.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		//Adding all the products to cart
		int num = driver.findElements(By.xpath("//button[@class='btn btn-info']")).size();
		
		List<WebElement> products= driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for(int i=0; i<num; i++)
		{
			
			products.get(i).click();
		}
		
	}

}
