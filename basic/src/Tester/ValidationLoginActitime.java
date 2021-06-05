package Tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationLoginActitime extends Basicsettings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username= driver.findElement(By.xpath("//input[@id=\"username\"]"));
		WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		WebElement loginButton=driver.findElement(By.xpath("//a[@id=\"loginButton\"]"));
		if(username.isDisplayed()) {
			System.out.println("Username textfield is displayed");
			
		}
		else {
			System.out.println("Username text field is not displayed");
		}
		if(password.isDisplayed()) {
			System.out.println("password textfield is displayed");
			
		}
		else {
			System.out.println("password text field is not displayed");
		}
		if(loginButton.isDisplayed()) {
			System.out.println("loginButton textfield is displayed");
			
		}
		else {
			System.out.println("loginButton text field is not displayed");
		}
		username.sendKeys("admin");
		password.sendKeys("manager");
		loginButton.click();
		
		//String expectedTitle="actiTIME - Login";
		
		//String actualTitle=driver.getTitle();
		
		/*if(actualTitle.equals(expectedTitle)) {
			System.out.println("Homepage is displayed");
		}
		else {
			System.out.println("Homepage is not displayed");
		}
		
		System.out.println(driver.getTitle());*/
		
		/*String expectedURL="https://demo.actitime.com/login.do";
		String actualURL=driver.getCurrentUrl();
		if(actualURL.equals(expectedURL)) {
			System.out.println("Homepage is displayed");
		}
		else {
			System.out.println("Homepage is not displayed");
		}
		
		System.out.println(driver.getCurrentUrl());*/
		Thread.sleep(5000);
		WebElement logOut=driver.findElement(By.xpath("//a[@id=\"logoutLink\"]"));
		if(logOut.isDisplayed()) {
			System.out.println("HomePage is displayed");
		}
		else {
			System.out.println("Homepage is not displayed");
		}
		logOut.click();
		Thread.sleep(5000);
        driver.quit();
	}

}
