package adwaitapractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDowns{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

driver.findElement(By.id("divpaxinfo")).click();

Thread.sleep(2000L);

System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

for(int i=1;i<5;i++)

{

driver.findElement(By.id("hrefIncAdt")).click();

}

driver.findElement(By.id("btnclosepaxoption")).click();

Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

}

}