package com.walmart.principal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectConversation {
	
	static ReadMsg rm = new ReadMsg();
	
	public void start(WebDriver driver) throws InterruptedException {
		System.out.println("start");
		try{
			WebElement bubbleMsg = driver.findElement(By.className("_1ZMSM"));
			Thread.sleep(300);
			WebElement parentElement = bubbleMsg.findElement(By.xpath("./.."));
			WebElement parentParentElement = parentElement.findElement(By.xpath("./.."));
			WebElement parentParentParentElement = parentParentElement.findElement(By.xpath("./.."));
			parentParentParentElement.click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[2]/div/div[2]")).sendKeys("hola");
			//driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[2]/div/div[2]")).sendKeys(Keys.RETURN);
			rm.getLastMsg(driver);
		}catch(Exception e){
			System.out.println("listo");
		}
			
	}	
}