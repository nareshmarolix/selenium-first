package com.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.manage().deleteAllCookies();
 driver.manage().window().maximize();
 driver.get("http://amazon.com");
 
 Select select=new Select(driver.findElement(By.id("searchDropdownBox")));
 select.selectByVisibleText("Baby");
		
	}

}
