package test_pkg_tribesindia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_pkg_tribesindia.InvalidProductSearch_page;

public class InvalidProductSearch_test {
	
	WebDriver d;
	@BeforeTest
	public void begin()
	{
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://tribesindia.com/");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		InvalidProductSearch_page ob=new InvalidProductSearch_page(d);
		ob.setup("facewash ");

		
	}

}
