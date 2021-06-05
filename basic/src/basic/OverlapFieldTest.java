package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverlapFieldTest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	WebElement un = driver.findElement(By.id("username"));
	Point unLoc = un.getLocation();
	int yunloc = unLoc.getY();
	Dimension unSize = un.getSize();
	int xunSize = unSize.getHeight();
	int totalheight=yunloc+xunSize;
	WebElement pass = driver.findElement(By.name("pwd"));
	Point passLoc = pass.getLocation();
	int ypassLoc = passLoc.getY();
	if(ypassLoc>totalheight) {
		System.out.println("fields are not overlapped");
	}else {
		System.out.println("fields are overlapped");
	}
}
}
