package org.main.java.clas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.java.clas.BaseClass;

public class PomClass extends BaseClass{

	
	public PomClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstname;

	@FindBy(xpath = "//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")
	private WebElement address;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@value='FeMale']")
	private WebElement gender;
	
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement gender1;

	@FindBy(xpath="//body[@class='ng-scope']")
	private WebElement languages;
	
	@FindBy(xpath="//input[@id='checkbox1']")
	private WebElement hobbies1;
	
	@FindBy(xpath="//input[@id='checkbox2']")
	private WebElement hobbies2;
	
	@FindBy(xpath="//input[@id='checkbox1']")
	private WebElement hobbies3;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getGender1() {
		return gender1;
	}

	public WebElement getLanguages() {
		return languages;
	}

	public WebElement getHobbies1() {
		return hobbies1;
	}

	public WebElement getHobbies2() {
		return hobbies2;
	}

	public WebElement getHobbies3() {
		return hobbies3;
	}
	
	
	
}
