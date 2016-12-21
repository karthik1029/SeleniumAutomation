# SeleniumAutomation

Automated Scripts using Selenium webdriver and Java.

AUT: http://www.anoralabs.com/


1.	Introduction
 	This Test Plan Version 1.1 provides the strategy for testing the project “Anora”. This section of the Test Plan document describes the following.
•	Purpose
•	Objectives

a.	Document Purpose
This Test Plan reviews:

i.	Existing project information,
ii.	Business Requirements and critical transactions to be tested,
iii.	Testing types and strategies to be implemented and
iv.	A proposed testing schedule
b.	Objectives
   	This document provides the platform for testing the project Anora “anoralabs.com”. The objective of testing is to see if the project meets the “Software Requirement Specifications version 2.0”. This document will provide - (1) the guidelines for the testing team to test the functionalities embedded in the project and (2) help for evaluating the Software Quality of the project. 

2.	Project Scope
This section of the Test Plan document describes the (1) Scope of the project “anoralabs.com”.
a.	Scope of the Project
Anora “anoralabs.com” will be tested for its functionality on a cluster of 3 computers. Each computer on the cluster contains Intel i7 (2.40 GHz) with Windows operating system. Testing include –   (1) Unit testing, (2) Integration testing, (3) System testing and. Each test is scheduled to take one week.
The testing includes testing for several functions like
•	Home Page
•	Contact Details
•	Switching between tabs.
•	Uploading a File.



3.	Project Resources
Table 1 describes the Roles, Responsibilities and Resource Name for the testing of the Project “Anora”.


Role	Responsibilities	Resource Name(s)
Tester		Plan testing activities
	Execute Test Cases
	Find, report and track defects 
	Measure test effort
	Analyze results	Karthik

Table 1 - Project Roles and Responsibilities




4.	Test Strategies/Techniques
This section of the document describes – (1) Test design and (2) Test Data for the project.
a.	Test Design
Considering the scope of the project and the time limitations, we will be performing following tests.
a)	Unit Test – 
This test verifies the program logic and is based on the knowledge of the program structure.
b)	Integration Test – 
This test verifies the entire system’s functionality according to the design specification.
c)	Business Requirements –
This test verifies whether specific requirements of the customer are met. 



For performing the above mentioned tests, we will create test cases as shown in table 2. 

Use Case ID	Description	Test Case
UC-1	Home Page	TC-1
UC-2	About Us	TC-2
UC-3	 Services	TC-3
UC-4	Careers	TC-4
UC-5	Contact Us	TC-5

Table 2 - Use cases and Test Cases

Table 3 describes the description of each test case mentioned in table 2 and the results expected from a corresponding test case.

Test Case	Use Case ID	Description	Expected Result
TC-1	UC-1	User enters the Home Page.	User is granted the access to the system.
TC-2	UC-2	User Clicks the About Us Page/tab.	A Brief content about the managing Directors is displayed.
TC-3	UC-3	User Switches to Services tab.	A drop down list is displayed. User can access each list/page.
TC-4	UC-4	User Clicks Careers page/tab.	* User is granted access to Submit file to this page with each locator displaying the appropriate response.

*Confirmation is sent when the user uploads the file.
TC-5	UC-5	User switches to contact Us Tab.	Appropriate details about the location is displayed.
Table 3 – Description and the Expected Results of each Test Case 
b.	Database
            	 An Excel sheet maintains Database that contains the locator element for every 	test case.
. 




5.	Project Tasks/Schedule
Table 4 describes the schedule for the Test Plan of the project “Anora”																																																				 

Task	Artifacts	Projected Completion
Test Plan Completed	Test Plan Version 1.0	09-29-2016
Test Environment Prepared	Hardware and software 	09-30-2016
Test Cases Recorded and Executed	Cluster, Test Plan Document version 1.0, Test Results Document	09-30-2016
Defects submitted and tracked	Unit Test Results Document 	10-05-2016
Integration test	Test Plan Document Version 1.0	10-05-2016

Table 4 - Project Schedule






6.	Exit Criteria

Testing can proceed to the next stage of the process when a sufficient proportion of the current stage has been completed All exit criteria should be satisfied by the end of the project.








7.	 Goals and Deliverables

	Goals and deliverables of the test plan of the project are as follows – 


a)	Goals:

	To accomplish all tasks described in this test plan.
	To install a measurable, improvable, repeatable, and manageable test process.
	To verify the functionality and content of the current version of the application.
	To reduce the frequency of error associated with manual testing.
	To find and successfully track 100% of defects present along the user path defined in this plan.

b)	Deliverables:
	 Test Planning Stage  
	 Test Execution and Defect Tracking Stage
	 Evaluation and Improvement – this include
	Test Cycle Evaluation
	Project Summary / Evaluation








