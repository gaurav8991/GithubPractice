package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
		driver.get("https://demoqa.com/");
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
		element.click();
		
		WebElement textBox = driver.findElement(By.xpath("(//span[@class='text'])[1]"));
		textBox.click();
		
		WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
		fullName.click();
		fullName.sendKeys("Williams John Smith");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.click();
		email.sendKeys("william@gmail.com");
		
		WebElement currentAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		currentAddress.click();
		currentAddress.sendKeys("Abc Road, Near Thomas Church Michigan - 786596 ");
		
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement permanantAddress = driver.findElement(By.xpath("(//textarea[@cols='20'])[2]"));
		permanantAddress.click();
		permanantAddress.sendKeys("Abc Road, Near Thomas Church Michigan - 786596 ");
		
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		Thread.sleep(3000);
		
		
		WebElement checkBox = driver.findElement(By.xpath("//span[text()='Check Box']"));
		checkBox.click();
		
		WebElement toggle = driver.findElement(By.xpath("//button[@aria-label='Toggle']"));
		toggle.click();
		
		
		WebElement desktop = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
		desktop.click();
		
		js.executeScript("window.scrollBy(0,200)");
		WebElement document = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[3]"));
		document.click();
		
		WebElement downloads = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[4]"));
		downloads.click();
		Thread.sleep(3000);
		
		WebElement radioButton = driver.findElement(By.xpath("(//span[@class='text'])[3]"));
		radioButton.click();
		
		WebElement DoYouLikeTheSite = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		
		boolean result = DoYouLikeTheSite.isSelected();
		if(result==true)
		{
			System.out.println("button is select");
			DoYouLikeTheSite.click();
		}
		else
		{
			System.out.println("button is  not select");
			DoYouLikeTheSite.click();
		}
		
		
		js.executeScript("window.scrollBy(0,200)");
		WebElement webTables = driver.findElement(By.xpath("(//span[@class='text'])[4]"));
		webTables.click();
		
		
		
		WebElement addNewRecordButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
		addNewRecordButton.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.click();
		firstName.sendKeys("jolly");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.click();
		lastName.sendKeys("david");
		
		WebElement emailId = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		emailId.click();
		emailId.sendKeys("jolly11@gmail.com");
		
		WebElement age = driver.findElement(By.xpath("//input[@placeholder='Age']"));
		age.click();
		age.sendKeys("25");
		
		WebElement salary = driver.findElement(By.xpath("//input[@maxlength='10']"));
		salary.click();
		salary.sendKeys("45000");
		
		WebElement department = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		department.click();
		department.sendKeys("QA");
		
		WebElement submited = driver.findElement(By.xpath("//button[@id='submit']"));
		submited.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
