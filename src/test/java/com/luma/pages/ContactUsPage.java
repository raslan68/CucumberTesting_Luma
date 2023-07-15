package com.luma.pages;

import com.luma.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends AbstractClass{

    public ContactUsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Contact Us']")
    public WebElement ContactUsButton;

    @FindBy(id = "name")
    public WebElement ContactUsName;

    @FindBy(id = "email")
    public WebElement ContactUsEmail;

    @FindBy(id = "comment")
    public WebElement ContactUsMind;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement ContactUsSubmit;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement VerificationContactUs;

}
