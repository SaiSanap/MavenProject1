package com.UtilityMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityMethods {
	public static WebDriver driver;
	

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Testing Applications\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
