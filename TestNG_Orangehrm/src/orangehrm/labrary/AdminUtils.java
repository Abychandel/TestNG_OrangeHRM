package orangehrm.labrary;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.apputils;

public class AdminUtils extends apputils
{
	LoginPage lp; 
	String uid = "Admin";
	String pwd = "Qedge123!@#";
	
	@BeforeTest
public void adminlogin()
{
	
  lp = new LoginPage();
  lp.Login(uid, pwd);


}
	@AfterTest
	public void adminlogout()
	{
		lp.Logout();
		
	}
}
