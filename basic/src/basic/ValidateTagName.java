package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		WebElement flipkart = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
		String expectedTagname="img";
		
		String actualTagname=flipkart.getTagName();
		if (actualTagname.equals(expectedTagname)) {
			System.out.println("flipkart logo is an image");
			System.out.println(actualTagname);
			
		}else {
			System.out.println("Flipkart logo is not an image");
		}
	}

}
