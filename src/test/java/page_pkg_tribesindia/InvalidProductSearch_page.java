package page_pkg_tribesindia;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class InvalidProductSearch_page {
	
	WebDriver d;
	
	By searchboxfield=By.xpath("//*[@id=\"search\"]");
	
	
	public InvalidProductSearch_page(WebDriver d)
	{
		this.d=d;
	}
	
	public void setup(String productname) throws InterruptedException
	{
		d.findElement(searchboxfield).sendKeys(productname);
		Thread.sleep(3000);  // short pause

		String pageSource = d.getPageSource();
		if (pageSource.contains("Sorry, nothing found for \"facewash\"")) 
		{
		    System.out.println("Invalid product search");
		} 
		else 
		{
		    System.out.println("Product search returned unexpected results");
		}

}
}
