package Tester;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait =new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		//wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		//wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
		WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		logoutLink.click();
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		System.out.println(driver.getTitle());
		driver.close();

	}

}
