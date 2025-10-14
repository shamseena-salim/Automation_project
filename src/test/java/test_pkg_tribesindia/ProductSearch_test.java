package test_pkg_tribesindia;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_pkg_tribesindia.ProductSearch_page;

public class ProductSearch_test {
	
	WebDriver d;
	@BeforeTest
	public void begin()
	{
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://tribesindia.com/");
	}
	@Test
	public void test()
	{
		ProductSearch_page ob=new ProductSearch_page(d);
		ob.setvalues("jewellery");
		
	}

}
