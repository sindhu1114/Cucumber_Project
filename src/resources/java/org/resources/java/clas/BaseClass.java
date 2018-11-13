package org.resources.java.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best\\eclipse-workspace\\sindhu\\SeleniumProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		return driver;

	}
	public static void closeMethod() {
		driver.quit();

	}
	public void sendmethod(WebElement element, String name) {
		element.sendKeys(name);
	}
	public void click(WebElement element) {
		element.click();

	}
}
