package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

public class Test2 {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Get current url
		String url =  driver.getCurrentUrl();
		System.out.println(url);
		
		
		// Get Title method
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// Find elemement
		
		//userName
		WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
		
		UserName.sendKeys("asdfghjkl");
		//get attribute method
		
		String values = UserName.getAttribute("aria-label");
		boolean result1 = values.equals("Phone number, username, or email");
		if(result1== true)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		//Get text method
		
		//password
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
			
		password.sendKeys("As@123456789");
		
		//get attribute method password
		// Get text method
		
		
		
		//Login 
	
		WebElement logIn = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		//get text method of login button
		
		String text = logIn.getText();
		boolean result2 = text.equals("Log In");
		if(result2==true)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		logIn.click();
		
		//get attribute method login button
		
	}

}
