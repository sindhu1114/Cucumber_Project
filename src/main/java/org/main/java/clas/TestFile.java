package org.main.java.clas;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TestFile {
static WebDriver driver;
@Given("The user is in guru login page")
public void the_user_is_in_guru_login_page() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\MavenProject\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/V4/index.php");
}

@When("The user enters the valid username and password")
public void the_user_enters_the_valid_username_and_password() {
    WebElement txtUser = driver.findElement(By.name("uid"));
    txtUser.sendKeys("mngr162586");
    WebElement pass = driver.findElement(By.name("password"));
    pass.sendKeys("ejuqAny");
}

@When("The user clicks on submit button")
public void the_user_clicks_on_submit_button() {
	WebElement btnlg = driver.findElement(By.name("btnLogin"));
    btnlg.click();
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("The user will be in managers login page")
public void the_user_will_be_in_managers_login_page() {
	Assert.assertTrue(driver.getCurrentUrl().contains("manager home page"));
    // Write code here that turns the phrase above into concrete actions
   
}

}
