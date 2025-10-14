package page_pkg_tribesindia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Removefromcart_page {
	
	WebDriver d;
	
	By honeyfield=By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div");
	By honeycartfield=By.xpath("//*[@id=\"maincontent\"]/div/div/div/div[2]/div[3]/button[1]");
	By removecartbuttonfield=By.xpath("//li[1]//div[1]//div[4]//a[1]");
    By emptyCartMessage =By.xpath("(//*[contains(text(),'Your Cart is empty')])[2]");
	
	public Removefromcart_page(WebDriver d)
	{
		this.d=d;
	}
	
	public void setup()
	{
		d.findElement(honeyfield).click();
		d.findElement(honeycartfield).click();
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		WebElement removeBtn = wait.until(
		    ExpectedConditions.elementToBeClickable(removecartbuttonfield)
		);
		removeBtn.click();
		WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCartMessage));
		        String actualMessage = messageElement.getText().trim();
		        String expectedMessage = "Your Cart is empty";
		        if (actualMessage.equalsIgnoreCase(expectedMessage))
		        {
		            System.out.println("Test Passed: Product removed from cart successfully.");
		        } 
		        else 
		        {
		            System.out.println("Test Failed: Product is not removed from cart");
		        }
		        
		     
	}

}
