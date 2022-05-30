package com.shop.tests;

import com.shop.MenuItems;
import org.testng.annotations.Test;

public class ShopTest extends BaseTest{

    @Test
    public void navigateToMenu() {
        homePage.openPage();
        navigationBarPage.assertTopMenuItemsCount();
        navigationBarPage.selectMenuByName(MenuItems.BOOTS);
        navigationBarPage.assertUrlContains(MenuItems.BOOTS);
    }

    @Test
    public void checkOutProductTest() {
        homePage.openPage();
        navigationBarPage.assertTopMenuItemsCount();
        navigationBarPage.selectMenuByName(MenuItems.BOOTS);
        navigationBarPage.assertUrlContains(MenuItems.BOOTS);
        productPage.openFirstProduct();
        productPage.selectSize();
        productPage.addToCart();
        productPage.checkOut();
        checkoutPage.assertUrl();
        checkoutPage.assertProductIssAdded();
    }
}


