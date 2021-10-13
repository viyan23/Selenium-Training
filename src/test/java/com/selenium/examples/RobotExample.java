package com.selenium.examples;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



class RobotExample {
@Test



public static void robot1() throws AWTException, InterruptedException {
WebDriverManager.firefoxdriver().setup();
WebDriver driver = new FirefoxDriver();
driver.get("https://spreadsheetpage.com/"); // sample url
//driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();
Robot robot = new Robot(); // Robot class throws AWT Exception
Thread.sleep(2000); // Thread.sleep throws InterruptedException
robot.keyPress(KeyEvent.VK_DOWN); // press arrow down key of keyboard to navigate and select Save radio button

Thread.sleep(2000); // sleep has only been used to showcase each event separately
robot.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_ENTER);
// press enter key of keyboard to perform above selected action
}
}