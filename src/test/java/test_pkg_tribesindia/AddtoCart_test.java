package test_pkg_tribesindia;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_pkg_tribesindia.Addtocart_page;

public class AddtoCart_test {
	
	WebDriver d;
	
	@BeforeTest
	public void begin()
	{
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://tribesindia.com/search?keyword=jewellery");
	}
	@Test
	public void test()
	{
		Addtocart_page ob=new Addtocart_page(d);
		ob.setup();
		
	}

}
