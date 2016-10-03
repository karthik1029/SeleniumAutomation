package com.selenium.tests;

import java.io.IOException;
import com.selenium.base.BaseClass;
import com.selenium.library.CommonLibrary;

public class Main extends BaseClass {

	public static void main(String[] args) throws IOException {
		writeDate();
		homePage();
		aboutus();
		services();
		servicesf();
		careers();
		careersf();
		contactus();
		
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
	
	public static void servicesf() throws IOException
	{
		int status=CommonLibrary.servicesf();
		if(status==6)
		{
			writeResultsToFile("Services Full Functionality","Pass");
		}
		else
		{
			writeResultsToFile("Services Full Functionality","Fail");
		}
		closeBrowser();
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
	
	public static void careersf() throws IOException
	{
		int[] status=new int[2];
		
			status=CommonLibrary.careersf();
	
		
		if(status[0]==4 && status[1]==4)
		{
			writeResultsToFile("Careers Page Full Functionality","Pass");
		}
		else
		{
			writeResultsToFile("Careers Page Full Functionality","Fail");
		}
		closeBrowser();
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
