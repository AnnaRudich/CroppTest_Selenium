package com.shop.tests;

import com.shop.pages.CheckoutPage;
import com.shop.pages.HomePage;
import com.shop.pages.NavigationBarPage;
import com.shop.pages.ProductPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    HomePage homePage;
    NavigationBarPage navigationBarPage;
    ProductPage productPage;
    CheckoutPage checkoutPage;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.homePage = new HomePage(driver, webDriverWait);
        this.navigationBarPage = new NavigationBarPage(driver, webDriverWait);
        this.productPage = new ProductPage(driver, webDriverWait);
        this.checkoutPage = new CheckoutPage(driver, webDriverWait);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }




}
