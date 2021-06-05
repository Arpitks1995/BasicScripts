package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeTextfield {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Dimension dim = driver.findElement(By.id("username")).getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		System.out.println("Height of the Username TextField "+height);
		System.out.println("Width of the Username TextField "+width);
		driver.close();

	}

}
