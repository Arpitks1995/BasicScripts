package encapsulations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tester5 {
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public Tester5(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUsername(String usr) {
		username.sendKeys(usr);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		loginButton.click();
	}
	
	

}
