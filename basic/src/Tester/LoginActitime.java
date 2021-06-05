package Tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//But it is not the proper Script because in this script it does not contain the proper validation

public class LoginActitime extends Basicsettings {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		
	

	}

}
