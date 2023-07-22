package com.orange;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("http://primusbank.qedgetech.com");

		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		System.out.println(findElements.size());
	

	}

}
