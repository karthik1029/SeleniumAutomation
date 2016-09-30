package com.selenium.tests;

import java.io.IOException;

import com.selenium.base.BaseClass;
import com.selenium.library.CommonLibrary;

public class AboutUs extends BaseClass {

	public static void main(String[] args) throws IOException {
		aboutus();
	}
	
	public static void aboutus() throws IOException
	{
		boolean status=CommonLibrary.aboutus();
		if(status==true)
		{
			writeResultsToFile("About Us","Pass");
		}
		else
		{
			writeResultsToFile("About Us","Fail");
		}
		closeBrowser();
	}

}
