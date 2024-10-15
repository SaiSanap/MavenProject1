package com.testClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	public static WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Testing Applications\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().fullscreen();
	}

	@Test
	public void test1() {
		driver.navigate().to("https://www.geeksforgeeks.org/");
		System.out.print("TestCase 1:- " + driver.getTitle());
	}

	@Test
	public void test2() {
		driver.navigate().to("https://www.geeksforgeeks.org/");
		WebElement searchBox = driver.findElement(
				By.xpath("//input[@class='HomePageSearchContainer_homePageSearchContainer_container_input__1LS0r']"));
		searchBox.click();
		searchBox.sendKeys("Java");
		WebElement introductionPage = driver.findElement(By.xpath("//div[text()='Introduction to Java']"));
		introductionPage.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.print("TestCase 2:- " + driver.getTitle());
		
		
	}

	@Test
	public void test3() {
		driver.navigate().to("https://www.geeksforgeeks.org/");
		System.out.print("TestCase 3:- " + driver.getCurrentUrl());
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
