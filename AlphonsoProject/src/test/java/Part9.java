import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		Thread.sleep(2000);
		
		//default selected radio button
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value =0][@name='news']"));
		WebElement radio2 = driver.findElement(By.xpath("//input[@value =1][@name='news']"));
		
		boolean r1 = radio1.isSelected();
		boolean r2 = radio2.isSelected();
		
		System.out.println(r1);
		System.out.println(r2);
		
		
//		if (radio1.isSelected())
//		{
//	
//		System.out.println("Unchecked is selected" );
//	}
//		
		
		WebElement radio3 = driver.findElement(By.xpath("//input[@value=2][@name='age']"));
		radio3.click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
}
}