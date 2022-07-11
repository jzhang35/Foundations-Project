package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Manager {

    WebDriver driver;
    @FindBy(id = "defect5")
    public WebElement defectInput;
    @FindBy(id = "employee5")
    public WebElement testerInput;
    @FindBy(id = "assign")
    public WebElement submitButton;
    @FindBy(id = "")
    public WebElement driver;


    public Manager(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void enterDefect(String defectId){
        this.defectInput.sendKeys(defectId); 
    }

    public void enterTester(String tester){
        this.testerInput.sendKeys(tester);
    }

    public void clickButton(){
        this.submitButton.click();
    }
    public void GetAlertText(){
        driver.switchTo().alert().getText();

    }

}