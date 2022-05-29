package Pack;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
				
		driver.get("https://www.amazon.in/your-account");
		Thread.sleep(5000);
		
		
		WebElement accountAndList = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		accountAndList.click();
		
		ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(addr.get(0)) ;
		
		WebElement emailOrMobile = driver.findElement(By.xpath("//input[@name='email']"));
		emailOrMobile.click();
		emailOrMobile.sendKeys("9503503574");
		
		WebElement conti = driver.findElement(By.xpath("//input[@id='continue']"));
		conti.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.click();
		password.sendKeys("G9503503574");
		
		Thread.sleep(3000);
		WebElement signInButton = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		signInButton.click();
		
		
		WebElement amazon = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		amazon.click();
		
		WebElement giftCards = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		giftCards.click();
		
		WebElement buyAgain = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		buyAgain.click();
		
		WebElement giftidea = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		giftidea.click();
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.click();
		searchBar.sendKeys("one plus 10 pro");
		
		WebElement go = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		go.click();
		
		WebElement selectMobile = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[5]"));
		selectMobile.click();
		
		ArrayList<String> add1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add1.get(1));
		
		WebElement accountAndList2 = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement signOut = driver.findElement(By.xpath("//span[text()='Sign Out']"));
		
	
		Actions act = new Actions(driver);
		
		act.moveToElement(accountAndList2).moveToElement(signOut).click().build().perform();

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
