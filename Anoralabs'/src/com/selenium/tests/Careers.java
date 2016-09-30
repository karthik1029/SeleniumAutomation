package com.selenium.tests;

import java.io.IOException;

import com.selenium.base.BaseClass;
import com.selenium.library.CommonLibrary;

public class Careers extends BaseClass {

	public static void main(String[] args) throws IOException {
		careers();

	}
	
	public static void careers() throws IOException
	{
		boolean status=CommonLibrary.careers();
		if(status==true)
		{
			writeResultsToFile("careers","Pass");
		}
		else
		{
			writeResultsToFile("careers","Fail");
		}
		closeBrowser();
	}

}
