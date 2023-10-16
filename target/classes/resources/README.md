This is an Assesment given by Raft.Ai team to evaluate your knowledge of test Automation and testing approach.



Steps to download and run the project:

1. Download the .zip file.
2. Extract the file
3. Launch Eclipse & navigate to the eclipse market place
4. Install testNG 
5. Now file> open > new project>select the extracted project.
6. click on project and click on update maven project.



In this project i have tried to automate the below link
"https://www.myntra.com/home-furnishing?src=bc"
 using Selenium with JAVA and TestNG framework

In this project I have user maven project sctructure 

Group_ID = org.apache.maven.archetypes 
Artifact Id = maven-archetype-quickstart

The project structure

pom.xml - In this file all the dependecies like Selenium & TestNg were added from the maven repository.
 
FOLDER = src/main/java  
under this folder there a package called resources. 
in resources package there are three files

BaseTest.java = This file consists of all the browser invocation methods so that if this class is inherited by anyclass to get the knowledge of the browser invocation.

PageObjects.java = This file consists of all the locators and webelements enclosed within methods.

data.properties = This file consists of the common data like URL and browsername.


FOLDER = src/test/java 
under this there is a package called myntra_homefurnishings.resources
in this package there are 5 class files (TESTCASES)

Filter_test : In this test we are trying to find out GENDER filter and try to click on every gender and 
check that the gender is selected or not?

Header_test : In this test we are trying check the redirection of header element.  to do so, we are clicking on each header and getting the currentURL and checking with the expected url.

LandingPage_test : In this test we are trying to that correct Item is opening or not. for that we are grabbing entire elements as list and iterating through each element and getting the text of the product and cliking on it, and now navigating to the new window getting the product details and comparing the text.

Profile_test : In this test we are trying to check the profile functionality. for that we are hovering the mouse over the profile symbol and now getting the welcome text to make sure we are hovering correctly and now clicking on login button which is available, after navigating checking the url that user is navigated to login page or not.

Search_test : In this test we are trying to check the suggested products are displayed as per the uer input or not. For this we are entering a "Shirt" text in the search field and grabbing all the suggestions, and checking that each suggestion is containing shirt text or not.


testng.xml : This is the file where we can control our tests, all the test cases are available.



 

