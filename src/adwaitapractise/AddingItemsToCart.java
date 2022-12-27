package adwaitapractise;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] veggies = { "Cucumber", "Brocolli" };
		List veggiesList = Arrays.asList(veggies);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

//		addItems(driver,veggies);
		AddingItemsToCart b= new AddingItemsToCart();
		b.addItems(driver, veggies);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}


public static void addItems(WebDriver driver, String[] veggies) throws InterruptedException {

			for (int i = 0; i < veggies.length; i++) {
				driver.findElement(By.xpath("//input[@type='search']")).clear();
				driver.findElement(By.xpath("//input[@type='search']")).sendKeys(veggies[i]);
				// driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				
				String xpath1= "//h4[text()='"+veggies[i]+" - 1 Kg']/following::div[2]/button";
				System.out.println(xpath1);
				
				driver.findElement(By.xpath(xpath1)).click();
				//Thread.sleep(3000);
				System.out.println(driver.findElement(By.xpath(xpath1)).getText());

			}
}
}