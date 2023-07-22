package com.tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/time-table");
//get list of tables rows count
	List<WebElement> findElements = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table")).findElements(By.tagName("tr"));
	System.out.println(findElements.size());
	
	
	//get list of table data means list of coloums count
	List<WebElement> findElements1 = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table")).findElements(By.tagName("tr"));
		List<WebElement> elements = findElements1.get(1).findElements(By.tagName("td"));
		
		System.out.println(elements.size() );

		List<WebElement> findElements2 = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table")).findElements(By.tagName("tr"));
		List<WebElement> elements1 = findElements1.get(1).findElements(By.tagName("td"));
		
//		for(int i=1; i<=elements1;i++)
//
//		
//	}
//
}
}