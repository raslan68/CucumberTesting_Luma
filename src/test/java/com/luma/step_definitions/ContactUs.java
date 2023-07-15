package com.luma.step_definitions;

import com.luma.pages.ContactUsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUs {

    ContactUsPage contactUsPage = new ContactUsPage();
    @When("click on Contact Us Button on Home Page")
    public void click_on_Contact_Us_Button_on_Home_Page() {
       contactUsPage.ContactUsButton.click();
    }

    @When("enter Contact Us Name {string}")
    public void enter_Contact_Us_Name(String string) {
       contactUsPage.sendKeysFunction(contactUsPage.ContactUsName, "Alex");
    }

    @When("enter Contact Us Email {string}")
    public void enter_Contact_Us_Email(String string) {
        contactUsPage.ContactUsEmail.sendKeys("alex@yahoo.de");
    }

    @When("enter his Mind  {string}")
    public void enter_his_Mind(String string) {
        contactUsPage.ContactUsMind.sendKeys("I test your Webpage");
    }

    @When("click on ContactUs Button")
    public void click_on_ContactUs_Button() {
       contactUsPage.ContactUsSubmit.click();
    }

    @Then("verify Contact Us successfully")
    public void verify_Contact_Us_successfully() {
        WebElement actual = contactUsPage.VerificationContactUs;
        String expected = "Thanks for contacting us with your comments and questions. We'll respond to you very soon.";
        contactUsPage.Assertion(actual, expected);
    }

}