package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ERP_App 
{
	WebDriver driver;
	
	@Given("launch browser")
	public void launch_browser() throws Throwable
	{
	   driver = FunctionLibrary.startbrowser();
	}
	@When("launch application url")
	public void launch_application_url() 
	{
	    FunctionLibrary.openUrl();
	}
	@When("wait for username by {string} and {string}")
	public void wait_for_username_by_and(String LocatorType, String LocatorValue) 
	{
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("enter username by {string} and {string} as {string}")
	public void enter_username_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter password by {string} and {string} as {string}")
	public void enter_password_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("click login button by {string} and {string}")
	public void click_login_button_by_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("wait for customer link by {string} and {string}")
	public void wait_for_customer_link_by_and(String LocatorType, String LocatorValue) 
	{
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("click on customer link by {string} and {string}")
	public void click_on_customer_link_by_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("wait for addicon by {string} and {string}")
	public void wait_for_addicon_by_and(String LocatorType, String LocatorValue) 
	{
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("click on addicon by {string} and {string}")
	public void click_on_addicon_by_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("wait for customer number by {string} and {string}")
	public void wait_for_customer_number_by_and(String LocatorType, String LocatorValue) 
	{
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("capture customer number by {string} and {string}")
	public void capture_customer_number_by_and(String LocatorType, String LocatorValue) throws Throwable
	{
	    FunctionLibrary.captureCus(LocatorType, LocatorValue);
	}
	@When("enter customer name by {string} and {string} as {string}")
	public void enter_customer_name_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter address by {string} and {string} as {string}")
	public void enter_address_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter city by {string} and {string} as {string}")
	public void enter_city_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter country name by {string} and {string} as {string}")
	public void enter_country_name_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter contact person by {string} and {string} as {string}")
	public void enter_contact_person_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter phone number by {string} and {string} as {string}")
	public void enter_phone_number_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter email by {string} and {string} as {string}")
	public void enter_email_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter mobile number by {string} and {string} as {string}")
	public void enter_mobile_number_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter notes by {string} and {string} as {string}")
	public void enter_notes_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("click add button by {string} and {string}")
	public void click_add_button_by_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("wait for confirm ok button by {string} and {string}")
	public void wait_for_confirm_ok_button_by_and(String LocatorType, String LocatorValue) 
	{
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("click confirm ok button by {string} and {string}")
	public void click_confirm_ok_button_by_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("wait for alert ok button by {string} and {string}")
	public void wait_for_alert_ok_button_by_and(String LocatorType, String LocatorValue) 
	{
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("click alert ok button by {string} and {string}")
	public void click_alert_ok_button_by_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("validate customer table")
	public void validate_customer_table() throws Throwable
	{
	    FunctionLibrary.customerTable();
	}
	@When("click logout link by {string} and {string}")
	public void click_logout_link_by_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("close application browser")
	public void close_application_browser() 
	{
	    FunctionLibrary.closebrowser();
	}
	@When("wait for supplier link by {string} and {string}")
	public void wait_for_supplier_link_by_and(String LocatorType, String LocatorValue) 
	{
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("click on supplier link by {string} and {string}")
	public void click_on_supplier_link_by_and(String LocatorType, String LocatorValue) 
	{
	    FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("wait for supplier number by {string} and {string}")
	public void wait_for_supplier_number_by_and(String LocatorType, String LocatorValue) 
	{
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("capture supplier number by {string} and {string}")
	public void capture_supplier_number_by_and(String LocatorType, String LocatorValue) throws Throwable
	{
	    FunctionLibrary.captureSup(LocatorType, LocatorValue);
	}
	@When("enter supplier name by {string} and {string} as {string}")
	public void enter_supplier_name_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
	    FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("validate supplier table")
	public void validate_supplier_table() throws Throwable
	{
	    FunctionLibrary.supplierTable();
	}
	@When("wait for stock items link by {string} and {string}")
	public void wait_for_stock_items_link_by_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("click on stock items link by {string} and {string}")
	public void click_on_stock_items_link_by_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("wait for category listbox by {string} and {string}")
	public void wait_for_category_listbox_by_and(String LocatorType, String LocatorValue) 
	{
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("select an item in categorylist by {string} and {string} as {string}")
	public void select_an_item_in_categorylist_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, TestData);
	}
	@When("select an item in suppliernumber by {string} and {string} as {string}")
	public void select_an_item_in_suppliernumber_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, TestData);
	}
	@When("capture stock number by {string} and {string}")
	public void capture_stock_number_by_and(String LocatorType, String LocatorValue) throws Throwable
	{
	    FunctionLibrary.captureStock(LocatorType, LocatorValue);
	}
	@When("enter stock name by {string} and {string} as {string}")
	public void enter_stock_name_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("select item in unit of measurements by {string} and {string} as {string}")
	public void select_item_in_unit_of_measurements_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
	 	FunctionLibrary.dropDownAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter purchasing price by {string} and {string} as {string}")
	public void enter_purchasing_price_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("enter selling price by {string} and {string} as {string}")
	public void enter_selling_price_by_and_as(String LocatorType, String LocatorValue, String TestData) 
	{
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("validate stock table")
	public void validate_stock_table() throws Throwable
	{
	    FunctionLibrary.stockTable();
	}

}
