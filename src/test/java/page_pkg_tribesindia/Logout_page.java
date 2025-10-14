package page_pkg_tribesindia;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout_page {
	WebDriver d;
	
	By emailfield=By.id("email");
	By passwordfield=By.id("password");
	By loginbuttonfield=By.xpath("//button[@class='btn btn-primary btn-block fw-700 fs-14 rounded-2 submit-button']");
	

	
	public Logout_page(WebDriver d)
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
	
	public void setup()
	{
		d.findElement(By.xpath("/html/body/header/div[2]/div[1]/div/div[1]/div/ul/li[1]/a")).click();
		WebElement w=d.findElement(By.xpath("//*[@id=\"nav-user-info\"]/span"));
		Actions a=new Actions(d);
		a.moveToElement(w);
		a.perform();
		
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div[1]/div[2]/div/div/div/ul/li[5]/a/span")));
		d.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/div/div/div/ul/li[5]/a/span")).click();
	}
	
	

	
}