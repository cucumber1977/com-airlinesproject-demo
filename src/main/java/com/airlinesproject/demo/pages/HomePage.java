package com.airlinesproject.demo.pages;

import com.airlinesproject.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[@for='mat-radio-2-input']//span[@class='mat-radio-outer-circle']")
    WebElement oneway ;

    @CacheLookup
    @FindBy(xpath = "//input[@id='From']")
    WebElement from;

    @CacheLookup
    @FindBy(xpath = "//input[@id='To']")
    WebElement to;

    @CacheLookup
    @FindBy(xpath = "//button[@class='show-flight-btn col-lg-5 col-12 booking-flight-btn text-uppercase ng-star-inserted']")
    WebElement button;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Change the Way you Travel']")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//label[@for='mat-radio-2-input']//span[@class='mat-radio-outer-circle']")
    WebElement radiobutton;

    @CacheLookup
    @FindBy(xpath = "(//span[@class='mat-radio-outer-circle'])[1]")
    WebElement radio;

    @CacheLookup
    @FindBy(id = "dropdownForm1")
    WebElement passengeradd;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/flight-booking[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-search-flight[1]/div[1]/form[1]/div[1]/app-add-passenger[1]/div[1]/div[2]/div[1]/div[2]/button[2]")
    WebElement adult2;

    @CacheLookup
    @FindBy(xpath = "//div[@class='mat-select-arrow ng-tns-c42-0']")
    WebElement selectcls;

    @CacheLookup
    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Business']")
    WebElement businesscls;

    @CacheLookup
    @FindBy(css = "#topMenu1")
    WebElement support;

    @CacheLookup
    @FindBy(xpath = "//a[@id='topMenu1submenu0']")
    WebElement customersupport;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Contact Us')]")
    WebElement contactus;


    public void sendTextToFromField(){
        clickOnElement(from);
        from.sendKeys( Keys.DOWN, Keys.ENTER);
    }

    public void sendTextToToField(){
        //sendTextToElement(to,toField);
        clickOnElement(to);
        to.sendKeys( Keys.DOWN, Keys.DOWN, Keys.ENTER);
    }

    public void clickOnOneWay(){
        clickOnElement(oneway);
    }

    public void showFlights(){
        clickOnElement(button);

    }

    public String assertMethod(){
    return text.getText();
    }

    public void clickOnOneWayRadioButton(){
        clickOnElement(radio);
    }

    public void addPassenger(){
        clickOnElement(passengeradd);
        clickOnElement(adult2);
    }

    public void selectClass() {
        clickOnElement(selectcls);
        clickOnElement(businesscls);
    }

    public void mouseHooverOnSupport(){
        mouseHoverToElement(support);

    }

    public void mouseHooverAndClickCustomerSupport(){
        mouseHoverToElementAndClick(customersupport);
    }

    public String verifyContactUsText(){
        return getTextFromElement(contactus);

    }
}