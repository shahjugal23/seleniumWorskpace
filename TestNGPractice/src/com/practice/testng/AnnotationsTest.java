package com.practice.testng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium browser drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void findTitle() throws InterruptedException {
		String expected = "Password:  ";
		driver.get("http://www.newtours.demoaut.com/");
		Thread.sleep(3000);
		String actual =	driver.findElement(By.xpath("//*[contains(text(),'Password:')]")).getText();
		assertEquals(actual, expected);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
