package lao.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.navigate().to("http://leafground.com/");
		
		driver.findElement(By.xpath("//a[@href='pages/Edit.html']")).click();
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("test@gmail.com");
		
		//Thread.sleep(2000);
		
		
		WebElement append = driver.findElement(By.xpath("//input[@type='text'][@value='Append ']"));
		append.sendKeys("Appending a text" + Keys.TAB);
		

		//Thread.sleep(2000);
		
		WebElement defaultText = driver.findElement(By.xpath("//input [@name='username'][@value='TestLeaf']"));
		String defaulttxt = defaultText.getAttribute("value");
		
		System.out.println("Given text is: " + defaulttxt);
		
		

		//Thread.sleep(2000);
		
		WebElement clearme = driver.findElement(By.xpath("//input [@name='username'][@value='Clear me!!']"));
		clearme.clear();
		
		

		Thread.sleep(2000);
		
		
		  WebElement editbtnStatus = driver.findElement(By.xpath("//input[@disabled='true']"));
		 
		  String status = editbtnStatus.getAttribute("disabled");
		  
		  
		  
		  if (status.equals("true")) { System.out.println("Edit Button is disabled");
		  }else { System.out.println("Edit Button is NOT disabled"); }
		 
		
		driver.quit();
		
		
	}

}
