package com.walmart.principal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadMsg {
	public void getLastMsg(WebDriver driver) {
		List<WebElement> allBubbleConversation = driver.findElements(By.className("FTBzM"));
		int index = allBubbleConversation.size() - 1;
		WebElement containerMsg = allBubbleConversation.get(index);
		WebElement child=containerMsg.findElement(By.className("_12pGw"));
		WebElement spanMsg = child.findElement(By.tagName("span"));
		System.out.println(spanMsg.getText());
	}
}
