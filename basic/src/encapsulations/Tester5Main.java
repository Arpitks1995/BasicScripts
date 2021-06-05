package encapsulations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tester5Main {

	@DataProvider
	public Object[][] getData(){
	Object[][] arr=new Object[3][2];
	
	arr[0][0]="adm";
	arr[0][1]	="man";
	arr[1][0]="dinga";
	arr[1][1]="dingi";
	arr[2][0]="admin";
	arr[2][1]="manager";
	return arr;
	}
	
	
	@Test(dataProvider="getData")
	public static void login(String username,String password) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		Tester5 test=new Tester5(driver);
		test.setUsername(username);
		test.setPassword(password);
		test.clickOnLogin();
	}
	
}
