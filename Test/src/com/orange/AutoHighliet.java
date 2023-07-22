package com.orange;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoHighliet {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("http://google.com");
		 
		//driver.findElement(By.name("q")).sendKeys("selenium");
		 
		 List<WebElement> findElements = driver.findElement(By.className("G4fze")).findElements(By.tagName("li"));
		 System.out.println(findElements.size());

	}

}
