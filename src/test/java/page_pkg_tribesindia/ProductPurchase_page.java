package page_pkg_tribesindia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPurchase_page {
	
	WebDriver d;
	
	By searchfield=By.id("search");
	By productfield=By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div");
	By buybutton=By.xpath("//*[@id=\"maincontent\"]/div/div/div/div[2]/div[3]/button[2]");
	By namefield=By.xpath("//input[@placeholder='Your name']");
	By emailfield=By.xpath("//input[@placeholder='Your Email']");
	By addressfield=By.xpath("//textarea[@placeholder='Your Address']");
	By countryfield=By.xpath("//*[@id=\"shipping_info\"]/div[1]/div[4]/div[2]/div/div/button/div/div/div");
	By statefield=By.xpath("//*[@id=\"shipping_info\"]/div[1]/div[5]/div[2]/div/button/div/div/div");
	By cityfield=By.xpath("//*[@id=\"shipping_info\"]/div[1]/div[6]/div[2]/div/button/div/div/div");
	By postalfield=By.xpath("//input[@placeholder='Your Postal Code']");
	By phonefield=By.xpath("//input[@id='phone-input']");
	By agreeboxfield=By.xpath("//*[@id=\"payment_info\"]/div[2]/label/span[1]");
	By completebuttonfield=By.id("submitOrderBtn");
	
	public ProductPurchase_page(WebDriver d)
	{
		this.d=d;
	}
	
	public void setup()
	{
		d.findElement(searchfield).sendKeys("honey",Keys.ENTER);
		d.findElement(productfield).click();
		d.findElement(buybutton).click();
	}
	public void setvalues(String name,String email,String address,String number,String country,String state,String city,String postal)
	{
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(15));
		WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(namefield));
	    firstName.sendKeys(name);
	    WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailfield));
	    emailField.sendKeys(email);
	    WebElement addressField = wait.until(ExpectedConditions.visibilityOfElementLocated(addressfield));
	    addressField.sendKeys(address);
	    WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(countryfield));
	    countryDropdown.click();
	    WebElement countryOption = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//span[normalize-space()='India']")
	    ));
	    countryOption.click();
	    WebElement stateDropdown = wait.until(ExpectedConditions.elementToBeClickable(statefield));
	    stateDropdown.click();
	    WebElement stateOption = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//a[@id='bs-select-2-19']")
	    ));
	    stateOption.click();

	    WebElement cityDropdown = wait.until(ExpectedConditions.elementToBeClickable(cityfield));
	    cityDropdown.click();
	    WebElement cityOption = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//span[normalize-space()='Aluva']")
	    ));
	    cityOption.click();	
	    WebElement postalField = wait.until(ExpectedConditions.visibilityOfElementLocated(postalfield));
	    postalField.sendKeys(postal);
	    WebElement phoneField = wait.until(ExpectedConditions.visibilityOfElementLocated(phonefield));
	    phoneField.sendKeys(number);
        d.findElement(agreeboxfield).click();
  
        WebElement completebuttonField = wait.until(ExpectedConditions.presenceOfElementLocated(completebuttonfield));
        ((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView(true);", completebuttonField);
        ((JavascriptExecutor) d).executeScript("arguments[0].click();", completebuttonField);

		
	}

}
