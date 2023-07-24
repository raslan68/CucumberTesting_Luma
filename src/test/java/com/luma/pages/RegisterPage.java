package com.luma.pages;

import com.luma.utilities.Driver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends AbstractClass{

    public RegisterPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
    private WebElement registerButton;

    public void  bottonClick(){
        registerButton.click();
    }
// --------------------------------------

    @FindBy(id = "firstname")
    public WebElement firstname;


    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "email_address")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "password-confirmation")
    public WebElement passwordconfirm;

    @FindBy(xpath = "//button[@title='Create an Account']")
    public WebElement createButton;

    @FindBy(xpath = "//div[contains(text(),'Thank you for registering with Main Website Store.')]")
    public WebElement verificationRegister;

    @FindBy(xpath = "//div[@class='message-error error message']")
    public WebElement Verification_Not_Register;


}
