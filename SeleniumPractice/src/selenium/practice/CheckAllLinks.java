package selenium.practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckAllLinks {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.amazon.in/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=books");
		Thread.sleep(5000);
		List<WebElement> books = driver.findElements(By.xpath("//*[@id='atfResults']/ul/li//h2"));
		
		Iterator<WebElement> it = books.iterator();
		while(it.hasNext()){
			
			WebElement book = it.next();
			System.out.println("Book Name: "+ book.getText());
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
