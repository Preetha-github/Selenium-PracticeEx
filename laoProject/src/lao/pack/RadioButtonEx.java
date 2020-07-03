package lao.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/");

		WebElement radio11 = driver.findElement(By.linkText("Radio Button"));
				radio11.click();

		Thread.sleep(3000);
		WebElement radio12 = driver.findElement(By.xpath("//div[@id='first']/label[1]"));
		radio12.click();
		

		WebElement below20 = driver.findElement(By.xpath("//*[@name='age']"));
		below20.click();
		Thread.sleep(3000);

		WebElement checked = driver.findElement(By.xpath("//*[@name='news'][@value='1']"));
		WebElement unchecked = driver.findElement(By.xpath("//*[@name='news'][@value='0']"));
		Boolean radio1 = checked.isSelected();
		Boolean radio2 = unchecked.isSelected();
		
		if (radio1.equals(true)) {
			
			System.out.println("checked is selected");
		}else if (radio2.equals(true)) {
			
			System.out.println("Unchecked is selected");
		}
		
	driver.close();

	}

}
