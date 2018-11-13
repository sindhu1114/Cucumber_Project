package org.test.java.clas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.resources.java.clas.Basecl;

public class Junitcls extends Basecl{
	static WebDriver driver;
	@BeforeClass  
	public static void bl() {
		driver=getDriver("https://www.facebook.com/");
		}
	@AfterClass
	public static void al() {
		quit(driver);
		}
		@Test
	public void tt() {
		WebElement user=driver.findElement(By.id("email"));
		enter(user, "sindhu");
		WebElement pass=driver.findElement(By.id("pass"));
		enter(pass, "manu");
		WebElement lgn=driver.findElement(By.xpath("//input[@value='Log In']"));
		clk(lgn);
	}
	
}
