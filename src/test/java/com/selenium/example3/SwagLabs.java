package com.selenium.example3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



public class SwagLabs {
@Test
public static void Individual() throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.id("user-name"));
WebElement username=driver.findElement(By.name("user-name"));
username.sendKeys("standard_user");
Thread.sleep(3000);
driver.findElement(By.id("password"));
WebElement password=driver.findElement(By.name("password"));
password.sendKeys("secret_sauce");
Thread.sleep(3000);
WebElement login=driver.findElement(By.id("login-button"));
login.click();

String Title = driver.getTitle();
Assert.assertEquals("SWAG LABS", Title);



}

}
