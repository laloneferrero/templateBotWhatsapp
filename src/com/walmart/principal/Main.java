package com.walmart.principal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	static SelectConversation sc = new SelectConversation();;
	static VerifyMessage vm = new VerifyMessage();
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "/Users/vn0ewh3/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(5000);
		System.out.println("****** Scan the QR code ******");
		
		System.out.println("iniciando...");
		for(int i = 0; i < 100000; i++){
			if(i == 0){
				Thread.sleep(5000);
			}else{
				Thread.sleep(1000);
			}
			System.out.println("checando intneto " + i);
			sc.start(driver);
			try{
				vm.checkNewMessage(driver);
			}catch (Exception e){
				
			}
			
		}
		
	}
	
}