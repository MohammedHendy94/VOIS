# Mohammed-Hendy
## Introduction
 This project automate the wesite http://automationpractice.com/index.php main High level scenarios:
1.	Create a new account user
2.	Authenticate as new user
3.	Select “Blouses” Subcategory in “Women” Category
4.	Select resulted product
5.	Follow checkout procedure
6.	Confirm order by selecting bank wire option
7.	Validate order was placed from order history page.
 , it's developed using Selenium Cucumber BDD Framework with Java implemented with page object model framework.
### Pre-requists
 JDK version 1.6 or higher, IntelliJ IDEA
#### about My Framework
 This framework mainly include six folders described as following 
  1- Base folder (main/java/VOIS/Base) including all the base classe which have the main setup of the webdriver and it's functionalities
  2- Pages folder (main/java/VOIS/pages) include all pages classes which have the webelements locating + the methods which handle test cases steps
  3- Features folder (test/java/Features) including the features files and the scenarios written in Gherkin Language.
  4- Runners folder (test/java/Runners) including the options interface which handle the test execution, reporting .etc.
  5- Tests folder (test/java/Tests) including the step definition of each scenario and test cases implementation
  p- target folder having the reports files 
Make sure you have the POM.XML file which having all needed libraries and Jar files for running the project.

##### Test data implementation
 This is a data-driven framewrok which read the data from the Feartures files.
