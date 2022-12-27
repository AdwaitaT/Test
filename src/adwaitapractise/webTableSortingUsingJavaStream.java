package adwaitapractise;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webTableSortingUsingJavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
		driver.manage().window().maximize();
		
		//click on column for sorting names
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Capture all the vegetable names from the column and store it in a list
		List<WebElement> elementList=driver.findElements(By.xpath("//tr/td[1]"));
		List<String>originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
//		Sort the original list
		List<String>sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
//		Compare original list and sorted list. If they are equal, test passes
		Assert.assertTrue(originalList.equals(sortedList));
		
//		Get the price of mentioned vegetable
//		Scan the column to find the vegetable and once it is found, get the price
		
		List<String> price;
		
		do
		{
			
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
			price=rows.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
			
			price.forEach(a->System.out.println(a));
			
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@area-label='Next']")).click();
			
		}
		}while(price.size()<1);
	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		
		String prc=s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();
		return prc;
	}

}
