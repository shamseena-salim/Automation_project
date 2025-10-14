package test_pkg_tribesindia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_pkg_tribesindia.Login_page;

public class Login_test {
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
		Login_page ob=new Login_page(d);
		ob.setvalues("shamsy@gmail.com", "Shamsy01@password");
		ob.click();
	}

}
