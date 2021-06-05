package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelctedType {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		//checkBox.click();
		if (checkBox.isSelected()) {
			System.out.println("Checkbox is selected");
			
		}else {
			System.out.println("Checkbox is not selected");
		}
		

	}

}
