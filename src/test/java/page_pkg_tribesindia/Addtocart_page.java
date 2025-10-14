package page_pkg_tribesindia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocart_page {
	
	WebDriver d;
	 
    By jewelfield=By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[20]/div");
    By cartfield=By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[20]/div/div[2]/div[2]/button");
    By cartbuttonfield=By.xpath("//*[@id=\"addToCart-modal-body\"]/div/div/div[2]/div/div[2]/button[1]");
    By proceedbuttonfield=By.xpath("//*[@id=\"addToCart-modal-body\"]/div/div[3]/div[2]/a");
	
	public Addtocart_page(WebDriver d)
	{
		this.d=d;
	}
	
	public void setup()
	{
		JavascriptExecutor js=((JavascriptExecutor)d);
	    WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(50));
	    WebElement jewel = d.findElement(jewelfield);
		js.executeScript("arguments[0].scrollIntoView();", jewel);
		WebElement cartBtn = wait.until(ExpectedConditions.elementToBeClickable(cartfield));
		try
		{
	    cartBtn.click();
		}
		catch(Exception e)
		{
	    js.executeScript("arguments[0].click();", cartBtn);
		}

	    
	    WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(cartbuttonfield));
	    cartButton.click();

	    
	    WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(proceedbuttonfield));
	    proceedButton.click();
	}
		

}
