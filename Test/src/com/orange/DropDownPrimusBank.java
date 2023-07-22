package com.orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrimusBank {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com");

		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	//	Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).click();
//		driver.findElement(By.xpath(
//				"/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a"))
//				.click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a")).click();
		driver.findElement(By.name("BtnNewBR")).click();
		//driver.findElement(By.name("BtnNewBR")).click();
		driver.findElement(By.name("txtbName")).sendKeys("Hyderabd");
		driver.findElement(By.name("txtAdd1")).sendKeys("Adress1");
		driver.findElement(By.name("Txtadd2")).sendKeys("Address2");
		driver.findElement(By.name("txtadd3")).sendKeys("Address3");
		driver.findElement(By.name("txtArea")).sendKeys("adress3");
		driver.findElement(By.name("txtZip")).sendKeys("23456");
		Select select = new Select(driver.findElement(By.name("lst_counrtyU")));
		select.selectByVisibleText("INDIA");
		Select select1 = new Select(driver.findElement(By.name("lst_stateI")));
		select1.selectByVisibleText("GOA");
		Select select2 = new Select(driver.findElement(By.name("lst_cityI")));
		select2.selectByIndex(1);
		driver.findElement(By.name("btn_insert")).click();

	}

}
