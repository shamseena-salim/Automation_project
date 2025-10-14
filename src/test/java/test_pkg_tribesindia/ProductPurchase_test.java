package test_pkg_tribesindia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_pkg_tribesindia.ProductPurchase_page;

public class ProductPurchase_test {
	
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
    	ProductPurchase_page ob=new ProductPurchase_page(d);
    	ob.setup();
    	ob.setvalues("shamseena", "shamseena@gmail.com", "Valiyakath(H),Edathala P.O, kuzhivelippady", "9876543219", "India", "Kerala", "Aluva", "683561");
    }
}
