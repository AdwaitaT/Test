package adwaitapractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
		
		WebElement wb1=driver.findElement(By.xpath("//frame[@src='/frame_top']"));
		driver.switchTo().frame(wb1);
		
		WebElement wb2=driver.findElement(By.xpath("//frame[@src='/frame_middle']"));
		driver.switchTo().frame(wb2);
		
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
