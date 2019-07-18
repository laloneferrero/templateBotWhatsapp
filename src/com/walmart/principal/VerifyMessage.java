package com.walmart.principal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyMessage {
	public void checkNewMessage(WebDriver driver) {
		try{
			List<WebElement> allBubbleConversation = driver.findElements(By.className("FTBzM"));
			int index = allBubbleConversation.size() - 1;
			WebElement containerMsg = allBubbleConversation.get(index);
			WebElement child=containerMsg.findElement(By.className("message-out"));
			WebElement spanMsg = child.findElement(By.tagName("span"));
			System.out.println("el ultimo mensaje es mio" + spanMsg.getText());
			
		} catch (Exception e){
			System.out.println("el ultimo mensaje es del cliente");
			driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[2]/div/div[2]")).sendKeys("BOT: Regreso en un rato...");
			driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[2]/div/div[2]")).sendKeys(Keys.RETURN);
		}
	}
}
