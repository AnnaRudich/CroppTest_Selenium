package com.shop.pages;

import com.shop.MenuItems;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class NavigationBarPage extends BasePage {


    public NavigationBarPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public List<WebElement> getMenuItems(){
        return   wait.withMessage("elements are not visible - TEST ERROR MESSAGE")
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".menu>li")));
    }

    public void assertTopMenuItemsCount(){
        Assert.assertEquals(getMenuItems().size(), 6);

    }

    public void selectMenuByName(MenuItems item){
        for(int i=0; i<=getMenuItems().size()-1;i++){
            WebElement menuItem = wait.withMessage("elements are not visible")
                    .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".menu>li"))).get(i);
            if(menuItem.getText().equals(item.getMenuNameLocalized())){
                menuItem.click();
            }
        }
    }

    public void assertUrlContains(MenuItems items){
        Assert.assertTrue(driver.getCurrentUrl().contains(items.getMenuNameLocalized().toLowerCase()));
    }


}
