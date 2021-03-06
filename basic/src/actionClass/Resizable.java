package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
	WebElement resizable = driver.findElement(By.xpath("//div[@id=\"resizable\"]/div[3]"));
	Actions action=new Actions(driver);
	action.dragAndDropBy(resizable, 800, 500).perform();
	Thread.sleep(3000);
	driver.close();

	}

}
