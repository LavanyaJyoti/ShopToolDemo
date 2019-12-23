package com.toolsqa.scripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.toolsqa.base.AutomationConstants;
import com.toolsqa.base.BaseTest;
import com.toolsqa.pages.MyAccountPage;

import generics.Utility;
/**
 * To verify user is able to login to application
 * 
 * @Author Smeetha
 */
public class LoginTest extends BaseTest implements AutomationConstants{

	public static String un;
	public static String pw;
	
	@Test
	public void Login() throws Exception {

		un = Utility.getPropertyValue(CONFIG_PATH, "UN");
		pw = Utility.getPropertyValue(CONFIG_PATH, "PW");
		MyAccountPage myAccLogin = new MyAccountPage(driver);
		myAccLogin.login(un, pw);
		
		 String actualTitle = driver.getTitle();
		 System.out.println("Actual Ree::"+actualTitle);
		 String expectedTitle = "My Account – ToolsQA Demo Site";
		 assertEquals(expectedTitle,actualTitle);
			

	}
}
