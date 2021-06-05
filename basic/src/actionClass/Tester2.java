package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://jqueryui.com/resources/demos/slider/default.html");
    WebElement pricing = driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
    Dimension dim = pricing.getSize();

    int CenterX = dim.getWidth()/2;
    Actions action=new Actions(driver);
    Thread.sleep(2000);
    action.moveToElement(pricing, 400, 0);
    Thread.sleep(2000);
    action.perform();
   // driver.close();
	}

}
