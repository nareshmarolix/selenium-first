package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HostHeaderCustomizer;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//input[starts-with (@id,'ohrmList_chkSelectRecord')]"));
		 // driver.findElements(By.xpath("//input[@id='ohrmList_chkSelectRecord']"));

		for (WebElement element : findElements) {
			element.click();
			driver.findElement(By.partialLinkText("Welcome")).click();

		}
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
		//driver.findElement(By.linkText("forgotPasswordLink")).click();
		driver.findElement(By.xpath("//a[contains (@href,'forgotPasswordLink?')]")).click();

	}

}
