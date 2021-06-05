package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://way2automation.com/angularjs-protractor/banking/#/login");
		driver.findElement(By.xpath("//button[text()='Bank Manager Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-class=\"btnClass2\"]")).click();
		Thread.sleep(2000);
		WebElement listbox = driver.findElement(By.xpath("//select[@id=\"userSelect\"]"));
		Select select=new Select(listbox);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(2000);
			
		}
       driver.close();
	}

}
