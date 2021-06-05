package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioIsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@name=\"sex\" and @value=\"2\"]"));
		maleRadioButton.click();
		if (maleRadioButton.isSelected()) {
			System.out.println("Radio Button is Selected");
		}else {
			System.out.println("Radio Button is not selected");
		}

	}

}
