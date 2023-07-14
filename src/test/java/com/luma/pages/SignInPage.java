package com.luma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.utilities.Driver;

public class SignInPage {
	
	public SignInPage() {
		PageFactory.initElements(Driver.get(), this);
	}	

	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	public WebElement signInButton;

	@FindBy(id="email")
	public WebElement email;

	@FindBy(id = "pass")
	public WebElement password;

	@FindBy(xpath = "//fieldset[@class='fieldset login']//button[@id='send2']")
	public WebElement LiginSubButton;



	
}
