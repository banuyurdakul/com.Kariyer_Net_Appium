# Kariyer.net Android App Testing Project with Appium, Java, TestNG and AllureReports

**Project Desc**

##

This is an test automation project for the Kariyer.Net Android App. 

Project tools:
1. Programming Language : Java
2. Automation Tools : Selenium and Appium(2.0)
3. Framework  : TestNG (Data Driven Development)
4. Dependency Management : Maven
5. Reporting : Allure 

Since the project is initially designed for an emulator, it either needs a tool like Virtual Device Manager or the Driver class should be altered in accordance with an actual device.

***IF YOU HAVE NOT USED ALLURE REPORTS BEFORE:***

Firstly Maven and Allure should be installed on the computer.
Whenever a test is run, Allure automatically generates reports and stores them in the allure-results inv.
In order to see the reports, Open the terminal section of the IDE and enter this command: 
allure serve allure-results
Allure-results file can always be deleted and new reports can be generated. 

**The project is desgined to be extended or altered to any app using a properties file. Any android app can be istalled via Apk_Install class, and app information can be entered into config.properties file.**



