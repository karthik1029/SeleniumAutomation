package com.selenium.tests;

import java.io.IOException;

import com.selenium.base.BaseClass;
import com.selenium.library.CommonLibrary;

public class ContactUs extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		contactus();
		
	}
	
	public static void contactus() throws IOException
	{
		boolean status=CommonLibrary.contactus();
		if(status==true)
		{
			writeResultsToFile("Contact Us","Pass");
		}
		else
		{
			writeResultsToFile("Contact Us","Fail");
		}
		closeBrowser();
	}

}
