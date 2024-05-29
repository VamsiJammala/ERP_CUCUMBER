Feature:
Adding customers/suppliers by admin credentials

@customer
Scenario Outline:
Adding multiple customers by admin
Given launch browser
When launch application url
When wait for username by "id" and "username"
When enter username by "id" and "username" as "admin"
When enter password by "name" and "password" as "master"
When click login button by "xpath" and "//button[@id='btnsubmit']"
When wait for customer link by "xpath" and "(//a[contains(text(),'Customers')])[2]"
When click on customer link by "xpath" and "(//a[contains(text(),'Customers')])[2]"
When wait for addicon by "xpath" and "(//span[@data-caption='Add'])[1]"
When click on addicon by "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for customer number by "xpath" and "//input[@id='x_Customer_Number']"
When capture customer number by "xpath" and "//input[@id='x_Customer_Number']"
When enter customer name by "xpath" and "//input[@id='x_Customer_Name']" as "<cname>"
When enter address by "xpath" and "//textarea[@id='x_Address']" as "<address>"
When enter city by "xpath" and "//input[@id='x_City']" as "<city>"
When enter country name by "xpath" and "//input[@id='x_Country']" as "<country>"
When enter contact person by "xpath" and "//input[@id='x_Contact_Person']" as "<cperson>"
When enter phone number by "xpath" and "//input[@id='x_Phone_Number']" as "<pnumber>"
When enter email by "xpath" and "//input[@id='x__Email']" as "<email>"
When enter mobile number by "xpath" and "//input[@id='x_Mobile_Number']" as "<mnumber>"
When enter notes by "xpath" and "//input[@id='x_Notes']" as "<notes>"
When click add button by "id" and "btnAction"
When wait for confirm ok button by "xpath" and "//button[normalize-space()='OK!']"
When click confirm ok button by "xpath" and "//button[normalize-space()='OK!']"
When wait for alert ok button by "xpath" and "(//button[contains(text(),'OK')])[6]"
When click alert ok button by "xpath" and "(//button[contains(text(),'OK')])[6]"
When validate customer table
When click logout link by "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close application browser

Examples:
|cname|address|city|country|cperson|pnumber|email|mnumber|notes|
|vamsi11|Etcherla|Srikakulam|India|Ranga|7894561231|demoqa1@gmail.com|5486952371|QedgeTech|
|vamsi22|Etcherla|Srikakulam|India|Ranga|7894561232|demoqa2@gmail.com|5486952370|QedgeTech|

@supplier
Scenario Outline:
Adding Multiple Suppliers to ERP

Given launch browser
When launch application url
When wait for username by "id" and "username"
When enter username by "id" and "username" as "admin"
When enter password by "name" and "password" as "master"
When click login button by "xpath" and "//button[@id='btnsubmit']"
When wait for supplier link by "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When click on supplier link by "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When wait for addicon by "xpath" and "(//span[@data-caption='Add'])[1]"
When click on addicon by "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for supplier number by "xpath" and "//input[@id='x_Supplier_Number']" 
When capture supplier number by "xpath" and "//input[@id='x_Supplier_Number']" 
When enter supplier name by "xpath" and "//input[@id='x_Supplier_Name']" as "<supname>"
When enter address by "xpath" and "//textarea[@id='x_Address']" as "<address>"
When enter city by "xpath" and "//input[@id='x_City']" as "<city>"
When enter country name by "xpath" and "//input[@id='x_Country']" as "<country>"
When enter contact person by "xpath" and "//input[@id='x_Contact_Person']" as "<cperson>"
When enter phone number by "xpath" and "//input[@id='x_Phone_Number']" as "<pnumber>"
When enter email by "xpath" and "//input[@id='x__Email']" as "<email>"
When enter mobile number by "xpath" and "//input[@id='x_Mobile_Number']" as "<mnumber>"
When enter notes by "xpath" and "//textarea[@id='x_Notes']" as "<notes>"
When click add button by "id" and "btnAction"
When wait for confirm ok button by "xpath" and "//button[normalize-space()='OK!']"
When click confirm ok button by "xpath" and "//button[normalize-space()='OK!']"
When wait for alert ok button by "xpath" and "(//button[contains(text(),'OK')])[6]"
When click alert ok button by "xpath" and "(//button[contains(text(),'OK')])[6]"
When validate supplier table
When click logout link by "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close application browser

Examples:
|supname|address|city|country|cperson|pnumber|email|mnumber|notes|
|vamsi1|ameerpet|hyderabad|india|ranga|7458963201|demo1@gmail.com|7458230691|qedgetech|
|vamsi2|ameerpet|hyderabad|india|ranga|7458963202|demo2@gmail.com|7458230692|qedgetech|
|vamsi3|ameerpet|hyderabad|india|ranga|7458963203|demo3@gmail.com|7458230693|qedgetech|

@stockitems
Scenario:
Adding Stock item to ERP

Given launch browser
When launch application url
When wait for username by "id" and "username"
When enter username by "id" and "username" as "admin"
When enter password by "name" and "password" as "master"
When click login button by "xpath" and "//button[@id='btnsubmit']"
When wait for stock items link by "xpath" and "//a[starts-with(text(),'Stock Items ')]"
When click on stock items link by "xpath" and "//a[starts-with(text(),'Stock Items ')]"
When wait for addicon by "xpath" and "(//span[@data-caption='Add'])[1]"
When click on addicon by "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for category listbox by "name" and "x_Category"
When select an item in categorylist by "name" and "x_Category" as "1"
When select an item in suppliernumber by "id" and "x_Supplier_Number" as "2"
When capture stock number by "name" and "x_Stock_Number"
When enter stock name by "name" and "x_Stock_Name" as "Tabs"
When select item in unit of measurements by "xpath" and "//select[@id='x_Unit_Of_Measurement']" as "2"
When enter purchasing price by "name" and "x_Purchasing_Price" as "300000"
When enter selling price by "name" and "x_Selling_Price" as "500000"
When enter notes by "xpath" and "//input[@id='x_Notes']" as "StoringTabs"
When click add button by "id" and "btnAction"
When wait for confirm ok button by "xpath" and "//button[normalize-space()='OK!']"
When click confirm ok button by "xpath" and "//button[normalize-space()='OK!']"
When wait for alert ok button by "xpath" and "(//button[contains(text(),'OK')])[6]"
When click alert ok button by "xpath" and "(//button[contains(text(),'OK')])[6]"
When validate stock table
When click logout link by "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close application browser
