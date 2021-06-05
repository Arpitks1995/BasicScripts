package Tester;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverlapValidation {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://demo.actitime.com/login.do");
     Point userLoc = driver.findElement(By.id("username")).getLocation();
     
     Dimension dim=driver.findElement(By.id("username")).getSize();
     
     int userHeight = dim.getHeight();
     
     int yuserLoc = userLoc.getY();
     System.out.println(yuserLoc);
     
     Point passLoc = driver.findElement(By.name("pwd")).getLocation();
     int ypassLoc = passLoc.getY();
     
     System.out.println(ypassLoc);
     
     if (ypassLoc>(yuserLoc+userHeight)) {
    	 System.out.println("Fields are not overlaped");
		
	}else {
    	 System.out.println("Fields are overlaped");
     }
     driver.close();
     

	}

}
