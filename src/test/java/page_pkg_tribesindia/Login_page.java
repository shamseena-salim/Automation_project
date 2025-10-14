package page_pkg_tribesindia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
	 WebDriver d;

	By emailfield=By.id("email");
	By passwordfield=By.id("password");
	By loginbuttonfield=By.xpath("//button[@class='btn btn-primary btn-block fw-700 fs-14 rounded-2 submit-button']");
	
	public Login_page(WebDriver d)
	{
		this.d=d;
	}
	
	public void setvalues(String email,String password)
	{
		d.findElement(emailfield).sendKeys(email);
		d.findElement(passwordfield).sendKeys(password);	
	}
	
	public void click()
	{
		d.findElement(loginbuttonfield).click();
	}

}
