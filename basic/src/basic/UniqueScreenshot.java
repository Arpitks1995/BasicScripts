package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueScreenshot {

	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		String s1=ldt.toString().replace(":", "-");
		System.out.println(s1);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File desfile=new File("./errorshots/"+s1+".png");
		FileUtils.copyFile(srcfile, desfile);

	}

}
