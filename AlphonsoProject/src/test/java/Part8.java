import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		Thread.sleep(2000);

		// Alert Box

		WebElement AlertBox = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		AlertBox.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

		// Confirm Box
		
		WebElement ConfirmBox = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		ConfirmBox.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(2000);
		
		//Prompt Box
		WebElement PromptBox = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		PromptBox.click();
		
		Alert Proalert = driver.switchTo().alert();
		Proalert.sendKeys("LAO");
		Thread.sleep(2000);
		String txt = Proalert.getText();
		System.out.println(txt + " : " );
		Proalert.accept();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
