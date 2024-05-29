package orangehrm.labrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utils.apputils;

public class Employee extends apputils
{
	public boolean AddEmployee(String fname,String lname)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		String empdata =driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();

	   driver.findElement(By.linkText("Employee List")).click();
	   driver.findElement(By.id("empsearch_id")).sendKeys(empdata);
	   driver.findElement(By.id("searchBtn")).click();
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,1000)");
	   
	    WebElement emptable =	driver.findElement(By.id("resultTable"));
		List<WebElement> rows = emptable.findElements(By.tagName("tr"));
	boolean isempexist = false;
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equalsIgnoreCase(empdata))
			{
				isempexist = true;
			}
		}
		return isempexist;
	}
}
