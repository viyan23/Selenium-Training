package com.selenium.example2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
/**
* @author Mukesh_50
* 
* 
* This class will store all the locator and methods of login page
*
*/
public class LoginPage 
{
 
WebDriver driver; 
By username=By.xpath("//input[@name='txtUsername']");
By password=By.cssSelector("#txtPassword");
By loginButton=By.cssSelector("input[class='button']");
 
 
public LoginPage(WebDriver driver)
{
this.driver=driver;
}
 
 
public void loginToWordpress(String userid,String pass)
{
 
driver.findElement(username).sendKeys(userid);
driver.findElement(password).sendKeys(pass);
driver.findElement(loginButton).click();
 
}
 
 
public void typeUserName(String uid)
{
 
driver.findElement(username).sendKeys(uid);
}
 
public void typePassword(String pass)
{
 
driver.findElement(password).sendKeys(pass);
}
 
public void clickOnLoginButton()
{
driver.findElement(loginButton).click();
}
}


