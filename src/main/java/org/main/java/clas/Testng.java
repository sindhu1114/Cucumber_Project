package org.main.java.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Testng {
public static WebDriver driver;
@BeforeClass
public static void beforeclass() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Best\\eclipse-workspace\\sindhu\\MavenProject\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIwPX17Lit3gIVhDUrCh0s8wxDEAAYASAAEgK4PvD_BwE");
}

@AfterClass
public static void afterclass() {
	driver.quit();
}

	}
