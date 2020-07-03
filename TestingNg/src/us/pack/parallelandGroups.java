package us.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelandGroups {

	
	@Test(groups = {"even","Reg"})
	public void test1() {
	System.out.println("first test");
	
}
	@Test(groups = {"odd","Reg"})
	public void test2() {
		System.out.println("second test");
		
	}
	@Test(groups = {"even","quick"})
	public void test3() {
		System.out.println("third test");
		
	}
	@Test(groups = {"odd","quick"})
	public void test4() {
		System.out.println("fourth test");
		
	}
	@Test(groups = {"even","Reg"})
	public void test5() {
		System.out.println("fifth test");
		
	}
	@Test(groups = {"odd","Reg"})
	public void test6() {
		System.out.println("sixth test");
		
	}
}