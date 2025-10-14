package test_pkg_tribesindia;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_pkg_tribesindia.Registration_page;

public class Registration_test{

	WebDriver d;
	@BeforeTest
	public void begin()
	{
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://tribesindia.com/users/registration");
	}

	@Test
	public void test() throws IOException, InterruptedException
	{
		Registration_page ob=new Registration_page(d);
             ob.setvalues("shamsy", "9876543211", "shamsy@gmail.com", "Shamsy01@password", "Shamsy01@password");
		     ob.click();
		     
	}
	
	

}
