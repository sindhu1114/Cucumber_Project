package org.main.java.clas;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testng2 {
	
@Parameters({"firstname","lastname","sex","date",})
	@Test
	public void test1(String firstname,String lastname,String sex,String date) {
	System.out.println(firstname);
	System.out.println(lastname);
	System.out.println(sex);
	System.out.println(date);
	
		
	}
	
	}


