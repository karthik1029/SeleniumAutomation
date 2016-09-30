package com.selenium.tests;

import java.io.IOException;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

import com.selenium.base.BaseClass;
import com.selenium.library.CommonLibrary;

public class HomePage extends BaseClass {

	public static void main(String[] args) throws IOException {
		homePage();

	}
	
	public static void homePage() throws IOException
	{
		boolean status=CommonLibrary.homePage();
		if(status==true)
		{
			writeResultsToFile("Home Page","Pass");
		}
		else
		{
			writeResultsToFile("Home Page","Fail");
		}
		closeBrowser();
	}

}
