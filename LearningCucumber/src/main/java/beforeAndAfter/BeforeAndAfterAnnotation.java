package beforeAndAfter;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAndAfterAnnotation {
	
	@Before
	public void everfirst() {
		System.out.println("Before annotation");
		
	}
	
	@After
    public void everlast() {
    	System.out.println("After annotation");
		
	}

}
