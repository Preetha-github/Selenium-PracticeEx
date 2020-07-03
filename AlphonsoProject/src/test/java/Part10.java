import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		Thread.sleep(2000);

		WebElement sql = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[3]"));
		sql.click();
		
		WebElement C = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[4]"));
		C.click();
		
		WebElement Selenium = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		boolean status = Selenium.isSelected();
		
		if (status==true) {
			System.out.println("Selenium is selected");
		}
		
		//deselect only checked
		WebElement Notselected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		
		WebElement Selected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		
		Boolean status1 = Notselected.isSelected();
		Boolean status2 = Selected.isSelected();
		
		if (status1 ==true) {
			Notselected.click();
		}
		
		if (status2 ==true) {
			Selected.click();
		}
		// Select all checkboxes
		
		WebElement Option1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[1]"));
		Option1.click();
		
		WebElement Option2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[2]"));
		Option2.click();
		
		WebElement Option3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[3]"));
		Option3.click();
	
		
		WebElement Option4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[4]"));
		Option4.click();
		
		WebElement Option5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[5]"));
		Option5.click();
		
		WebElement Option6 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/input[6]"));
		Option6.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
