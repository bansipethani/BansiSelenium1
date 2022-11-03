package com.ict.learning.bansi11111;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSele {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bansi\\eclipse-workspace-new\\LearnSel\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tigernet.campbellsville.edu/ics/");
		driver.manage().window().fullscreen();
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
