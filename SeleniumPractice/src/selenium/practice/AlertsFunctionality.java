package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsFunctionality {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value='Submit']")).submit();
		Thread.sleep(3000);
		WebDriverWait wait = new  WebDriverWait(driver, 20);
		
		WebElement cusid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cusid']")));
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("The message is : "+alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
		
		driver.close();
	
	}

}
