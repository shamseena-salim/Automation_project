package test_pkg_tribesindia;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Link_validation_test {
	
	WebDriver d;
	String baseurl="https://tribesindia.com/";
	@BeforeTest
	public void begin()
	{
		d=new ChromeDriver();
		d.get(baseurl);
		
	}
	@Test
	public void test() throws IOException
	{
		List <WebElement> w=d.findElements(By.tagName("a"));
		URL ob=new URL(baseurl);
		HttpsURLConnection con=(HttpsURLConnection) ob.openConnection();
		int responsecode=con.getResponseCode();
		for(WebElement web:w)
		{
			System.out.println(web.getAttribute("href")+     "        "+responsecode);
			if(responsecode==200)
			{
				System.out.println("Link is valid");
			}
			else
			{
				System.out.println("Link is invalid");
			}
		}
	}

}
