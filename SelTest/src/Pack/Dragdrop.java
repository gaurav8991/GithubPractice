package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, dest).click().build().perform();
		Thread.sleep(2000);
		
		WebElement source1 = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement dest1 = driver.findElement(By.xpath("//div[@id='box107']"));
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(source1, dest1).click().build().perform();
		Thread.sleep(2000);
		
		WebElement source2 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement dest2 = driver.findElement(By.xpath("//div[@id='box101']"));
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(source2, dest2).click().build().perform();
		Thread.sleep(2000);
		
		WebElement source3 = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement dest3 = driver.findElement(By.xpath("//div[@id='box104']"));
		Actions act3 = new Actions(driver);
		act3.dragAndDrop(source3, dest3).click().build().perform();
		Thread.sleep(2000);
		
		WebElement source4 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement dest4 = driver.findElement(By.xpath("//div[@id='box105']"));
		Actions act4 = new Actions(driver);
		act4.dragAndDrop(source4, dest4).click().build().perform();
		Thread.sleep(2000);
		
		WebElement source5 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement dest5 = driver.findElement(By.xpath("//div[@id='box102']"));
		Actions act5 = new Actions(driver);
		act5.dragAndDrop(source5, dest5).click().build().perform();
		Thread.sleep(2000);
		
		WebElement source6 = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement dest6 = driver.findElement(By.xpath("//div[@id='box103']"));
		Actions act6 = new Actions(driver);
		act6.dragAndDrop(source6, dest6).click().build().perform();
		
		
		
	}

}
