package com.luma.step_definitions;


import com.luma.pages.SignInPage;
import com.luma.utilities.ConfigurationReader;
import com.luma.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SignIn {

    SignInPage signInPage = new SignInPage();

    @Given("click on SignIn Button in Homapage")
    public void click_on_SignInt_Button_in_Homapage() {
        signInPage.signInButton.click();
    }

    @Then("enter Login email {string}")
    public void enter_Login_email(String string) {
        signInPage.email.sendKeys(ConfigurationReader.get("UserRamiEmail"));

    }

    @And("enter Login password {string}")
    public void enter_Login_password(String string) {
        signInPage.password.sendKeys("UserRamiPassword");
    }

    @And("click on Login SignbButton")
    public void click_on_Login_SignbButton() throws IOException, TesseractException {
        signInPage.LiginSubButton.click();
        File file =Driver.get().findElement(By.xpath("//div[@id='captcha-container-user_login']//img[@alt='Please type the letters and numbers below']"))
                        .getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir")+"captcha.png";
        FileHandler.copy(file, new File(path));

        ITesseract image = new Tesseract();
        String imageText = image.doOCR(new File(path));
        String captchaText = imageText.split("blow")[1].replace("[^a-zA-Z0-9]", "");
        System.out.println("Image Text "+imageText);
        Driver.get().findElement(By.id("captcha_user_login")).sendKeys(captchaText);


        WebElement cap =Driver.get().findElement(By.xpath("//*[@id=\"captcha-container-user_login\"]/div/img"));

    }

    @Then("verify Login succefully")
    public void verify_Login_succefully() {

    }


}
