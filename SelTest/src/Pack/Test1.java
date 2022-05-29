package Pack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		
		driver.get("https://facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://instagram.com/");
		Thread.sleep(2000);
		
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		// How to maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		// how to change the size browser
		
		Dimension d = new Dimension(1000,500);	//length*hight
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		// How to change the position
		
		Point p = new Point(100,500);	// position x*y
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
