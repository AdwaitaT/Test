package adwaitapractise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adwaita\\eclipse-workspace\\Adwaita_1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Get the URLs with attribute (href)
		
		List<WebElement> links=driver.findElements(By.xpath("//div[@id='gf-BIG']//li/a"));
		
		SoftAssert a=new SoftAssert();
		
		for (WebElement link: links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode= conn.getResponseCode();
			System.out.println(respCode);
			
			a.assertTrue(respCode<400,"The link with text '"+ link.getText()+"' is broken with code "+respCode);
			
//			if(respCode>400)
//			{
//				System.out.println("The link with text "+ link.getText()+"is broken with code "+respCode);
//			}
		}
		//This line will pass only if there was no broken link. It will fail if it has at least one broken link
		a.assertAll();
		
		
		//Call openConnection method. This method is present in URL class. So we are calling the method by creating object and
		//then writing object.method, And the return type of the method is HTTP URL Connection
		
		
		

	}

}
