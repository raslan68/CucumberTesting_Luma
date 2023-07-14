package com.luma.pages;

import com.luma.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPages extends AbstractClass{

    public MenPages(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "ui-id-5")
    public WebElement MenButtonHomapage;


    @FindBy(xpath = "//a[@id='ui-id-17']//span[contains(text(),'Tops')]")
    public WebElement TopsUnderMen;

    @FindBy(id = "ui-id-19")
    public WebElement JacketsUnderMenTops;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement SearchInput;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/a/span/span/img")
    public WebElement ClickOnLandoGymJacket;

    @FindBy(id = "option-label-size-143-item-168")
    public WebElement ClickOnSize_M;

    @FindBy(id = "option-label-color-93-item-52")
    public WebElement ClickOnColor_Gray;

    @FindBy(id = "product-addtocart-button")
    public WebElement ClickOnAddToChartButton;

    @FindBy(xpath = "//span[@class='counter-number']")
    public WebElement ClickOnKorbButtton;

    @FindBy(xpath = "//a[@data-bind='attr: {href: product_url}, html: product_name']")
    public WebElement ActualLandoGymJacketInKorb;

}