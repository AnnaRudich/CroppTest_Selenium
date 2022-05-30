package com.shop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void assertUrl(){
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout/cart/"));
    }

    public void assertProductIssAdded(){
        Assert.assertTrue(wait
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-selen-group='product']"))).size()>0);
    }
}
