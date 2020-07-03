package testCases;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.DropdownPageObjects;

public class DropdownTestcases {
	WebDriver driver;
	
	@Test
	public void Dropdown() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		// Maximize the screen
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Navigate to url
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		PageFactory.initElements(driver, DropdownPageObjects.class);
		
		Select select = new Select(DropdownPageObjects.UsingIndex);
		select.selectByIndex(3);
		
		Select select1 = new Select(DropdownPageObjects.UsingText);
		select1.selectByVisibleText("Loadrunner");
		
		Select select2 = new Select(DropdownPageObjects.UsingValue);
		select2.selectByValue("2");
		
		
		Select select3 = new Select(DropdownPageObjects.numberOfOptions);
		 List<WebElement> opt = select3.getOptions();
		  
		  int size = opt.size(); System.out.println("options :"+ size);
		 
		
		DropdownPageObjects.sendKeysSelect.sendKeys("Appium" + Keys.ENTER);
		
		
		
		Select select4 = new Select(DropdownPageObjects.SelectPorgrams);
		select4.selectByIndex(1);
		select4.selectByIndex(2);
		select4.selectByIndex(3);
		
		
		
		
		
		
	}

}
