package org.resources.java.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basecl {
	static WebDriver driver;
	public static WebDriver getDriver(String url) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
    driver.get(url);
    return driver;
} 
	public void enter(WebElement element,String name) {
		element.sendKeys(name);

	}
	public void clk(WebElement element) {
		element.click();

	}
	public static void quit(WebDriver driver) {
		driver.quit(); 

	}
	


}
