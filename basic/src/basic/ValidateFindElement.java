package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateFindElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
	    List<WebElement> images = driver.findElements(By.tagName("img"));
	    System.out.println("Total Number of the images "+images.size());
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("Total Number of the Links are "+links.size());
	    for (WebElement link:links) {
	    	System.out.println(link.getText());
			
		}
	}

}
