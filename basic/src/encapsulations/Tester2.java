package encapsulations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tester2 {
	private WebElement username;
	private WebElement password;
	private WebElement loginButton;
	
	public Tester2(WebDriver driver) {
		
		username=driver.findElement(By.id("username"));
		password=driver.findElement(By.name("pwd"));
		loginButton=driver.findElement(By.id("loginButton"));
		
	}
	public void setUsername(String usr) {
		username.sendKeys(usr);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		loginButton.click();
	}

}
