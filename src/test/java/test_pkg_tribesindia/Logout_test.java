package test_pkg_tribesindia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_pkg_tribesindia.Logout_page;

public class Logout_test {
	
	WebDriver d;
	@BeforeTest
	public void begin()
	{
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://tribesindia.com/users/login");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Logout_page ob=new Logout_page(d);
		ob.setvalues("shamsy@gmail.com", "Shamsy01@password");
		ob.click();
		ob.setup();
	}
	
	

}
