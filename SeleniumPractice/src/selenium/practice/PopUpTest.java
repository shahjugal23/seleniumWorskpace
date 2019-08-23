package selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		/*driver.navigate().to("http://www.popuptest.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Click here to test...')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #2')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Good PopUp #3']")).click();
		
		//driver.close();
		driver.quit();*/
		
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.navigate().to("http://jsbin.com/usidix/1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@*='Go!']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("The alert message is : "+text);
		alert.accept();
		Thread.sleep(5000);
		driver.close();
	}

}
