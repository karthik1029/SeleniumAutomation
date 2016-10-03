package com.selenium.library;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.selenium.base.BaseClass;

public class CommonLibrary extends BaseClass {
	public static boolean homePage() throws IOException
	{
		launchBrowser();
		if(driver.findElement(By.xpath("//html/body/div[1]/div/nav/div/div[1]/a/img")).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean aboutus() throws IOException
	{
		launchBrowser();
		driver.findElement(By.linkText("About Us")).click();
		if(driver.findElement(By.xpath("//html/body/div[2]/div/div/h2")).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int servicesf() throws IOException
	{
		launchBrowser();
		int count=0;
		String[] ser = {"Design For Test", "Post-silicon design validation and characterization", "ATE Test Engineering","PCB Design Engineering","Systems Engineering","Product Breadth"};
		
		for(int i=0;i<6;i++)
		{
			driver.findElement(By.xpath("//html/body/div[1]/div/nav/div/div[2]/ul/li[3]/a")).click();
			driver.findElement(By.xpath(getLocatorData(ser[i]))).click();
			if(driver.findElement(By.className("page-header")).isDisplayed())
			{
				count++;
			}
			driver.navigate().back();
		}
		return count;
		
		
	}
	
	public static boolean services() throws IOException
	{
		launchBrowser();
		WebElement myEle=driver.findElement(By.xpath("//html/body/div[1]/div/nav/div/div[2]/ul/li[3]/a"));
		myEle.click();
		if(myEle.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean careers() throws IOException
	{
		launchBrowser();
		driver.findElement(By.linkText("Careers")).click();
		if(driver.findElement(By.linkText("hr@anoralabs.com")).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int[] careersf() throws IOException
	{
		launchBrowser();
		int[] countarray=new int[2];
		driver.findElement(By.linkText("Careers")).click();
		List<WebElement> listEle=driver.findElements(By.linkText("Apply"));
		String[] strEle=new String[listEle.size()];
		int i=0,count=0,countu=0;
		for(WebElement e : listEle)
		{
			strEle[i]=e.getText();
			i++;
			
		}
		for(String e : strEle)
		{
			
				driver.findElement(By.linkText(e)).click();
				if(driver.findElement(By.name("send")).isDisplayed())
				{
					driver.findElement(By.id("name")).sendKeys("kc");
					driver.findElement(By.name("send")).click();
					if(driver.getPageSource().contains("Enter valid email id"))
					{
						countu++;
					}
					count++;
					countu++;
					driver.navigate().back();
				}
				countarray[0]=count;
				countarray[1]=countu;
			
		}
		return countarray;
		
	}
	
	public static boolean contactus() throws IOException
	{
		launchBrowser();
		driver.findElement(By.linkText("Contact Us")).click();
		if(driver.findElement(By.xpath("//html/body/div[2]/div/div/div[1]/div[1]/h2")).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
