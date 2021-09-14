package com.stepdefn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefn {
	WebDriver driver;
	@Given("Launching Adactin URL")
	public void launching_Adactin_URL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\CucuProj\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}


	@When("Entering {string} and {string}")
	public void entering_and(String UserName, String Password) {

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(UserName);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(Password);	
	}

	@When("Clicking Login button")
	public void clicking_Login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@When("Entering {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void entering_and(String Location, String Hotels, String RoomType, String NumberofRooms, String CheckInDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {

		WebElement txtlocation = driver.findElement(By.id("location"));
		Select s = new Select(txtlocation);
		s.selectByVisibleText(Location);

		WebElement txtHotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(txtHotels);
		s1.selectByVisibleText(Hotels);

		WebElement txtRoomType = driver.findElement(By.id("room_type"));
		Select s2 = new Select(txtRoomType);
		s2.selectByVisibleText(RoomType);

		WebElement txtNumberofRooms = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(txtNumberofRooms);
		s3.selectByVisibleText(NumberofRooms);

		WebElement txtCheckInDate = driver.findElement(By.id("datepick_in"));
		txtCheckInDate.clear();
		txtCheckInDate.sendKeys(CheckInDate);

		WebElement txtCheckOutDate = driver.findElement(By.id("datepick_out"));
		txtCheckOutDate.clear();
		txtCheckOutDate.sendKeys(CheckOutDate);	

		WebElement txtAdultsperRoom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(txtAdultsperRoom);
		s4.selectByVisibleText(AdultsperRoom);

		WebElement txtChildrenperRoom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(txtChildrenperRoom);
		s5.selectByVisibleText(ChildrenperRoom);

	}

	@Then("Click Search")
	public void click_Search() {
		WebElement txtSearchbtn = driver.findElement(By.id("Submit"));
		txtSearchbtn.click();
	}
	@When("click the Checkbox and Click Continue")
	public void click_the_Checkbox_and_Click_Continue() {
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();

		WebElement contBtn = driver.findElement(By.id("continue"));
		contBtn.click();

	}
	@When("Entering Personal details {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void entering_Personal_details_and(String FirstName, String LastName, String BillingAddress, String CreditCardNo, String CreditCardType, String ExpiryMonth, String ExpiryYear, String CVVNumber) {
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys(FirstName);
		
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(LastName);
		
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys(BillingAddress);
		
		WebElement txtCreditCard = driver.findElement(By.id("cc_num"));
		txtCreditCard.sendKeys(CreditCardNo);
		
		WebElement txtCreditCardtype = driver.findElement(By.id("cc_type"));
		Select CC = new Select(txtCreditCardtype);
		CC.selectByVisibleText(CreditCardType);
		
		WebElement txtCCmonth = driver.findElement(By.id("cc_exp_month"));
		Select CCm = new Select(txtCCmonth);
		CCm.selectByVisibleText(ExpiryMonth);
		
		WebElement txtCCyear = driver.findElement(By.id("cc_exp_year"));
		Select CCy = new Select(txtCCyear);
		CCy.selectByVisibleText(ExpiryYear);
		
		WebElement txtCCVnum = driver.findElement(By.id("cc_cvv"));
		txtCCVnum.sendKeys(CVVNumber);
		
	}

	@Then("Booking room")
	public void booking_room() {
		WebElement Booknow = driver.findElement(By.id("book_now"));
		Booknow.click();
		
		WebElement orderno = driver.findElement(By.id("order_no"));
		System.out.println(orderno.getAttribute("value"));
	}

}
