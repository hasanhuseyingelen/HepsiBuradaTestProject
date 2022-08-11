package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstTest extends TestBase{
    @Test
    public  void test() {
        new WebDriverWait(webDriver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div[2]/div")));

        //webDriver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div[2]/div")).click();
        webDriver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("hasanhuseyingelen@gmail.com");
        webDriver.findElement(By.id("btnLogin")).click();

        new WebDriverWait(webDriver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPassword")));
        webDriver.findElement(By.id("txtPassword")).sendKeys("denemePassword");
        webDriver.findElement(By.id("btnEmailSelect")).click();
        // webDriver.findElement(By.xpath("//*[@id=\'password-show_svg__password-show_svg__prefix__a\']")).click();
    }
}
