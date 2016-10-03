package com.selenium.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	//Base Class
	public static WebDriver driver;
	
	public static String getConfigData(String propname) throws IOException
	{
		String data =null;
		File f=new File("./src/data/config.properties");
		FileInputStream fio= new FileInputStream(f);
		Properties prop =new Properties();
		prop.load(fio);
		data=prop.getProperty(propname);
		return data;
	}
	
	public static void launchBrowser() throws IOException
	{
		String browser=getConfigData("browser");
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get(getConfigData("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	

	public static void writeDate() throws IOException
	{
		Date date = new Date();
		File f=new File("./src/results/results.txt");
		FileWriter fw=new FileWriter(f);
		fw.write(date.toString()+"\n");
		fw.flush();
		fw.close();
	}
	
	public static void writeStatus(String status) throws IOException
	{
		File f=new File("./src/results/results.txt");
		FileWriter fw=new FileWriter(f);
		fw.write(status+"\n");
		fw.flush();
		fw.close();
	}
	
	public static void writeResultsToFile(String testcasename, String status) throws IOException
	{
		File f=new File("./src/results/results.txt");
		FileWriter fw=new FileWriter(f,true);
		fw.write(testcasename+"======="+status+"\n");
		fw.flush();
		fw.close();
	}
	
	public static String getLocatorData(String a) throws IOException
	{
		String xpath=null;
		File f=new File("./src/data/locator.xlsx");
		FileInputStream fio=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fio);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rownum=ws.getLastRowNum();
		//int columns=ws.getRow(1).getLastCellNum();
		for(int x=1;x<=rownum;x++)
		{
			String a1=ws.getRow(x).getCell(0).getStringCellValue();
			if(a.equalsIgnoreCase(a1))
			{
				xpath=ws.getRow(x).getCell(1).getStringCellValue();
				break;
			}
			//wb.close();
		}
		return xpath;
		
		
	}
	
	
	public static void closeBrowser()
	{
		driver.quit();
	}

}
