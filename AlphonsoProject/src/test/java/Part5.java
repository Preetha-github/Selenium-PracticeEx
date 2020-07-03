import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
		Thread.sleep(2000);

		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
		append.sendKeys("added text");
		Thread.sleep(2000);

		WebElement getdefaulttxt = driver.findElement(By.xpath("//input[@value = 'TestLeaf']"));
		String textdisplayed = getdefaulttxt.getAttribute("value");
		System.out.println("the text displayed is: " + textdisplayed);

		Thread.sleep(2000);

		WebElement clearme = driver.findElement(By.xpath("//input[@value = 'Clear me!!']"));
		clearme.clear();
		Thread.sleep(2000);

	WebElement disabled = driver.findElement(By.xpath("//input[@disabled='true']"));
	String status1 = disabled.getAttribute("disabled");
	System.out.println(status1);
	if (status1.equalsIgnoreCase("True")) {
		System.out.println("Button disabled is : " + status1);
	}
	else {System.out.println("Button disabled is: " + status1);
		
	}

		driver.quit();

	}

}
