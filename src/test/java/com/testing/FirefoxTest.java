package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {

	public static void main(String[] args) {

		// Setup Firefox Driver
		WebDriverManager.firefoxdriver().setup();

		// Open Firefox Browser
		WebDriver driver = new FirefoxDriver();

		// Open Website
		driver.get("https://www.google.com");

		// Maximize Browser Window
		driver.manage().window().maximize();

		// Wait for 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close Browser
		driver.quit();
	}
}