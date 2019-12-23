package com.toolsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.toolsqa.base.BasePage;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);

	}

	// locators for registration functionality//
	@FindBy(id = "reg_username")
	private WebElement registerusername;

	@FindBy(id = "reg_email")
	private WebElement registeremail;

	@FindBy(id = "reg_password")
	private WebElement regsiterpassword;

	@FindBy(xpath = ".//button[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']")
	private WebElement RegsiterBtn;
	
	// locators for login functionality// 
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath=".//button[@class='woocommerce-button button woocommerce-form-login__submit']")
	private WebElement loginBtn;
	
	//locators for My-Account page links//
	@FindBy(xpath = ".//a[@class='noo-search']")
	private WebElement GlobalsearchrBtn;

	@FindBy(xpath = ".//label[@class='note-search']")
	private WebElement GlobalsearchrNavigationText;

	@FindBy(xpath = ".//*[@class='navbar-logo']/a/img")
	private WebElement ShoptoolHeaderText;

	@FindBy(xpath = "//*[@class='icon_bag_alt']")
	private WebElement Minicart;

	@FindBy(xpath = " //h1[@class='page-title']")
	private WebElement Cartheading;

		
	//method to perform registration operation//
	public void registartion(String un, String pw, String em) {
		registerusername.sendKeys(un);
		registeremail.sendKeys(pw);
		regsiterpassword.sendKeys(em);
		RegsiterBtn.click();
	}
	
	//method to perform login operation//
	public void login(String un,String pw){
		username.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.click();
	}
	
	//method to perform verify links//
	public void verifyLinks() {

		MyAccountPage lin = new MyAccountPage(driver);
		GlobalsearchrBtn.click();
		lin.checkElementIsPresent(GlobalsearchrNavigationText);
		driver.navigate().to("http://shop.demoqa.com/my-account/");
		ShoptoolHeaderText.click();
		driver.navigate().to("http://shop.demoqa.com/my-account/");
		Minicart.click();
		lin.checkElementIsPresent(Cartheading);

	}

}
