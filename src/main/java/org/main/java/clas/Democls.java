package org.main.java.clas;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Democls {
	static WebDriver driver;
	@Given("The user is in guru page")
	public void the_user_is_in_guru_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Best\\eclipse-workspace\\sindhu\\MavenProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");

// Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
		WebElement txtUser = driver.findElement(By.name("uid"));
		txtUser.sendKeys("mngr162586");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("ejuqAny");

	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.name("btnLogin")).click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The user should be in managers home page")
	public void the_user_should_be_in_managers_home_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("Managerhomepage"));
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("The user clicks the new user button")
	public void the_user_clicks_the_new_user_button() {
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user enters the mandatory fields")
	public void the_user_enters_the_mandatory_fields() {
		System.out.println("The user enters the mandatory fields");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user clicks the submit new registration button")
	public void the_user_clicks_the_submit_new_registration_button(io.cucumber.datatable.DataTable Credentials) {
		Map<String, String> credentailsMap = Credentials.asMap(String.class, String.class);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(credentailsMap.get("customername"));
		List<WebElement> genderOptions = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (int i = 0; i < genderOptions.size(); i++) {
			String genValue = genderOptions.get(i).getAttribute("value");
			
		if(genValue.equals("f"))
		{
			genderOptions.get(i).click();
		}

		}
		WebElement dob = driver.findElement(By.id("dob"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].type=arguments[1]",dob,"text");
		dob.sendKeys(credentailsMap.get("Date of Birth"));
	    driver.findElement(By.name("addr")).sendKeys(credentailsMap.get("Address"));
		driver.findElement(By.name("city")).sendKeys(credentailsMap.get("city"));
		driver.findElement(By.name("state")).sendKeys(credentailsMap.get("State"));
		driver.findElement(By.name("pinno")).sendKeys(credentailsMap.get("Pin"));
		driver.findElement(By.name("telephoneno")).sendKeys(credentailsMap.get("Mobile Number"));
		driver.findElement(By.name("emailid")).sendKeys(credentailsMap.get("E-mail"));
		driver.findElement(By.name("password")).sendKeys(credentailsMap.get("Password"));
		driver.findElement(By.name("sub")).click();
}

	@Then("The user should be registered sucessfully")
	public void the_user_should_be_registered_sucessfully() {
		Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Customer Registered Successfully!!!']")).getText().contains("Registered"));
    // Write code here that turns the phrase above into concrete actions
	    
	}
	

@Given("The user get the customer ID")
public void the_user_get_the_customer_ID() {
	List<WebElement> tRow = driver.findElements(By.tagName("tr"));
	   List<WebElement> data = tRow.get(4).findElements(By.tagName("td"));
	    String id = data.get(1).getText();
	   System.out.println(id);
//Write code here that turns the phrase above into concrete actions
    
}

@When("The user click on Edit customer button")
public void the_user_click_on_Edit_customer_button() {
	driver.findElement(By.xpath("//a[text()='Edit Customer']")).click();
 // Write code here that turns the phrase above into concrete actions
    
}

@When("The user gives the customer ID")
public void the_user_gives_the_customer_ID() {
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("id");
 // Write code here that turns the phrase above into concrete actions
	
    
}

@When("The user clicks on Submit button")
public void the_user_clicks_on_Submit_button() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
 // Write code here that turns the phrase above into concrete actions
    
}

@Then("The user should be in edit customer page")
public void the_user_should_be_in_edit_customer_page() {
	Assert.assertTrue(driver.getCurrentUrl().contains("editCustomerPage"));
	 // Write code here that turns the phrase above into concrete actions
    
}

@Then("user validate the details and does the change in the details")
public void user_validate_the_details_and_does_the_change_in_the_details() {
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Athur");
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("clicks on submit")
public void clicks_on_submit() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
    // Write code here that turns the phrase above into concrete actions
    }
}
