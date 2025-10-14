package test_pkg_tribesindia;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class LogoDisplay_test {
	WebDriver d;
	@Test
	public void test() throws IOException
	{
		d=new ChromeDriver();
		d.get("https://tribesindia.com/");
		WebElement w=d.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[1]/div/div[1]/a/img"));
		File f=w.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File("./Screenshotsoftribesindia//Logo_of_tribesindia.png"));
		if(w.isDisplayed())
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
		
	}

}
