package lao.pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/pages/sortable.html");

		// Thread.sleep(2000);
		Actions actions = new Actions(driver);
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		int size = li.size();
		System.out.println("Number of List items: " + size);

		
		for (int j = 0; j<size-1 ; j++) {
			int i = size-1;
			WebElement From = li.get(i);
			WebElement To = li.get(j);

			actions.clickAndHold(From);
			actions.moveToElement(To);
			System.out.println("i:" + i );
			System.out.println("j:" + j );
			actions.release().build().perform();
			
			
		}
	}

}
