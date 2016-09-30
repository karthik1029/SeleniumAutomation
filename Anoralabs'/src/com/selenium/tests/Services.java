package com.selenium.tests;

import java.io.IOException;

import com.selenium.base.BaseClass;
import com.selenium.library.CommonLibrary;

public class Services extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		services();

	}
	
	public static void services() throws IOException
	{
		boolean status=CommonLibrary.services();
		if(status==true)
		{
			writeResultsToFile("Services","Pass");
		}
		else
		{
			writeResultsToFile("Services","Fail");
		}
		closeBrowser();
	}

}
