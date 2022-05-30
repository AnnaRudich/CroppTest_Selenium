package com.shop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void openPage(){
        driver.get(baseUrl);
        //cookiePopUp handling
        WebElement cookieDialog = driver.findElement(By.id("cookiebotDialogOkButton"));
       if(cookieDialog.isDisplayed()){
           cookieDialog.click();
        }
    }


}
