package page_pkg_tribesindia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProductSearch_page {
	WebDriver d;
	
	By searchbarfield=By.id("search");
	
	public ProductSearch_page(WebDriver d)
	{
		this.d=d;
	}
	
	public void setvalues(String search)
	{
		d.findElement(searchbarfield).sendKeys(search,Keys.ENTER);
	}

}
