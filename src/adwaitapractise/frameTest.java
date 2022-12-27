package adwaitapractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement wb1=driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		driver.switchTo().frame(wb1);
		driver.findElement(By.id("draggable")).click();
		WebElement wb2=driver.findElement(By.id("draggable"));
		WebElement wb3=driver.findElement(By.id("droppable"));
		
		Actions a= new Actions(driver);
		a.dragAndDrop(wb2, wb3).build().perform();
		System.out.println(driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable ui-state-highlight']/p")).getText());
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//a[@href='/resources/demos/droppable/default.html']")).getText());
	}

}
