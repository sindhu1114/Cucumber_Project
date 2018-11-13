package org.test.java.clas;


import org.main.java.clas.PomClass;
import org.openqa.selenium.WebDriver;
import org.resources.java.clas.Basecl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng extends Basecl{
	static WebDriver driver;
	static PomClass p;
	static Basecl b;
	@BeforeClass  
	public static void bl() {
		driver=getDriver("http://demo.automationtesting.in/Register.html");
		}
	@AfterClass
	public static void al() {
		quit(driver);
		}
		@Test
		public void testMethod() {
			p=new PomClass();
	
	}
}
