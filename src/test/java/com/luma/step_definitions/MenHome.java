package com.luma.step_definitions;

import com.luma.pages.MenPages;
import com.luma.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;


public class MenHome {

    MenPages menPages = new MenPages();
    @When("click on Men Button in Homapage")
    public void click_on_Men_Button_in_Homapage() {
        Actions actions = new Actions(Driver.get());
        WebElement el=Driver.get().findElement(By.id("ui-id-5"));
        actions.moveToElement(el).build().perform();

    }

    @And("scroll on Tops")
    public void scroll_on_Tops() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(menPages.TopsUnderMen).build().perform();
    }

    @And("click on Jackets")
    public void click_on_Jackets() {
        menPages.JacketsUnderMenTops.click();

    }

    @And("write JacketModel {string} in searc input and I click on Lando Gym Jacket model")
    public void write_JacketModel_in_searc_input(String string) {
        menPages.SearchInput.sendKeys("Lando Gym Jacket", Keys.ENTER);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,500)");
        menPages.ClickOnLandoGymJacket.click();
    }

    @And("select size M")
    public void select_size_M() {
        menPages.ClickOnSize_M.click();
    }

    @And("select color Gray and I click on Add to Chart button")
    public void select_color_Gray() throws InterruptedException {
        menPages.ClickOnColor_Gray.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();",menPages.ClickOnAddToChartButton);

        Thread.sleep(5000);
        jse.executeScript("arguments[0].click();",menPages.ClickOnKorbButtton);

        WebElement firstResult = new WebDriverWait(Driver.get(), Duration.ofSeconds(10).getSeconds())
                .until(ExpectedConditions.visibilityOf(menPages.ActualLandoGymJacketInKorb));

        assertEquals(firstResult.getText(), "Lando Gym Jacket");
        System.out.println(firstResult.getText());

    }


}
