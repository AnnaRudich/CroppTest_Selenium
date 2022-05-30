package com.shop.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class SelenideDemo {

    @Test
    public void selenideDemo(){
        Selenide.open("https://www.cropp.com/pl/pl");
        $(By.id("#id")).should(Condition.appear);
    }
}
