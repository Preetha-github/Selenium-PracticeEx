package lao.pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/pages/sortable.html");
		
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		List <WebElement> li = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		int size = li.size();
		System.out.println("Number of List items: " + size);
		
		
		WebElement From = driver.findElement(By.xpath("//*[@id='sortable']/li[7]"));
		WebElement To = driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
	
		actions.clickAndHold(From);
		actions.moveToElement(To);
		actions.release().build().perform();
		
		
		WebElement From1 = driver.findElement(By.xpath("//*[@id='sortable']/li[7]"));
		WebElement To1 = driver.findElement(By.xpath("//*[@id='sortable']/li[2]"));
		
		
		actions.clickAndHold(From1);
		actions.moveToElement(To1);
		actions.release().build().perform();
		
		WebElement From2 = driver.findElement(By.xpath("//*[@id='sortable']/li[7]"));
		WebElement To2 = driver.findElement(By.xpath("//*[@id='sortable']/li[3]"));
		
		
		actions.clickAndHold(From2);
		actions.moveToElement(To2);
		actions.release().build().perform();
		
		WebElement From3 = driver.findElement(By.xpath("//*[@id='sortable']/li[7]"));
		WebElement To3 = driver.findElement(By.xpath("//*[@id='sortable']/li[4]"));
		
		
		actions.clickAndHold(From3);
		actions.moveToElement(To3);
		actions.release().build().perform();
		
		WebElement From4 = driver.findElement(By.xpath("//*[@id='sortable']/li[7]"));
		WebElement To4 = driver.findElement(By.xpath("//*[@id='sortable']/li[5]"));
		
		
		actions.clickAndHold(From4);
		actions.moveToElement(To4);
		actions.release().build().perform();
		
		WebElement From5 = driver.findElement(By.xpath("//*[@id='sortable']/li[7]"));
		WebElement To5 = driver.findElement(By.xpath("//*[@id='sortable']/li[6]"));
		
		
		actions.clickAndHold(From5);
		actions.moveToElement(To5);
		actions.release().build().perform();
			
		}
		

	}


