package orangehrm.labrary;

import org.openqa.selenium.By;

import Utils.apputils;

public class LoginPage extends apputils 
{
 public void Login(String uid, String pwd) 
 {
	 
	 driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
	}
	public boolean isAdminModuleDisplay()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else 
		{
			return false;
		}
	}
	public void Logout() 
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

	  public boolean isErrorMsgDisplay()
	  {
		String errmsg = driver.findElement(By.id("spanMessage")).getText();
		if(errmsg.toLowerCase().contains("invalid")|| errmsg.toLowerCase().contains("empty"))
		{
			return true;
		}else
		{
			return false;
		}
	  }
	

	 
 }

