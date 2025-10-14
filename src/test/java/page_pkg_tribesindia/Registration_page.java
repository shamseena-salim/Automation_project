package page_pkg_tribesindia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration_page {
	
	WebDriver d;
	By fullnamefield=By.name("name");
	By numberfield=By.id("phone-code");
	By emailfield=By.xpath("//*[@id=\"reg-form\"]/div[4]/input");
	By passwordfield=By.name("password");
	By confirmpasswordfield=By.name("password_confirmation");
	By agreecheckboxfield=By.xpath("//*[@id=\"reg-form\"]/div[8]/label/span[2]");
	By registerbuttonfield=By.xpath("/html/body/div[1]/div[4]/section/div/div/div/div[1]/div[2]/div/div/div/div/div/form/div[9]/button");
	By loginlink=By.xpath("//*[@id=\"maincontent\"]/section/div/div/div/div[1]/div[2]/div/p/a\r\n");
	
	public Registration_page(WebDriver d)
	{
		this.d=d;
	}
	
	
	public void setvalues(String fullname,String number,String email,String password,String confirmpassword)
	{
		d.findElement(fullnamefield).sendKeys(fullname);
		d.findElement(numberfield).sendKeys(number);
		d.findElement(emailfield).sendKeys(email);
		d.findElement(passwordfield).sendKeys(password);
		d.findElement(confirmpasswordfield).sendKeys(confirmpassword);
	}
	
	public void click() {
	    WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));

	    
	    WebElement w = wait.until(ExpectedConditions.elementToBeClickable(agreecheckboxfield));
	    w.click();

	    // Scroll and click register button
	    WebElement registerBtn = wait.until(ExpectedConditions.elementToBeClickable(registerbuttonfield));
	    registerBtn.click();

	    // Handle alert if exists
	    try {
	        d.switchTo().alert().accept();
	    } catch (Exception e) {
	        System.out.println("No alert found.");
	    }

	    d.findElement(loginlink).click();
	}


}
