package us.pack;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=0,enabled=true)
	public void gotoshed() {

		System.out.println("Go to Shed");

	}

	@Test(priority=1, dependsOnMethods="gotoshed")
	public void findcycle() {

		System.out.println("Find cycle");

	}

	@Test(priority=2, dependsOnMethods ="findcycle")
	public void unlockcycle() {

		System.out.println("unlock cycle");

	}

	@Test(priority=3)
	public void rideit() {

		System.out.println("Ride it");

	}

	@Test(priority=4)
	public void shop() {

		System.out.println("shop");

	}
}