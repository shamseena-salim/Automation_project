package test_pkg_tribesindia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_pkg_tribesindia.Removefromcart_page;

public class Removefromcart_test {
	
	WebDriver d;
	@BeforeTest
	public void begin()
	{
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://tribesindia.com/search?keyword=honey");
	}
	
	@Test
	public void test()
	{
		Removefromcart_page ob=new Removefromcart_page(d);
		ob.setup();
	}
	
	@AfterTest
	public void end()
	{
		d.quit();
	}

}
