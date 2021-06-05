package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester7 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	WebElement gift = driver.findElement(By.xpath("//a[text()='Gift a Smile']"));
	Actions action=new Actions(driver);
	action.keyDown(Keys.CONTROL);
	//action.click(gift);
	action.keyUp(Keys.CONTROL);
	action.perform();
	Thread.sleep(2000);
	

	}

}
