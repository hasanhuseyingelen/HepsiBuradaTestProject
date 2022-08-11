package com.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
    WebDriver webDriver;

    @BeforeTest
    public void beforeTest(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://giris.hepsiburada.com/");

        System.out.println("Before Test is run");
    }

    @AfterMethod
    public void closeBrowser(){
        // webDriver.quit();
    }
}
