package Pack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement userId =  driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='passwor']"));
		WebElement logIn = driver.findElement(By.xpath("//button[@name='login']")); 
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		WebElement password1 = wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//input[@type='passwor']")));
		
		
	}

}
