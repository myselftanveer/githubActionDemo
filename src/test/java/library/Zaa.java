package library;

import org.testng.annotations.Test;

public class Zaa {

	@Test(priority = 0)
	public void Demoa() {
		System.out.println("1st test");
	}

	@Test(priority = 1)
	public void Demoa1() {
		System.out.println("2nd test");
	}

}
