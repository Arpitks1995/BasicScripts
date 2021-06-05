package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Point un = driver.findElement(By.id("username")).getLocation();
		int xUn = un.getX();
		Point pass = driver.findElement(By.name("pwd")).getLocation();
		int xpass=pass.getX();
		if (xUn==xpass) {
			System.out.println("test case is Passed");
			System.out.println(xUn);
			System.out.println(xpass);
			
		}else {
			System.out.println("test case is Failed");
			
		}
		driver.close();
		

	}

}
