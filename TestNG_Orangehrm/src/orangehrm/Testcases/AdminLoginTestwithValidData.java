package orangehrm.Testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.apputils;
import orangehrm.labrary.LoginPage;

public class AdminLoginTestwithValidData extends apputils
{
	@Parameters({"uid","pwd"})
    @Test
	public void checkAdminLogin(String uid,String pwd)
	{
		LoginPage lp = new LoginPage();
		lp.Login(uid, pwd);
	    boolean res = lp.isAdminModuleDisplay();
	    Assert.assertTrue(res);
	    lp.Logout();
	}
	
	
	
}
