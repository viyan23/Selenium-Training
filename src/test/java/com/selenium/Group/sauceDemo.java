package com.selenium.Group;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sauceDemo {
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
		Assert.assertEquals("Swag LABS", Title);
		WebElement addtocart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addtocart.click();
		Thread.sleep(2000);
		WebElement gotocart=driver.findElement(By.className("shopping_cart_link"));
		gotocart.click();
		Thread.sleep(2000);
		WebElement checkout=driver.findElement(By.id("checkout"));
		checkout.click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName"));
		WebElement FullName=driver.findElement(By.name("firstName"));
		FullName.sendKeys("sahana");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName"));
		WebElement FullName1=driver.findElement(By.name("lastName"));
		FullName1.sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode"));
		WebElement zipcode=driver.findElement(By.name("postalCode"));
		zipcode.sendKeys("600126");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		WebElement continue2=driver.findElement(By.id("continue"));
		continue2.click();
		Thread.sleep(2000);
		WebElement finish=driver.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(2000);
		WebElement backtohome=driver.findElement(By.id("back-to-products"));
		backtohome.click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-400)", "");
		WebElement button=driver.findElement(By.id("react-burger-menu-btn"));
		button.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(2000);
		driver.quit();




		}


}
