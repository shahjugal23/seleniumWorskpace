package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement source = driver.findElement(By.xpath("//*[@id='credit2']/a"));	
		WebElement target = driver.findElement(By.xpath("//*[@id='bank']/li"));	
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
