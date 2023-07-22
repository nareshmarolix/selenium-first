package com.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skype {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://skype.com");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText("My account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("loginfmt")).sendKeys("8247357344");
		// Thread.sleep(2000);

		// driver.findElement(By.linkText("Next")).click();
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("i0118")).sendKeys("Naresh@143");
		Thread.sleep(2000);
   
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("KmsiCheckboxField")).click();
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Naresh Pallaregi")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}

}
