package Tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester11 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin");
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//label[contains(@id,'keepLoggedInLabel')]")).click();
	Thread.sleep(5000);
	driver.quit();

	}

}
