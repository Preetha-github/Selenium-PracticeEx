package lao.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.navigate().to("http://leafground.com/");

		WebElement checkbox = driver.findElement(By.linkText("Checkbox"));
				checkbox.click();

				Thread.sleep(2000);
				WebElement Java = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
				Java.click();
				
				WebElement sql = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input"));
				sql.click();
				
				WebElement C = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[4]/input"));
				C.click();
				
				
				WebElement Selenium = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
				boolean status =Selenium.isSelected();
				
				if (status) {
					System.out.println("Selenium is selected");
					
				} else {
					System.out.println("Selenium is NOT selected");
				}
				
				WebElement NotSelected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
				boolean status1 = NotSelected.isSelected();
				
				if (status1) {
					NotSelected.click();
				}
				
				Thread.sleep(2000);
				
				WebElement IAmSelected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
				boolean status2 = IAmSelected.isSelected();
				if (status2) {
					IAmSelected.click();
				}
				
				WebElement Option1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
				Option1.click();
				
				WebElement Option2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
				Option2.click();
				
				WebElement Option3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
				Option3.click();
				
				WebElement Option4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
				Option4.click();
				
				WebElement Option5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input"));
				Option5.click();
				
				Thread.sleep(2000);
				
				driver.close();
				
	}

}
