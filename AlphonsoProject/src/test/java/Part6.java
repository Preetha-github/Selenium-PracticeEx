



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		Thread.sleep(2000);

		WebElement HomeButton = driver.findElement(By.id("home"));
		HomeButton.click();
		
		Thread.sleep(2000);
		
		
		WebElement LinkPage1 = driver.findElement(By.xpath("//a [@href = 'pages/Button.html']"));
		LinkPage1.click();
		
		Thread.sleep(2000);
		
		
		//Loc
		
		WebElement PositionButton2 = driver.findElement(By.id("position"));
		Point loc = PositionButton2.getLocation();
		
		int x = loc.getX();
		System.out.println("x position is:" + x );
		int y = loc.getY();
		System.out.println("y position is:" + y );
		
		
		//color
		
		WebElement Buttoncolor = driver.findElement(By.id("color"));
		String bkcolor=Buttoncolor.getCssValue("background-color");
		System.out.println("Background color: " + bkcolor);
		
		// size
		
		WebElement Buttonsize = driver.findElement(By.id("size"));
		int ht = Buttonsize.getSize().getHeight();
		int width = Buttonsize.getSize().getWidth();
		
		System.out.println("height of the button: " + ht);
		System.out.println("width of the button: " + width);
		
		
	}

}
