package adwaitapractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class limitingWebdriverScopeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#");
		driver.manage().window().maximize();
		
//		Check any checkbox and grab the text mentioned for the same
		driver.findElement(By.id("checkBoxOption2")).click();
		String s=driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(s);
		
//		Select the same radio button as checkbox by using data from above step
		String s1="//option[text()='"+s+"']";
		driver.findElement(By.xpath(s1)).click();
		
//		Enter grabbed text in the textbox
		driver.findElement(By.id("name")).sendKeys(s);
		driver.findElement(By.id("alertbtn")).click();
		
		if(driver.switchTo().alert().getText().contains(s)) {
			System.out.println("Test successful");
		}
	}

}
