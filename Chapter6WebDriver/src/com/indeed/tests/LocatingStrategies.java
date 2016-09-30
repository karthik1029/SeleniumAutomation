package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingStrategies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create firefox driver to drive the browser
		WebDriver driver=new FirefoxDriver();
		
		//Open Indeed home page
		driver.get("http://www.indeed.co.uk");
		
		//Locating by ID		
		//driver.findElement(By.id("what")).sendKeys("Selenium");
	
		//Locating by name
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//Locating by linkText
		//driver.findElement(By.linkText("Upload your CV")).click();
		
		//Locating by partial link text
		//driver.findElement(By.partialLinkText("Post Job")).click();
		//driver.findElements(By.xpath("//img[@title='Indeed job search']")).getClass()
		
		
		//Locating by Xpath
//		System.out.println(
//				driver.findElements(By.xpath("//img[@title='Indeed job search']")).getClass()
//				
//				);
		
		//Locating by css selector
		//driver.findElement(By.cssSelector("input.input_submit")).getAttribute("value");
		
//		System.out.println(
//				driver.findElement(By.cssSelector("input.input_submit")).getAttribute("value")
//				);
		
		//Locating by Tag name, get total no of links in a page
//		System.out.println(
//				driver.findElements(By.tagName("a")).size()
//				);
		
		//Locating by Tag name, get first link
//				System.out.println(
//						driver.findElement(By.tagName("a")).getText()
//						);
//				
				
				
				//Locating by class name
				System.out.println(
						driver.findElements(By.className("input_text")).size()
						);
				
				//Locating by class name, type (Selenium) in the first with the class name inout_text
						
						driver.findElement(By.className("input_text")).sendKeys("Selenium");




	
	}

}
