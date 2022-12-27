package adwaitapractise;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webTableFilterUsingJavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
//		Type vegetable name and see if the filter results display the correct vegetable name
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
//		Ideally columns containing text "Rice" should be displayed. But in order to validate if the filter functionality is working,
//		we will capture all the displayed names from the column after applying filter
		List<WebElement>veggies=driver.findElements(By.xpath("//tr/td[1]"));
		
//		Here we are manually filtering names containing "Rice" from veggies list and validating if both lists are same
		List<WebElement>filteredList=veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(veggies.size(),filteredList.size());

	}

}
