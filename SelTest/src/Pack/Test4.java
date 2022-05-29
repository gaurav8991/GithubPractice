package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.xpath("//input[contains (@class,'inputtext _55r1 _6luy')][1]"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement Login = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		Username.sendKeys("asdfg");
		Password.sendKeys("123465");
		Login.click();
	}
}
