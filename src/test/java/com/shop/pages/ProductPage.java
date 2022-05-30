package com.shop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public List<WebElement> getFiveProducts(){
        return  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//article[position() < 6]")));
    }

    public void openFirstProduct(){
        wait.until(ExpectedConditions.elementToBeClickable(getFiveProducts().get(0))).click();
    }

    public List<WebElement> getActiveSizePickers(){
        return wait.withMessage("elements are not visible")
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-selen='size']")));
    }

    public void selectSize(){
        for(int i=0; i<=getActiveSizePickers().size()-1;i++) {
            WebElement sizePicker = wait.withMessage("elements are not visible").withTimeout(Duration.ofSeconds(15))
                    .until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[data-selen='size']"), getActiveSizePickers().size())).get(i);
            if (sizePicker.getText().equals("41")) {
                sizePicker.click();
            }
        }
    }

    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-selen='add-to-cart-button']"))).click();
    }

    public void checkOut(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-selen='cart-confirmation-go-to-checkout']"))).click();

    }

}
