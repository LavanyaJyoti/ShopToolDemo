package com.toolsqa.scripts;

import org.testng.annotations.Test;

import com.toolsqa.base.BaseTest;
import com.toolsqa.pages.MyAccountPage;


/**
 * Test to verify links available on My-Account page
 * 
 * @Author Smeetha
 */

public class VerifyLinksTest extends BaseTest {

	@Test
	public void Links() throws Exception {
		
		MyAccountPage myAccVerifyLinks = new MyAccountPage(driver);
		myAccVerifyLinks.verifyLinks();

	}
}
