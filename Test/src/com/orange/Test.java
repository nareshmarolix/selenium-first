package com.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test { // selenium executing not matching --> synchronization.

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
		driver.findElement(By.partialLinkText("Welcom")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click(); //no such element
		driver.close();
	}

}
