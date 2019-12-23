package com.toolsqa.scripts;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.toolsqa.base.BaseTest;
import com.toolsqa.pages.MyAccountPage;
import generics.Utility;

/**
 * To verify user is able to register to the application
 * 
 * @Author Smeetha
 */
public class RegsitrationTest extends BaseTest{

	@Test
	public void registration() throws Exception
	{
		
		 int rc=Utility.getExcelRowCount(INPUT_PATH, "Registration");
		
		 for(int i=1;i<=rc;i++)
		   {
			 String userName=Utility.getExcelCellValue(INPUT_PATH, "Registration",i,1);
			 String emailId=Utility.getExcelCellValue(INPUT_PATH, "Registration",i,2);
			 String password=Utility.getExcelCellValue(INPUT_PATH, "Registration",i,3);
			 
			 
			 MyAccountPage myAccReg = new MyAccountPage(driver);
			 myAccReg.registartion(userName, emailId , password);
			
			 String actualTitle = driver.getTitle();
			 System.out.println("Actual Ree::"+actualTitle);
			 String expectedTitle = "Log In ‹ ToolsQA Demo Site — WordPress";
			 assertEquals(expectedTitle,actualTitle);
				
		   }
		 
		
			
	}
}
		
		 
		 
		 
		 
		 
		 
		 
		 
	
	

