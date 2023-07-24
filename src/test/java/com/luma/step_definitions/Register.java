package com.luma.step_definitions;

import com.luma.pages.RegisterPage;
import com.luma.utilities.ConfigurationReader;
import com.luma.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Register {
    RegisterPage registerPage = new RegisterPage();

    @Given("navigate to Homepage")
    public void navigate_to_Homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
    }

    @When("click create an Account Button")
    public void click_create_an_Account_Button() {

        registerPage.bottonClick();
    }

    @And("enter name {string}")
    public void enter_name(String string) {
       registerPage.firstname.sendKeys("Rami");
    }

    @And("enter lastname {string}")
    public void enter_lastname(String string) {
       registerPage.lastname.sendKeys("Aslan");
    }

    @And("enter email {string}")
    public void enter_email(String string) {
       registerPage.email.sendKeys("Rami@gmail.com");
    }

    @And("enter password {string}")
    public void enter_password(String string) {
        registerPage.password.sendKeys("RamazanAslan-123");
    }

    @And("enter confirm password {string}")
    public void enter_confirm_password(String string) {
      registerPage.passwordconfirm.sendKeys("RamazanAslan-123");
    }

    @And("click on create an Account Button")
    public void click_on_create_an_Account_Button() {
        registerPage.createButton.click();
    }

    @Then("verify Register succefully")
    public void verify_Register_succefully() throws InterruptedException {
        String expected = "Thank you for registering with Main Website Store.";
        Assert.assertEquals(registerPage.verificationRegister.getText(), expected);
    }

    @Then("verify Register not succefully")
    public void verify_Register_not_succefully() {
        String expected = "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";
        Assert.assertEquals(registerPage.Verification_Not_Register.getText(), expected);
    }



}
