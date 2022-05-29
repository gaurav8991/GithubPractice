package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		userName.sendKeys("class1");
		password.sendKeys("send1234@");
		
		WebElement Login= driver.findElement(By.xpath("//button[text()Log In]"));
		
		Login.click();
	}
	

}
