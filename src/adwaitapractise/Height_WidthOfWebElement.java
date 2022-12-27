package adwaitapractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_WidthOfWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
//		Find the Height and Width of Name input box
		System.out.println("Height is: "+driver.findElement(By.xpath("//input[@name='name']")).getRect().getHeight());
		System.out.println("Width is: "+driver.findElement(By.xpath("//input[@name='name']")).getRect().getWidth());
	}

}
