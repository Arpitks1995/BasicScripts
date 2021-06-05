package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationTextfield {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Point loc = driver.findElement(By.id("username")).getLocation();
		int xloc = loc.getX();
		int yloc = loc.getY();
		
	System.out.println("x location of the Username textfield "+xloc);
	System.out.println("y location of the Username textfield "+yloc);

	}

}
