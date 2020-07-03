package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeANDAfterAnnotation {

//	@Before (order=1)
//	public void everfirst() {
//		System.out.println("Before annotation1");
//		
//	}
//	
	@After 
    public void everlast() {
    	System.out.println("After annotation");
		
	}
	@Before 
	public void everfirst1() {
		System.out.println("Before annotation");
		
	}
//	@After (order=0)
//	public void everfirst2() {
//		System.out.println("After annotation0");
//		
//	}
	
	@Before("@First, @Third")
    public void beforeFirst(){
        System.out.println("This is before the First and Third Scenario");
    } 
 
 @Before("@Second")
    public void beforeSecond(){
        System.out.println("This is before the Second Scenario");
    } 
 
// @Before("@Third")
//    public void beforeThird(){
//        System.out.println("This is before the Third Scenario");
//    }
 
 @After("@First")
    public void afterFirst(){
        System.out.println("This is after the First Scenario");   
    } 
 
 @After("@Second")
    public void afterSecond(){
        System.out.println("This is after the Second Scenario");   
    } 
 
 @After("@Third")
    public void afterThird(){
        System.out.println("This is after the Third Scenario");   
    } 
}
