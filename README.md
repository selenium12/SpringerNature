# Introduction
This project consist about the "Search functionality" in detail with explanation about the tests.The search functionality can be seen in http://link.springer.com 

Below are the tools and programming language used for this project:

## Programming language 
Java is used as a programming language.
## Tools
Selenium webdriver - Selenium is an Open Source Testing Automation Framework which helps the tester in automating test execution of web applications without recording or writing the selenium scripts.
## Testing Framework
TestNG - TestNG is a testing framework that overcomes the limitations of another popular testing framework called JUnit.
TestNG can generate the report in a readable format like the one shown below.

# Installation
## Requirements
[Lets install Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

Then set java and jar on the PATH

[Install Eclipse](http://www.eclipse.org/downloads/eclipse-packages/)

[Install Selenium library files](http://www.seleniumhq.org/download/)
## Optional requirements
If you plan to install Chrome you need this
[ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)
## TestNG can be installed from eclipse
Launch the eclipse and click "Install new software" then add Name - TestNG and Location - http://beust.com/eclipse/ and click finish.

# Code
## TestBase.java
It serves as a base class to the project in which project setup has been done.
Here, firefox driver is getting initilized by launching the url.

TestNG annotations are used Example: BeforeTest and AfterTest
### BeforeTest
The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
### AfterTest
The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.


# Search.java
## Search result Method:
Here, search operation is performed with the keyword "Research".Searchresult is stored in the variable 'test'
## no result Method:
Here, search operation is performed with the keyword "+++".No result message is stored in the variable 'test'

# Output
Result is stored in testoutput folder.

!![alt tag](https://github.com/selenium12/SpringerNature/blob/master/Screen%20Shot%202017-02-16%20at%2015.49.00.png)

