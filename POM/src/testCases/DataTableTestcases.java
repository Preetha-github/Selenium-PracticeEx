package testCases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.DataTablePageObjects;


public class DataTableTestcases {
	
	WebDriver driver;
	@Test
	public void data() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
	driver = new ChromeDriver();

	// Maximize the screen
	driver.manage().window().maximize();

	// Implicit wait
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	// Navigate to url
	driver.navigate().to("http://leafground.com/pages/table.html");
	PageFactory.initElements(driver, DataTablePageObjects.class);

	List<WebElement> totcol = driver.findElements(By.xpath("//th"));
	int colsize = totcol.size();
	System.out.println(colsize);
	
	List<WebElement> totrows = driver.findElements(By.xpath("//tr"));
	int rowsize = totrows.size();
	System.out.println(rowsize);
	
	String pro = driver.findElement(By.xpath("//td[contains(text(),'Learn to interact with Elements')]//following::td[1]")).getText();
	System.out.println(pro);
	
	List<Integer> numberlist1 = new ArrayList<Integer>();
	
	List<WebElement> progresslist = driver.findElements(By.xpath("//td[2]"));
	
	for (WebElement pro1 : progresslist) {
		String value = pro1.getText().replace("%", " ");
		System.out.println(value);
		 numberlist1.add(Integer.parseInt(value));
		
	}
	System.out.println(numberlist1);
	
	int smallnum = Collections.min(numberlist1);
	System.out.println(smallnum);
	
	String newstring = Integer.toString(smallnum)+ "%";
	driver.findElement(By.xpath(""));
	
	//td[conatins(text(),'
	
	
	
}
	
}
