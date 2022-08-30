package library;

import org.testng.annotations.Test;

public class Za {
	
	@Test(priority = 0)
	public void Demo() {
		System.out.println("1st test");
	}
	
	@Test(priority = 1)
	public void Demo1() {
		System.out.println("2nd test");
	}
	
	@Test(priority = 2)
	public void Demo2() {
		System.out.println("3rd test");
	}

}
