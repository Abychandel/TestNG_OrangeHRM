package orangehrm.Testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import orangehrm.labrary.AdminUtils;
import orangehrm.labrary.Employee;


public class Employee_Registration extends AdminUtils
{
	
   @Parameters({"fname","lname"})
   @Test
	public void EmployeeReg(String fname, String lname)
	{
		
		
		Employee emp = new Employee();
		boolean res = emp.AddEmployee(fname, lname);
	
		Assert.assertTrue(res);
	
	}
	
}
