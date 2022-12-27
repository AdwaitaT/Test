package adwaitapractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HareshTimepass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		//Navigation methods
		/*driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in/");
		driver.close();*/
		//driver.findElement(By.id("opentab")).click();
		//Thread.sleep(2000);
		//driver.quit();
		////label[@for='radio3']/preceding-sibling::label[0]
		
		
		//Input Text
//		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Adwaita");
//		driver.findElement(By.xpath("//input[@name='enter-name']")).clear();
		
		
		System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
	}


}
