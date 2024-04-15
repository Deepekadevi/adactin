package com.adactinstepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin_runner.Runner_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef_adactin {

	public static WebDriver driver = Runner_Class.driver;
	
	 @Given("User Launch the Adactin  Application")
	 public void user_launch_the_adactin_application() {
		 driver.get("https://adactinhotelapp.com/");
	 }
	 @When("User Enter The Username In Username  Field")
	 public void user_enter_the_username_in_username_field() {
		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("deeps1708");
	 }
	 @When("User Enter The Password In Password Field")
	 public void user_enter_the_password_in_password_field() {
		 WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys("deeps@1708");
	 }
	 @Then("User Click The Login Button And It Navigates To Search Hotel Page")
	 public void user_click_the_login_button_and_it_navigates_to_search_hotel_page() {
		 WebElement login = driver.findElement(By.id("login"));
		  
		 login.click();
		 
	 }

	 @When("User select The Hotel Location")
	 public void user_select_the_hotel_location() {
	     
		 WebElement location = driver.findElement(By.id("location"));
		 Select location1 = new Select(location);
		 location1.selectByVisibleText("New York");

	 }
	 @When("User Select The hotels Name")
	 public void useer_select_the_hotels_name() {
	     
		 WebElement hotels = driver.findElement(By.id("hotels"));
			Select hotels1 = new Select(hotels);
			hotels1 .selectByVisibleText("Hotel Sunshine");
	 }
	 @When("User Select The Room Type")
	 public void user_select_the_room_type() {
		 
		 WebElement room = driver.findElement(By.id("room_type"));
	     Select room1 = new Select(room);
		    room1.selectByVisibleText("Standard");
				
	 }
	 @When("User Select The Number Of Rooms")
	 public void user_select_the_number_of_rooms() {
	    
		 WebElement nos = driver.findElement(By.id("room_nos"));
		    Select nos1 = new Select(nos);
		    nos1.selectByIndex(1);
		 
	 }
	 @When("User Clear The Check In Date")
	 public void user_clear_the_check_in_date() {
	     
		 driver.findElement(By.name("datepick_in")).clear();
		   
		  
		 
	 }
	 @When("User Enter The Date In Check In Date Field")
	 public void user_enter_the_date_in_check_in_date_field() {
	     
		 driver.findElement(By.name("datepick_in")).sendKeys("08/03/2024");
		 
	 }
	 @When("User Clear The Check Out Date")
	 public void user_clear_the_check_out_date() {
	    
		 driver.findElement(By.name("datepick_out")).clear();
		  
	 }
	 @When("User Enter The Date In Check Out Date Field")
	 public void user_enter_the_date_in_check_out_date_field() {
	    
		 driver.findElement(By.name("datepick_out")).sendKeys("20/03/2024");
		 
	 }
	 @When("User Select The Adults per Room")
	 public void user_select_the_adults_per_room() {
	    
		 WebElement adult_room = driver.findElement(By.id("adult_room"));
	     Select adult = new Select(adult_room);
		   adult.selectByIndex(1);
		   
	 }
	 @When("User Select The Children per Room")
	 public void user_select_the_children_per_room() {
	     
		 WebElement child= driver.findElement(By.id("child_room"));
		  Select child1 = new Select(child);
		  child1.selectByIndex(0);
		  
	 }
	 @Then("User Submit The Details")
	 public void user_submit_the_details() {
		 
		 driver.findElement(By.id("Submit")).click();
		 
	 }

	 @When("User Click  The Conformation hotel booking details")
	 public void user_click_the_conformation_hotel_booking_details() {
		
		 driver.findElement(By.id("radiobutton_0")).click();
	     
		
	 }
	 @Then("User Click The Continue Button And It Navigates To Hotel Book Page")
	 public void user_click_the_continue_button_and_it_navigates_to_hotel_book_page() {
	     
		 driver.findElement(By.id("continue")).click();
		 
	 }

	 @When("User Enter The Firstname In Username  Field")
	 public void user_enter_the_firstname_in_username_field() {
	     
		 driver.findElement(By.id("first_name")).sendKeys("deeps");
	 }
	 @When("User Enter The Lastname In Username Field")
	 public void user_enter_the_lastname_in_username_field() {
	     
		 driver.findElement(By.id("last_name")).sendKeys("deeps");
	 }
	 @When("User Enter The Billing Address In Address Field")
	 public void user_enter_the_billing_address_in_address_field() {
	     
		  driver.findElement(By.id("address")).sendKeys("Nol 25/56 chennai");
	 }
	 @When("User Enter The Credit Card No In Credit Card Field")
	 public void user_enter_the_credit_card_no_in_credit_card_field() {
	     
		  driver.findElement(By.id("cc_num")).sendKeys("1234567891011121");
	 }
	 @When("User Select The Credit Card Type")
	 public void user_select_the_credit_card_type() {
	    
		 WebElement type = driver.findElement(By.id("cc_type"));
	     Select type1 = new Select(type);
	      type1.selectByVisibleText("VISA");
	 }
	 @When("User Select The Expiry date In Selected Month")
	 public void user_select_the_expiry_date_in_selected_month() {
	    
		 WebElement expmonth= driver.findElement(By.id("cc_exp_month"));
		       Select  month= new Select(expmonth);
		       month.selectByIndex(6);
	 }
	 @When("User Select The Expiry date In Selected Year")
	 public void user_select_the_expiry_date_in_selected_year() {
	     
		 WebElement exp_year= driver.findElement(By.id("cc_exp_year"));
	 	Select  year = new Select(exp_year);
	 	  year.selectByVisibleText("2026");
	 }

	 @When("User Enter The CVV Number In CVV Number Field")
	 public void user_enter_the_cvv_number_in_cvv_number_field() {
	    
		  driver.findElement(By.id("cc_cvv")).sendKeys("123");
		   
	 	  
	 }
	 @Then("User Click The Book Now Button And It Navigates To Hotel Booking Conformation Page")
	 public void user_click_the_book_now_button_and_it_navigates_to_hotel_booking_conformation_page() throws InterruptedException {
	    
		 driver.findElement(By.id("book_now")).click();
		 Thread.sleep(10000);
	 }
	 @Then("User Get The Booking Conformation And Click The Logout Butoon And It Navigates To Succesfuly Logout Page")
	 public void user_get_the_booking_conformation_and_click_the_logout_butoon_and_it_navigates_to_succesfuly_logout_page() {
	    
		  WebElement logout = driver.findElement(By.name("logout"));
	  	 logout.click();
	 }
}
