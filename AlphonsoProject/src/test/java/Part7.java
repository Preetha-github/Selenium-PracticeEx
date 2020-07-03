import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Part7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		Thread.sleep(2000);
		
		// using index
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select sellist1 = new Select(dropdown1);
		sellist1.selectByIndex(2);
		
		
		//using text
		
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select sellist2 = new Select(dropdown2);
		sellist2.selectByVisibleText("Loadrunner");
		
		
		// using value
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select sellist3 = new Select(dropdown3);
		sellist3.selectByValue("3");
		
		//no: of options in the dropdown
		
		WebElement options = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select sel = new Select(options);
		
		List<WebElement> listofOptions = sel.getOptions();
		int size = listofOptions.size();
		System.out.println("Number of Options: "+ size);
		
//		for (WebElement option : listofOptions) {
//			System.out.println(option);
//			
//		}
//		
		//sendKeys
		
		WebElement sendKeys = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		sendKeys.sendKeys("Loadrunner");
		
		//Multiselect
		
		WebElement multi = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select select = new Select(multi);
		
		select.selectByVisibleText("Selenium");
		select.selectByVisibleText("Appium");
		select.selectByVisibleText("UFT/QTP");
		
		
			
		}
		
		
		
		
	

}
