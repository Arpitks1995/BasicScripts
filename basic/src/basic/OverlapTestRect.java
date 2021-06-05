package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverlapTestRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Rectangle un = driver.findElement(By.id("username")).getRect();
		int unY = un.getY();
		int unHeight = un.getHeight();
		int totalheight = unY + unHeight;
		Rectangle pass = driver.findElement(By.name("pwd")).getRect();
		int ypassLoc = pass.getY();
		if (ypassLoc > totalheight) {
			System.out.println("fields are not overlapped");
			System.out.println(totalheight);
		} else {
			System.out.println("fields are overlapped");
		}
	}

}
