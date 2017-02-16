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
Here, firefox driver is getting initilized and output file is created for results

# HomePage.java
## Test Method:
Here, springer link site is getting launched and search operation is performed with the keyword "Research".
If results has displayed then it will get stored in Printwriter out put file or it will enter into else loop and display no results found message.





