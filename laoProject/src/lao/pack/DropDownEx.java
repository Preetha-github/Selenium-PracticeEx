package lao.pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.linkText("Drop down")).click();
		
		Thread.sleep(2000);
		
		
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dd1);
		select.selectByIndex(1);
		
		//Thread.sleep(2000);
		
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select selectdd2 = new Select(dd2);
		selectdd2.selectByVisibleText("UFT/QTP");
		//Thread.sleep(2000);
		
		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select selectdd3 = new Select(dd3);
		selectdd3.selectByValue("4");
		//Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select selectdropdown = new Select(dropdown);
		List<WebElement> options= selectdropdown.getOptions();
		int size = options.size();
		System.out.println("Number of Options: "+ size);
		Thread.sleep(2000);
		
		WebElement sendkeys1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		sendkeys1.sendKeys("A" + Keys.ENTER);
		
		////*[ contains (text(),'sendKeys to select')]
		//
		Thread.sleep(2000);
		WebElement multiple = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multi  = new Select(multiple);
		multi.selectByIndex(1);
		multi.selectByValue("2");
		multi.selectByIndex(3);
		
		driver.quit();
		
		
		
		//*[contains(text(),'Select your programs')]
	}

}
