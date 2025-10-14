package test_pkg_tribesindia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Titleverify_test {
	WebDriver d;
	@Test
	public void begin()
	{
		d=new ChromeDriver();
		d.get("https://tribesindia.com/");
		String actualtitle=d.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Tribes India | an Ecommerce Website";
		/*if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("Title verification pass");
		}
		else
		{
			System.out.println("Title verification fail");
		}*/
		Assert.assertEquals(actualtitle, expectedtitle);
	}

}
