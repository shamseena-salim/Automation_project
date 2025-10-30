package page_pkg_tribesindia;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
	
	public void setvalues() throws IOException
	{
		File f=new File("D:\\program files\\fblogindatas.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			d.findElement(emailfield).clear();
			d.findElement(emailfield).sendKeys(email);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			d.findElement(passwordfield).clear();
			d.findElement(passwordfield).sendKeys(password);
		}
	}
	
	public void click()
	{
		d.findElement(loginbuttonfield).click();
	}

}
