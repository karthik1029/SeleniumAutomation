package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndeedJobSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create firefox driver to drive the browser
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthik\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//Open Indeed home page
		driver.get("http://www.indeed.co.uk");
		
		//Find what field and enter selenium
		driver.findElement(By.id("what")).sendKeys("Selenium");
		
		
		//Find location field and enter london
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("London");
		
		
		//Find Findjobs button and click on it
		//Thread.sleep(2000);
		driver.findElement(By.id("fj")).click();
		
		
		//From job search results page, get page title and jobs count message
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("searchCount")).getText());
		
		driver.close();
		

		
		
		

	}

}
