package dev;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkspaceNew\\basic\\driver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyblockcapital.com");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String expectedTitle="Hyblockcapital - Cryptocurrencys Tracking and analytics platform for crypto traders";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title is correct");
			System.out.println(actualTitle);
		}else {
			System.out.println("Title is not correct");
		}
		
		driver.close();
	
	}

}
