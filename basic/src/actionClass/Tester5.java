package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester5 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement washington = driver.findElement(By.xpath("//div[text()='Washington' and @id='box3']"));
	WebElement us = driver.findElement(By.xpath("//div[@id=\"box103\"]"));
	Actions action=new Actions(driver);
	action.dragAndDrop(washington, us);
	action.perform();
	Thread.sleep(2000);

	
	
	

	}

}
