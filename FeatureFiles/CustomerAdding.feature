Feature:
Adding Customer
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
|vamsi1|Etcherla|Srikakulam|India|Ranga|7894561231|demoqa1@gmail.com|5486952371|QedgeTech|
|vamsi2|Etcherla|Srikakulam|India|Ranga|7894561232|demoqa2@gmail.com|5486952370|QedgeTech|



